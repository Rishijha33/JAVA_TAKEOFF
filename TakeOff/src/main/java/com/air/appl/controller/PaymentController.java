package com.air.appl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.air.appl.beans.Flight;
import com.air.appl.beans.Payment;
import com.air.appl.services.PaymentService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/v1")
public class PaymentController {

	@Autowired
	private PaymentService service;
	
	@PostMapping("/payBill")
	public Payment payBill(@RequestBody Payment p)
	{
		return service.payBill(p);
	}
}