package com.ruoyi.system.service.impl;

import cn.hutool.core.date.DateUnit;
import cn.hutool.core.date.DateUtil;
import com.ruoyi.common.core.domain.R;
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
 * 【设备】Service业务层处理
 *
 * @author ruoyi
 * @date 2024-12-05
 */
@Service
public class SysDeviceServiceImpl implements ISysDeviceService {
    @Autowired
    private SysDeviceMapper sysDeviceMapper;

    /**
     * 查询【设备】
     *
     * @param deviceId 【设备】主键
     * @return 【设备】
     */
    @Override
    public SysDevice selectSysDeviceByDeviceId(String deviceId) {
        return sysDeviceMapper.selectSysDeviceByDeviceId(deviceId);
    }

    /**
     * 查询【设备】列表
     *
     * @param sysDevice 【设备】
     * @return 【设备】
     */
    @Override
    public List<SysDevice> selectSysDeviceList(SysDevice sysDevice) {
        return sysDeviceMapper.selectSysDeviceList(sysDevice);
    }

    /**
     * 新增【设备】
     *
     * @param sysDevice 【设备】
     * @return 结果
     */
    @Override
    public int insertSysDevice(SysDevice sysDevice) {
        return sysDeviceMapper.insertSysDevice(sysDevice);
    }

    /**
     * 修改【设备】
     *
     * @param sysDevice 【设备】
     * @return 结果
     */
    @Override
    public int updateSysDevice(SysDevice sysDevice) {
        return sysDeviceMapper.updateSysDevice(sysDevice);
    }

    /**
     * 批量删除【设备】
     *
     * @param deviceIds 需要删除的【设备】主键
     * @return 结果
     */
    @Override
    public int deleteSysDeviceByDeviceIds(String deviceIds) {
        return sysDeviceMapper.deleteSysDeviceByDeviceIds(Convert.toStrArray(deviceIds));
    }

    /**
     * 删除【设备】信息
     *
     * @param deviceId 【设备】主键
     * @return 结果
     */
    @Override
    public int deleteSysDeviceByDeviceId(String deviceId) {
        return sysDeviceMapper.deleteSysDeviceByDeviceId(deviceId);
    }

    @Override
    public R<SysDeviceResponse> checkDevice(SysDevice device) {
        SysDeviceResponse result = new SysDeviceResponse();
        SysDevice sysDeviceResponse = sysDeviceMapper.checkDevice(device);
        Date date = DateUtil.date();

        if (Objects.isNull(sysDeviceResponse)) {
            return R.fail("该设备尚未激活");
        }


//        result.setEndDate(sysDeviceResponse.getEndDate());
        if (date.before(result.getEndDate())) {
            result.setCheck(true);
//            result.setMsg("使用剩余: " + DateUtil.between(date, sysDeviceResponse.getEndDate(), DateUnit.DAY) + "天");
        }
        return R.ok(result);
    }

}
