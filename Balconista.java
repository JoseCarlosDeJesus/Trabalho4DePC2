package cachorro;


public class Balconista {
	protected String nomeUsuario;
    protected Double senha;
    protected String nivelAcesso;
    
    public Balconista() {
    	
    }
    
    public Balconista(String nomeUsuario, Double senha, String nivelAcesso) {
		super();
		this.nomeUsuario = nomeUsuario;
		this.senha = senha;
		this.nivelAcesso = nivelAcesso;
	}

	public void login() {
    	
    }
    
    public void inserir(){
    	
    }
    public void consultar() {
    	
    }
    
    public void alterar() {
    	
    }
    
    public void excluir() {
    	
    }
    public void remessaCliente() {
    	
    }
    public void efetuarPedidoCliente(){
    	
    }

	public String getNomeUsuario() {
		return nomeUsuario;
	}

	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}

	public Double getSenha() {
		return senha;
	}

	public void setSenha(Double senha) {
		this.senha = senha;
	}

	public String getNivelAcesso() {
		return nivelAcesso;
	}

	public void setNivelAcesso(String nivelAcesso) {
		this.nivelAcesso = nivelAcesso;
	}
    
    
}
