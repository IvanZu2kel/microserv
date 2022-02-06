package com.example.microserv.controller;

import com.example.microserv.dto.CatDto;
import com.example.microserv.entity.Cat;
import com.example.microserv.service.CatService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/cats")
@Tag(name = "cats controller")
public class CatController {
    private final CatService catService;

    @PostMapping
    @Operation(summary = "save cat")
    public Cat saveCat(@RequestBody CatDto cat) {
        return catService.save(cat);
    }

    @GetMapping
    @Operation(summary = "get cats")
    public Iterable<Cat> getCats() {
        return catService.getAll();
    }
}
