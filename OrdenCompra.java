package org.chxm;

import java.util.Arrays;
import java.util.Date;

public class OrdenCompra {
    private final Integer id;
    private final String descripcion;
    private Date fecha;
    private Cliente cliente;
    private final Producto[] productos;
    private int indiceProducto;
    private static int count;

    public OrdenCompra(String descripcion) {
        this.id = ++count;
        this.descripcion = descripcion;
        this.productos = new Producto[4];
    }

    public Integer getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Producto[] getProductos() {
        return productos;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void addProducto (Producto producto){
        if(indiceProducto < this.productos.length) {
            this.productos[indiceProducto++] = producto;
        }
    }

    @Override
    public String toString() {
        return "OrdenCompra: " +
                "\nid= " + id +
                "\ndescripcion = " + descripcion +
                "\nfecha = " + fecha +
                "\ncliente=" + cliente +
                "\nproductos=" + Arrays.toString(productos) +
                "\nindiceProducto=" + indiceProducto;
    }

    public String totalPrecios(Producto[] producto) {
        double totalP = 0;
        for (Producto value : producto) {
            totalP += value.getPrecio();
        }
        return "El precio total de todos los productos es de: " + totalP;
    }
}
