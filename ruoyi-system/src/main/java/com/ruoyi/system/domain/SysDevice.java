package com.ruoyi.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

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

    /** $column.columnComment */
    @Excel(name = "到期时间", readConverterExp = "$column.readConverterExp()")
    private Date endDate;
    
    @Excel(name = "激活时间", readConverterExp = "$column.readConverterExp()")
    private Date activationDate;
    
    /** $column.columnComment */
    @Excel(name = "排序", readConverterExp = "$column.readConverterExp()")
    private Long roleSort;


}
