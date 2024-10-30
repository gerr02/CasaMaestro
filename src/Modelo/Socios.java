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
 * La clase Socios representa la información de un socio registrado en el sistema.
 * Contiene detalles personales del socio, datos de contacto, fecha de inscripción y
 * tipo de suscripción asociada.
 */
public class Socios {

    // DNI del socio, que sirve como identificador único.
    private String dniSocio;

    // Nombre del socio.
    private String nombreSocio;

    // Apellido del socio.
    private String apellidoSocio;

    // Fecha de nacimiento del socio en formato de cadena de texto.
    private String fechaNacimiento;

    // Edad del socio, calculada o ingresada manualmente.
    private int edad;

    // Correo electrónico de contacto del socio.
    private String emailSocio;

    // Número de teléfono de contacto del socio.
    private String telefonoSocio;

    // Dirección física del socio.
    private String direccionSocio;

    // Fecha en la que el socio se inscribió en el sistema.
    private String fechaInscripcion;

    // ID del tipo de suscripción a la que el socio está inscrito.
    private String idTipoSuscripcion;

    /**
     * Constructor de la clase Socios. Inicializa todos los atributos de la clase.
     *
     * @param dniSocio          DNI único del socio.
     * @param nombreSocio       Nombre del socio.
     * @param apellidoSocio     Apellido del socio.
     * @param fechaNacimiento   Fecha de nacimiento del socio.
     * @param edad              Edad del socio.
     * @param emailSocio        Correo electrónico del socio.
     * @param telefonoSocio     Teléfono de contacto del socio.
     * @param direccionSocio    Dirección física del socio.
     * @param fechaInscripcion  Fecha de inscripción del socio.
     * @param idTipoSuscripcion ID del tipo de suscripción del socio.
     */
    public Socios(String dniSocio, String nombreSocio, String apellidoSocio, String fechaNacimiento, int edad, String emailSocio, String telefonoSocio, String direccionSocio, String fechaInscripcion, String idTipoSuscripcion) {
        this.dniSocio = dniSocio;
        this.nombreSocio = nombreSocio;
        this.apellidoSocio = apellidoSocio;
        this.fechaNacimiento = fechaNacimiento;
        this.edad = edad;
        this.emailSocio = emailSocio;
        this.telefonoSocio = telefonoSocio;
        this.direccionSocio = direccionSocio;
        this.fechaInscripcion = fechaInscripcion;
        this.idTipoSuscripcion = idTipoSuscripcion;
    }

    /**
     * Obtiene el DNI del socio.
     * 
     * @return DNI del socio.
     */
    public String getDniSocio() {
        return dniSocio;
    }

    /**
     * Establece el DNI del socio.
     * 
     * @param dniSocio DNI del socio a establecer.
     */
    public void setDniSocio(String dniSocio) {
        this.dniSocio = dniSocio;
    }

    /**
     * Obtiene el nombre del socio.
     * 
     * @return Nombre del socio.
     */
    public String getNombreSocio() {
        return nombreSocio;
    }

    /**
     * Establece el nombre del socio.
     * 
     * @param nombreSocio Nombre del socio a establecer.
     */
    public void setNombreSocio(String nombreSocio) {
        this.nombreSocio = nombreSocio;
    }

    /**
     * Obtiene el apellido del socio.
     * 
     * @return Apellido del socio.
     */
    public String getApellidoSocio() {
        return apellidoSocio;
    }

    /**
     * Establece el apellido del socio.
     * 
     * @param apellidoSocio Apellido del socio a establecer.
     */
    public void setApellidoSocio(String apellidoSocio) {
        this.apellidoSocio = apellidoSocio;
    }

    /**
     * Obtiene la fecha de nacimiento del socio.
     * 
     * @return Fecha de nacimiento del socio.
     */
    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * Establece la fecha de nacimiento del socio.
     * 
     * @param fechaNacimiento Fecha de nacimiento del socio a establecer.
     */
    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    /**
     * Obtiene la edad del socio.
     * 
     * @return Edad del socio.
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Establece la edad del socio.
     * 
     * @param edad Edad del socio a establecer.
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * Obtiene el correo electrónico del socio.
     * 
     * @return Correo electrónico del socio.
     */
    public String getEmailSocio() {
        return emailSocio;
    }

    /**
     * Establece el correo electrónico del socio.
     * 
     * @param emailSocio Correo electrónico del socio a establecer.
     */
    public void setEmailSocio(String emailSocio) {
        this.emailSocio = emailSocio;
    }

    /**
     * Obtiene el teléfono de contacto del socio.
     * 
     * @return Teléfono del socio.
     */
    public String getTelefonoSocio() {
        return telefonoSocio;
    }

    /**
     * Establece el teléfono de contacto del socio.
     * 
     * @param telefonoSocio Teléfono del socio a establecer.
     */
    public void setTelefonoSocio(String telefonoSocio) {
        this.telefonoSocio = telefonoSocio;
    }

    /**
     * Obtiene la dirección del socio.
     * 
     * @return Dirección del socio.
     */
    public String getDireccionSocio() {
        return direccionSocio;
    }

    /**
     * Establece la dirección del socio.
     * 
     * @param direccionSocio Dirección del socio a establecer.
     */
    public void setDireccionSocio(String direccionSocio) {
        this.direccionSocio = direccionSocio;
    }

    /**
     * Obtiene la fecha de inscripción del socio.
     * 
     * @return Fecha de inscripción del socio.
     */
    public String getFechaInscripcion() {
        return fechaInscripcion;
    }

    /**
     * Establece la fecha de inscripción del socio.
     * 
     * @param fechaInscripcion Fecha de inscripción del socio a establecer.
     */
    public void setFechaInscripcion(String fechaInscripcion) {
        this.fechaInscripcion = fechaInscripcion;
    }

    /**
     * Obtiene el ID del tipo de suscripción del socio.
     * 
     * @return ID del tipo de suscripción.
     */
    public String getIdTipoSuscripcion() {
        return idTipoSuscripcion;
    }

    /**
     * Establece el ID del tipo de suscripción del socio.
     * 
     * @param idTipoSuscripcion ID del tipo de suscripción a establecer.
     */
    public void setIdTipoSuscripcion(String idTipoSuscripcion) {
        this.idTipoSuscripcion = idTipoSuscripcion;
    }
    
}
