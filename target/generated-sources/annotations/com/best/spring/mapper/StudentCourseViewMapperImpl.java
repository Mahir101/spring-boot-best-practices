package com.best.spring.mapper;

import com.best.spring.domain.StudentCourseView;
import com.best.spring.dto.StudentCourseViewDTO;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-01-26T20:47:08+0600",
    comments = "version: 1.3.1.Final, compiler: Eclipse JDT (IDE) 3.37.0.v20240103-0614, environment: Java 17.0.9 (Eclipse Adoptium)"
)
@Component
public class StudentCourseViewMapperImpl implements StudentCourseViewMapper {

    @Override
    public StudentCourseViewDTO toDto(StudentCourseView studentCourseView) {
        if ( studentCourseView == null ) {
            return null;
        }

        StudentCourseViewDTO studentCourseViewDTO = new StudentCourseViewDTO();

        studentCourseViewDTO.setCourseCode( studentCourseView.getCourseCode() );
        studentCourseViewDTO.setCourseName( studentCourseView.getCourseName() );
        studentCourseViewDTO.setName( studentCourseView.getName() );
        studentCourseViewDTO.setStudentId( studentCourseView.getStudentId() );

        return studentCourseViewDTO;
    }
}
