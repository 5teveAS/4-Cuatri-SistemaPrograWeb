/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Steve AS
 */
public class Prospecto {

    private int id;
    private String idProspecto;
    private String nombre;
    private String Apellido1;
    private String Apellido2;
    private Date fechaNacimiento;
    private Date fechaGraduacionColegio;
    private Date fechaPosibleIngreso;
    private String correo;
    private String celular;

    public Prospecto() {
    }

    public Prospecto(int id, String idProspecto, String nombre, String Apellido1, String Apellido2, Date fechaNacimiento, Date fechaGraduacionColegio, Date fechaPosibleIngreso, String correo, String celular) {
        this.id = id;
        this.idProspecto = idProspecto;
        this.nombre = nombre;
        this.Apellido1 = Apellido1;
        this.Apellido2 = Apellido2;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaGraduacionColegio = fechaGraduacionColegio;
        this.fechaPosibleIngreso = fechaPosibleIngreso;
        this.correo = correo;
        this.celular = celular;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIdProspecto() {
        return idProspecto;
    }

    public void setIdProspecto(String idProspecto) {
        this.idProspecto = idProspecto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return Apellido1;
    }

    public void setApellido1(String Apellido1) {
        this.Apellido1 = Apellido1;
    }

    public String getApellido2() {
        return Apellido2;
    }

    public void setApellido2(String Apellido2) {
        this.Apellido2 = Apellido2;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Date getFechaGraduacionColegio() {
        return fechaGraduacionColegio;
    }

    public void setFechaGraduacionColegio(Date fechaGraduacionColegio) {
        this.fechaGraduacionColegio = fechaGraduacionColegio;
    }

    public Date getFechaPosibleIngreso() {
        return fechaPosibleIngreso;
    }

    public void setFechaPosibleIngreso(Date fechaPosibleIngreso) {
        this.fechaPosibleIngreso = fechaPosibleIngreso;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

   //METODO toString devuelve un JSON
    @Override
    public String toString(){
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
        String fecha1 = format.format(this.fechaNacimiento);
        String fecha2 = format.format(this.fechaGraduacionColegio);
        String fecha3 = format.format(this.fechaPosibleIngreso);
        return "{\"Propecto\":{\n\"cedula\":\""
                + idProspecto + "\",\n\"nombre\":\""
                + nombre + "\",\n\"apellido1\":\""
                + Apellido1 + "\",\n\"apellido2\":\""
                + Apellido2 + "\",\n\"fechaNacimiento\":\""
                + fecha1 + "\",\n\"fechaGraduacionColegio\":\""
                + fecha2 + "\",\n\"fechaPosibleIngreso\":\""
                + fecha3 + "\",\n\"correo\":\""
                + correo + "\",\n\"celular\":\""
                + celular + "\"\n}\n}";
        
    }

}
