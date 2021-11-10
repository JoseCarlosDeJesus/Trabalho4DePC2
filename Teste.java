package cachorro;

public class Teste {

	public static void main(String[] args) {
		Livro f1=new Livro();
		f1.setTitulo("O Velho e o mar");
		Cliente bom=new Cliente();
		bom.setNome("Pedro Alves de Alcantara");
		Pedido a1=new Pedido();
		a1.setDataPedido("12/04/2020");
		a1.setListaLivro(f1);
		Balconista p1= new Balconista();
		p1.setNomeUsuario("Fernando Miguel de Oliveira");
		System.out.println("Título do livro: "+a1.listaLivro.getTitulo()+"\n"+ "Nome do Cliente: "+bom.getNome()+"\n"+"Data do pedido: "+a1.getDataPedido()+"\n"+"Nome do Balconista: "+p1.getNomeUsuario());
		
	}

}
