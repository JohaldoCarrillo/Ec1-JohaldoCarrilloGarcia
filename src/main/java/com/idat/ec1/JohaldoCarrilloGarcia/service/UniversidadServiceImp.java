package com.idat.ec1.JohaldoCarrilloGarcia.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.ec1.JohaldoCarrilloGarcia.model.Universidad;
import com.idat.ec1.JohaldoCarrilloGarcia.repository.UniversidadRepository;

@Service
public class UniversidadServiceImp implements UniversidadService {
	@Autowired
	private UniversidadRepository repositorio;
	
	@Override
	public void guardar(Universidad universidad) {
		repositorio.save(universidad);

	}

	@Override
	public void actualizar(Universidad universidad) {
		repositorio.saveAndFlush(universidad);

	}

	@Override
	public void eliminar(Integer id) {
		repositorio.deleteById(id);

	}

	@Override
	public List<Universidad> listar() {
		return repositorio.findAll();
	}

	@Override
	public Universidad obtener(Integer id) {
		return repositorio.findById(id).orElse(null);
	}

}
