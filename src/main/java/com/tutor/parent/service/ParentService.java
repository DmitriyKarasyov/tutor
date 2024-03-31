package com.tutor.parent.service;

import com.tutor.parent.dto.ParentCreationDto;
import com.tutor.parent.dto.ParentDto;

public interface ParentService {

    ParentDto addParent(ParentCreationDto parentCreationDto);

    ParentDto updateParent(ParentDto parentDto, Integer parentId);
}
