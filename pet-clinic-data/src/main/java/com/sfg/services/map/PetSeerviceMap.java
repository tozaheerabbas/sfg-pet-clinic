package com.sfg.services.map;

import java.util.Set;

import com.sfg.module.Pet;
import com.sfg.services.CRUDService;

public class PetSeerviceMap extends AbstractMapService<Pet, Long>implements CRUDService<Pet, Long>{

	@Override
	public Set<Pet> findAll() {
		
		return super.findAll();
	}

	@Override
	public Pet findById(Long id) {
		
		return super.findById(id);
	}

	@Override
	public Pet save(Long id, Pet object) {
		
		return super.save(id, object);
	}

	@Override
	public void delete(Pet object) {
		super.delete(object);
	}

	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
		
	}

}
