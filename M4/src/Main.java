import java.util.Scanner;

import billeteraDigital.Usuario;
import billeteraDigital.UsuarioNuevo;

// clase main implementa una interfaz
public class Main implements UsuarioNuevo {
    public static void main(String[] args) throws Exception {

        Main miObjeto = new Main();
        miObjeto.usuarioN();
        billeteraDigital.Menu.menu();

    }

    // se cargan los datos del usuario registrado
    @Override
    public void usuarioN() {

        System.out.println("");
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese Usuario: ");
        String nombreUsuario = leer.nextLine();

        switch (nombreUsuario) {
            // usuario registrado
            case "Dayana Carvajal":

                // saldo en cuenta
                Usuario usuario = new Usuario(0f);

                // Datos en linea
                System.out.println();
                System.out.println("Usuario en línea: ");
                System.out.println();
                System.out.println("                    Nombre: " + nombreUsuario);
                System.out.println("                    N°Cuenta: " + usuario.getCuenta());
                System.out.println("                    Saldo en Linea: " + usuario.getSaldo());
                break;
            default:
                // en caso de ingresar otro usuario
                System.out.println("            Usuario No registrado !");
                System.out.println("            REGISTRATE CON NOSOTROS");
                usuarioN();
                break;
        }
    }

}