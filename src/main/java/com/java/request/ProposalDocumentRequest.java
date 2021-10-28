package com.java.request;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ProposalDocumentRequest implements Serializable  {
	
	private LoginDetails LoginData;
	private String ProposalNumber;
	private List<Documents> ProposalDocuments;
	
	
	public ProposalDocumentRequest() {
		super();
		// TODO Auto-generated constructor stub
	}


	public ProposalDocumentRequest(LoginDetails loginData, String proposalNumber, List<Documents> proposalDocuments) {
		super();
		LoginData = loginData;
		ProposalNumber = proposalNumber;
		ProposalDocuments = proposalDocuments;
	}


	public LoginDetails getLoginData() {
		return LoginData;
	}


	public void setLoginData(LoginDetails loginData) {
		LoginData = loginData;
	}


	public String getProposalNumber() {
		return ProposalNumber;
	}


	public void setProposalNumber(String proposalNumber) {
		ProposalNumber = proposalNumber;
	}


	public List<Documents> getProposalDocuments() {
		return ProposalDocuments;
	}


	public void setProposalDocuments(List<Documents> proposalDocuments) {
		ProposalDocuments = proposalDocuments;
	}
	
	


}