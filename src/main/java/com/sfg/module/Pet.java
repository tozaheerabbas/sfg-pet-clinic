package com.sfg.module;

import java.time.LocalDate;

public class Pet {
	PetType petType;
	public PetType getPetType() {
		return petType;
	}
	public void setPetType(PetType petType) {
		this.petType = petType;
	}
	public Owner getOwner() {
		return owner;
	}
	public void setOwner(Owner owner) {
		this.owner = owner;
	}
	public LocalDate getBithDate() {
		return bithDate;
	}
	public void setBithDate(LocalDate bithDate) {
		this.bithDate = bithDate;
	}
	Owner owner;
	LocalDate bithDate;

}
