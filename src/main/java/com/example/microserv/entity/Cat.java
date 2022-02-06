package com.example.microserv.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
@Setter
@Getter
@Accessors(chain = true)
public class Cat {
    @Id
    private String id;
    private String name;
    @Column(name = "birth_day")
    private LocalDateTime birthDay;
    @Column(name = "create_at")
    private LocalDateTime createAt;
}
