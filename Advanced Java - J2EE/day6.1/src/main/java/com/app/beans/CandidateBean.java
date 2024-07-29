package com.app.beans;

import java.sql.SQLException;
import java.util.LinkedHashMap;
import java.util.List;

import com.app.dao.CandidateDaoImpl;
import com.app.entities.Candidate;

public class CandidateBean {
//depcy 
	private CandidateDaoImpl dao;

	// def ctor
	public CandidateBean() throws SQLException {
		// depnt has to create the depcy
		dao = new CandidateDaoImpl();
		System.out.println("candidate bean created");
	}

	// add B.L method to get top 2 candidates
	public List<Candidate> getCandidates() throws SQLException {
		return dao.getTop2Candidates();
	}

	// add B.L method to get party wise votes
	public LinkedHashMap<String, Integer> getPartyVotes() throws SQLException {
		return dao.getPartywiseVotes();
	}
}
