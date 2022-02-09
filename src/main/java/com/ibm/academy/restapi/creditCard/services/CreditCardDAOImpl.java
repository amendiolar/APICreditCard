package com.ibm.academy.restapi.creditCard.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ibm.academy.restapi.creditCard.model.entity.CreditCard;
import com.ibm.academy.restapi.creditCard.repositories.CreditCardRepository;

@Service
public class CreditCardDAOImpl implements CreditCardDAO
{
	
	@Autowired
	private CreditCardRepository creditCardRepository;
	
	@Override
	@Transactional(readOnly = true)
	public Optional<CreditCard> buscarPorId(Long id) 
	{
		return creditCardRepository.findById(id);
	}

	@Override
	@Transactional
	public CreditCard guardar(CreditCard creditCard) 
	{
		return creditCardRepository.save(creditCard);
	}

	@Override
	@Transactional(readOnly = true)
	public Iterable<CreditCard> buscarTodos() 
	{
		return creditCardRepository.findAll();
	}

	@Override
	@Transactional
	public void eliminarPorId(Long id) 
	{
		creditCardRepository.deleteById(id);
	}
	
	/*
	@Autowired
	public CreditCardDAOImpl(CreditCardRepository creditCardRepository)
	{
		super(creditCardRepository);
	}
	*/
	
	@Override
	@Transactional(readOnly = true)
	public Iterable<CreditCard> buscarTarjetaSugerida(String yourPassion, Double monthlySalaryFrom, Double monthlySalaryTo, Integer ageFrom, Integer ageTo)
	{
		return creditCardRepository.buscarTarjetaSugerida(yourPassion, monthlySalaryFrom, monthlySalaryTo, ageFrom, ageTo);
	}
	

}
