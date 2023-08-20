package Persona;

import java.time.LocalDate;
import java.time.Period;

public class Persona {
    //--------------Atributos---------------
    private String nombre;
    private String apellido;
    private int edad;
    private LocalDate fecha_nacimiento;
    private int dni;
    private char sexo;
    private double peso;
    private double altura;
    //constantes
    public static final int MAYOREDAD=18;
    public static final int POTENCIA=2;
    public static final double MIN=18.5;
    public static final int VOTA=16;

    public static final double MAX=25;


    //--------------Contructores--------------
    public Persona(){
        fecha_nacimiento= LocalDate.of(2000,01,01); //valores por defecto
        sexo='F';
        nombre="N";
        apellido="N";
        peso=1;
        altura=1;
    }
    //preguntar para que tengo que crear estos constructores

    public Persona(int dni) {
        this.dni = dni;
    }
    public Persona(String nombre, String apellido, int dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }
    public Persona(String nombre, String apellido, LocalDate fecha_nacimiento, int dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fecha_nacimiento = fecha_nacimiento;
        this.dni = dni;
    }


    //--------------Metodos----------------------
    //Get

    public String getNombre(){
        return this.nombre;
    }
    public String getApellido(){
        return this.apellido;
    }
    public int getEdad(){
        return this.edad;
    }
    public LocalDate getFecha_nacimiento() {
        return this.fecha_nacimiento;
    }
    public int getDni(){
        return this.dni;
    }
    public char getSexo(){
        return this.sexo;
    }
    public double getPeso(){
        return this.peso;
    }
    public double getAltura(){
        return this.altura;
    }

    //Set
    public String setNombre(String nuevoNombre){
        return this.nombre=nuevoNombre;
    }
    public String setApellido(String nuevoApellido){
        return this.apellido=nuevoApellido;
    }
    public int setEdad(int nuevaEdad){
        return this.edad=nuevaEdad;
    }
    public LocalDate setFechaNacimiento(LocalDate nuevaFechaNacimiento){
        return this.fecha_nacimiento=nuevaFechaNacimiento;
    }
    public int setDni(int nuevoDni){
        return this.dni=nuevoDni;
    }
    public char setSexo(char nuevoSexo){
        return this.sexo=nuevoSexo;
    }
    public double setPeso(double nuevoPeso){
        return this.peso=nuevoPeso;
    }
    public double setAltura(double nuevaAltura){
        return this.altura=nuevaAltura;
    }

    //Indice de masa corporal
    public double getIMC(){
        return  this.peso/(Math.pow(this.altura,POTENCIA));
        }
    //Estado
    public boolean getEstado(){

        return (this.getIMC()>=MIN && this.getIMC()<MAX);

    }
    //Cumpleaños
    public boolean getCumpleAnios(){
        LocalDate fecha_actual = LocalDate.now();
        return(fecha_actual.getMonth()==this.fecha_nacimiento.getMonth()
                && fecha_actual.getDayOfMonth()==this.fecha_nacimiento.getDayOfMonth());
    }
    //Mayor de edad
    public boolean getMayorEdad(){
        LocalDate fecha_actual = LocalDate.now();
        Period periodo = Period.between(this.fecha_nacimiento, fecha_actual);
        return(periodo.getYears()>=MAYOREDAD);
    }
    //Puede votar
    public boolean getVotar(){
        LocalDate fecha_actual = LocalDate.now();
        Period periodo = Period.between(this.fecha_nacimiento, fecha_actual);
        return (periodo.getYears()>=VOTA);
    }

    //Edad correcta
    public boolean validarEdad(){
        LocalDate fecha_actual = LocalDate.now();
        Period periodo = Period.between(this.fecha_nacimiento, fecha_actual);
        return(periodo.getYears()==this.edad);
    }

    public void getPersona(){
        System.out.println("Nombre y Apellido: "+this.nombre +" "+this.apellido +
                        "\nEdad: "+this.edad+
                        "\nFecha de nacimiento: "+this.fecha_nacimiento+
                        "\nD.N.I: "+this.dni+
                        "\nSexo: "+this.sexo+
                        "\nPeso: "+this.peso+
                        "\nAltura: "+this.altura
                );


    }
}
