/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bdncpractica1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Ville
 */
public class Conexion {
    
     private static Conexion instancia = null;
    private Connection cn = null;

    private Conexion() {
        try {
            cn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/bdnc", "postgres", "saLvador7");
        } catch (SQLException e) {
            System.out.println("Error al conectarse a la base de datos: " + e);
        }
    }

    public static Conexion getInstancia() {
        if (instancia == null) {
            instancia = new Conexion();
        }
        return instancia;
    }

    public Connection getConexion() {
        return cn;
    }
}
