package com.springtest.springbootapplication.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springtest.springbootapplication.DTO.InformationDTO;
import com.springtest.springbootapplication.Service.InformationService;

@RestController

@RequestMapping("/general")
public class InfoRestController {
    InformationService informationService = new InformationService();

    @RequestMapping(path = "/getInfo", method = RequestMethod.GET)
    public InformationDTO getInfo() {
        
        InformationDTO info = informationService.getInfo();
        return info;
    }
}
