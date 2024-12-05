package com.ruoyi.system.domain.response;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class SysDeviceResponse implements Serializable {
    
    private static final long serialVersionUID = 1L;

    private Date endDate;
    
    private String msg;
    
    private boolean check;
}
