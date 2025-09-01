package com.example.medicina_pacientes;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({
    "id","nombres","apellidos","rut","fechaDeNacimiento","historialMedico","atencionMedica"
})
public class Paciente {
    private int id;
    private String nombres;
    private String apellidos;           
    private String rut;
    private String fechaDeNacimiento;
    private String historialMedico;
    private String atencionMedica; 

    public Paciente(int id, String nombres, String apellidos, String rut, String fechaDeNacimiento, String historialMedico, String atencionMedica) {
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.rut = rut;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.historialMedico = historialMedico;
        this.atencionMedica = atencionMedica;
    }

    public int getId() { return id; }
    public String getNombres() { return nombres; }
    public String getApellidos() { return apellidos; }
    public String getRut() { return rut; }
    public String getFechaDeNacimiento() { return fechaDeNacimiento; }
    public String getHistorialMedico() { return historialMedico; }
    public String getAtencionMedica() { return atencionMedica; }
}
