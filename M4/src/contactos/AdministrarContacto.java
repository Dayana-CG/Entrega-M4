package contactos;

import java.util.ArrayList;
import java.util.Scanner;

public class AdministrarContacto {

    // creamos un arraylist para guardar los contactos del archivo
    private static ArrayList<Contactos> listaContactos = new ArrayList<Contactos>();

    // guardamos los registros
    public static ArrayList<Contactos> getListarContactos() {
        return listaContactos;
    }

    // Mostramos los datos que estan guardados en el archivo
    public void setListarContactos(ArrayList<Contactos> listaContactos) {
        this.listaContactos = listaContactos;
    }

    // como se mostraran
    public static void listarContactos() {
        for (Contactos contactos : listaContactos) {
            System.out.println();
            System.out.println("Datos del Contacto: ");
            System.out.println("Rut: " + contactos.getRut());
            System.out.println("Nombre Contacto: " + contactos.getNombreContacto());
            System.out.println("Tipo Cuenta: " + contactos.getTipoCuenta());
            System.out.println("Número Cuenta: " + contactos.getNumeroCuenta());
            System.out.println("Nombre Banco: " + contactos.getNombreBanco());

        }
    }

    // Metodo que permite agregar un nuevo contacto
    public static void agregarContacto(Contactos contacto) {

        listaContactos.add(contacto);

    }

    // metodo que nos permite modificar, buscar y eliminar un contacto
    // tenemos un menu que permite elegir las distintas opciones
    public static void opcionesVarias() {

        Scanner leer = new Scanner(System.in);
        System.out.println();
        System.out.println("Ingrese Rut del contacto: ");
        String rut = leer.nextLine();

        for (Contactos contacto : listaContactos) {

            if (rut.equals(contacto.getRut())) {

                System.out.println();
                System.out.println("Datos del Contacto: ");
                System.out.println();
                System.out.println("Rut: " + contacto.getRut());
                System.out.println("Nombre Contacto: " + contacto.getNombreContacto());
                System.out.println("Tipo Cuenta: " + contacto.getTipoCuenta());
                System.out.println("Número Cuenta: " + contacto.getNumeroCuenta());
                System.out.println("Nombre Banco: " + contacto.getNombreBanco());
                System.out.println();

                Scanner nuevo = new Scanner(System.in);

                System.out.println("Que desea hacer con el Contacto: ");
                System.out.println();
                System.out.println("1. Se modificara: ");
                System.out.println("  Tipo de Cuenta");
                System.out.println("  Número de Cuenta");
                System.out.println("  Nombre de Banco");
                System.out.println();
                System.out.println("2. Eliminar contacto");
                System.out.println("3. Solo Busqueda, NO realizar Cambios.");
                System.out.println();
                System.out.println("Seleccione la acción a realizar: ");

                String opcion = nuevo.nextLine();

                switch (opcion) {

                    case "1":
                        // Modificar tipo de cuenta
                        System.out.println();
                        System.out.println("Ingrese Nuevo Tipo de Cuenta: ");
                        String tipoCuentaN = leer.nextLine();
                        contacto.setTipoCuenta(tipoCuentaN);
                        System.out.println();
                        System.out.println("**   Modificación Exitosa   **");
                        System.out.println();

                        // Modificar número de cuenta
                        System.out.println("Ingrese Nuevo Número de Cuenta: ");
                        String numeroCuentaN = leer.nextLine();
                        contacto.setNumeroCuenta(numeroCuentaN);
                        System.out.println();
                        System.out.println("Modificación Exitosa");
                        System.out.println();

                        // Modificar nombre de banco
                        System.out.println("Ingrese Nuevo Banco: ");
                        String nombreBancoN = leer.nextLine();
                        contacto.setNombreBanco(nombreBancoN);
                        System.out.println();
                        System.out.println("**   Modificación Exitosa   **");
                        System.out.println();
                        ArchivoContacto.extraerContacto();
                        break;

                    case "2":
                        // Eliminar contacto
                        listaContactos.remove(contacto);
                        System.out.println();
                        System.out.println("**   Contacto Eliminado Correctamente.   **");
                        ArchivoContacto.extraerContacto();
                        break;

                    case "3":
                        System.out.println();
                        System.out.println("**   No Se realizaron Cambios.  **");
                        break;


                    default:
                        System.out.println();
                        System.out.println("Opción no válida. Intente nuevamente.");
                        opcionesVarias();
                        break;
                }

            }
        }
    }
}


