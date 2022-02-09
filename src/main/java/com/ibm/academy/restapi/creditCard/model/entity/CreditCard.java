package com.ibm.academy.restapi.creditCard.model.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "creditcard", schema = "creditcard")
public class CreditCard implements Serializable
{
	// Attributes
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "your_passion", nullable = false, length =30)
	private String yourPassion;
	
	@Column(name = "monthly_salary_from")
	private Double monthlySalaryFrom;
	
	@Column(name = "monthly_salary_to")
	private Double monthlySalaryTo;
	
	@Column(name = "age_from")
	private Integer ageFrom;
	
	@Column(name = "age_to")
	private Integer ageTo;
	
	@Column(name = "credit_card_suggested", length = 150)
	private String creditCardSuggested;
	
	@Column(name = "usario_creacion", nullable = false)
	private String usuarioCreacion;
	
	@Column(name = "fecha_creacion", nullable = false)
	private Date fechaCreacion;
	
	@Column(name = "fecha_modificacion")	
	private Date fechaModificacion;
	
	// Constructor with Args
	
	public CreditCard(Long id, String yourPassion, Double monthlySalaryFrom, Double monthlySalaryTo, Integer ageFrom, Integer ageTo,  String creditCardSuggested, String usuarioCreacion)
	{
		this.id = id;
		this.yourPassion = yourPassion;
		this.monthlySalaryFrom = monthlySalaryFrom;
		this.monthlySalaryTo = monthlySalaryTo;
		this.ageFrom = ageFrom;
		this.ageTo = ageTo;
		this.creditCardSuggested = creditCardSuggested;
		this.usuarioCreacion = usuarioCreacion;
	}
	
	public CreditCard() {}
	
	// Methods

	@Override
	public String toString() 
	{
		StringBuilder builder = new StringBuilder();
		builder.append("CreditCard [id=");
		builder.append(id);
		builder.append(", yourPassion=");
		builder.append(yourPassion);
		builder.append(", monthlySalaryFrom=");
		builder.append(monthlySalaryFrom);
		builder.append(", monthlySalaryTo=");
		builder.append(monthlySalaryTo);
		builder.append(", ageFrom=");
		builder.append(ageFrom);
		builder.append(", ageTo=");
		builder.append(ageTo);
		builder.append(", creditCardSuggested=");
		builder.append(creditCardSuggested);
		builder.append(", usuarioCreacion=");
		builder.append(usuarioCreacion);
		builder.append(", fechaCreacion=");
		builder.append(fechaCreacion);
		builder.append(", fechaModificacion=");
		builder.append(fechaModificacion);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(ageFrom, ageTo, creditCardSuggested, id, monthlySalaryFrom, monthlySalaryTo, yourPassion);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof CreditCard))
			return false;
		CreditCard other = (CreditCard) obj;
		return Objects.equals(ageFrom, other.ageFrom) && Objects.equals(ageTo, other.ageTo)
				&& Objects.equals(creditCardSuggested, other.creditCardSuggested) && Objects.equals(id, other.id)
				&& Objects.equals(monthlySalaryFrom, other.monthlySalaryFrom)
				&& Objects.equals(monthlySalaryTo, other.monthlySalaryTo)
				&& Objects.equals(yourPassion, other.yourPassion);
	}

	
	@PrePersist
	private void antesPersistir() 
	{
		this.fechaCreacion = new Date();
	}
	
	
	@PreUpdate
	private void antesActualizar() 
	{
		this.fechaModificacion = new Date();
	}

	private static final long serialVersionUID = -2105187081678649639L;
}
