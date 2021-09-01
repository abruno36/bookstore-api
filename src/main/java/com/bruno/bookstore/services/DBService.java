package com.bruno.bookstore.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bruno.bookstore.domain.Categoria;
import com.bruno.bookstore.domain.Livro;
import com.bruno.bookstore.repositories.CategoriaRepository;
import com.bruno.bookstore.repositories.LivroRepository;

@Service
public class DBService {

	@Autowired
	private CategoriaRepository categoriaRepository;

	@Autowired
	private LivroRepository livroRepository;

	public void instanciaBaseDeDados() {
		
		Categoria cat1 = new Categoria(null, "Informática", "Livros de TI");
		Categoria cat2 = new Categoria(null, "Culinária", "Livros de Alimentações e Receitas");
		Categoria cat3 = new Categoria(null, "Romance", "Livros em geral");
		Categoria cat4 = new Categoria(null, "Suspense", "Livros de suspense e terror");

		Livro l1 = new Livro(null, "Clean Code", "Robert Martin",
				"Ao contrário do que se acredita, Lorem Ipsum não é simplesmente um texto randômico. ", cat1);
		Livro l2 = new Livro(null, "Cozinha prática", "Rita Lobo",
				"Neste novo livro, Rita Lobo apresenta 60 receitas e todas as dicas, técnicas culinárias e truques de economia doméstica da temporada de básicos do programa Cozinha Prática, do GNT",
				cat2);
		Livro l3 = new Livro(null, "O que tem na geladeira?", "Rita Lobo",
				"Como é que eu transformo a compra da feira em refeições variadas e saborosas todo santo dia? Este livro tem a resposta. Rita Lobo ensina sua fórmula de criar receitas e apresenta mais de 200 opções para variar o cardápio",
				cat2);
		Livro l4 = new Livro(null, "Capitão Cueca e a tirânica retaliação", "Dav Pilkey",
				"Jorge e Haroldo achavam que nunca mais teriam medo de dar a descarga… Até um grande inimigo voltar: a Privada Turbo 2000. Depois de ter sido expulsa da Terra pelo Capitão Cueca, tudo o que ela quer é se vingar e dominar o mundo!",
				cat3);
		Livro l5 = new Livro(null, "A carta secreta", "Lucinda Riley",
				"A carta secreta é um livro multifacetado, escrito com o primor e a poderosa imaginação que já são marcas registradas de Lucinda Riley. Um jogo de gato e rato.",
				cat4);
		Livro l6 = new Livro(null, "A garota do lago", "Charlie Donlea",
				"Summit Lake, uma pequena cidade entre montanhas, é esse tipo de lugar, bucólico e com encantadoras casas dispostas à beira de um longo trecho de água intocada.Duas semanas atrás, a estudante de direito Becca Eckersley foi brutalmente assassinada",
				cat4);

		cat1.getLivros().addAll(Arrays.asList(l1));
		cat2.getLivros().addAll(Arrays.asList(l2, l3));
		cat3.getLivros().addAll(Arrays.asList(l4));
		cat4.getLivros().addAll(Arrays.asList(l5, l6));

		this.categoriaRepository.saveAll(Arrays.asList(cat1, cat2, cat3, cat4));
		this.livroRepository.saveAll(Arrays.asList(l1, l2, l3, l4, l5, l6));
	}

}
