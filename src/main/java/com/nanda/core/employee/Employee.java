package com.nanda.core.employee;

import com.nanda.core.job.Job;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "job_id")
    private Job job;

}
