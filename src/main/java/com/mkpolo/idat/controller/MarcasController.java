package com.mkpolo.idat.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mkpolo.idat.entity.Marcas;
import com.mkpolo.idat.service.IMarcasService;

@RestController
@RequestMapping(value="/api/marcas/")
@CrossOrigin("*")
public class MarcasController {

	@Autowired
	private IMarcasService marcaService;
	
	@GetMapping(value="/all")
	public List<Marcas> listar(){
		return marcaService.listarMarcas();
	}
	
}
