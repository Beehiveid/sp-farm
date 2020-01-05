package com.nanda.core.livestock;

import com.nanda.core.base.AuditorBase;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@NoArgsConstructor
class Livestock extends AuditorBase {
    @Id
    private long id;
    private String name;
    private int type;
    private boolean big;
    private int amount;
    private String batch;
    private Date birthDate;
}
