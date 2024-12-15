package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.SysActivationCode;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author ruoyi
 * @date 2024-12-15
 */
public interface ISysActivationCodeService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public SysActivationCode selectSysActivationCodeById(Long id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param sysActivationCode 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<SysActivationCode> selectSysActivationCodeList(SysActivationCode sysActivationCode);

    /**
     * 新增【请填写功能名称】
     * 
     * @param sysActivationCode 【请填写功能名称】
     * @return 结果
     */
    public int insertSysActivationCode(SysActivationCode sysActivationCode);

    /**
     * 修改【请填写功能名称】
     * 
     * @param sysActivationCode 【请填写功能名称】
     * @return 结果
     */
    public int updateSysActivationCode(SysActivationCode sysActivationCode);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键集合
     * @return 结果
     */
    public int deleteSysActivationCodeByIds(String ids);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteSysActivationCodeById(Long id);
}
