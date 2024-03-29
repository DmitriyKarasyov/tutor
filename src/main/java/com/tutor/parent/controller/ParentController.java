package com.tutor.parent.controller;

import com.tutor.parent.dto.ParentCreationDto;
import com.tutor.parent.dto.ParentDto;
import com.tutor.parent.service.ParentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/parent")
public class ParentController {

    private final ParentService service;

    @Autowired
    public ParentController(ParentService service) {
        this.service = service;
    }

    @PostMapping
    public ParentDto addParent(@RequestBody ParentCreationDto parentDto) {
        return service.addParent(parentDto);
    }
}
