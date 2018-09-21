package com.sfg.services;

import java.util.Set;

public interface CRUDService<T, ID> {
	Set<T> findAll();
	T findById(ID id);
	T save(ID id, T object);
	void delete(T object);
	void deleteById(ID id);

}
