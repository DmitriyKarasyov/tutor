package com.tutor.parent.controller;

import com.tutor.parent.dto.ParentDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/parent")
public class ParentController {

    @PostMapping
    public ParentDto addParent(@RequestBody ParentDto parentDto) {
        return parentDto;
    }
}
