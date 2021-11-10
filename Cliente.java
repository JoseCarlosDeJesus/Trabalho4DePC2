package cachorro;


public class Cliente {
      private Integer codigo;
      private String nome;
      private String endereco;
      private String cidade;
      private String estado;
      private Double cep;
      private Integer telefone;
      private Integer pedcli;
      
    public Cliente() {
    	  
    }
    
	public Cliente(Integer codigo, String nome, String endereco, String cidade, String estado, Double cep,
			Integer telefone, Integer pedcli) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.endereco = endereco;
		this.cidade = cidade;
		this.estado = estado;
		this.cep = cep;
		this.telefone = telefone;
		this.pedcli = pedcli;
	}
	
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public Double getCep() {
		return cep;
	}
	public void setCep(Double cep) {
		this.cep = cep;
	}
	public Integer getTelefone() {
		return telefone;
	}
	public void setTelefone(Integer telefone) {
		this.telefone = telefone;
	}
	public Integer getPedcli() {
		return pedcli;
	}
	public void setPedcli(Integer pedcli) {
		this.pedcli = pedcli;
	}
	
	public void inserir(){
		
	}
	
	public void consultar() {
		
	}
	
	public void alterar() {
		
	}
	
	public void excluir() {
		
	}
	
	public void efetuarPedidoCliente() {
		
	}
	public void efetuarPagamento() {
		
	}
        
}
