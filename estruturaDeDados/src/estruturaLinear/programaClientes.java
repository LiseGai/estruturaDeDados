package estruturaLinear;

public class programaClientes {
	public static void main(String[] args) {
		listaEncadeada<Cliente> clientes = new listaEncadeada<Cliente>();
		clientes.Adicionar(new Cliente("12345","Cleo"));
		clientes.Adicionar(new Cliente("12343","Jao"));
		//Como sao 2 atributos, fica um pouco diferente o add
		
		System.out.println("Lista de clientes:");
		for (int i=0; i<clientes.getTamanho();i++) {
			System.out.println("Cliente: "+clientes.get(i).getValor());
			//Pra evitar esse erro, se vai em Cliente e se sobreescreve
			//o método toString
			
		}
	}
}
