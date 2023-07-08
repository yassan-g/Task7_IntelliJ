package com.example.task7;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class BoxerCreateForm {

    @NotBlank
    @Size(max = 20)
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
