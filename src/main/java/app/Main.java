package app;

import model.Direccion;
import model.Empleado;
import model.Persona;

public class Main {
    public static void main(String[] args) {
        // 1. Crear algunas direcciones (Composición)
        Direccion dir1 = new Direccion("Av. Vicente Pérez Rosales", 123, "Llanquihue", "Los Lagos");
        Direccion dir2 = new Direccion("Calle del Lago", 456, "Puerto Varas", "Los Lagos");
        Direccion dir3 = new Direccion("Arturo Prat", 789, "Frutillar", "Los Lagos");

        // 2. Crear objetos Persona y Empleado (Herencia)
        Persona cliente1 = new Persona("11.111.111-1", "Juan", "Pérez", "+56911223344", dir1);
        Persona proveedor1 = new Persona("22.222.222-2", "María", "González", "+56955667788", dir2);
        
        Empleado guia1 = new Empleado("33.333.333-3", "Pedro", "Soto", "+56999887766", dir3, "Guía Turístico", 5);

        // 3. Mostrar por consola los datos de los objetos usando toString()
        System.out.println("=== Sistema de Gestión - Llanquihue Tour ===");
        System.out.println("\n--- Cliente ---");
        System.out.println(cliente1.toString());

        System.out.println("\n--- Proveedor ---");
        System.out.println(proveedor1.toString());

        System.out.println("\n--- Empleado (Guía) ---");
        System.out.println(guia1.toString());
    }
}
