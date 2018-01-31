package tcc.iff.rdf.rest.service;

import java.util.ArrayList;
import java.util.List;

import tcc.iff.rdf.rest.model.Categoria;

public class CategoriaService {
	
	public List<Categoria> getAllCategorias(){
		Categoria cat1 = new Categoria(1L, "Celulares");
		Categoria cat2 = new Categoria(2L, "TV");
		Categoria cat3 = new Categoria(3L, "Eletrodomésticos");
		Categoria cat4 = new Categoria(4L, "Eletrônico");
		Categoria cat5 = new Categoria(5L, "Games");
		Categoria cat6 = new Categoria(6L, "Casa e Decoração");
		
		List<Categoria> categorias = new ArrayList<>();
		categorias.add(cat1);
		categorias.add(cat2);
		categorias.add(cat3);
		categorias.add(cat4);
		categorias.add(cat5);
		categorias.add(cat6);
		
		return categorias;
	}

	public Categoria addCategoria(Categoria cat) {
		// TODO Auto-generated method stub
		return null;
	}

	public Categoria updateCategoria(long id, Categoria cat) {
		// TODO Auto-generated method stub
		return null;
	}

	public void deleteCategoria(long id) {
		// TODO Auto-generated method stub
		
	}
	
	public List<Categoria> getAllCategoriasPaginated(int start, int size){
		/*
		ArrayList<Categoria> lista = new ArrayList<Categoria>(categorias.values());
		if(start + size > list.size()) return new ArrayList<Categoria>();
		return list.sublista(start, start + size);
		*/
		return null;
	}
	

}
