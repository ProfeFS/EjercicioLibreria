package edu.cesur.fullstack.services;

import java.util.ArrayList;

import edu.cesur.fullstack.model.ReservaDTO;
import edu.cesur.fullstack.model.UserDTO;

public interface ReservaService {
	
	ReservaDTO reserveBook(Integer bookId, Integer userId);
	void cancelReservation(Integer bookId, Integer userId);
	ArrayList<ReservaDTO> getAllReservations();

}
