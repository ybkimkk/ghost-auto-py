package com.ruoyi.web.controller.system;

import com.alibaba.fastjson.JSON;
import com.ruoyi.common.core.domain.R;
import com.ruoyi.system.domain.SysDevice;
import com.ruoyi.system.domain.response.SysDeviceResponse;
import com.ruoyi.system.service.ISysDeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class SysApiController {

    @Autowired
    private ISysDeviceService sysDeviceService;
    
    @PostMapping("/checkDevice")
    public R<SysDeviceResponse> checkDevice(@RequestBody SysDevice device) {
        return sysDeviceService.checkDevice(device);
    }
    
    
}
