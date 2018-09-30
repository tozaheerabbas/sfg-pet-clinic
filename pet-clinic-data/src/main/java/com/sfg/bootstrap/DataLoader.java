package com.sfg.bootstrap;

import java.time.LocalDate;
import java.util.Map;
import java.util.Set;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.sfg.module.Owner;
import com.sfg.module.Pet;
import com.sfg.module.PetType;
import com.sfg.module.Speciality;
import com.sfg.module.Vet;
import com.sfg.services.OwnerService;
import com.sfg.services.PetService;
import com.sfg.services.PetTypeService;
import com.sfg.services.SpecialityService;
import com.sfg.services.VetService;


@Component
public class DataLoader implements CommandLineRunner {

	
	private final VetService vetService;
	private final OwnerService ownerService;
	private final PetTypeService petTypeService;	
	private final PetService petService;
	private final SpecialityService specialityService;
	

	public DataLoader(VetService vetService, OwnerService ownerService, PetTypeService petTypeService,PetService petService, SpecialityService specialityService) {
		super();
		this.vetService = vetService;
		this.ownerService = ownerService;
		this.petTypeService = petTypeService;
		this.petService = petService;
		this.specialityService = specialityService;
	}



	@Override
	public void run(String... args) throws Exception {
		
		PetType pt1 = new PetType();
		pt1.setId(1L);
		pt1.setName("dog");
		petTypeService.save(pt1);
		PetType pt2 = new PetType();
		pt2.setId(2L);
		pt2.setName("cat");
		petTypeService.save(pt2);		
		
		Owner o1 = new Owner();
		o1.setId(1L);
		o1.setFirstname("Zaheer");
		o1.setLastname("Momin");
		o1.setAddress("123 avenue one");
		o1.setCity("Pune");
		o1.setPhone("12345678");	
		
		Owner o2 = new Owner();
		o2.setId(2L);
		o2.setFirstname("Afzaliya");
		o2.setLastname("Momin");
		o2.setAddress("343 palmgrove");
		o2.setCity("Pune");
		o2.setPhone("83838383883");
		
		
		Pet dog = new Pet();
		dog.setId(1L);
		dog.setOwner(o1);
		dog.setPetType(pt1);
		dog.setBithDate(LocalDate.now());
		petService.save(dog);
		
		Set<Pet> owners = o1.getPets();
		owners.add(dog);
		o1.setPets(owners);
		ownerService.save(o1);
		
		Pet cat = new Pet();
		cat.setId(2L);
		cat.setOwner(o2);
		cat.setPetType(pt2);
		cat.setBithDate(LocalDate.now());
		petService.save(cat);
		
		owners = o2.getPets();
		owners.add(cat);
		o2.setPets(owners);
		ownerService.save(o2);
		
		
		Speciality spl = new Speciality();
		spl.setId(1L);
		spl.setDescription("stupid");
		specialityService.save(spl);
		
		Vet v1 = new Vet();
		v1.setId(1L);
		v1.setFirstname("Shaheer");
		v1.setLastname("Aqdas");
		
		Set<Speciality> splset = v1.getSpecialities();
		splset.add(spl);
		v1.setSpecialities(splset);
		vetService.save(v1);
		
		Vet v2 = new Vet();
		v2.setId(2L);
		v2.setFirstname("Hina");
		v2.setLastname("Siddiqui");
		splset = v2.getSpecialities();
		splset.add(spl);
		v2.setSpecialities(splset);
		vetService.save(v2);
		
		
		
		
				
		
	}
	
	

}
