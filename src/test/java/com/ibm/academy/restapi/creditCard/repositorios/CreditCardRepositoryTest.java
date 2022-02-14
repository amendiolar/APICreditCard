package com.ibm.academy.restapi.creditCard.repositorios;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import com.ibm.academy.restapi.creditCard.datos.DatosDummy;
import com.ibm.academy.restapi.creditCard.model.entity.CreditCard;
import com.ibm.academy.restapi.creditCard.repositories.CreditCardRepository;

public class CreditCardRepositoryTest 
{
	private CreditCardRepository creditCardRepository;
	
	@BeforeEach
	void setup()
	{
		//Given
		creditCardRepository.save(DatosDummy.creditCard01());
		creditCardRepository.save(DatosDummy.creditCard02());
		creditCardRepository.save(DatosDummy.creditCard03());
		creditCardRepository.save(DatosDummy.creditCard04());
		creditCardRepository.save(DatosDummy.creditCard05());
	}
	
	@AfterEach
	void tearDown()
	{
		creditCardRepository.deleteAll();
	}
	
	void buscarTarjetaSugerida()
	{
		//When
		List<CreditCard> expected = (List<CreditCard>) creditCardRepository.buscarTarjetaSugerida("My style", 32000.0, 32000.0, 52, 52);
		
		//Then
		assertThat(expected.size()==1).isTrue();
	}
}
