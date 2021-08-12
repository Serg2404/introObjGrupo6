package com.company;

public class Articulo {

    private String descripcion;
    private double precioVenta;
    private double precioCompra;
    private int stock;

    public Articulo(String descripcion, int stock, double precioVenta, double precioCompra) {
        this.descripcion = descripcion;
        this.precioVenta = precioVenta;
        this.stock = stock;
        this.precioCompra = precioCompra;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public double getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public boolean hayStock() {
        return this.stock > 0;
    }

    public double consultarGanancia() {
        return this.precioVenta - this.precioCompra;
    }
}
