package edu.cesur.fullstack.services;

import java.util.ArrayList;

import edu.cesur.fullstack.model.ReservaDTO;
import edu.cesur.fullstack.model.UserDTO;

public interface ReservaService {
	
	ReservaDTO reserveBook(Long bookId, Long userId);
	void cancelReservation(Long bookId, Long userId);
	ArrayList<ReservaDTO> getAllReservationsByUser(Long userId);

}
