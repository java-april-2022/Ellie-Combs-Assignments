package com.combs.savetravels.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="expenses")
public class Expense {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	@Size(min = 3, max = 200)
	private String name;
	@NotNull (message="Name Required")
	@Size(min = 5, max = 200)
	private String Vendor;
	@NotNull(message="Price Required")
	@DecimalMin(value = "0.01", inclusive = true)
	
	private Double Amount;
	@NotNull (message="Description Requried")
	@Size(min = 5, max = 200)
	private String Description;
	
	//Created At & Updated At
	
    @DateTimeFormat(pattern = "MM/dd/yyyy HH:mm:ss")
    private Date createdAt;
    @DateTimeFormat(pattern = "MM/dd/yyyy HH:mm:ss")
    private Date updatedAt;
    @PrePersist
    protected void onCreate(){
        this.createdAt = new Date();
    }
    @PreUpdate
    protected void onUpdate(){
        this.updatedAt = new Date();
    }
    
    //
    public Expense() {
    	
    }
	
	public Expense (String name, String Vendor,Double Amount, String Description){
		this.name = name;
		this.Vendor = Vendor;
		this.Amount = Amount;
		this.Description = Description;
	}


	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getVendor() {
		return Vendor;
	}



	public void setVendor(String vendor) {
		Vendor = vendor;
	}



	public Double getAmount() {
		return Amount;
	}



	public void setAmount(Double amount) {
		Amount = amount;
	}



	public String getDescription() {
		return Description;
	}



	public void setDescription(String description) {
		Description = description;
	}
	
}

	