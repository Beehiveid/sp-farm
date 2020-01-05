package com.nanda.core.job;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Job {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    @Column(columnDefinition = "text")
    private String description;
}
