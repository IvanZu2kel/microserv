package com.example.microserv.dto;

import lombok.Data;
import lombok.experimental.Accessors;

import java.time.LocalDateTime;

@Data
@Accessors(chain = true)
public class CatDto {
    private String name;
    private LocalDateTime birthDay;
}
