package com.ruoyi.web.controller.system;

import java.util.List;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.system.domain.SysDevice;
import com.ruoyi.system.service.ISysDeviceService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 【设备】Controller
 * 
 * @author ruoyi
 * @date 2024-12-05
 */
@Controller
@RequestMapping("/system/device")
public class SysDeviceController extends BaseController
{
    private String prefix = "system/device";

    @Autowired
    private ISysDeviceService sysDeviceService;

    @RequiresPermissions("system:device:view")
    @GetMapping()
    public String device()
    {
        return prefix + "/device";
    }

    /**
     * 查询【设备】列表
     */
    @RequiresPermissions("system:device:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(SysDevice sysDevice)
    {
        startPage();
        List<SysDevice> list = sysDeviceService.selectSysDeviceList(sysDevice);
        return getDataTable(list);
    }

    /**
     * 导出【设备】列表
     */
    @RequiresPermissions("system:device:export")
    @Log(title = "【设备】", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(SysDevice sysDevice)
    {
        List<SysDevice> list = sysDeviceService.selectSysDeviceList(sysDevice);
        ExcelUtil<SysDevice> util = new ExcelUtil<SysDevice>(SysDevice.class);
        return util.exportExcel(list, "【设备】数据");
    }

    /**
     * 新增【设备】
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存【设备】
     */
    @RequiresPermissions("system:device:add")
    @Log(title = "【设备】", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(SysDevice sysDevice)
    {
        return toAjax(sysDeviceService.insertSysDevice(sysDevice));
    }

    /**
     * 修改【设备】
     */
    @RequiresPermissions("system:device:edit")
    @GetMapping("/edit/{deviceId}")
    public String edit(@PathVariable("deviceId") String deviceId, ModelMap mmap)
    {
        SysDevice sysDevice = sysDeviceService.selectSysDeviceByDeviceId(deviceId);
        mmap.put("sysDevice", sysDevice);
        return prefix + "/edit";
    }

    /**
     * 修改保存【设备】
     */
    @RequiresPermissions("system:device:edit")
    @Log(title = "【设备】", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(SysDevice sysDevice)
    {
        return toAjax(sysDeviceService.updateSysDevice(sysDevice));
    }

    /**
     * 删除【设备】
     */
    @RequiresPermissions("system:device:remove")
    @Log(title = "【设备】", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(sysDeviceService.deleteSysDeviceByDeviceIds(ids));
    }
}
