package Persona;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
       Persona Persona1= new Persona("Felicitas", "Aguerralde",34206598);
       Persona1.setPeso(55.00);
       Persona1.setAltura(1.71);
       Persona1.setSexo('F');
       Persona1.setEdad(34);
       Persona1.setFechaNacimiento(LocalDate.of(1989,03,21));

       //En estado
        Persona1.getEstado();
       //Cumpleaños
       if(Persona1.getCumpleAnios()==true) {
           System.out.println("Hoy cumple años!!!");
       }
       else{
           System.out.println("Hoy no es su cumpleaños :(");
       }

       //Mayor de edad
        if(Persona1.getMayorEdad()==true){
            System.out.println("Es mayor de edad");
        }
       else{
            System.out.println("Es menor de edad");
        }

        //Votar
        if(Persona1.getVotar()==true){
            System.out.println("Está habilitado para votar");
        }
        else {
            System.out.println("No está habilitado para votar");
        }

        //Validar edad
        if(Persona1.validarEdad()==true){
            System.out.println("La edad es correcta");
        }
        else{
            System.out.println("La edad es incorrecta");

        }

        //Datos de la Persona
        System.out.println("Datos completos de la persona:");
       Persona1.getPersona();
        }
    }
