package com.best.spring.mapper;

import com.best.spring.domain.Student;
import com.best.spring.dto.StudentDTO;
import javax.annotation.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-01-26T20:47:07+0600",
    comments = "version: 1.3.1.Final, compiler: Eclipse JDT (IDE) 3.37.0.v20240103-0614, environment: Java 17.0.9 (Eclipse Adoptium)"
)
@Component
public class StudentMapperImpl implements StudentMapper {

    @Autowired
    private CourseMapper courseMapper;

    @Override
    public Student toModel(StudentDTO studentDto) {
        if ( studentDto == null ) {
            return null;
        }

        Student student = new Student();

        student.setBatch( studentDto.getBatch() );
        student.setCourse( courseMapper.toCourse( studentDto.getCourse() ) );
        student.setGroup( studentDto.getGroup() );
        student.setId( studentDto.getId() );
        student.setName( studentDto.getName() );
        student.setSemester( studentDto.getSemester() );

        return student;
    }

    @Override
    public StudentDTO toDto(Student student) {
        if ( student == null ) {
            return null;
        }

        StudentDTO studentDTO = new StudentDTO();

        studentDTO.setBatch( student.getBatch() );
        studentDTO.setCourse( courseMapper.fromCourse( student.getCourse() ) );
        studentDTO.setGroup( student.getGroup() );
        studentDTO.setId( student.getId() );
        studentDTO.setName( student.getName() );
        studentDTO.setSemester( student.getSemester() );
        studentDTO.setYear( student.getYear() );

        return studentDTO;
    }
}
