package com.java.request;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Documents {
	
	private String DocName;
	private String DocContent;
	private String Doctype;
	
	
	public Documents() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Documents(String docName, String docContent, String doctype) {
		super();
		DocName = docName;
		DocContent = docContent;
		Doctype = doctype;
	}


	public String getDocName() {
		return DocName;
	}


	public void setDocName(String docName) {
		DocName = docName;
	}


	public String getDocContent() {
		return DocContent;
	}


	public void setDocContent(String docContent) {
		DocContent = docContent;
	}


	public String getDoctype() {
		return Doctype;
	}


	public void setDoctype(String doctype) {
		Doctype = doctype;
	}
	
	
	

}
