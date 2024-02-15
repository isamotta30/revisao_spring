package com.example.demo.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Cliente;
import com.example.demo.repositories.ClienteRepository;

@Service
public class ClienteServices {
	private final ClienteRepository clienteRepository;

	@Autowired
	public ClienteServices(ClienteRepository clienteRepository) {
		this.clienteRepository = clienteRepository;
	}

	public Cliente saveCliente(Cliente cliente) {
		return clienteRepository.save(cliente);
	}

	public Cliente getClienteByIdcCliente(Long ClienteId) {
		return clienteRepository.findById(ClienteId).orElse(null);
	}

	public List<Cliente> getAllCliente() {
		return clienteRepository.findAll();
	}

	public void deleteCliente(Long idcCliente) {
		clienteRepository.deleteById(idcCliente);
	}
	
}
