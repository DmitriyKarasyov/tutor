package com.tutor.parent.controller;

import com.tutor.parent.dto.ParentCreationDto;
import com.tutor.parent.dto.ParentDto;
import com.tutor.parent.service.ParentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/parent")
@Slf4j
public class ParentController {

    private final ParentService service;

    @Autowired
    public ParentController(ParentService service) {
        this.service = service;
    }

    @PostMapping("/{studentId}")
    public ParentDto addParent(@RequestBody ParentCreationDto parentCreationDto, @PathVariable Integer studentId) {
        log.info("POST new parent: {}", parentCreationDto);
        return service.addParent(parentCreationDto, studentId);
    }

    @PatchMapping("/{parentId}")
    public ParentDto updateParent(@RequestBody ParentDto parentDto, @PathVariable Integer parentId) {
        log.info("PATCH parent with id={}, new parent: {}", parentId, parentDto);
        return service.updateParent(parentDto, parentId);
    }

    @GetMapping("/{parentId}")
    public ParentDto getParent(@PathVariable Integer parentId) {
        log.info("GET parent with id={}", parentId);
        return service.getParent(parentId);
    }

    @DeleteMapping("/{parentId}")
    public void deleteParent(@PathVariable Integer parentId) {
        log.info("DELETE parent with id={}", parentId);
        service.deleteParent(parentId);
    }
}
