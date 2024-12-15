package com.ruoyi.system.service;

import java.util.List;

import com.ruoyi.common.core.domain.R;
import com.ruoyi.system.domain.SysDevice;
import com.ruoyi.system.domain.response.SysDeviceResponse;

/**
 * 【设备】Service接口
 * 
 * @author ruoyi
 * @date 2024-12-05
 */
public interface ISysDeviceService 
{
    /**
     * 查询【设备】
     * 
     * @param deviceId 【设备】主键
     * @return 【设备】
     */
    public SysDevice selectSysDeviceByDeviceId(String deviceId);

    /**
     * 查询【设备】列表
     * 
     * @param sysDevice 【设备】
     * @return 【设备】集合
     */
    public List<SysDevice> selectSysDeviceList(SysDevice sysDevice);

    /**
     * 新增【设备】
     * 
     * @param sysDevice 【设备】
     * @return 结果
     */
    public int insertSysDevice(SysDevice sysDevice);

    /**
     * 修改【设备】
     * 
     * @param sysDevice 【设备】
     * @return 结果
     */
    public int updateSysDevice(SysDevice sysDevice);

    /**
     * 批量删除【设备】
     * 
     * @param deviceIds 需要删除的【设备】主键集合
     * @return 结果
     */
    public int deleteSysDeviceByDeviceIds(String deviceIds);

    /**
     * 删除【设备】信息
     * 
     * @param deviceId 【设备】主键
     * @return 结果
     */
    public int deleteSysDeviceByDeviceId(String deviceId);

    R<SysDeviceResponse> checkDevice(SysDevice device);
}
