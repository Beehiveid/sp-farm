package com.nanda.core.employee;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.nanda.core.base.AuditorBase;
import com.nanda.core.job.Job;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@NoArgsConstructor
class Employee extends AuditorBase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "job_id")
    @JsonIgnoreProperties(value = {"description","createdDate","modifiedDate"})
    private Job job;
}
