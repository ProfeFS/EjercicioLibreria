package edu.cesur.fullstack.model;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ReservaDTO { 

    private Integer id; 

    private Integer libroId; 

    private Integer usuarioId; 

    private LocalDate fechaReserva; 
    
    private LocalDate returnDate;

  

    // Getters y setters 

} 