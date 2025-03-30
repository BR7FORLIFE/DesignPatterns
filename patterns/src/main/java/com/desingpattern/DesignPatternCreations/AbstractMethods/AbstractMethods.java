package com.desingpattern.DesignPatternCreations.AbstractMethods;
import java.util.Scanner;
import com.desingpattern.DesignPatternCreations.AbstractMethods.interfaces.DBconecction;

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
    DBconecction factory;

    Scanner scanner = new Scanner(System.in);
    String typeDB = scanner.nextLine();

}
