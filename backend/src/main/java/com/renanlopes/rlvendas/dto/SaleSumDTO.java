package com.renanlopes.rlvendas.dto;

import java.io.Serializable;

import com.renanlopes.rlvendas.entities.Seller;

public class SaleSumDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String sellerNameString;
	private Double sum;
	
	public SaleSumDTO() {
	}

	public SaleSumDTO(Seller seller, Double sum) {
		this.sellerNameString = seller.getName();
		this.sum = sum;
	}

	public String getSellerNameString() {
		return sellerNameString;
	}

	public void setSellerNameString(String sellerNameString) {
		this.sellerNameString = sellerNameString;
	}

	public Double getSum() {
		return sum;
	}

	public void setSum(Double sum) {
		this.sum = sum;
	}
}
