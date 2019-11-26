package com.leporonitech.appmanageproposals.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.leporonitech.appmanageproposals.model.Cliente;
import com.leporonitech.appmanageproposals.repository.ClienteRepository;

@RequestMapping("/")
@RestController
public class ClienteController {

	@Autowired
	private ClienteRepository clienteRepository;

	@GetMapping("/clientes")
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Cliente>> listarClientes() {

		List<Cliente> clientes = this.clienteRepository.findAll();
		return ResponseEntity.ok(clientes);	
	}
}
