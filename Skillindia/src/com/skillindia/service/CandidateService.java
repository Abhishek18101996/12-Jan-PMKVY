package com.skillindia.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.skillindia.model.Candidate;


@Service
public interface CandidateService {
			public void addCandidate(Candidate p);//insert
			public void updateCandidate(Candidate p);//update/modify
			public List<Candidate> listCandidates();//retrieve/listAll
			public Candidate getCandidateByName(String name);//search
			public void removeCandidate(int id);//delete/remove
		

}

