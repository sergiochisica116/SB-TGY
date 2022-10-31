package com.Yelmos.app.TeamDigitalYelmos.R;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Yelmos.app.TeamDigitalYelmos.M.Reserva;


@Repository
public interface ReservaR extends JpaRepository<Reserva, Long> {

}
