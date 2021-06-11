package com.railway.passenger.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Card_details")
public class Card {
	@Id
	private String confirmation_no;
	private String card_no;
	private String card_holder_name;
	private String bank_name;
	private String card_exp_date;
	
	public Card() {
		super();
	}
	
	public Card(String confirmation_no,String card_no,String card_holder_name,String bank_name,String card_exp_date ) {
		this.card_no = card_no;
		this.confirmation_no = confirmation_no;
		this.card_holder_name = card_holder_name;
		this.bank_name = bank_name;
		this.card_exp_date = card_exp_date;
	}
	
	public String getCard_no() {
		return card_no;
	}
	public void setCard_no(String card_no) {
		this.card_no = card_no;
	}
	
	public String getConfirmation_no() {
		return confirmation_no;
	}
	public void setConfirmation_no(String confirmation_no) {
		this.confirmation_no = confirmation_no;
	}
	
	public String getCard_holder_name() {
		return card_holder_name;
	}
	public void setCard_holder_name(String card_holder_name) {
		this.card_holder_name = card_holder_name;
	}
	
	public String getBank_name() {
		return bank_name;
	}
	public void setBank_name(String bank_name) {
		this.bank_name = bank_name;
	}
	
	public String getCard_exp_date() {
		return card_exp_date;
	}
	public void setCard_exp_date(String card_exp_date) {
		this.card_exp_date = card_exp_date;
	}

	@Override
	public String toString() {
		return "Card [confirmation_no=" + confirmation_no + ", card_no=" + card_no + ", card_holder_name="
				+ card_holder_name + ", bank_name=" + bank_name + ", card_exp_date=" + card_exp_date + "]";
	}
	
	
	

}
