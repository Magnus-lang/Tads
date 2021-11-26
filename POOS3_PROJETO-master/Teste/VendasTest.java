package Teste;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


import model.Cliente;

class VendasTest {
	
	@Test
	void criarCliente() {
		Cliente cliente = new Cliente(null, null, null, null);
		assertNotNull(cliente);
	}
	
	
	private Cliente cliente(String string, String string2, String string3) {
		return null;
		// TODO Auto-generated method stub
		
	}


	@Test
	void getNome() {
		Cliente cliente = new Cliente("nome");
		assertNotNull("nome", cliente.getNome());
		}
	
	@Test 
	void getEmail() {
		Cliente cliente = new Cliente("email");
		assertNotNull("email", cliente.getEmail());
	}
	}