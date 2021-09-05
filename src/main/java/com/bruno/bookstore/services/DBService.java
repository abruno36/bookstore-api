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
		
		Categoria cat1 = new Categoria(null, "Livros de Informática", "Tecnologia da Informação");
		Categoria cat2 = new Categoria(null, "Livros de Culinária", "Alimentações e Receitas");
		Categoria cat3 = new Categoria(null, "Livros de Romance", "Livros em geral");
		Categoria cat4 = new Categoria(null, "Livros de Suspense", "Suspense e Terror");
		Categoria cat5 = new Categoria(null, "Livros Clássicos", "Literatura Classicas");
		Categoria cat6 = new Categoria(null, "Livros de Ficção Científica", "Livros Cientificos");
		Categoria cat7 = new Categoria(null, "Livros Infantis", "Histórias engraçadas");
		Categoria cat8 = new Categoria(null, "EBooks em Inglês", "Recomendados para você | Histórias em geral");
		Categoria cat9 = new Categoria(null, "Livros de Matemática Informática", "Matemática na Informática");
		Categoria cat10 = new Categoria(null, "Livros de Geografia", "Ensino de Geografia aplicada no ensino fundamental");
		Categoria cat11 = new Categoria(null, "Livros de Histórias do Mar", "Histórias relacionadas ao mar e oceanos");
		Categoria cat12 = new Categoria(null, "Livros de Magia Natural", "Mágicas na sua naturalidade");
		Categoria cat13 = new Categoria(null, "Livros que viraram filmes e séries", "Histórias que se tornaram filmes e séries");
		Categoria cat14 = new Categoria(null, "Livros de Direito Constitucional", "Tudo sobre as leis do direito constitucional");

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
		Livro l14 = new Livro(null, "Informática e Educação Matemática", "Marcelo Carvalho de Borba",
				"Neste livro, Marcelo de Carvalho Borba e Miriam Godoy Penteado apresentam o resultado de mais um trabalho em conjunto sobre informática educativa. Eles trabalham há mais de dez anos em uma das principais tendências da Educação Matemática: a informática. Os autores apresentam exemplos do uso de informática com alunos e professores, para, então, debaterem desde temas ligados às políticas governamentais para a informática educativa até questões epistemológicas e pedagógicas relacionadas à utilização de computadores e calculadoras gráficas em Educação Matemática. Este livro se dirige àquele que ainda não está familiarizado com essa tendência e também àquele que gostaria de conhecer a visão particular dos autores sobre o tema.",
				cat9);
		Livro l15 = new Livro(null, "Guia prático de implementação da LGPD", "Daniel Donda",
				"A Lei n. 13.709/2018, conhecida como Lei Geral de Proteção de Dados Pessoais (LGPD), promulgada em 14 de agosto de 2018, dispõe sobre o tratamento de dados pessoais. Trata-se de um marco regulatório inédito no Brasil e atingirá todas as instituições públicas e privadas que lidam com dados sensíveis. Com base nas melhores práticas de segurança no tratamento de dados, este livro responde as principais questões que surgem na preparação para estar em conformidade com a LGPD.\r\n"
				+ "\r\n"
				+ "De maneira simples e objetiva, Daniel Donda apresenta ações práticas que devem ser adotadas por todas as empresas que lidam com dados de cidadãos brasileiros, a fim de oferecer ferramentas para que o leitor possa tomar as melhores a decisões no tratamento seguro dos dados pessoais.\r\n"
				+ "Ao abordar os principais aspectos previstos pela legislação de maneira clara, este livro se torna obra fundamental para empresários, profissionais e estudantes da tecnologia da informação e demais interessados no assunto.\r\n"
				+ "\r\n"
				+ "Daniel Donda é especialista em segurança da informação com mais de 20 anos de experiência. Formado em Matemática e em Segurança da Informação, atua profissionalmente como arquiteto de soluções para segurança e conformidade.\r\n"
				+ "\r\n"
				+ "Microsoft Most Valuable Professional (MVP) na competência Cloud and Datacenter Management desde 2011.",
				cat9);
		Livro l16 = new Livro(null, "Curso de Informática Básico", "Lucas Durigon",
				"Processador de Textos, Planilha Eletrônica, Windows, Sistema Operacional, Curso de Informática, Noções de Informática, Histórica da Informática, Como formatar textos, como fazer planilhas, como fazer cálculos automáticos, Painel de Controle, Gerenciador de Impressão, Correção ortográfica de Textos, auto soma.", cat1);
		Livro l17 = new Livro(null, "A geografia antes da Geografia", "Marcos Bau Brandão",
				"Este livro eletrônico se divide em resumo, introdução, seis capítulos e o epílogo, como conclusão, além das referências (359 páginas). O primeiro capítulo é didático e metodológico ao versar sobre a práxis da sala de aula, como lugar geográfico de pausa, mas, acima de tudo, como local de troca de experiências para as aprendizagens dos estudantes e do professor, que deve ser um mediador, ora dialético, ora fenomenológico, em sua ação docente. Os capítulos posteriores foram dispostos em uma ideia evolutiva dos componentes universais que compõem a transdisciplinaridade do espaço a-geográfico e geográfico, seguindo cronologicamente a divisão que propomos para a construção do pensar o objeto espaço na Geografia ou a sua genealogia, como categoria de primórdio da disciplina enquanto ciência. Partimos do que chamamos de Pré-Geografia, em um segundo capítulo sobre a mecânica quântica e a relatividade do Big Bang no tecido gravitacional do espaço-tempo, de primórdio do cosmo, para chegarmos ao aparecimento da Terra em sua composição mais primitiva, até a solidificação das primeiras rochas e a composição da atmosfera terrestre, que deu chance ao aparecimento das primeiras formas de vida. O terceiro capítulo, o da Geografia Primitiva, chega aos primeiros hominídeos, descendentes do primata chipanzé, mas centra-se na espacialidade do Homo sapiens, que se mostrou a única espécie de hominídeo dominante, desde que houve a predominância da sedentarização agrícola no período neolítico. O quarto capítulo é de continuidade do entendimento da territorialidade do sapiens, uma vez que, nos leva a analogias de territorializações contemporâneas similares, seja na desigualdade entre os povos e no individualismo intolerante, seja na produção de excedentes, perpetuada como evolução acumulativa, mas que tem no medo da escassez a sua eterna continuidade. O quinto capítulo emenda o neolítico com o advindo dos primeiros escritos que chegaram a nós, nos quais, se encaixam no que intitulamos de Geografia da Idade Antiga e Aristotélica, pois só a escrita teve a capacidade de tornar a historiografia longínqua o suficiente para ser entendida como ciência. De Homero a Hesíodo e da filosofia pré-socrática à aristotélica, passando pela historiografia de Tucídides e Heródoto, chegamos ao sexto capítulo, dividido em dois períodos têmporo-espaciais: o do período da Geografia Ptolomaica e da Idade Média, da época que envolve o recorte da Geografia dominada pelos mapas cartográficos, de traço ptolomaico, com projeções que influenciaram o pensamento geográfico, desde Eratóstenes (e Estrabão), que teve rebatimento nas territorialidades do cristianismo, das cruzadas e da posterior crise feudal, até a chegada do período da Geografia das Grandes Navegações e dos primórdios da sistematização científica do espaço, com a cosmografia de Mercator e a ocupação de novos espaços continentais, ao que se insere no ideário de acesso a alicerces teóricos mais coesos e de influência filosófico-científica, com Descartes, Varenius, Newton e Kant, que já se encaixam em uma Geografia de primórdio basilar e sequencial à cientificidade do espaço, inclusive através das investidas de aproximação à Geografia Tradicional ou dos Fundadores, sistematizada no século XIX, propriamente alicerçada em Humboldt e Ritter e, posteriormente, em Ratzel e La Blache (aqui também consideramos Reclus e Kropotkin), assim como bastante difundida na literatura geográfica clássica.",
				cat10);
		Livro l18 = new Livro(null, "Elementos de Didática da Geografia", "Alfredo Braga Furtado",
				"Este livro apresenta elementos de Didática voltados para o desenvolvimento de habilidades e de competências exigidas na profissão de geógrafo. O livro destina-se a alunos de cursos de graduação em Geografia (bacharelado e licenciatura). Destina-se também a professores dos cursos da área, que podem eventualmente considerar a leitura e a reflexão acerca do conteúdo do livro como forma de apreciação de suas próprias práticas didáticas.\r\n"
				+ "\r\n"
				+ "A partir das Diretrizes Curriculares do MEC para os cursos de Geografia, são identificados perfil, conteúdo de cada curso que os projetos pedagógicos das Instituições de Ensino Superior devem apresentar e habilidades e competências requeridas do profissional. Depois da descrição de métodos ou técnicas de ensino no capítulo 7, em quadros-resumo, são sintetizadas habilidades e competências que cada método ou técnica potencialmente pode desenvolver ou aprimorar. Desta forma, o docente pode selecionar as abordagens mais indicadas para sua disciplina, levando em conta habilidades e competências que seus alunos precisam exercitar.",
				cat10);
		Livro l19 = new Livro(null, "HISTÓRIAS DO MAR: 200 CASOS", "Jorge de Souza",
				"Em 29 de janeiro de 2014, o casco de um pequeno barco foi dar numa esquecida praia das Ilhas Marshall, nos confins do Oceano Pacífico. Dentro dele havia um homem combalido e praticamente nu, mas com uma extraordinária história para contar: a de como sobrevivera 13 meses sem água nem comida no mar, depois que o motor de seu barco quebrou, condenando-o a atravessar, à deriva, o maior dos oceanos. Um feito inacreditável, não fosse ser pura verdade.\r\n"
				+ "Esta e outras 199 histórias nas quais o mar é o principal protagonista compõe a coletânea de façanhas, dramas, aventuras, mistérios e odisseias marítimas que dão forma a este livro, fruto de anos de pesquisas sobre o período mais intenso da navegação humana, os últimos cinco séculos.\r\n"
				+ "Algumas histórias são curtíssimas e curiosas; outras bem maiores, mas igualmente extraordinárias. Todas, contudo, têm em comum o fato de serem verídicas, embora, em alguns casos, sejam tão impressionantes que mais pareçam ficção. Mas não são.\r\n"
				+ "Todas as histórias aqui contadas aconteceram de fato. Por mais incrível que isso possa parecer.",
				cat11);
		Livro l20 = new Livro(null, "Em Busca do Brasil", "Pablo Amaral Rebello",
				"Século XVI. O mundo assume novas margens enquanto mapas seculares são redesenhados a uma velocidade assombrosa. Tudo graças às descobertas de novas terras do outro lado do grande mar Oceano e ao avanço predatório dos portugueses sobre o mercado de especiarias nas tão distantes e sonhadas Índias Orientais. É no extremo oposto do mundo conhecido até então que a presente história se inicia. Balas de canhão chovem sobre Calicute. Um encontro inesperado na costa africana dá início a uma perigosa conspiração. Na França, planos de homens poderosos atraem personagens de diversos reinos. Um marinheiro português com fama de mau, um inexperiente espião francês e um capitão inglês tido como louco se vem amarrados a uma trama que os fará cruzar oceanos e desbravar novos mundos numa aventura de tirar o fôlego. Em Busca do Brasil traz uma narrativa permeada de fatos históricos obscuros para jogar luz sobre os primeiros anos de ocupação europeia no maior país da América Latina. Uma leitura instigante capaz de surpreender aos leitores mais exigentes.",
				cat11);
		Livro l21 = new Livro(null, "Magia natural: Libro Básico del Novicio", "Carlos Esteban González Figueroa",
				"Magia natural es una temática de esoterismo y psicomagia aplicada a la vida cotidiana que tiene como objetivo ayudarle al lector a desarrollar su poder personal que le permite modificar, crear y editar su propia realidad desde un conjunto de técnicas y metodologías propias de un mago como bien se puede decir. Magia natural es una escuela de iniciación, intermediación y maestría de las artes mágicas antiguas aplicadas al ser como centro de aprendizaje en la evolución del mismo en cada vida. El presente libro consiste de las herramientas básicas del primer nivel, cosmovisión de magia natural, métodos de alteración de la realidad y métodos de creación de hechizos y conjuros de magia natural.",
				cat12);
		Livro l22 = new Livro(null, "Segredos da Magia e Bruxaria", "Pierre Macedo",
				"A palavra-chave deste livro é praticidade. Ele é destinado a quem quer praticar magia de forma rápida, sem a necessidade de ler longos livros teóricos. Com Segredos da Magia e Bruxaria, você aprende enquanto pratica. Ele contém uma variedade de feitiços e rituais exclusivos, como amor, dinheiro, beleza, evocações, proteção. O leitor também será introduzido aos selos mágicos, também chamados de sigilos, tais como selos de espíritos e planetários. Nenhum outro livro ensina a maneira correta de se evocar Lúcifer e Miguel. Nenhum outro livro fornece um ritual detalhado de beleza com os deuses nórdicos Frey e Freya ou um poderoso feitiço de amor com a misteriosa Lilith. Nenhum outro autor jamais abordou tantos assuntos, desde amor até magia planetária, em uma única obra, como Pierre Macedo fez. Não importa se você é um praticante de magia branca ou magia negra, um seguidor da Wicca ou se você precisa de alguma ajuda espiritual, esta obra foi escrita para você. Agora você tem em suas mãos a chave para mudar o curso da sua vida.",
				cat12);
		Livro l23 = new Livro(null, "Mulherzinhas", "Louisa May Alcott",
				"Talvez você não tenha ouvido falar de Louisa May Alcott, mas deve ter ouvido a respeito de Jane Austen. Pode ser que não tenha visto o filme “Adoráveis mulheres” de 1994, estrelando Winona Ryder, mas talvez tenha visto “Lady Bird” de 2017, dirigido por Greta Gerwig. Ao longo das páginas de \"Mulherzinhas\", o leitor entenderá o que une essas obras: fortes personagens femininas que marcaram e continuam a marcar gerações. Acompanhe as aventuras, dores, desilusões amorosas, perdas e aprendizados das irmãs March e descubra o que torna esse livro um dos mais queridos e relevantes da literatura mundial.",
				cat13);
		Livro l24 = new Livro(null, "O sol também é uma estrela", "Nicola Yoon",
				"Natasha: Sou uma garota que acredita na ciência e nos fatos. Não acredito na sorte. Nem no destino. Muito menos em sonhos que nunca se tornarão realidade. Não sou o tipo de garota que se apaixona perdidamente por um garoto bonito que encontra numa rua movimentada de Nova York. Não quando minha família está a 12 horas de ser deportada para a Jamaica. Apaixonar-me por ele não pode ser a minha história.\r\n"
				+ "\r\n"
				+ "Daniel: Sou um bom filho e um bom aluno. Sempre estive à altura das grandes expectativas dos meus pais. Nunca me permiti ser o poeta. Nem o sonhador. Mas, quando a vi, esqueci de tudo isso. Há alguma coisa em Natasha que me faz pensar que o destino tem algo extraordinário reservado para nós dois.\r\n"
				+ "\r\n"
				+ "O Universo: Cada momento de nossas vidas nos trouxe a este instante único. Há um milhão de futuros diante de nós. Qual deles se tornará realidade?",
				cat13);
		Livro l25 = new Livro(null, "A tenda vermelha", "Anita Diamant",
				"Seu nome é Dinah. Na Bíblia, sua vida é mencionada em um breve episódio no livro do Gênesis, nos capítulos sobre seu pai, Jacó. Narrado na voz de Dinah, este romance revela as tradições e as turbulências de ser mulher na antiguidade. A tenda vermelha era o lugar em que as mulheres se reuniam durante seus ciclos de nascimento e menstruação ou quando estavam doentes. Imaginando as conversas e os mistérios mantidos dentro dessa tenda exclusivamente feminina, Anita Diamant nos oferece um olhar privilegiado sobre a vida diária das quatro esposas de Jacó, mães de seus doze filhos homens, e sobre o convívio com sua única filha, Dinah. Com o resgate desse olhar feminino, conhecemos as fascinantes mulheres que sangraram, trocaram palavras, experiências e rituais na tenda vermelha.\r\n"
				+ "\r\n"
				+ "Em uma voz íntima e poética, Dinah sussurra histórias sobre suas quatro “mães”, Raquel, Lia, Zilpah e Bilah, que a inspiraram com seus traços femininos únicos. Conforme histórias permeadas de sensualidade, intuição e fortes emoções vão sendo narradas, descortina-se um mundo de caravanas, escravos, artesãos, príncipes, milagres e segredos femininos, até o momento em que Dinah mergulha em sua própria saga de paixão, traições e sofrimento.",
				cat13);
		
		cat1.getLivros().addAll(Arrays.asList(l1, l16));
		cat2.getLivros().addAll(Arrays.asList(l2, l3));
		cat3.getLivros().addAll(Arrays.asList(l4));
		cat4.getLivros().addAll(Arrays.asList(l5, l6));
		cat5.getLivros().addAll(Arrays.asList(l7, l8));
		cat6.getLivros().addAll(Arrays.asList(l9));
		cat7.getLivros().addAll(Arrays.asList(l10, l11));
		cat8.getLivros().addAll(Arrays.asList(l12, l13));
		cat9.getLivros().addAll(Arrays.asList(l14, l15));
		cat10.getLivros().addAll(Arrays.asList(l17, l18));
		cat11.getLivros().addAll(Arrays.asList(l19, l20));
		cat12.getLivros().addAll(Arrays.asList(l21, l22));
		cat13.getLivros().addAll(Arrays.asList(l23, l24, l25));

		this.categoriaRepository.saveAll(Arrays.asList(cat1, cat2, cat3, cat4, cat5, cat6, cat7, cat8, cat9, cat10, cat11, cat12, cat13, cat14));
		this.livroRepository.saveAll(Arrays.asList(l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12, l13, l14, l15, l16, l17, l18, l19, l20, l21, l22, l23, l24, l25));
	}

}
