package sellerAdmin.controller;

import icu.bitgo.entity.common.BaseResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import sellerAdmin.service.SystemService;

@RestController
public class SystemController {
    private SystemService systemService;

    @Autowired
    public void setSystemService(SystemService systemService){
        this.systemService=systemService;
    }

    @GetMapping("/")
    public BaseResponse<Integer> getCount(){
        return systemService.getCount();
    }
}
