package com.syntaxe.projet.entities;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
	public class etudiant { 
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY) 
	private Long idetudiant; 
	private Date adresse; 
	private String telephone; 

	} 

