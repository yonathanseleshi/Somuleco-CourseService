package com.somuleco.courseservice.models;


import org.springframework.data.annotation.Id;


import javax.persistence.Entity;

@Entity
public class Course {

    @Id
    private Long courseId;
    private String courseName;
    private String courseCreatorUsername;


}
