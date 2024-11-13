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

import com.realetech.models.Producto;
import com.realetech.services.ProductoService;

@RestController
@RequestMapping("api/productos")
public class ProductosController {
 
	 @Autowired
	 private ProductoService productoService;
	 
	 
	 // LISTO TODOS LOS productoS
	 @GetMapping
	 public ResponseEntity<List<Producto>> getAllProductos(){
		 try {
			 List<Producto> producto = productoService.getAllProductos();
			 return ResponseEntity.ok(producto);
		 } catch(Exception e) {
			 return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		 }
	 }
	 
	 // producto POR ID
	 @GetMapping("/{id}")
	 public ResponseEntity<Producto> getProductoById(@PathVariable long id){
		try {
			Producto producto = productoService.findById(id);
			return ResponseEntity.ok(producto);
		} catch(IllegalArgumentException e) {
			return ResponseEntity.notFound().build();			
		} catch(Exception e) {
			 return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		 } 
	} 
	 
	// MODIFICO producto	 
	 @PutMapping("/{id}")
	 public ResponseEntity<Producto> updateProductoById(@PathVariable Long id, @RequestBody Producto productoDetails){
		 try {
		 	 Producto updatedProducto = productoService.updateProducto(id, productoDetails);
			 return ResponseEntity.ok(updatedProducto);
		 } catch(IllegalArgumentException e) {
				return ResponseEntity.notFound().build();			
		 } catch(Exception e) {
				 return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		 } 
	 }		 			 
	
	 //AGREGAR producto
	 @PostMapping
	 public ResponseEntity<Producto> createProducto(@RequestBody Producto producto){
		try {
			Producto createdProducto = productoService.saveProducto(producto);
			return ResponseEntity.ok(createdProducto);	
		} catch(Exception e) {
			 return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		 } 
		 
	 }
	 
	 //ELIMINO producto
	@DeleteMapping("/{id}")	
	public ResponseEntity<Void> deleteProductoById(@PathVariable Long id){
			try {
				productoService.deleteProducto(id);
				return ResponseEntity.noContent().build();				
			}catch(IllegalArgumentException e) {
				return ResponseEntity.notFound().build();			
		 } catch(Exception e) {
				 return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		 } 
	}
	 		
}

	 