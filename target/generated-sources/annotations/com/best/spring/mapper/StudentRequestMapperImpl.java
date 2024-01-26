package com.best.spring.mapper;

import com.best.spring.dto.CourseDTO;
import com.best.spring.dto.StudentDTO;
import com.best.spring.dto.StudentRequestDto;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-01-26T20:47:07+0600",
    comments = "version: 1.3.1.Final, compiler: Eclipse JDT (IDE) 3.37.0.v20240103-0614, environment: Java 17.0.9 (Eclipse Adoptium)"
)
@Component
public class StudentRequestMapperImpl implements StudentRequestMapper {

    @Override
    public StudentDTO toStudentDto(StudentRequestDto studentRequestDto) {
        if ( studentRequestDto == null ) {
            return null;
        }

        StudentDTO studentDTO = new StudentDTO();

        studentDTO.setCourse( studentRequestDtoToCourseDTO( studentRequestDto ) );
        studentDTO.setBatch( studentRequestDto.getBatch() );
        studentDTO.setGroup( studentRequestDto.getGroup() );
        studentDTO.setId( studentRequestDto.getId() );
        studentDTO.setName( studentRequestDto.getName() );
        studentDTO.setSemester( studentRequestDto.getSemester() );

        return studentDTO;
    }

    protected CourseDTO studentRequestDtoToCourseDTO(StudentRequestDto studentRequestDto) {
        if ( studentRequestDto == null ) {
            return null;
        }

        CourseDTO courseDTO = new CourseDTO();

        courseDTO.setId( studentRequestDto.getCourseId() );

        return courseDTO;
    }
}
