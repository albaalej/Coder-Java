package com.realetech.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.realetech.models.Cliente;
import com.realetech.repositories.ClienteRepository;

@RestController
@RequestMapping("api/cliente")
public class ClientesController {
 
	 @Autowired
	 private ClienteRepository clienteRepository;
	 
	 @GetMapping
	 public List<Cliente> getAllClientes(){
		 return clienteRepository.findAll();
	 }

	 @GetMapping("/{id}")
	 public ResponseEntity<Cliente> getClienteByid(@PathVariable Long id){
		 if (clienteRepository.existsById(id)) {
		  Cliente cliente = clienteRepository.findById(id).get(); 
		  return ResponseEntity.ok(cliente);
		 }else {
		  return ResponseEntity.notFound().build();
			 }
		 }

	 	@PostMapping
	 	public Cliente createCliente(@RequestBody Cliente cliente) {
	 		return clienteRepository.save(cliente);
	 	}
	 	
	 	@PutMapping("/{id}")														// Modificar cliente
	     public ResponseEntity<Cliente> updateClienteById(@PathVariable Long id, @RequestBody Cliente clienteDetails) {
	         try {
	             Cliente updatedCliente = clienteService.updateCliente(id, clienteDetails);
	             return ResponseEntity.ok(updatedCliente);
	         } catch (IllegalArgumentException e) {
	 			return ResponseEntity.notFound().build();
	         } catch (Exception e) {
	             return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
	         }
	     }
}
	 