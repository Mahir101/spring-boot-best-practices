package com.best.spring.mapper;

import com.best.spring.domain.Course;
import com.best.spring.dto.CourseDTO;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-01-26T20:47:08+0600",
    comments = "version: 1.3.1.Final, compiler: Eclipse JDT (IDE) 3.37.0.v20240103-0614, environment: Java 17.0.9 (Eclipse Adoptium)"
)
@Component
public class CourseMapperImpl implements CourseMapper {

    @Override
    public Course toCourse(CourseDTO courseDTO) {
        if ( courseDTO == null ) {
            return null;
        }

        Course course = new Course();

        course.setCode( courseDTO.getCode() );
        course.setId( courseDTO.getId() );
        course.setName( courseDTO.getName() );

        return course;
    }

    @Override
    public CourseDTO fromCourse(Course course) {
        if ( course == null ) {
            return null;
        }

        CourseDTO courseDTO = new CourseDTO();

        courseDTO.setCode( course.getCode() );
        courseDTO.setId( course.getId() );
        courseDTO.setName( course.getName() );

        return courseDTO;
    }
}
