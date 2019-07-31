package com.somuleco.courseservice.models;


import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import java.util.Date;

@Entity
public class CourseEnrollment {

    @Id
    private Long enrollmentId;
    private String userId;
    private String username;
    private Date dateOfEnrollment;


    @OneToOne
    private Course course;


}
