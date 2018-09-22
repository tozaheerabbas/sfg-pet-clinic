package com.sfg.services.map;

import java.util.Set;

import com.sfg.module.Owner;

import com.sfg.services.OwnerService;

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
	public Owner save(Long id, Owner object) {
		
		return super.save(id, object);
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
