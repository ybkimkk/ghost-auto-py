package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.SysDevice;
import com.ruoyi.system.domain.response.SysDeviceResponse;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author ruoyi
 * @date 2024-12-05
 */
public interface SysDeviceMapper 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param deviceId 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public SysDevice selectSysDeviceByDeviceId(String deviceId);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param sysDevice 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<SysDevice> selectSysDeviceList(SysDevice sysDevice);

    /**
     * 新增【请填写功能名称】
     * 
     * @param sysDevice 【请填写功能名称】
     * @return 结果
     */
    public int insertSysDevice(SysDevice sysDevice);

    /**
     * 修改【请填写功能名称】
     * 
     * @param sysDevice 【请填写功能名称】
     * @return 结果
     */
    public int updateSysDevice(SysDevice sysDevice);

    /**
     * 删除【请填写功能名称】
     * 
     * @param deviceId 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteSysDeviceByDeviceId(String deviceId);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param deviceIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteSysDeviceByDeviceIds(String[] deviceIds);

    SysDevice checkDevice(SysDevice device);
}
