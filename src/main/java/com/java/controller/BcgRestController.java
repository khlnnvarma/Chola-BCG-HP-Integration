package com.java.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.java.client.SoapClient;
import com.java.request.ProposalDocumentRequest;
import com.java.wsdl.java.ProposalDocumentPushResponse;

@RestController
public class BcgRestController {
	
	@Autowired
	private SoapClient soapClient;
	
	@PostMapping("/push/proposal/docs")
	public ProposalDocumentPushResponse pushproposaldocs(@RequestBody ProposalDocumentRequest pDocument)
	{
		return soapClient.getdetails(pDocument);
	}

}
