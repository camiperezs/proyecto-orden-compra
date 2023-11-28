package org.chxm;

import java.util.Date;

public class EjemploOrdenes {
    public static void main(String[] args) {
        OrdenCompra orden1 = new OrdenCompra("Primera orden de compra");
        orden1.setFecha(new Date());
        orden1.setCliente(new Cliente("Camila", "Perez"));
        orden1.addProducto(new Producto("Fabricante 1", "nombreFabricante1", 10.5));
        orden1.addProducto(new Producto("Fabricante 1", "nombreFabricante1", 10.0));
        orden1.addProducto(new Producto("Fabricante 1", "nombreFabricante1", 8.0));
        orden1.addProducto(new Producto("Fabricante 1", "nombreFabricante1", 2.5));

        System.out.println("ID = " + orden1.getId());
        System.out.println("Descripción: " + orden1.getDescripcion());
        System.out.println("Date = " + orden1.getFecha());
        System.out.println("Cliente = " + orden1.getCliente().getNombre() + " " + orden1.getCliente().getApellido());
        for(Producto pr : orden1.getProductos()){
            System.out.println("Fabricante = "+ pr.getFabricante() +
                            ", Nombre = " + pr.getNombre() +
                            ", Precio =  " + pr.getPrecio());
        }
        System.out.println("Total de precios de productos = " + orden1.totalPrecios(orden1.getProductos()));
        System.out.println("-------------------------------------------");

        OrdenCompra orden2 = new OrdenCompra("Segunda orden de compra");
        orden2.setFecha(new Date());
        orden2.setCliente(new Cliente("Celia", "Attonaty"));
        orden2.addProducto(new Producto("Fabricante 2", "nombreFabricante2", 10.8));
        orden2.addProducto(new Producto("Fabricante 2", "nombreFabricante2", 10.2));
        orden2.addProducto(new Producto("Fabricante 2", "nombreFabricante2", 6.5));
        orden2.addProducto(new Producto("Fabricante 2", "nombreFabricante2", 4.5));
        System.out.println("ID = " + orden2.getId());
        System.out.println("Descripción: " + orden2.getDescripcion());
        System.out.println("Date = " + orden2.getFecha());
        System.out.println("Cliente = " + orden2.getCliente().getNombre() + " " + orden2.getCliente().getApellido());
        for(Producto pr : orden2.getProductos()){
            System.out.println("Fabricante = "+ pr.getFabricante() +
                    ", Nombre = " + pr.getNombre() +
                    ", Precio =  " + pr.getPrecio());
        }
        System.out.println("Total de precios de productos = " + orden2.totalPrecios(orden2.getProductos()));
        System.out.println("-------------------------------------------");

        OrdenCompra orden3 = new OrdenCompra("Tercera orden de compra");
        orden3.setFecha(new Date());
        orden3.setCliente(new Cliente("Pablo", "Perez"));
        orden3.addProducto(new Producto("Fabricante 3", "nombreFabricante3", 20.5));
        orden3.addProducto(new Producto("Fabricante 3", "nombreFabricante3", 10.5));
        orden3.addProducto(new Producto("Fabricante 3", "nombreFabricante3", 8.5));
        orden3.addProducto(new Producto("Fabricante 3", "nombreFabricante3", 1.5));
        System.out.println("ID = " + orden3.getId());
        System.out.println("Descripción: " + orden3.getDescripcion());
        System.out.println("Date = " + orden3.getFecha());
        System.out.println("Cliente = " + orden3.getCliente().getNombre() + " " + orden3.getCliente().getApellido());
        for(Producto pr : orden3.getProductos()){
            System.out.println("Fabricante = "+ pr.getFabricante() +
                    ", Nombre = " + pr.getNombre() +
                    ", Precio =  " + pr.getPrecio());
        }
        System.out.println("Total de precios de productos = " + orden3.totalPrecios(orden3.getProductos()));
    }
}