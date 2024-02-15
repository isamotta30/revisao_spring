package com.example.demo.controlers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Services.PedidoServices;
import com.example.demo.entities.Pedido;

@RestController
@RequestMapping("pedido")
public class PedidoControler {
	private final PedidoServices pedidoService;

	@Autowired
	public  PedidoControler (PedidoServices pedidoService) {
		this.pedidoService = pedidoService;
	}

	@PostMapping
	public Pedido createPedido(@RequestBody Pedido pedido) {
		return pedidoService.savePedido(pedido);
	}

	@GetMapping("/{PedidoId}")
	public Pedido getPedido(@PathVariable Long PedidoId) {
		return pedidoService.getPedidoByPedidoId(PedidoId);
	}

	@GetMapping
	public List<Pedido> getAllPedido() {
		return pedidoService.getAllPedido();
	}

	@DeleteMapping("/{PedidoId}")
	public void deletePedido(@PathVariable Long PedidoId) {
		pedidoService.deletePedido(PedidoId);
	}
 {

}

	}


