package com.skillindia.dao;

import java.util.List;

import com.skillindia.model.Candidate;

public interface CandidateDao {
	public void addCandidate(Candidate p);//insert
	public void updateCandidate(Candidate p);//update/modify
	public List<Candidate> listCandidates();//retrieve/listAll
	public Candidate getCandidateByName(String name);//search
	public void removeCandidate(int id);//delete/remove

}
