package cachorro;


public class Livro {
     private Integer codigo;
     private String titulo;
     private String autor;
     private Integer preco;
     private Integer codfornecedor;
     private String isbn;
     
     public Livro() { 	 
     }
      
	public Livro(Integer codigo, String titulo, String autor, Integer preco, Integer codfornecedor, String isbn) {
		super();
		this.codigo = codigo;
		this.titulo = titulo;
		this.autor = autor;
		this.preco = preco;
		this.codfornecedor = codfornecedor;
		this.isbn = isbn;
	}
	
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public Integer getPreco() {
		return preco;
	}
	public void setPreco(Integer preco) {
		this.preco = preco;
	}
	public Integer getCodfornecedor() {
		return codfornecedor;
	}
	public void setCodfornecedor(Integer codfornecedor) {
		this.codfornecedor = codfornecedor;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
    
	public void inserir() {
		
	}
	
	public void excluir() {
		
	}
	public void  alterar() {
		
	}
	public void consultar() {
		
	}
     
}
