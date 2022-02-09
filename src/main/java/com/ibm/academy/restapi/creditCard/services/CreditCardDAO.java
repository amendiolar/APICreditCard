package com.ibm.academy.restapi.creditCard.services;

import java.util.Optional;

import com.ibm.academy.restapi.creditCard.model.entity.CreditCard;

public interface CreditCardDAO 
{
	public Optional<CreditCard> buscarPorId(Long id);
	public CreditCard guardar(CreditCard creditCard);
	public Iterable<CreditCard> buscarTodos();
	public void eliminarPorId(Long id);
	
	public Iterable<CreditCard> buscarTarjetaSugerida(String yourPassion, Double monthlySalaryFrom, Double monthlySalaryTo, Integer ageFrom, Integer ageTo);
}
