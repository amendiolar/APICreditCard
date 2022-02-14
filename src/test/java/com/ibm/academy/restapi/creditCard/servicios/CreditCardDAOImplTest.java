package com.ibm.academy.restapi.creditCard.servicios;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.ibm.academy.restapi.creditCard.datos.DatosDummy;
import com.ibm.academy.restapi.creditCard.model.entity.CreditCard;
import com.ibm.academy.restapi.creditCard.repositories.CreditCardRepository;
import com.ibm.academy.restapi.creditCard.services.CreditCardDAO;
import com.ibm.academy.restapi.creditCard.services.CreditCardDAOImpl;

public class CreditCardDAOImplTest 
{
	CreditCardDAO creditCardDao;
	CreditCardRepository creditCardRepository;
	
	@BeforeEach
	void setup()
	{
		creditCardRepository= mock(CreditCardRepository.class);
		creditCardDao = new CreditCardDAOImpl(creditCardRepository);
	}
	
	@Test
	@DisplayName("Test: Sugerir tarjeta con base en preferencia, sueldo y edad")
	void buscarTarjetaSugerida()
	{
		//Given
		String yourPassion = "My style";
		Double monthlySalaryFrom = 32000.0;
		Double monthlySalaryTo = 32000.0;
		Integer ageFrom = 52;
		Integer ageTo = 52;
		when(creditCardRepository.buscarTarjetaSugerida(yourPassion, monthlySalaryFrom, monthlySalaryTo, ageFrom, ageTo)).thenReturn(Arrays.asList(DatosDummy.creditCard04()));
		
		//When
		List<CreditCard> expected = (List<CreditCard>) creditCardDao.buscarTarjetaSugerida(yourPassion, monthlySalaryFrom, monthlySalaryTo, ageFrom, ageTo);
		
		//Then
		assertThat(expected.get(0)).isEqualTo(DatosDummy.creditCard04());
		
		verify(creditCardRepository).buscarTarjetaSugerida(yourPassion, monthlySalaryFrom, monthlySalaryTo, ageFrom, ageTo);
	}
	
}
