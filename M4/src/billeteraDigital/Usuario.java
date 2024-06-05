package billeteraDigital;

// Informacion del usuario
public class Usuario {

    // Atributos
    private String usuario;
    private String cuenta;
    private static float saldo;

    // Getter y Setter
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public Float getSaldo() {
        return saldo;
    }

    public void setSaldo(Float saldo) {
        this.saldo = saldo;
    }

    // constructor
    public Usuario(String cuenta, Float saldo) {
        this.cuenta = cuenta;
        this.saldo = saldo;
    }

    public Usuario(){};
}
