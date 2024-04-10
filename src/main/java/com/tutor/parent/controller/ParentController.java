package com.tutor.parent.controller;

import com.tutor.parent.dto.ParentCreationDto;
import com.tutor.parent.dto.ParentDto;
import com.tutor.parent.service.ParentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/parent")
public class ParentController {

    private final ParentService service;

    @Autowired
    public ParentController(ParentService service) {
        this.service = service;
    }

    @PostMapping("/{studentId}")
    public ParentDto addParent(@RequestBody ParentCreationDto parentDto, @PathVariable Integer studentId) {
        return service.addParent(parentDto, studentId);
    }

    @PatchMapping("/{parentId}")
    public ParentDto updateParent(@RequestBody ParentDto parentDto, @PathVariable Integer parentId) {
        return service.updateParent(parentDto, parentId);
    }

    @GetMapping("/{parentId}")
    public ParentDto getParent(@PathVariable Integer parentId) {
        return service.getParent(parentId);
    }
}
