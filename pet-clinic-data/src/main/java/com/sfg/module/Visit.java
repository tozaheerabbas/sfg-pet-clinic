package com.sfg.module;

import java.time.LocalDate;

public class Visit extends BaseEntity{
	LocalDate date;
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public Pet getPet() {
		return pet;
	}
	public void setPet(Pet pet) {
		this.pet = pet;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	Pet pet;
	String description;
	
}
