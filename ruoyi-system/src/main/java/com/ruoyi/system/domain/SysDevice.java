package com.ruoyi.system.domain;

import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import lombok.Data;

import java.util.Date;

/**
 * 【请填写功能名称】对象 sys_device
 * 
 * @author ruoyi
 * @date 2024-12-05
 */
@Data
public class SysDevice extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    @Excel(name = "设备ID", readConverterExp = "$column.readConverterExp()")
    private String deviceId;
    
    private String activationId;

    @Excel(name = "备注", readConverterExp = "$column.readConverterExp()")
    private String remark;
    
    /** $column.columnComment */
    @Excel(name = "排序", readConverterExp = "$column.readConverterExp()")
    private Long roleSort;
    
    private SysActivationCode sysActivationCode;


}
