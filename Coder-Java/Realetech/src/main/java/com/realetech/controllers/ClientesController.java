package com.realetech.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.realetech.models.Cliente;
import com.realetech.services.ClienteService;

@RestController
@RequestMapping("api/clientes")
public class ClientesController {
 
	 @Autowired
	 private ClienteService clienteService;
	 
	 
	 // LISTO TODOS LOS CLIENTES
	 @GetMapping
	 public ResponseEntity<List<Cliente>> getAllClientes(){
		 try {
			 List<Cliente> cliente = clienteService.getAllClientes();
			 return ResponseEntity.ok(cliente);
		 } catch(Exception e) {
			 return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		 }
	 }
	 
	 // CLIENTE POR ID
	 @GetMapping("/{id}")
	 public ResponseEntity<Cliente> getClienteById(@PathVariable long id){
		try {
			Cliente cliente = clienteService.findById(id);
			return ResponseEntity.ok(cliente);
		} catch(IllegalArgumentException e) {
			return ResponseEntity.notFound().build();			
		} catch(Exception e) {
			 return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		 } 
	} 
	 
	// MODIFICO CLIENTE	 
	 @PutMapping("/{id}")
	 public ResponseEntity<Cliente> updateClienteById(@PathVariable Long id, @RequestBody Cliente clienteDetails){
		 try {
		 	 Cliente updatedCliente = clienteService.updateCliente(id, clienteDetails);
			 return ResponseEntity.ok(updatedCliente);
		 } catch(IllegalArgumentException e) {
				return ResponseEntity.notFound().build();			
		 } catch(Exception e) {
				 return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		 } 
	 }		 			 
	
	 //AGREGAR CLIENTE
	 @PostMapping
	 public ResponseEntity<Cliente> createCliente(@RequestBody Cliente cliente){
		try {
			Cliente createdCliente = clienteService.saveCliente(cliente);
			return ResponseEntity.ok(createdCliente);	
		} catch(Exception e) {
			 return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		 } 
		 
	 }
	 
	 //ELIMINO CLIENTE
	@DeleteMapping("/{id}")	
	public ResponseEntity<Void> deleteClienteById(@PathVariable Long id){
			try {
				clienteService.deleteCliente(id);
				return ResponseEntity.noContent().build();				
			}catch(IllegalArgumentException e) {
				return ResponseEntity.notFound().build();			
		 } catch(Exception e) {
				 return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		 } 
	}
	 		
}

	 