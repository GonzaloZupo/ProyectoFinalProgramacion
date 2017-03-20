/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modulo;

/**
 *
 * @author Gonzalo
 */
public class Alumno{
    //Atributos
    private String nombre;
    private String apellido;
    private int matricula;
    private int semestre;
    private Fecha fechaIng;
    private Fecha fechaNac;
    
    //Constructor
    public Alumno(String nombre, String apellido, int matricula, int semestre, Fecha fechaIng, Fecha fechaNac) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.matricula = matricula;
        this.semestre = semestre;
        this.fechaIng = fechaIng;
        this.fechaNac = fechaNac;
    }
    
    //Metodos Get y Set
    //Get
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getMatricula() {
        return matricula;
    }

    public int getSemestre() {
        return semestre;
    }

    public Fecha getFechaIng() {
        return fechaIng;
    }

    public Fecha getFechaNac() {
        return fechaNac;
    }
    
    //Set
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public void setFechaIng(Fecha fechaIng) {
        this.fechaIng = fechaIng;
    }

    public void setFechaNac(Fecha fechaNac) {
        this.fechaNac = fechaNac;
    }
    
    //Metodo toString
    @Override
    public String toString() {
        return "Nombre: " + getNombre() + "\n" +
                "Apellido: " + getApellido() + "\n" +
                "Matricula: " + getMatricula() + "\n" +
                "Semestre: " + getSemestre() + "\n" +
                "Fecha de ingreso: " + getFechaIng() + "\n" +
                "Fecha de nacimiento: " + getFechaNac() + "\n";
    }
}