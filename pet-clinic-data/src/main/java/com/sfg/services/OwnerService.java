package com.sfg.services;

import java.util.Set;

import com.sfg.module.Owner;

public interface OwnerService {
	Owner findById(Long id);
	Owner save(Owner owner);
	Set<Owner> findAll();
	Owner findByLastname(String lastname);

}
