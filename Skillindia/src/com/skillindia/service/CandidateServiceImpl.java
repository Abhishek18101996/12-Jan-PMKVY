package com.skillindia.service;

import java.util.List;

import com.skillindia.dao.CandidateDao;
import com.skillindia.model.Candidate;

public class CandidateServiceImpl implements  CandidateService {

private 	CandidateDao cdDao;
	@Override
	public void addCandidate(Candidate p) {
		cdDao.addCandidate(p);
		
	}

	@Override
	public void updateCandidate(Candidate p) {
		cdDao.updateCandidate(p);
		
	}

	@Override
	public List<Candidate> listCandidates() {
		return cdDao.listCandidates();
	}

	@Override
	public Candidate getCandidateByName(String name) {
		return cdDao.getCandidateByName(name);
	}

	@Override
	public void removeCandidate(int id) {
		cdDao.removeCandidate(id);
		
	}

}
