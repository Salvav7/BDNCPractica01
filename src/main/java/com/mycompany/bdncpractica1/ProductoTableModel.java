/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bdncpractica1;

import javax.swing.table.AbstractTableModel;
import java.util.List;

/**
 *
 * @author Ville
 */
public class ProductoTableModel extends AbstractTableModel {

    private List<Producto> productos;
    private String[] columnNames = {"Clave", "Descripción", "Precio de Venta", "Costo"};

    public ProductoTableModel(List<Producto> productos) {
        this.productos = productos;
    }

    @Override
    public int getRowCount() {
        return productos.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Producto producto = productos.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return producto.getId();
            case 1:
                return producto.getDescripcion();
            case 2:
                return producto.getPrecioVenta();
            case 3:
                return producto.getPrecioCompra();
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }

}
