package com.nanda.core.base;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BaseService<T extends BaseRepository<U,V>, U, V> {
    @Autowired
    private T repository;

    List<U> findAll(){
        return repository.findAll();
    }

    U findById(V v){
        return repository.findById(v).orElse(null);
    }

    void save(U u){
        repository.save(u);
    }

    void save(List<U> u){
        repository.saveAll(u);
    }


}
