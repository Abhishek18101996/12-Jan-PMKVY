package com.skillindia.dao;

import java.util.List;

import com.skillindia.model.Establishment;

public interface EstablishmentDao {

		public void addEstablishment(Establishment p);//insert
	public void updateEstablishment(Establishment p);//update/modify
	public List<Establishment> listEstablishments();//retrieve/listAll
	public Establishment getEstablishmentByName(String name);//search
	public void removeEstablishmentByName(String name);//delete/remove

}
