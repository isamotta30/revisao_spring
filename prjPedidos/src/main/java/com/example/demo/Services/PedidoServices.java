package com.example.demo.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Pedido;
import com.example.demo.repositories.ClienteRepository;
import com.example.demo.repositories.PedidoRepository;

@Service
public class PedidoServices {
	private final PedidoRepository pedidoRepository;

	@Autowired
	public PedidoServices(PedidoRepository pedidoRepository) {
		this.pedidoRepository = pedidoRepository;
	}

	public Pedido savePedido(Pedido Pedido) {
		return pedidoRepository.save(Pedido);
	}

	public Pedido getPedidoByPedidoId(Long PedidoId) {
		return pedidoRepository.findById(PedidoId).orElse(null);
	}

	public List<Pedido> getAllPedido() {
		return pedidoRepository.findAll();
	}

	public void deletePedido(Long pedidoId) {
		pedidoRepository.deleteById(pedidoId);
	}
}
