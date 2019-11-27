package com.leporonitech.appmanageproposals.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.leporonitech.appmanageproposals.model.Cliente;
import com.leporonitech.appmanageproposals.repository.ClienteRepository;


@RestController
public class ClienteController {

	@Autowired
	private ClienteRepository clienteRepository;

	@GetMapping("/clientes")
	public ResponseEntity<List<Cliente>> listarClientes() {

		List<Cliente> clientes = this.clienteRepository.findAll();
		return ResponseEntity.ok(clientes);
	}

	@PostMapping("/novo")
	public ResponseEntity<Void> novoCliente(@Valid @RequestBody Cliente cliente) {

		this.clienteRepository.save(cliente);
		return ResponseEntity.status(201).build();
	}
	
	@DeleteMapping("{id}")
	public ResponseEntity<Void> excluirCliente(@PathVariable Long id){
		
		clienteRepository.deleteById(id);
		return ResponseEntity.accepted().build();
	}
}
