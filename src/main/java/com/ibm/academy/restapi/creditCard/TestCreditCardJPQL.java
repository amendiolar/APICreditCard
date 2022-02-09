package com.ibm.academy.restapi.creditCard;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.ibm.academy.restapi.creditCard.model.entity.CreditCard;
import com.ibm.academy.restapi.creditCard.services.CreditCardDAO;

@Component
public class TestCreditCardJPQL implements CommandLineRunner
{
	@Autowired
	private CreditCardDAO creditCardDao;
	
	@Override
	public void run(String... args) throws Exception 
	{
		/*
		CreditCard Shopping2 = new CreditCard(null, "My style", 30000.0, 34999.0, 18, 23, "B*smart, Afinity Card", "amendiola");
		CreditCard Shopping3 = new CreditCard(null, "My style", 30000.0, 34999.0, 24, 32, "B*smart, Platinum, Afinity Card", "amendiola");
		CreditCard Shopping4 = new CreditCard(null, "My style", 30000.0, 34999.0, 33, 75, "B*smart, Afinity Card", "amendiola");
		CreditCard Shopping5 = new CreditCard(null, "My style", 35000.0, 999999.0, 18, 23, "B*smart", "amendiola");
		CreditCard Shopping6 = new CreditCard(null, "My style", 35000.0, 999999.0, 24, 75, "B*smart, Platinum", "amendiola");
		
		CreditCard creditCard2 = creditCardDao.guardar(Shopping2);
		CreditCard creditCard3 = creditCardDao.guardar(Shopping3);
		CreditCard creditCard4 = creditCardDao.guardar(Shopping4);
		CreditCard creditCard5 = creditCardDao.guardar(Shopping5);
		CreditCard creditCard6 = creditCardDao.guardar(Shopping6);
		
		System.out.println(creditCard2.toString());
		System.out.println(creditCard3.toString());
		System.out.println(creditCard4.toString());
		System.out.println(creditCard5.toString());
		System.out.println(creditCard6.toString());
		*/
		
		List<CreditCard> tarjetasSugeridas = (List<CreditCard>) creditCardDao.buscarTarjetaSugerida("Shopping", 20000.0, 20000.0, 52, 52);
		tarjetasSugeridas.forEach(System.out::println);
	}

}
