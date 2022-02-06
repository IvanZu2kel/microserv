package com.example.microserv.service;

import com.example.microserv.dto.CatDto;
import com.example.microserv.entity.Cat;
import com.example.microserv.repository.CatRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class CatService {
    private final CatRepository catRepository;

    public Cat save(CatDto catDto) {
        return catRepository.save(new Cat()
                .setName(catDto.getName())
                .setBirthDay(catDto.getBirthDay())
                .setId(UUID.randomUUID().toString())
                .setCreateAt(LocalDateTime.now()));
    }

    public Iterable<Cat> getAll() {
        return catRepository.findAll();
    }
}
