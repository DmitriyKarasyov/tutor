package com.tutor.parent.mapper;

import com.tutor.parent.dto.ParentCreationDto;
import com.tutor.parent.dto.ParentDto;
import com.tutor.parent.model.Parent;
import org.springframework.stereotype.Service;

@Service
public class ParentMapper {

    public Parent makeParent(ParentCreationDto parentCreationDto) {
        return Parent.builder()
                .name(parentCreationDto.getName())
                .build();
    }

    public ParentDto makeParentDto(Parent parent) {
        return ParentDto.builder()
                .id(parent.getId())
                .name(parent.getName())
                .build();
    }
}
