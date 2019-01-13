package com.skillindia.dao;

import java.util.List;

import com.skillindia.model.Institution;

public interface InstitutionDao {

	public void addInstitution(Institution p);//insert
	public void updateInstitution(Institution p);//update/modify
	public List<Institution> listInstitutions();//retrieve/listAll
	public Institution getInstitutionByName(String name);//search
	public void removeInstitutionByName(String name);//delete/remove

	
	
}
