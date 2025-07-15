package com.springtest.springbootapplication.Service;

import com.springtest.springbootapplication.DTO.InformationDTO;

public class InformationService {
    public InformationDTO getInfo() {
        InformationDTO informationDTO = new InformationDTO();
        informationDTO.setTitle("Title of the Information");
        informationDTO.setDescription("Description of the Information");
        return informationDTO;
    }
}
