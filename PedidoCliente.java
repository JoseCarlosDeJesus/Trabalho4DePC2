package cachorro;

public class PedidoCliente extends Pedido{
	private Integer codcliente;
	private String dataRemessa;
	
	public PedidoCliente() {
		
	}
	public PedidoCliente(Integer codcliente, String dataRemessa) {
		super();
		this.codcliente = codcliente;
		this.dataRemessa = dataRemessa;
	}
	
	public Integer getCodcliente() {
		return codcliente;
	}
	public void setCodcliente(Integer codcliente) {
		this.codcliente = codcliente;
	}
	public String getDataRemessa() {
		return dataRemessa;
	}
	public void setDataRemessa(String dataRemessa) {
		this.dataRemessa = dataRemessa;
	}
    
	public void pagamentoCliente(){
		
	}
	
	public void remessaCliente(){
		
	}
	
	public void recuperarPedCliente(){
		
	}
	   
}
