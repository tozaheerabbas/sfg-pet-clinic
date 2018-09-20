package com.sfg.services;

import java.util.Set;

import com.sfg.module.Pet;

public interface PetService {
	Pet findById(Long id);
	Pet save(Pet pet);
	Set<Pet> findAll();

}
