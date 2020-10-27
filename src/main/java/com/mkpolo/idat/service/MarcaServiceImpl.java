package com.mkpolo.idat.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mkpolo.idat.entity.Marcas;
import com.mkpolo.idat.repository.MarcasRepository;

@Service
public class MarcaServiceImpl implements IMarcasService{

	@Autowired
	private MarcasRepository marcasRepo;
	
	@Override
	public List<Marcas> listarMarcas() {
		return (List<Marcas>) marcasRepo.findAll();
	}

}
