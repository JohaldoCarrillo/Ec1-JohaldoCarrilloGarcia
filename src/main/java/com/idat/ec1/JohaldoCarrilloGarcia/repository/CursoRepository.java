package com.idat.ec1.JohaldoCarrilloGarcia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.ec1.JohaldoCarrilloGarcia.model.Curso;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Integer>{

}
