package br.com.devsuperior.hrpayroll.entities;

import java.io.Serializable;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Worker implements Serializable{
	private static final long serialVersionUID = 1L;

	@EqualsAndHashCode.Include
	private Long Id;
	private String name;
	private Double dailyIncome;
	
}
