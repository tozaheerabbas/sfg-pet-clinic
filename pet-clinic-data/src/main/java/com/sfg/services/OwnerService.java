package com.sfg.services;

import com.sfg.module.Owner;

public interface OwnerService extends CRUDService<Owner, Long> {
	
	Owner findByLastname(String lastname);

}
