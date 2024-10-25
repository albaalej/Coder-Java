package com.coderhouse.models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.util.List;

public class Venta {
    private static int contadorVentas = 0;
    private int idVenta;
    private int idCliente;
    private List<Producto> productos;
    private double total;

    public Venta(int idCliente, List<Producto> productos) {
        this.idVenta = ++contadorVentas; // Incrementa el contador para cada venta nueva
        this.idCliente = idCliente;
        this.productos = productos;
        calcularTotal(); // Calcula el total de la venta
    }

    // Método para calcular el total de la venta
    private void calcularTotal() {
        total = 0.0;
        for (Producto producto : productos) {
            total += producto.getPrecio(); // Sumar el precio de cada producto
        }
    }

    public void enviarFactura() {
        // Lógica para enviar la factura, aquí simplemente lo mostraremos en consola
        System.out.println("Factura enviada para la venta con ID: " + idVenta + ". Total: $" + total);
    }

    // Método para registrar la venta (puede usarse en otras partes del sistema)
    public static void registrarVenta(int idCliente, List<Producto> productos) {
        Venta venta = new Venta(idCliente, productos);
        System.out.println("Venta registrada con éxito. Total: $" + venta.total);
    }

    // Getters y setters si son necesarios
    public int getIdVenta() {
        return idVenta;
    }

    public double getTotal() {
        return total;
    }
}
