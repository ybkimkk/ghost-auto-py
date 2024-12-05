package com.ruoyi.system.service.impl;

import com.ruoyi.common.core.text.Convert;
import com.ruoyi.system.domain.SysDevice;
import com.ruoyi.system.domain.response.SysDeviceResponse;
import com.ruoyi.system.mapper.SysDeviceMapper;
import com.ruoyi.system.service.ISysDeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Objects;

/**
 * 【请填写功能名称】Service业务层处理
 *
 * @author ruoyi
 * @date 2024-12-05
 */
@Service
public class SysDeviceServiceImpl implements ISysDeviceService {
    @Autowired
    private SysDeviceMapper sysDeviceMapper;

    /**
     * 查询【请填写功能名称】
     *
     * @param deviceId 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public SysDevice selectSysDeviceByDeviceId(String deviceId) {
        return sysDeviceMapper.selectSysDeviceByDeviceId(deviceId);
    }

    /**
     * 查询【请填写功能名称】列表
     *
     * @param sysDevice 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<SysDevice> selectSysDeviceList(SysDevice sysDevice) {
        return sysDeviceMapper.selectSysDeviceList(sysDevice);
    }

    /**
     * 新增【请填写功能名称】
     *
     * @param sysDevice 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertSysDevice(SysDevice sysDevice) {
        return sysDeviceMapper.insertSysDevice(sysDevice);
    }

    /**
     * 修改【请填写功能名称】
     *
     * @param sysDevice 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateSysDevice(SysDevice sysDevice) {
        return sysDeviceMapper.updateSysDevice(sysDevice);
    }

    /**
     * 批量删除【请填写功能名称】
     *
     * @param deviceIds 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteSysDeviceByDeviceIds(String deviceIds) {
        return sysDeviceMapper.deleteSysDeviceByDeviceIds(Convert.toStrArray(deviceIds));
    }

    /**
     * 删除【请填写功能名称】信息
     *
     * @param deviceId 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteSysDeviceByDeviceId(String deviceId) {
        return sysDeviceMapper.deleteSysDeviceByDeviceId(deviceId);
    }

    @Override
    public SysDeviceResponse checkDevice(SysDevice device) {
        SysDeviceResponse result = new SysDeviceResponse();
        SysDevice sysDeviceResponse = sysDeviceMapper.checkDevice(device);
        Date date = new Date();
        if (Objects.isNull(sysDeviceResponse)){
           
            device.setActivationDate(date);
//            device.setEndDate(date.);
            sysDeviceMapper.insertSysDevice(device);
            result.setCheck(true);
            result.setMsg("试用期三天");
        }
        
        
        if (Objects.nonNull(sysDeviceResponse)) {
            result.setEndDate(sysDeviceResponse.getEndDate());
            if (date.before(result.getEndDate())) {
                result.setCheck(true);
            }
        }
        return result;
    }

}
