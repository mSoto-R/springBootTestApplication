package com.springtest.springbootapplication.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springtest.springbootapplication.DTO.InformacionDTO;

@RestController
@RequestMapping("/general")
public class InfoRestController {

    @RequestMapping(path = "/info", method = RequestMethod.GET)
    public InformacionDTO info() {
        return new InformacionDTO("Info is working!", "Descripcion");
    }
}
