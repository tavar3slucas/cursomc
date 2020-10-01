package com.nelioalves.cursomc.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nelioalves.cursomc.domain.Categoria;

@RestController
@RequestMapping(value="/categorias")
public class CategoriaResource {

	@RequestMapping(method = RequestMethod.GET)
	public List<Categoria> listar() {
		
		Categoria cat1 = new Categoria(1, "informática");
		Categoria cat2 = new Categoria(2, "escritorio");
		
		List<Categoria> list = new ArrayList<>();
		
		list.add(cat1);
		list.add(cat2);
		
		return list;
		
	}
}
