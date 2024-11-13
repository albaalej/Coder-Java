package com.realetech.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.realetech.models.Venta;
import com.realetech.services.VentaService;

@RestController
@RequestMapping("api/ventas")
public class VentasController {
    
    @Autowired
    private VentaService ventaService;

    @GetMapping
    public ResponseEntity<List<Venta>> getAllVentas() {
        try {
            List<Venta> ventas = ventaService.getAllVentas();
            return ResponseEntity.ok(ventas);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<Venta> getVentaById(@PathVariable Long id) {
        try {
            Venta venta = ventaService.findById(id);
            return ResponseEntity.ok(venta);
        } catch (IllegalArgumentException e) {
            return ResponseEntity.notFound().build();
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @PostMapping
    public ResponseEntity<Venta> createVenta(@RequestBody Venta venta) {
        try {
            Venta createdVenta = ventaService.createVenta(venta);
            return ResponseEntity.ok(createdVenta);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<Venta> updateVenta(@PathVariable Long id, @RequestBody Venta ventaDetails){
        try {
            Venta updatedVenta = ventaService.updateVenta(id, ventaDetails);
            return ResponseEntity.ok(updatedVenta);
        	} catch(IllegalArgumentException e) {
			return ResponseEntity.notFound().build();			
        	} catch(Exception e) {
			 return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
	 		} 
    }	 

    //ELIMINO CLIENTE
   	@DeleteMapping("/{id}")	
   	public ResponseEntity<Void> deleteClienteById(@PathVariable Long id){
   			try {
   				ventaService.deleteVenta(id);
   				return ResponseEntity.noContent().build();				
   			}catch(IllegalArgumentException e) {
   				return ResponseEntity.notFound().build();			
   		 } catch(Exception e) {
   				 return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
   		 } 
   	}

}


