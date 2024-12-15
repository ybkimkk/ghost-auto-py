package com.ruoyi.web.controller.system;

import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.system.domain.SysActivationCode;
import com.ruoyi.system.service.ISysActivationCodeService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 【请填写功能名称】Controller
 *
 * @author ruoyi
 * @date 2024-12-15
 */
@Controller
@RequestMapping("/system/code")
public class SysActivationCodeController extends BaseController {
    private String prefix = "system/code";

    @Autowired
    private ISysActivationCodeService sysActivationCodeService;

    @RequiresPermissions("system:code:view")
    @GetMapping()
    public String code() {
        return prefix + "/code";
    }

    /**
     * 查询【请填写功能名称】列表
     */
    @RequiresPermissions("system:code:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(SysActivationCode sysActivationCode) {
        startPage();
        List<SysActivationCode> list = sysActivationCodeService.selectSysActivationCodeList(sysActivationCode);
        return getDataTable(list);
    }

    /**
     * 导出【请填写功能名称】列表
     */
    @RequiresPermissions("system:code:export")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(SysActivationCode sysActivationCode) {
        List<SysActivationCode> list = sysActivationCodeService.selectSysActivationCodeList(sysActivationCode);
        ExcelUtil<SysActivationCode> util = new ExcelUtil<SysActivationCode>(SysActivationCode.class);
        return util.exportExcel(list, "【请填写功能名称】数据");
    }

    /**
     * 新增【请填写功能名称】
     */
    @GetMapping("/add")
    public String add() {
        return prefix + "/add";
    }

    /**
     * 新增保存【请填写功能名称】
     */
    @RequiresPermissions("system:code:add")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(SysActivationCode sysActivationCode) {
        return toAjax(sysActivationCodeService.insertSysActivationCode(sysActivationCode));
    }

    /**
     * 修改【请填写功能名称】
     */
    @RequiresPermissions("system:code:edit")
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap) {
        SysActivationCode sysActivationCode = sysActivationCodeService.selectSysActivationCodeById(id);
        mmap.put("sysActivationCode", sysActivationCode);
        return prefix + "/edit";
    }

    /**
     * 修改保存【请填写功能名称】
     */
    @RequiresPermissions("system:code:edit")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(SysActivationCode sysActivationCode) {
        return toAjax(sysActivationCodeService.updateSysActivationCode(sysActivationCode));
    }

    /**
     * 删除【请填写功能名称】
     */
    @RequiresPermissions("system:code:remove")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.DELETE)
    @PostMapping("/remove")
    @ResponseBody
    public AjaxResult remove(String ids) {
        return toAjax(sysActivationCodeService.deleteSysActivationCodeByIds(ids));
    }
}
