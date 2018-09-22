package com.sfg.services.map;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public abstract class AbstractMapService <T, ID extends Long> {
	
	Map<Long,T> map =new HashMap<>();
	
	Set<T> findAll(){
		return new HashSet<T>(map.values());
	}
	
	T findById(ID id) {
		return map.get(id);
	}
	
	T save(T obj) {
		Long id = getNextId();
		map.put(id,obj);
		return obj;
	}
	
	void deleteById(ID id) {
		map.remove(id);
	}
	
	void delete(T obj) {
		map.entrySet().removeIf(entry -> entry.getValue().equals(obj) );
	}
	
	private Long getNextId() {
		Long nextId = 1L;
		if(map != null && map.size() > 0) {
			nextId = Collections.max(map.keySet()) + 1;
		}
		
		return nextId;
	}
	
}
