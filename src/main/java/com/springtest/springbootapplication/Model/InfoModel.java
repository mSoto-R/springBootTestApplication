package com.springtest.springbootapplication.Model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class InfoModel {
    private String title, subtitle, description;

    public InfoModel(String title, String subtitle, String description) {
        this.title = title;
        this.subtitle = subtitle;
        this.description = description;
    }

}
