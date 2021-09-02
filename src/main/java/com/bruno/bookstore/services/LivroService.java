package com.bruno.bookstore.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import com.bruno.bookstore.domain.Livro;
import com.bruno.bookstore.dtos.LivroDTO;
import com.bruno.bookstore.repositories.LivroRepository;
import com.bruno.bookstore.services.exceptions.ObjectNotFoundException;

@Service
public class LivroService {
	
	@Autowired
	private LivroRepository repository;
	
	public Livro findById(Integer id) {
		Optional<Livro> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Livro.class.getName()));
	}
	
	public List<Livro> findAll() {
		return repository.findAll();
	}
	
	public Livro create(Livro obj) {
		obj.setId(null);
		return repository.save(obj);
	}
	
	public Livro update(Integer id, LivroDTO objDTO) {
		Livro obj = findById(id);
		obj.setTitulo = objDTO.getTitulo();
		obj.setNome_autor = objDTO.getNome_autor();
		obj.setTexto = objDTO.getTexto();
		return repository.save(obj);
	}
	
	public void delete(Integer id) {
		findById(id);
	}

}
