package com.mitocode.repo;

//una interface puede heredar otra interface 
//se referencian con sus genericos
import org.springframework.data.jpa.repository.JpaRepository;

import com.mitocode.model.Paciente;

public interface IPacienteRepo extends JpaRepository<Paciente, Integer> {

}
