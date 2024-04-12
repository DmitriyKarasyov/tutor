package com.tutor.parent.service;

import com.tutor.parent.dto.ParentCreationDto;
import com.tutor.parent.dto.ParentDto;
import com.tutor.parent.mapper.ParentMapper;
import com.tutor.parent.model.Parent;
import com.tutor.parent.repository.ParentRepository;
import com.tutor.student.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ParentServiceImpl implements ParentService {

    private final ParentRepository parentRepository;
    private final StudentRepository studentRepository;

    @Autowired
    public ParentServiceImpl(ParentRepository parentRepository, StudentRepository studentRepository) {
        this.parentRepository = parentRepository;
        this.studentRepository = studentRepository;
    }
    @Override
    public ParentDto addParent(ParentCreationDto parentCreationDto, Integer studentId) {
        return ParentMapper.makeParentDto(
                parentRepository.save(
                        ParentMapper.makeParent(
                                parentCreationDto, studentRepository.getReferenceById(studentId))));
    }

    @Override
    public ParentDto updateParent(ParentDto parentDto, Integer parentId) {
        Parent savedParent = parentRepository.getReferenceById(parentId);
        if (parentDto.getName() != null && !parentDto.getName().isBlank()) {
            savedParent.setName(parentDto.getName());
        }
        if (parentDto.getTelephoneNumber() != null && !parentDto.getTelephoneNumber().isBlank()) {
            savedParent.setTelephoneNumber(parentDto.getTelephoneNumber());
        }
        return ParentMapper.makeParentDto(parentRepository.save(savedParent));
    }

    @Override
    public ParentDto getParent(Integer parentId) {
        return ParentMapper.makeParentDto(parentRepository.getReferenceById(parentId));
    }

    @Override
    public void deleteParent(Integer parentId) {
        parentRepository.deleteById(parentId);
    }
}
