package com.sfg.services.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import com.sfg.module.Owner;

import com.sfg.services.OwnerService;

@Service
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {

	@Override
	public Set<Owner> findAll() {
		
		return super.findAll();
	}

	@Override
	public Owner findById(Long id) {
		
		return super.findById(id);
	}

	@Override
	public Owner save(Owner object) {
		
		return super.save(object);
	}

	@Override
	public void delete(Owner object) {
		super.delete(object);
		
	}

	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
		
	}

	@Override
	public Owner findByLastname(String lastname) {
		
		return null;
	}
	

}
