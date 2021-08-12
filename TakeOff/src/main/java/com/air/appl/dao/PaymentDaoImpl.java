package com.air.appl.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.air.appl.beans.Payment;

@Repository("paymentDao")
@EnableTransactionManagement
public class PaymentDaoImpl implements PaymentDao {

	@PersistenceContext
	private EntityManager em;
	
	
	@Override
	public Payment payBill(Payment p) {
		System.out.println("DAO--Payment"+ p);
		em.persist(p);
		return p;
	}

}
