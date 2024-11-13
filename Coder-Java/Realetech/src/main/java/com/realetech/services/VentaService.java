package com.realetech.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.realetech.models.Venta;
import com.realetech.repositories.VentaRepository;

import jakarta.transaction.Transactional;

@Service
public class VentaService {
    @Autowired
    private VentaRepository ventaRepository;
    
    public List<Venta> getAllVentas() {
        return ventaRepository.findAll();
    }

    public Venta findById(Long id) {
        return ventaRepository.findById(id)
            .orElseThrow(() -> new IllegalArgumentException("Venta no encontrada"));
    }
    
    @Transactional
    public Venta createVenta(Venta venta) {
        return ventaRepository.save(venta);
    }
    
    @Transactional
    public Venta saveVenta(Venta venta) {
        return ventaRepository.save(venta);
    }
    
    @Transactional
    public Venta updateVenta(Long id, Venta ventaDetails) {
        Venta venta = ventaRepository.findById(id)
            .orElseThrow(() -> new IllegalArgumentException("Venta no encontrada"));
        
        venta.setPrecio_Venta_Total(ventaDetails.getPrecio_Venta_Total());
        venta.setFecha_Venta(ventaDetails.getFecha_Venta());
        venta.setCliente(ventaDetails.getCliente());
        
        return ventaRepository.save(venta);
    }
    
    @Transactional
    public void deleteVenta(Long id) {
    	if(!ventaRepository.existsById(id)) {
    		 throw new IllegalArgumentException("El cliente no fué encontrado");
    	}
		 	ventaRepository.deleteById(id);
    	}
    
}
