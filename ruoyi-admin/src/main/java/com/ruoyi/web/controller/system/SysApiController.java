package com.ruoyi.web.controller.system;

import com.ruoyi.system.domain.SysDevice;
import com.ruoyi.system.domain.response.SysDeviceResponse;
import com.ruoyi.system.service.ISysDeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/api")
public class SysApiController {

    @Autowired
    private ISysDeviceService sysDeviceService;
    
    @PostMapping("/checkDevice")
    @ResponseBody
    public SysDeviceResponse checkDevice(@RequestBody SysDevice device) {
        return sysDeviceService.checkDevice(device);
    }
    
    
}
