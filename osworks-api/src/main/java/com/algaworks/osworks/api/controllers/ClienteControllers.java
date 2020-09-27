package com.algaworks.osworks.api.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.osworks.domain.model.Cliente;

@RestController
public class ClienteControllers {
	
	@GetMapping("/clientes")
	public List<Cliente> listar() {
		var cliente1 = new Cliente();
		cliente1.setId(1L);
		cliente1.setNome("Lucas Abcde");
		cliente1.setTelefone("11 90876-3456");
		cliente1.setEmail("lucas@gmail.com");
		
		var cliente2 = new Cliente();
		cliente2.setId(2L);
		cliente2.setNome("Maria");
		cliente2.setTelefone("11 99475-4765");
		cliente2.setEmail("lucas@gmail.com");
		
		return Arrays.asList(cliente1, cliente2);
	}
}
