package cachorro;

public class Pedido{
    protected Integer codigo;
    protected String dataPedido;
    protected Livro listaLivro;
    protected Integer quantidade;
    protected Integer valor;
    
    public Pedido(){
    	
    }
    
	public Pedido(Integer codigo, String dataPedido, Livro listaLivro, Integer quantidade, Integer valor) {
		super();
		this.codigo = codigo;
		this.dataPedido = dataPedido;
		this.listaLivro = listaLivro;
		this.quantidade = quantidade;
		this.valor = valor;
	}



	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getDataPedido() {
		return dataPedido;
	}

	public void setDataPedido(String dataPedido) {
		this.dataPedido = dataPedido;
	}

	public Livro getListaLivro() {
		return listaLivro;
	}

	public void setListaLivro(Livro listaLivro) {
		this.listaLivro = listaLivro;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Integer getValor() {
		return valor;
	}

	public void setValor(Integer valor) {
		this.valor = valor;
	}

	public void calcvalor() {
		
	}
	
}
