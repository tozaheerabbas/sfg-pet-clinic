package com.sfg.services.map;

import java.util.Set;

import com.sfg.module.Vet;
import com.sfg.services.CRUDService;

public class VetServiceMap extends AbstractMapService<Vet, Long>implements CRUDService<Vet, Long>{

	@Override
	public Set<Vet> findAll() {
		
		return super.findAll();
	}

	@Override
	public Vet findById(Long id) {
		
		return super.findById(id);
	}

	@Override
	public Vet save(Long id, Vet object) {
		
		return super.save(id, object);
	}

	@Override
	public void delete(Vet object) {
		super.delete(object);
		
	}

	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
		
	}
	

}
