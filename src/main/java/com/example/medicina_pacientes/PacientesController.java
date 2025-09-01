package com.example.medicina_pacientes;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
public class PacientesController {

    private final List<Paciente> pacientes = new ArrayList<>();

    public PacientesController() {
        pacientes.add(new Paciente(1, "Ana María", "Pérez Soto", "12.345.678-9", "1990-04-12", "Hipertensión controlada", "Consulta general"));
        pacientes.add(new Paciente(2, "Pedro Jose", "González Rivas", "15.234.567-8", "1985-09-30", "Alergia estacional", "Atención de urgencia"));
        pacientes.add(new Paciente(3, "Lucía Andrea", "Ramírez Díaz", "22.111.333-4", "2001-01-07", "Sin antecedentes", "Control preventivo"));
        pacientes.add(new Paciente(4, "Felipe Cristobal", "Tapia Orellana", "17.987.654-3", "1995-12-22", "Asma leve", "Control bronquial"));
        pacientes.add(new Paciente(5, "María José", "Fuentes Araya", "8.765.432-1", "1992-06-03", "Hipotiroidismo", "Controles endocrinos"));
        pacientes.add(new Paciente(6, "Diego Fernando", "Contreras Pino", "9.876.543-2", "1998-11-19", "Rinitis alérgica", "Evaluación otorrino"));
        pacientes.add(new Paciente(7, "Camila Ignacia", "Vega Muñoz", "14.223.334-5", "1993-02-28", "Migraña episódica", "Neurocontrol"));
        pacientes.add(new Paciente(8, "Javiera Daniela", "Molina Ruiz", "13.222.111-0", "2000-08-15", "Tendinitis de muñeca", "Kinesiología"));
    }

    @GetMapping({"/pacientes", "/pacientes/"})
    public List<Paciente> getPacientes() {
        return pacientes;
    }

    @GetMapping("/pacientes/{id}")
    public Paciente getPacienteById(@PathVariable int id) {
        for (Paciente p : pacientes) {
            if (p.getId() == id) return p;
        }
        return null;
    }
}
