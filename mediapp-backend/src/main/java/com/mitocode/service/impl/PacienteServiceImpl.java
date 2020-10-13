package com.mitocode.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mitocode.model.Paciente;
import com.mitocode.repo.IPacienteRepo;
import com.mitocode.service.IPacienteService;
//la clase va a implementar de la interface IpacienteService
//ctrl + 1 para sobre escribir los metodos
//Definimos la logica que se encuentra en Repo
//Siempre el @Service debe estar en la clase, no en la implementacion

@Service
public class PacienteServiceImpl implements IPacienteService{


	@Autowired
	private IPacienteRepo repo;
	
	@Override
	public Paciente registrar(Paciente pac) {
		return repo.save(pac);
	}

	@Override
	public Paciente modificar(Paciente pac) {
		return repo.save(pac);
	}

	@Override
	public void eliminar(Integer id) {
		repo.deleteById(id);
	}
	
	@Override
	public Paciente listarPorId(Integer id) {		
		Optional<Paciente> op = repo.findById(id);
		return op.isPresent() ? op.get() : new Paciente();
	}

	
	@Override
	public List<Paciente> listar() {
		return repo.findAll();
	}

}
