package com.services;

import java.util.List;

import com.entities.Person;


public interface PersonService {

	public List<Person> listPersons();
	public void addPerson(Person p);
	public void updatePerson(Person p);
	public Person getPersonById(int id);
	public void removePerson(int id);
}