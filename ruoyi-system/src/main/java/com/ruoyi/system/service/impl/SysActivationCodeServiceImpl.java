package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.SysActivationCodeMapper;
import com.ruoyi.system.domain.SysActivationCode;
import com.ruoyi.system.service.ISysActivationCodeService;
import com.ruoyi.common.core.text.Convert;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-12-15
 */
@Service
public class SysActivationCodeServiceImpl implements ISysActivationCodeService 
{
    @Autowired
    private SysActivationCodeMapper sysActivationCodeMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public SysActivationCode selectSysActivationCodeById(Long id)
    {
        return sysActivationCodeMapper.selectSysActivationCodeById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param sysActivationCode 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<SysActivationCode> selectSysActivationCodeList(SysActivationCode sysActivationCode)
    {
        return sysActivationCodeMapper.selectSysActivationCodeList(sysActivationCode);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param sysActivationCode 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertSysActivationCode(SysActivationCode sysActivationCode)
    {
        return sysActivationCodeMapper.insertSysActivationCode(sysActivationCode);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param sysActivationCode 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateSysActivationCode(SysActivationCode sysActivationCode)
    {
        return sysActivationCodeMapper.updateSysActivationCode(sysActivationCode);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteSysActivationCodeByIds(String ids)
    {
        return sysActivationCodeMapper.deleteSysActivationCodeByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteSysActivationCodeById(Long id)
    {
        return sysActivationCodeMapper.deleteSysActivationCodeById(id);
    }
}
