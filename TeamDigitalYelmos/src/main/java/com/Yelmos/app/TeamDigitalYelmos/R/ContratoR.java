package com.Yelmos.app.TeamDigitalYelmos.R;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Yelmos.app.TeamDigitalYelmos.M.Contrato;

@Repository
public interface ContratoR extends JpaRepository<Contrato, Long> {

}