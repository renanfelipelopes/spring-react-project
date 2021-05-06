package com.renanlopes.rlvendas.entities;

import java.util.ArrayList;
import java.util.List;

public class Seller {

	private Long idLong;
	private String name;
	
	private List<Sale> sales = new ArrayList<>();
	
	public Seller() {
		
	}

	public Seller(Long idLong, String name) {
		this.idLong = idLong;
		this.name = name;
	}

	public Long getIdLong() {
		return idLong;
	}

	public void setIdLong(Long idLong) {
		this.idLong = idLong;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Sale> getSales() {
		return sales;
	}
	
	
}
