package com.veho.practice.service;

import java.util.List;

public interface CrudGenericService <T>{
    T findById(Long id);
    List<T> findAll();
    T remove (Long id);
    T save(T model);

}
