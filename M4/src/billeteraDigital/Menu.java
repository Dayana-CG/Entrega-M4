package billeteraDigital;

import java.util.Scanner;
/*
 * Esta clase es el menu de seleccion para realizar
 * distintas opciones dentro de la billetera digital
 */

public class Menu {

    public static void menu() throws Exception {

        Usuario usuario = new Usuario();

        Scanner opcion = new Scanner(System.in);

        /*
         * Se pueden hacer transferencias, depositos
         * ver los movimientos realizados
         * tambien se puede ingresar a un menu de contactos
         */

        System.out.println();
        System.out.println("Billetera Digital");
        System.out.println("*****************");
        System.out.println();
        System.out.println("Saldo disponible: CLP " + usuario.getSaldo());
        System.out.println();
        System.out.println("*** Tu Sesión ***");
        System.out.println();
        System.out.println("1. Transferencias");
        System.out.println("2. Depósitos");
        System.out.println("3. Movimientos");
        System.out.println("4. Contactos");
        System.out.println("5. Cerrar Sesión");
        System.out.println();
        System.out.println("Que es lo que desea realizar?");
        System.out.print("Seleccione una opción: ");
        String opc = opcion.nextLine();

        switch (opc) {
            case "1":
                Transferir.menuTrans();
                break;

            case "2":
                Depositar.menuDepo();
                break;

            case "3":
                System.out.println();
                System.out.println("MOVIMIENTOS: ");
                System.out.println("***********");
                Transferir.movTransferencia();
                Depositar.movDepositos();
                menu();
                break;

            case "4":
                contactos.MenuContacto.menuContacto();
                menu();
                break;
                
            case "5":
                System.out.println("CERRANDO SESION...");
                break;

            default:
                System.out.println();
                System.out.println("Opción no valida...");
                System.out.println("Ingrese una opción valida.");
                menu();
                break;
        }
    }

}
