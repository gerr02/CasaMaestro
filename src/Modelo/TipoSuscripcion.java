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
 * La clase TipoSuscripcion representa un tipo de suscripción que los socios pueden
 * adquirir en el sistema. Incluye detalles sobre el identificador de la suscripción,
 * una descripción y el monto mensual asociado.
 */
public class TipoSuscripcion {

    // Identificador único del tipo de suscripción.
    private String idTipoSuscripcion;

    // Descripción del tipo de suscripción.
    private String descripcion;

    // Monto mensual asociado a la suscripción.
    private int montoMensual;

    /**
     * Constructor de la clase TipoSuscripcion. Inicializa todos los atributos de la clase.
     *
     * @param idTipoSuscripcion Identificador único del tipo de suscripción.
     * @param descripcion       Descripción del tipo de suscripción.
     * @param montoMensual      Monto mensual de la suscripción.
     */
    public TipoSuscripcion(String idTipoSuscripcion, String descripcion, int montoMensual) {
        this.idTipoSuscripcion = idTipoSuscripcion;
        this.descripcion = descripcion;
        this.montoMensual = montoMensual;
    }

    /**
     * Obtiene el identificador del tipo de suscripción.
     * 
     * @return ID del tipo de suscripción.
     */
    public String getIdTipoSuscripcion() {
        return idTipoSuscripcion;
    }

    /**
     * Establece el identificador del tipo de suscripción.
     * 
     * @param idTipoSuscripcion ID del tipo de suscripción a establecer.
     */
    public void setIdTipoSuscripcion(String idTipoSuscripcion) {
        this.idTipoSuscripcion = idTipoSuscripcion;
    }

    /**
     * Obtiene la descripción del tipo de suscripción.
     * 
     * @return Descripción del tipo de suscripción.
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Establece la descripción del tipo de suscripción.
     * 
     * @param descripcion Descripción del tipo de suscripción a establecer.
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * Obtiene el monto mensual de la suscripción.
     * 
     * @return Monto mensual de la suscripción.
     */
    public int getMontoMensual() {
        return montoMensual;
    }

    /**
     * Establece el monto mensual de la suscripción.
     * 
     * @param montoMensual Monto mensual de la suscripción a establecer.
     */
    public void setMontoMensual(int montoMensual) {
        this.montoMensual = montoMensual;
    }
    
}
