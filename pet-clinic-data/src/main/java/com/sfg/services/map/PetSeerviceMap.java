package com.sfg.services.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import com.sfg.module.Pet;

import com.sfg.services.PetService;

@Service
public class PetSeerviceMap extends AbstractMapService<Pet, Long>implements PetService{

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
