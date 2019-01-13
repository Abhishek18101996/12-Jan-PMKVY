package com.skillindia.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.skillindia.model.Establishment;

@Service
public interface EstablishmentService {
	public void addEstablishment(Establishment p);//insert
	public void updateEstablishment(Establishment p);//update/modify
	public List<Establishment> listEstablishments();//retrieve/listAll
	public Establishment getEstablishmentByName(String name);//search
	public void removeEstablishmentByName(String name);//delete/remove
}
