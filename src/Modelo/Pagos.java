/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author leo_8
 */
/**
 * La clase Pagos representa el registro de un pago realizado por un socio en el sistema.
 * Contiene información relevante sobre el pago, incluyendo el código del pago, el monto,
 * el mes correspondiente, la fecha en la que se realizó el pago, el DNI del socio que realizó
 * el pago y el ID del usuario que registró el pago.
 */
public class Pagos {

    // Código único que identifica el pago.
    private String codPagos;

    // Monto del pago realizado en una cantidad entera.
    private int monto;

    // Mes correspondiente al pago realizado.
    private String mes;

    // Fecha en la que se realizó el pago, almacenada como cadena de texto.
    private String fechaPago;

    // DNI del socio que realizó el pago.
    private String dniSocio;

    // ID del usuario que registró el pago en el sistema.
    private String idUsuario;

    /**
     * Constructor de la clase Pagos. Inicializa todos los atributos de la clase.
     *
     * @param codPagos   Código único del pago.
     * @param monto      Monto del pago.
     * @param mes        Mes correspondiente al pago.
     * @param fechaPago  Fecha en la que se realizó el pago.
     * @param dniSocio   DNI del socio que realizó el pago.
     * @param idUsuario  ID del usuario que registró el pago.
     */
    public Pagos(String codPagos, int monto, String mes, String fechaPago, String dniSocio, String idUsuario) {
        this.codPagos = codPagos;
        this.monto = monto;
        this.mes = mes;
        this.fechaPago = fechaPago;
        this.dniSocio = dniSocio;
        this.idUsuario = idUsuario;
    }

    /**
     * Obtiene el código del pago.
     * 
     * @return Código del pago.
     */
    public String getCodPagos() {
        return codPagos;
    }

    /**
     * Establece el código del pago.
     * 
     * @param codPagos Código del pago a establecer.
     */
    public void setCodPagos(String codPagos) {
        this.codPagos = codPagos;
    }

    /**
     * Obtiene el monto del pago.
     * 
     * @return Monto del pago.
     */
    public int getMonto() {
        return monto;
    }

    /**
     * Establece el monto del pago.
     * 
     * @param monto Monto del pago a establecer.
     */
    public void setMonto(int monto) {
        this.monto = monto;
    }

    /**
     * Obtiene el mes correspondiente al pago.
     * 
     * @return Mes del pago.
     */
    public String getMes() {
        return mes;
    }

    /**
     * Establece el mes correspondiente al pago.
     * 
     * @param mes Mes del pago a establecer.
     */
    public void setMes(String mes) {
        this.mes = mes;
    }

    /**
     * Obtiene la fecha en la que se realizó el pago.
     * 
     * @return Fecha del pago.
     */
    public String getFechaPago() {
        return fechaPago;
    }

    /**
     * Establece la fecha en la que se realizó el pago.
     * 
     * @param fechaPago Fecha del pago a establecer.
     */
    public void setFechaPago(String fechaPago) {
        this.fechaPago = fechaPago;
    }

    /**
     * Obtiene el DNI del socio que realizó el pago.
     * 
     * @return DNI del socio.
     */
    public String getDniSocio() {
        return dniSocio;
    }

    /**
     * Establece el DNI del socio que realizó el pago.
     * 
     * @param dniSocio DNI del socio a establecer.
     */
    public void setDniSocio(String dniSocio) {
        this.dniSocio = dniSocio;
    }

    /**
     * Obtiene el ID del usuario que registró el pago.
     * 
     * @return ID del usuario.
     */
    public String getIdUsuario() {
        return idUsuario;
    }

    /**
     * Establece el ID del usuario que registró el pago.
     * 
     * @param idUsuario ID del usuario a establecer.
     */
    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }
    
}
