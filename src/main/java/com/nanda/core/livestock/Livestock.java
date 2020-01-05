package com.nanda.core.livestock;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Data
class Livestock {
    @Id
    private long id;
    private String name;
    private int type;
    private boolean big;
    private int amount;
    private String batch;
    private Date birthDate;
}
