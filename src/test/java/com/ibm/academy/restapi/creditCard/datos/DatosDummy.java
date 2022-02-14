package com.ibm.academy.restapi.creditCard.datos;

import com.ibm.academy.restapi.creditCard.model.entity.CreditCard;

public class DatosDummy 
{
	public static CreditCard creditCard01()
	{
		return new CreditCard(null, "My style", 30000.0, 34999.0, 18, 23, "B*smart, Afinity Card", "amendiola");
	}
	
	public static CreditCard creditCard02()
	{
		return new CreditCard(null, "My style", 30000.0, 34999.0, 24, 32, "B*smart, Platinum, Afinity Card", "amendiola");
	}
	
	public static CreditCard creditCard03()
	{
		return new CreditCard(null, "My style", 30000.0, 34999.0, 33, 75, "B*smart, Afinity Card", "amendiola");
	}
	
	public static CreditCard creditCard04()
	{
		return new CreditCard(null, "My style", 35000.0, 999999.0, 18, 23, "B*smart", "amendiola");
	}
	
	public static CreditCard creditCard05()
	{
		return new CreditCard(null, "My style", 35000.0, 999999.0, 24, 75, "B*smart, Platinum", "amendiola");
	}
	

}
