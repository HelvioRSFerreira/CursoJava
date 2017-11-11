package br.com.cliente.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.cliente.model.Cliente;

public class ClienteDao {

	private List<Cliente> clientes;
	
	public ClienteDao() {
		initMock();		
	}
	
	private void initMock() {
		
		clientes = new ArrayList<Cliente>();
		
//		1� mode de carga do array
//		Cliente cliente1 = new Cliente();
//		cliente1.setId(1);
//		cliente1.setNome("Catia");
//		cliente1.setSobreNome("Silva");
//		cliente1.setIdade(18);
//		cliente1.setTelefone("3440099345");
			
//      2� modo (+ pr�tico)
		clientes.add(new Cliente(1, "C�tia", "Silva", 18,"3440099345"));
		clientes.add(new Cliente(2, "H�lvio", "Ferreira", 53,"3440099330"));
		clientes.add(new Cliente(3, "Janeilson", "Silva", 32,"3440099322"));
		clientes.add(new Cliente(4, "Sergio", "Pereira", 35,"3440099321"));
	}
	
	public List<Cliente> obterTodosClientes() {
		return this.clientes;
	}
	

	
}
