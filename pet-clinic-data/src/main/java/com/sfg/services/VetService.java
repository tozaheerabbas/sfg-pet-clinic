package com.sfg.services;

import java.util.Set;
import com.sfg.module.Vet;

public interface VetService {
	Vet findById(Long id);
	Vet save(Vet vet);
	Set<Vet> findAll();

}
