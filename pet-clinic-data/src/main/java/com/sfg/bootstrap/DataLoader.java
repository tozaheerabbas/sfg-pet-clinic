package com.sfg.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.sfg.module.Owner;
import com.sfg.module.Pet;
import com.sfg.module.Vet;
import com.sfg.services.OwnerService;
import com.sfg.services.PetService;
import com.sfg.services.VetService;
import com.sfg.services.map.OwnerServiceMap;
import com.sfg.services.map.PetSeerviceMap;
import com.sfg.services.map.VetServiceMap;

@Component
public class DataLoader implements CommandLineRunner {

	
	private final VetService vetService;
	private final OwnerService ownerService;
	
	

	public DataLoader(VetService vetService, OwnerService ownerService) {
		super();
		this.vetService = vetService;
		this.ownerService = ownerService;
	}



	@Override
	public void run(String... args) throws Exception {
		Owner o1 = new Owner();
		o1.setId(1L);
		o1.setFirstname("Zaheer");
		o1.setLastname("Momin");
		ownerService.save(1L, o1);
		Owner o2 = new Owner();
		o2.setId(2L);
		o2.setFirstname("Afzaliya");
		o2.setLastname("Momin");
		ownerService.save(2L, o2);
		
		Vet v1 = new Vet();
		v1.setId(1L);
		v1.setFirstname("Shaheer");
		v1.setLastname("Aqdas");
		vetService.save(1L, v1);
		Vet v2 = new Vet();
		v2.setId(2L);
		v2.setFirstname("Shaheer");
		v2.setLastname("Aqdas");
		vetService.save(2L, v2);
		
				
		
	}
	
	

}
