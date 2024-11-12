package com.realetech.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.realetech.models.Cliente;
import com.realetech.repositories.ClienteRepository;

import jakarta.transaction.Transactional;

@Service

public class ClienteService {
	@Autowired
	 private ClienteRepository clienteRepository;
	
	 public List<Cliente> getAllClientes(){
		 return clienteRepository.findAll();
	 
	 }
	 
	 public Cliente findById(Long id) {
		 return clienteRepository.findById(id)
				 .orElseThrow(() -> new IllegalArgumentException("Cliente no encontrado.") ); 
	 }
	 
	 @Transactional
	    public Cliente createCliente(Cliente cliente) {	
	        return clienteRepository.save(cliente);
	    }
	 
	 @Transactional
	 public Cliente saveCliente(Cliente cliente) {
		 return clienteRepository.save(cliente);
	 }
	 
	 @Transactional
	 public Cliente updateCliente(Long id, Cliente clienteDetails) {
		 Cliente cliente = clienteRepository.findById(id)
				 .orElseThrow(() -> new IllegalArgumentException("Cliente no encontrado.") ); 
		 
		 cliente.setApellido(clienteDetails.getApellido());
		 cliente.setNombre(clienteDetails.getNombre());
		 
		 if (clienteDetails.getMatricula() != 0)  {
			 cliente.setMatricula(clienteDetails.getMatricula());
		 }
		 
		return clienteRepository.save(cliente);
		 
	 }
	 
	 @Transactional
	 public void deleteCliente(Long id) {
		 if(!clienteRepository.existsById(id)) {
			 throw new IllegalArgumentException("El cliente no fué encontrado");
		 }
		 	clienteRepository.deleteById(id);
	 }
	 
	 
}