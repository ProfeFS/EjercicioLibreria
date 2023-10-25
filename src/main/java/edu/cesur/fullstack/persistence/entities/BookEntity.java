package edu.cesur.fullstack.persistence.entities;

import java.time.LocalDate;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "book")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookEntity { 

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE) //para posgres
	//@GeneratedValue(strategy = GenerationType.IDENTITY) //usado para mysql
    private Integer id; 

    private String titulo; 

    private String autor; 

    private Boolean reservado; 

} 