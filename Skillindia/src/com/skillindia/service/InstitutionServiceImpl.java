package com.skillindia.service;

import java.util.List;

import com.skillindia.dao.InstitutionDao;
import com.skillindia.model.Institution;

public class InstitutionServiceImpl implements InstitutionService {

	private InstitutionDao institutedao;

	@Override
	public void addInstitution(Institution p) {
		institutedao.addInstitution(p);
	}

	@Override
	public void updateInstitution(Institution p) {
		institutedao.updateInstitution(p);
	}

	@Override
	public List<Institution> listInstitutions() {
		institutedao.listInstitutions();
		return null;
	}

	@Override
	public Institution getInstitutionByName(String name) {
		institutedao.getInstitutionByName(name);
		return null;
	}

	@Override
	public void removeInstitutionByName(String name) {
		institutedao.removeInstitutionByName(name);
	}

}
