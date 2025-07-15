package com.springtest.springbootapplication.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springtest.springbootapplication.DTO.InformationDTO;
import com.springtest.springbootapplication.Service.InformationService;

@RestController

@RequestMapping("/general")
public class InfoRestController {
    InformationService informationService = new InformationService();

    // Simple GET request to return InformationDTO
    @RequestMapping(path = "/getInfo", method = RequestMethod.GET)
    public InformationDTO getInfo() {

        return informationService.getInfo();
    }

    //Example of a GET request with parameters
    @RequestMapping(path = "/printInfo", method = RequestMethod.GET)
    public InformationDTO printInfo(@RequestParam String titulo, @RequestParam String descripcion) {
        return new InformationDTO(titulo, descripcion);
    }
}
