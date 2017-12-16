package com.nanda.core.base;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import javax.persistence.MappedSuperclass;
import java.util.List;

@MappedSuperclass
public class BaseController<T extends BaseService<R extends BaseRepository<U, V>, U, V>, U, V, R> {
    @Autowired
    private T service;

    @GetMapping
    public List<U> findAll(){
        return service.findAll();
    }

    @GetMapping("/{id}")
    public U findById(@PathVariable V id){
        return service.findById(id);
    }
}
