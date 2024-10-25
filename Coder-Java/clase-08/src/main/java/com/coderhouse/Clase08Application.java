/*package com.coderhouse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Clase08Application {

	public static void main(String[] args) {
		SpringApplication.run(Clase08Application.class, args);
	}

}*/
package com.coderhouse;

import java.util.ArrayList;
import java.util.List;

public class Clase08Application.java {
    public static void main(String[] args) {
        // Crear usuarios
        Usuario usuario1 = new Usuario(1, "Juan", "Pérez", 12345, "Calle Falsa 123", "juan@mail.com");
        Usuario usuario2 = new Usuario(2, "María", "Gómez", 67890, "Avenida Siempre Viva 456", "maria@mail.com");

        // Agregar usuarios
        Usuario.nuevoUsuario(usuario1);
        Usuario.nuevoUsuario(usuario2);

        // Modificar usuario
        Usuario.modificarUsuario(1, "Juan Carlos", "Pérez", "Calle Falsa 321", "juancarlos@mail.com");

        // Crear productos
        Producto producto1 = new Producto(1, "Laptop", "Dell", 1500.00, "Electrónica", 10);
        Producto producto2 = new Producto(2, "Teléfono", "Samsung", 800.00, "Electrónica", 20);

        // Agregar productos
        Producto.nuevoProducto(producto1);
        Producto.nuevoProducto(producto2);

        // Modificar producto
        Producto.modificarProducto(1, "Laptop Dell XPS", 1550.00, 8);

        // Registrar una venta
        List<Producto> productosVendidos = new ArrayList<>();
        productosVendidos.add(producto1);
        productosVendidos.add(producto2);

        Venta.registrarVenta(1, productosVendidos);

        // Simular el envío de una factura para la primera venta
        Venta primeraVenta = new Venta(1, 1, productosVendidos);
        primeraVenta.enviarFactura();
    }
}
