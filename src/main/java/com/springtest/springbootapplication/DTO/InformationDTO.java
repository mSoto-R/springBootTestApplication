package com.springtest.springbootapplication.DTO;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class InformationDTO {
    private String title;

    private String description;

    public InformationDTO(String title, String description) {
        this.title = title;
        this.description = description;
    }
}
