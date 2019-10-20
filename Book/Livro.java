package Book;

/*1.Implemente uma classe Livro para um sistema de biblioteca com as seguintes vari�veis 
de inst�ncias (atributos): t�tulo, autor, editora e anoPublicacao.*/

public class Livro {

	String titulo;
	String autor;
	String editora;
	int anoPublicacao;
	
	//a.Quais outros atributos voc� adicionaria?
	String isbn;
	
	/*b.Defina dois construtores, um padr�o e um que receba de 
	 entrada valores de todos os atributos.*/
	//construtor padr�o
	Livro(){
	}

    //Construtor que recebe entrada de valores 
	Livro(String titulo, String autor, String editora, int anoPublicacao, String isbn){
	this.titulo=titulo;
	this.autor=autor;
	this.editora=editora;
	this.anoPublicacao=anoPublicacao;
	this.isbn=isbn;
	}
	
	public String getTitulo(){
		return titulo;
	}
	
	public void setTitulo(String titulo){
	this.titulo=titulo;
	}
	
	public String getAutor(){
		return autor;
	}
	public void setAutor(String autor){
		this.autor=autor;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public int getAnoPublicacao() {
		return anoPublicacao;
	}

	public void setAnoPublicacao(int anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	/*2.Dentro da classe Livro,implemente um m�todo main que te ajude 
	a responder os itens a seguir:
	a.Defina duas vari�veis do tipo Livro: livro1, livro2*/
	
	public static void main(String[] args){
    Livro livro1, livro2, livro3;
    	
  //b.Utilize dois construtores diferentes para instanciar livro1 e livro2
	livro1 = new Livro();
	livro2 = new Livro("Desconectados","Courtney Maum","Record",2019,"978-85-01-11371-9");
	
	System.out.println("\n* * * * Livro 1 * * * *");
	/*c.Tente imprimir o valor do atributo t�tulo de livro1. 
	Para isso execute System.out.println(livro1.titulo)no m�todo main. 
	O que aconteceu? Por qu�?*/
	
	System.out.println(livro1.titulo);
	/*O output apresentou nulo. Porque livro1 foi instanciado 
	pelo construtor 1 que n�o recebeu
	nenhum argumento e o corpo dele est� vazio.*/
		
	//d.Repita c, por�m usando livro2.
	System.out.println("\n* * * * Livro 2 * * * *");
	System.out.println(livro2.titulo);
	
	//e.Imprima os valores dos atributos do livro2
	System.out.println("\n* * * Atributos do Livro 2 * * *");
	System.out.println("T�tulo: "+livro2.titulo);
	System.out.println("Autor: "+livro2.autor);
	System.out.println("Editora: "+livro2.editora);
	System.out.println("Ano de publica��o: "+livro2.anoPublicacao);
	System.out.println("ISBN: "+livro2.isbn);

	//f.Instancie um objeto Livro com a vari�vel livro3 usando o construtor 1 e atribua a livro2
	livro3=new Livro();
	livro3=livro2;

	//g.Qual o estado de livro2 e do livro3? Imprima os valores do livro2 e livro3.
	System.out.println("\n* * * * Livro 3 * * * *");
	System.out.println("T�tulo: "+livro3.getTitulo());
	System.out.println("Autor: "+livro3.autor);
	System.out.println("Editora: "+livro3.editora);
	System.out.println("Ano de publica��o: "+livro3.anoPublicacao);
	System.out.println("ISBN: "+livro3.isbn);

	/*h.Modifique a refer�ncia da vari�vel livro2 executando livro2=livro1 (ou seja, atribuindo 
	a vari�vel livro2, a vari�vel livro1).*/
	livro2=livro1;

	/*i.O que acontece com livro2? e com livro3? Quais s�o os valores destas vari�veis?
	O livro2 apresenta valores nulos, pois foi referenciado por livro1.*/
	System.out.println("\n**** Livro 2 referenciado por Livro 1 ****");
	System.out.println("T�tulo: "+livro2.getTitulo());
	System.out.println("Autor: "+livro2.getAutor());
	System.out.println("Editora: "+livro2.getEditora());
	System.out.println("Ano Publica��o: "+livro2.getAnoPublicacao());
	System.out.println("ISBN: "+livro2.getIsbn());

	/*i.O que acontece com livro2? E com livro3? Quais s�o os valores destas vari�veis?
	O livro3 n�o sofreu nenhuma altera��o*/
	System.out.println("\n**** Livro 3 ap�s Livro 2 ter sido referenciado por Livro 1 ****");
	System.out.println("T�tulo: "+livro3.getTitulo());
	System.out.println("Autor: "+livro3.getAutor());
	System.out.println("Editora: "+livro3.getEditora());
	System.out.println("Ano Publica��o: "+livro3.getAnoPublicacao());
	System.out.println("ISBN: "+livro3.getIsbn());
		
	}
}