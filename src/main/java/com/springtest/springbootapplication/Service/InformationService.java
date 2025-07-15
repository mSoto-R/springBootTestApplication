package com.springtest.springbootapplication.Service;

import com.springtest.springbootapplication.DTO.InformationDTO;

public class InformationService {
    public InformationDTO getInfo() {
        return new InformationDTO("Info is working!", "Descripcion");
    }
}
