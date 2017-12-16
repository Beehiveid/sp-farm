package com.nanda.core.base;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public abstract class BaseRepository<T, ID> implements JpaRepository<T, ID> {
}
