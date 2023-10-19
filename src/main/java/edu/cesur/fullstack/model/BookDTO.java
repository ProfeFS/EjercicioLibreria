package edu.cesur.fullstack.model;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class BookDTO { 

    private Long id; 

    private String titulo; 

    private String autor; 

    private Boolean reservado; 

  

    // Getters y setters 

} 