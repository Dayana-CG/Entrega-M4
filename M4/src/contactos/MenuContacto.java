package contactos;

import java.util.Scanner;
/*
 * En esta clase podemos realizar
 * distintas acciones con la lista de contactos
 * predefinida
 */

public class MenuContacto {

    public static void menuContacto() throws Exception {

        Scanner leer = new Scanner(System.in);

        System.out.println();
        System.out.println("   Menu Contactos");
        System.out.println("   **************");
        System.out.println();
        System.out.println("1. Cargar Contactos");
        System.out.println("2. Lista de Contactos");
        System.out.println("3. Agregar Contacto");
        System.out.println("4. Buscar/Modificar/Eliminar Contacto");
        System.out.println("5. Volver al Menu Principal");
        System.out.println();
        System.out.println("Que es lo que desea realizar?");
        System.out.print("Seleccione una opción: ");
        String opc = leer.nextLine();

        switch (opc) {

            case "1":
                System.out.println();
                ArchivoContacto.cargarDatos();
                menuContacto();
                break;

            case "2":
                System.out.println();
                ArchivoContacto.listarContactos();
                menuContacto();
                break;

            case "3":
                System.out.println();
                agregarContacto();
                menuContacto();
                break;

            case "4":
                System.out.println();
                varios();
                menuContacto();
                break;

            case "5":
                System.out.println();
                System.out.println("Menu Principal...");
                break;

            default:
                System.out.println();
                System.out.println("Opción no valida...");
                menuContacto();
                break;
        }
    }

    public static void agregarContacto() {

        Scanner nuevo = new Scanner(System.in);

        System.out.println();
        System.out.println("Ingrese Rut: ");
        String rut = nuevo.nextLine();
        System.out.println("Ingrese Nombre Contacto: ");
        String nombreContacto = nuevo.nextLine();
        System.out.println("Ingrese Tipo de Cuenta: ");
        String tipoCuenta = nuevo.nextLine();
        System.out.println("Ingrese Número de Cuenta: ");
        String numeroCuenta = nuevo.nextLine();
        System.out.println("Ingrese Nombre Banco: ");
        String nombreBanco = nuevo.nextLine();

        System.out.println();
        System.out.println("**   Contacto ingresado exitosamente!   **");

        Contactos contactos = new Contactos(rut, nombreContacto, tipoCuenta, numeroCuenta, nombreBanco);
        AdministrarContacto.agregarContacto(contactos);
        ArchivoContacto.extraerContacto();
    }

    public static void varios() {
        AdministrarContacto.opcionesVarias();
    }

}
