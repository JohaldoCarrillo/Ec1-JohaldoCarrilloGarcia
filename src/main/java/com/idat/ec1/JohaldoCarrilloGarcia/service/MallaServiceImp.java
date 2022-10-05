package com.idat.ec1.JohaldoCarrilloGarcia.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.ec1.JohaldoCarrilloGarcia.model.Malla;
import com.idat.ec1.JohaldoCarrilloGarcia.repository.MallaRepository;

@Service
public class MallaServiceImp implements MallaService {
	
	@Autowired
	private MallaRepository repositorio;

	@Override
	public void guardar(Malla malla) {
		repositorio.save(malla);

	}

	@Override
	public void actualizar(Malla malla) {
		repositorio.saveAndFlush(malla);

	}

	@Override
	public void eliminar(Integer id) {
		repositorio.deleteById(id);

	}

	@Override
	public List<Malla> listar() {
		return repositorio.findAll();
	}

	@Override
	public Malla obtener(Integer id) {
		return repositorio.findById(id).orElse(null);
	}

}
