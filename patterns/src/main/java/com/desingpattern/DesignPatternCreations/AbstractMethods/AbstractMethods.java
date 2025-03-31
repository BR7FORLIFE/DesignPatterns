package com.desingpattern.DesignPatternCreations.AbstractMethods;

import com.desingpattern.DesignPatternCreations.AbstractMethods.Factorys.MySqlFactory;
import com.desingpattern.DesignPatternCreations.AbstractMethods.Factorys.PostgreSqlFactory;
import com.desingpattern.DesignPatternCreations.AbstractMethods.interfaces.AbstractFactoryInterfaceDB;

/**
 * 🔥 Ejercicio 3: Base de Datos
📌 Objetivo: Implementar una Abstract Factory para manejar conexiones a diferentes bases de datos: MySQL y PostgreSQL.

Requisitos:
1️⃣ Crea una interfaz ConexionBD con el método conectar().
2️⃣ Implementa MySQLConexion y PostgreSQLConexion.
3️⃣ Crea una interfaz BaseDeDatosFactory con el método crearConexion().
4️⃣ Implementa MySQLFactory y PostgreSQLFactory.
5️⃣ En el main, usa la fábrica correspondiente para obtener una conexión y llamar a conectar().
 */

public class AbstractMethods {
    public static void main(String[] args) {
        AbstractFactoryInterfaceDB factory;
        String typeDB = "MySql";
        
        if(typeDB.equalsIgnoreCase("MySql")){
            factory = new MySqlFactory();
            factory.createConnection();
        }else if(typeDB.equalsIgnoreCase("PostgreSql")){
            factory = new PostgreSqlFactory();
            factory.createConnection();
        } 
    }   

}
