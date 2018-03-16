package com.dao;

import java.util.List;

import com.entities.Person;

public interface PersonDAO {

	
	public List<Person> listPersons();
	public void addPerson(Person p);
	 public void updatePerson(Person p);
	 public Person getPersonById(int id);
	public void removePerson(int id); 
}
