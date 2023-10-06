package me.dio.domain.model;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity(name ="tb_card")
public class Card {

	@ID 
	@GeneratedValue(GenerationType IDENTITY)
	private Long id;
	
	@Column(unique = true)
	private String number;
	
	@Column(name = "available_limit", precision = 13, scale = 2)
	private BigDecimal limit;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public BigDecimal getLimit() {
		return limit;
	}
	public void setLimit(BigDecimal limit) {
		this.limit = limit;
	}
}
