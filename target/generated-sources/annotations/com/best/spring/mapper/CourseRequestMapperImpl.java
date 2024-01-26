package com.best.spring.mapper;

import com.best.spring.dto.CourseDTO;
import com.best.spring.dto.CourseRequestDto;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-01-26T20:47:08+0600",
    comments = "version: 1.3.1.Final, compiler: Eclipse JDT (IDE) 3.37.0.v20240103-0614, environment: Java 17.0.9 (Eclipse Adoptium)"
)
@Component
public class CourseRequestMapperImpl implements CourseRequestMapper {

    @Override
    public CourseDTO toCourseDto(CourseRequestDto courseRequestDto) {
        if ( courseRequestDto == null ) {
            return null;
        }

        CourseDTO courseDTO = new CourseDTO();

        courseDTO.setCode( courseRequestDto.getCode() );
        courseDTO.setId( courseRequestDto.getId() );
        courseDTO.setName( courseRequestDto.getName() );

        return courseDTO;
    }
}
