package com.nanda.core.base;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.MappedSuperclass;
import java.util.List;

@MappedSuperclass
public class BaseService<T extends BaseRepository<U,V>, U, V> {
    @Autowired
    protected T repository;

    List<U> findAll(){
        return repository.findAll();
    }

    U findById(V id){
        return repository.findById(id).orElse(null);
    }

    protected void save(U u){
        repository.save(u);
    }

    public void save(List<U> u){
        repository.saveAll(u);
    }

    private U shouldExist(V id){
        U e = this.findById(id);

        if(e == null)
            throw new RuntimeException("Not Exist");

        return e;
    }

    void update(V id, U u) {
        U exist = this.shouldExist(id);

        if(exist != null)
            this.save(u);
    }

    void delete(V id) {
        U exist = this.shouldExist(id);

        if(exist != null)
            repository.delete(exist);
    }
}
