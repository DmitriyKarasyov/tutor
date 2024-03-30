package com.tutor.parent.service;

import com.tutor.parent.dto.ParentCreationDto;
import com.tutor.parent.dto.ParentDto;
import com.tutor.parent.mapper.ParentMapper;
import com.tutor.parent.repository.ParentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ParentServiceImpl implements ParentService {

    private final ParentRepository repository;
    private final ParentMapper mapper;

    @Autowired
    public ParentServiceImpl(ParentRepository repository, ParentMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }
    @Override
    public ParentDto addParent(ParentCreationDto parentCreationDto) {
        return mapper.makeParentDto(repository.save(mapper.makeParent(parentCreationDto)));
    }
}
