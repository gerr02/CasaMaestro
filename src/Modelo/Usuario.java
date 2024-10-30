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
 * La clase Usuario representa a un usuario en el sistema, proporcionando los
 * detalles necesarios para su autenticación y clasificación según su tipo.
 */
public class Usuario {

    // Identificador único del usuario.
    private String idUsuario;

    // Nombre del usuario.
    private String nombreUsuario;

    // Apellidos del usuario.
    private String apellidosUsuario;

    // Correo electrónico del usuario.
    private String emailUsuario;

    // Contraseña del usuario.
    private String contraseña;

    // Tipo de usuario (por ejemplo, administrador, empleado, socio, etc.).
    private String tipoUsuario;

    /**
     * Constructor de la clase Usuario. Inicializa todos los atributos de la clase.
     *
     * @param idUsuario       Identificador único del usuario.
     * @param nombreUsuario   Nombre del usuario.
     * @param apellidosUsuario Apellidos del usuario.
     * @param emailUsuario    Correo electrónico del usuario.
     * @param contraseña      Contraseña del usuario.
     * @param tipoUsuario     Tipo de usuario (por ejemplo, administrador o socio).
     */
    public Usuario(String idUsuario, String nombreUsuario, String apellidosUsuario, String emailUsuario, String contraseña, String tipoUsuario) {
        this.idUsuario = idUsuario;
        this.nombreUsuario = nombreUsuario;
        this.apellidosUsuario = apellidosUsuario;
        this.emailUsuario = emailUsuario;
        this.contraseña = contraseña;
        this.tipoUsuario = tipoUsuario;
    }

    /**
     * Obtiene el identificador del usuario.
     * 
     * @return ID del usuario.
     */
    public String getIdUsuario() {
        return idUsuario;
    }

    /**
     * Establece el identificador del usuario.
     * 
     * @param idUsuario ID del usuario a establecer.
     */
    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    /**
     * Obtiene el nombre del usuario.
     * 
     * @return Nombre del usuario.
     */
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    /**
     * Establece el nombre del usuario.
     * 
     * @param nombreUsuario Nombre del usuario a establecer.
     */
    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    /**
     * Obtiene los apellidos del usuario.
     * 
     * @return Apellidos del usuario.
     */
    public String getApellidosUsuario() {
        return apellidosUsuario;
    }

    /**
     * Establece los apellidos del usuario.
     * 
     * @param apellidosUsuario Apellidos del usuario a establecer.
     */
    public void setApellidosUsuario(String apellidosUsuario) {
        this.apellidosUsuario = apellidosUsuario;
    }

    /**
     * Obtiene el correo electrónico del usuario.
     * 
     * @return Correo electrónico del usuario.
     */
    public String getEmailUsuario() {
        return emailUsuario;
    }

    /**
     * Establece el correo electrónico del usuario.
     * 
     * @param emailUsuario Correo electrónico del usuario a establecer.
     */
    public void setEmailUsuario(String emailUsuario) {
        this.emailUsuario = emailUsuario;
    }

    /**
     * Obtiene la contraseña del usuario.
     * 
     * @return Contraseña del usuario.
     */
    public String getContraseña() {
        return contraseña;
    }

    /**
     * Establece la contraseña del usuario.
     * 
     * @param contraseña Contraseña del usuario a establecer.
     */
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    /**
     * Obtiene el tipo de usuario.
     * 
     * @return Tipo de usuario (por ejemplo, administrador o socio).
     */
    public String getTipoUsuario() {
        return tipoUsuario;
    }

    /**
     * Establece el tipo de usuario.
     * 
     * @param tipoUsuario Tipo de usuario a establecer.
     */
    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }
    
}
