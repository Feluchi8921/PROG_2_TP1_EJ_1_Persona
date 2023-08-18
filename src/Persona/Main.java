package Persona;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
       Persona Persona1= new Persona("Felicitas", "Aguerralde",34206598);
       Persona1.setPeso(55.00);
       Persona1.setAltura(1.71);
       Persona1.setSexo('F');
       Persona1.getEstado();
       Persona1.setFechaNacimiento(LocalDate.of(1989,8,18));
       Persona1.setEdad(34);
       Persona1.getCumpleAnios();
       Persona1.getVotar();
       Persona1.getMayorEdad();
       Persona1.validarEdad();
       Persona1.getPersona();
        }
    }
