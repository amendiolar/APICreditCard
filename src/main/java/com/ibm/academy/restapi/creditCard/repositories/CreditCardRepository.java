package com.ibm.academy.restapi.creditCard.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ibm.academy.restapi.creditCard.model.entity.CreditCard;

@Repository
public interface CreditCardRepository extends CrudRepository<CreditCard, Long>
{
	@Query("select c from CreditCard c where c.yourPassion = ?1 and c.monthlySalaryFrom <= ?2 and c.monthlySalaryTo >= ?3 and c.ageFrom <= ?4 and c.ageTo >= ?5")
	public Iterable<CreditCard> buscarTarjetaSugerida(String yourPassion, Double monthlySalaryFrom, Double monthlySalaryTo, Integer ageFrom, Integer ageTo );
}
