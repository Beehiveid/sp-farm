package com.nanda.core.base;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.MappedSuperclass;
import java.util.List;

@MappedSuperclass
public class BaseService<T extends BaseRepository<U,V>, U, V> {
    @Autowired
    private T repository;

    List<U> findAll(){
        return repository.findAll();
    }

    U findById(V id){
        return repository.findById(id).orElse(null);
    }

    void save(U u){
        repository.save(u);
    }

    void save(List<U> u){
        repository.saveAll(u);
    }

    U shouldExist(V id){
        U e = this.findById(id);

        if(e == null)
            throw new RuntimeException("Not Exist");

        return e;
    }
}
