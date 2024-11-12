package com.realetech.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.realetech.models.Producto;
import com.realetech.repositories.ProductoRepository;

import jakarta.transaction.Transactional;

@Service
public class ProductoService {
	@Autowired
	private ProductoRepository productoRepository;
	
	// listar todos
	public List<Producto> getAllProductos(){
		return productoRepository.findAll();
	}
	
	//buscar por id
	public Producto getProductoById(Long id){
		return productoRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Producto no encontrado.") );
	}
	
	//agregar
	@Transactional
	public Producto crearProducto(Producto producto){
		return productoRepository.save(producto);
	}
	
	//Modificar/actualizar
	@Transactional
	public Producto updateProducto2(Long id, Producto productoDetails) {
		Producto producto = productoRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Producto no encontrado.") );
		productoDetails.setNombre(productoDetails.getNombre());
		return productoRepository.save(producto);
	} 
	
	@Transactional
	public Producto updateProducto(Long id, Producto productoDetails) {
	    Producto producto = productoRepository.findById(id)
	        .orElseThrow(() -> new IllegalArgumentException("Producto no encontrado."));
	    
	    producto.setMarca(productoDetails.getMarca());
	    producto.setNombre(productoDetails.getNombre());
	    producto.setPrecio(productoDetails.getPrecio()); 
	    producto.setStock(productoDetails.getStock());
	    
	    
	    return productoRepository.save(producto);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}