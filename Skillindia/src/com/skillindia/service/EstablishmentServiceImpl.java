package com.skillindia.service;

import java.util.List;

import com.skillindia.dao.EstablishmentDao;
import com.skillindia.model.Establishment;

public class EstablishmentServiceImpl implements EstablishmentService {

	private EstablishmentDao establishmentdao;

	@Override
	public void addEstablishment(Establishment p) {
		establishmentdao.addEstablishment(p);
	}

	@Override
	public void updateEstablishment(Establishment p) {
		establishmentdao.updateEstablishment(p);
	}

	@Override
	public List<Establishment> listEstablishments() {
		establishmentdao.listEstablishments();
		return null;
	}

	@Override
	public Establishment getEstablishmentByName(String name) {
establishmentdao.getEstablishmentByName(name);
return null;
	}

	@Override
	public void removeEstablishmentByName(String name ) {
		establishmentdao.removeEstablishmentByName(name);
	}

}
