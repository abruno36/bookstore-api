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
		Categoria cat5 = new Categoria(null, "Livros Clássicos", "Literatura Classicas");
		Categoria cat6 = new Categoria(null, "Ficção Científica", "Livros Cientificos");
		Categoria cat7 = new Categoria(null, "Livros Infantis", "Histórias engraçadas");
		Categoria cat8 = new Categoria(null, "eBooks em Inglês", "Recomendados para você | Histórias em geral");

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
		Livro l7 = new Livro(null, "A revolução dos bichos: Um conto de fadas", "Heitor Aquino Ferreira",
				"Verdadeiro clássico moderno, concebido por um dos mais influentes escritores do século XX, A revolução dos bichos é uma fábula sobre o poder. Narra a insurreição dos animais de uma granja contra seus donos. Progressivamente, porém, a revolução degenera numa tirania ainda mais opressiva que a dos humanos.\r\n"
				+ "Escrita em plena Segunda Guerra Mundial e publicada em 1945 depois de ter sido rejeitada por várias editoras, essa pequena narrativa causou desconforto ao satirizar ferozmente a ditadura stalinista numa época em que os soviéticos ainda eram aliados do Ocidente na luta contra o eixo nazifascista. De fato, são claras as referências: o despótico Napoleão seria Stálin, o banido Bola-de-Neve seria Trotsky, e os eventos políticos - expurgos, instituição de um estado policial, deturpação tendenciosa da História - mimetizam os que estavam em curso na União Soviética. Com o acirramento da Guerra Fria, as mesmas razões que causaram constrangimento na época de sua publicação levaram A revolução dos bichos a ser amplamente usada pelo Ocidente nas décadas seguintes como arma ideológica contra o comunismo. O próprio Orwell, adepto do socialismo e inimigo de qualquer forma de manipulação política, sentiu-se incomodado com a utilização de sua fábula como panfleto. Depois das profundas transformações políticas que mudaram a fisionomia do planeta nas últimas décadas, a pequena obra-prima de Orwell pode ser vista sem o viés ideológico reducionista.",
				cat5);
		Livro l8 = new Livro(null, "Drácula", "Bram Stoker",
				"Obras essenciais da literatura gótica: Drácula de Bram Stoker, Frankenstein de Mary Shelley, O Retrato de Dorian Gray de Oscar Wilde e O Fantasma da Ópera de Gaston Leroux. Com cenários medievais, personagens melodramáticos, desconfortos psicológicos, como medo e loucura, estão presentes nessas narrativas.",
				cat5);
		Livro l9 = new Livro(null, "O livro da ciência", "Marck John",
				"“A ciência é uma busca continua pela verdade – uma luta perpétua para descobrir como o universo funciona [...]”. O livro da ciência, sétimo volume da coleção As grandes ideias de todos os tempos – da qual fazem parte os bests-sellers O livro da filosofia e O livro da psicologia – traz de maneira simples e acessível os principais nomes e conceitos que moveram a curiosidade humana desde o início das civilizações. Escrito por professores e pesquisadores, o livro apresenta biografias e citações de grandes pensadores, linhas do tempo com os principais acontecimentos de cada período, diagramas que apresentam teorias complexas e ilustrações divertidas. Seguindo o projeto editorial dinâmico de toda a coleção, O livro da ciência conta com gráficos e boxes que ilustram conceitos como a gravidade, as propriedades da luz, correntes elétricas e compostos químicos, além de destacar as máximas que permearam a evolução do conhecimento científico, introduzindo seus autores: Arquimedes, Copérnico, Francis Bacon, Isaac Newton, Alan Turing, Stephen Hawking, entre tantos outros. Dividido em seis partes, que vão desde 600 a.C. – “O começo da ciência” – passando por toda a evolução das principais teorias até chegar ao presente – “Pilares fundamentais” – o título conta ainda com um Diretório, que traz uma breve biografia das figuras mais importantes de cada área, e um Glossário com os termos científicos essenciais. Um apanhado completo para curiosos, estudantes ou quem deseja se aprofundar no assunto.",
				cat6);
		Livro l10 = new Livro(null, "Droga Da Obediência", "Pedro Bandeira",
				"Uma turma de adolescentes enfrenta o mais diabólico dos crimes! Num clima de muito mistério e suspense, cinco estudantes ? os Karas ? enfrentam uma macabra trama internacional: o sinistro Doutor Q.I. pretende subjugar a humanidade aos seus desígnios, aplicando na juventude uma perigosa droga! E essa droga já está sendo experimentada em alunos dos melhores colégios de São Paulo. Esse é um trabalho para os Karas: o avesso dos coroas, o contrário dos caretas!",
				cat7);
		Livro l11 = new Livro(null, "Turma da Mônica - 60 atividades", "Mauricio de Souza",
				"O que não falta nos dias da Mônica e de seus amigos é diversão! Venha resolver muitos desafios com essa turma. São atividades sobre o alfabeto, os números e muito mais para você aprender e brincar ao mesmo tempo!",
				cat7);
		Livro l12 = new Livro(null, "Attack on Titan Vol. 1", "Hajime Isayama",
				"In this post-apocalytpic sci-fi story, humanity has been devastated by the bizarre, giant humanoids known as the Titans. Little is known about where they came from or why they are bent on consuming mankind. Seemingly unintelligent, they have roamed the world for years, killing everyone they see. For the past century, what's left of man has hidden in a giant, three-walled city. People believe their 100-meter-high walls will protect them from the Titans, but the sudden appearance of an immense Titan is about to change everything. Winner of the 2011 Kodansha Manga Award (Shonen) and nominated for the prestigious Osamu Tezuka Cultural Prize for 2012.",
				cat8);
		Livro l13 = new Livro(null, "Verity", "Colleen Hoover",
				"Lowen Ashleigh is a struggling writer on the brink of financial ruin when she accepts the job offer of a lifetime. Jeremy Crawford, husband of bestselling author Verity Crawford, has hired Lowen to complete the remaining books in a successful series his injured wife is unable to finish.\r\n"
				+ "\r\n"
				+ "Lowen arrives at the Crawford home, ready to sort through years of Verity’s notes and outlines, hoping to find enough material to get her started. What Lowen doesn’t expect to uncover in the chaotic office is an unfinished autobiography Verity never intended for anyone to read. Page after page of bone-chilling admissions, including Verity's recollection of the night their family was forever altered.\r\n"
				+ "\r\n"
				+ "Lowen decides to keep the manuscript hidden from Jeremy, knowing its contents would devastate the already grieving father. But as Lowen’s feelings for Jeremy begin to intensify, she recognizes all the ways she could benefit if he were to read his wife’s words. After all, no matter how devoted Jeremy is to his injured wife, a truth this horrifying would make it impossible for him to continue to love her.\r\n"
				+ "\r\n"
				+ "A standalone romantic thriller from #1 New York Times bestselling author Colleen Hoover.",
				cat8);

		cat1.getLivros().addAll(Arrays.asList(l1));
		cat2.getLivros().addAll(Arrays.asList(l2, l3));
		cat3.getLivros().addAll(Arrays.asList(l4));
		cat4.getLivros().addAll(Arrays.asList(l5, l6));
		cat5.getLivros().addAll(Arrays.asList(l7, l8));
		cat6.getLivros().addAll(Arrays.asList(l9));
		cat7.getLivros().addAll(Arrays.asList(l10, l11));
		cat8.getLivros().addAll(Arrays.asList(l12, l13));

		this.categoriaRepository.saveAll(Arrays.asList(cat1, cat2, cat3, cat4, cat5, cat6, cat7, cat8));
		this.livroRepository.saveAll(Arrays.asList(l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12, l13));
	}

}
