package edu.cesur.fullstack.model;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookDTO { 

    private Integer id; 

    private String titulo; 

    private String autor; 

    private Boolean reservado; 

  

    // Getters y setters 

} 