package cuentas;

/**
 * Clase que representa una cuenta bancaria
 * Permite realizar operaciones de ingreso y retirada de dinero
 *
 * @author Samuel
 */
public class CCuenta {

     /** Nombre del titular de la cuenta*/
    private String nombre;
    
    /** Número identificador de la cuenta*/
    private String cuenta;
    
    /** Saldo actual de la cuenta*/
    private double saldo;
    
    /** Tipo de interes aplicado a la cuenta*/
    private double tipoInterés;

    /**
     * Constructor vacio
     */
    public CCuenta()
    {
    }

    /**
     * Constructor con parametros
     * @param nom  Nombre del titular
     * @param cue  Numero de cuenta
     * @param sal  Saldo inicial
     * @param tipo Tipo de interes
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
        tipoInterés = tipo;
    }

    /**
     * Obtiene el nombre del titular
     * @return nombre del titular
     */
    public String getNombre() {
        return nombre;
    }
    
    /**
     * Obtiene el número de cuenta
     * @return número de cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Obtiene el saldo de la cuenta
     * @return saldo de la cuenta
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Obtiene el tipo de interes
     * @return tipo de interes
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

     /**
     * Establece el nombre del titular
     * @param nombre nuevo nombre del titular
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Establece el número de cuenta
     * @param cuenta nuevo número de cuenta
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Establece el saldo de la cuenta
     * @param saldo nuevo saldo
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Establece el tipo de interes
     * @param tipoInterés nuevo tipo de interes
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
    
    /**
    * Devuelve el saldo actual de la cuenta
    * @return saldo actual
    */
    public double estado()
    {
        return saldo;
    }

    /**
     * Ingresa una cantidad en la cuenta
     * @param cantidad Importe a ingresar
     * @throws Exception Si la cantidad es negativa
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    /**
     * Retira una cantidad de la cuenta
     * @param cantidad Importe a retirar
     * @throws Exception Si la cantidad es negativa o no hay saldo suficiente
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
}
