import java.util.Calendar;
public class Persona {
    //--------------Atributos---------------
    String nombre="N";
    String apellido="N";
    int edad;
    String fecha_nacimiento="2000-01-01";
    int dni;
    String sexo= "F";
    double peso=1;
    double altura=1;

    //--------------Contructores--------------
    public Persona(int dni) {
        this.dni = dni;
    }
    public Persona(String nombre, String apellido, int dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }
    public Persona(String nombre, String apellido, String fecha_nacimiento, int dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fecha_nacimiento = fecha_nacimiento;
        this.dni = dni;
    }

    //--------------Metodos----------------------
public double getMasaCorporal(double peso, double altura){
        double masa_corporal=0;
        masa_corporal=peso/Math.pow(altura,2);
        return masa_corporal;
}
public String getEstado(double masa_corporal){
        String estado="en estado";
        if(masa_corporal>18.5 && masa_corporal<25){
            return estado;
        }
        else {
            estado="fuera de estado";
            return estado;
        }
}

public void getCumpleanios(String fecha_nacimiento){
    // Fecha actual
    String [] cadena =getFechaActual();
    //Paso los datos de string a int
    int anio_actual=Integer.parseInt(cadena[0]);
    int mes_actual=Integer.parseInt(cadena[1]);
    int dia_actual=Integer.parseInt(cadena[2]);

    //Separo los datos de la fecha
    String[] cadena_nacimiento=fecha_nacimiento.split("-");

    //Paso los datos de string a int
    int anio_cumple=Integer.parseInt(cadena_nacimiento[0]);
    int mes_cumple=Integer.parseInt(cadena_nacimiento[1]);
    int dia_cumple=Integer.parseInt(cadena_nacimiento[2]);

    //Indico si cumple o no
    if(anio_actual==anio_cumple && mes_actual==mes_cumple && dia_actual==dia_cumple){
        System.out.println("Hoy es el cumpleaños!!!");
    }
    else{
        System.out.println("Hoy no es el cumpleaños");
    }
}
public void getEsMayorEdad(String fecha_nacimiento){
    String [] cadena=getFechaActual();

    //Paso los datos de string a int
    int anio_cumple=Integer.parseInt(cadena[0]);
    int mes_cumple=Integer.parseInt(cadena[1]);
    int dia_cumple=Integer.parseInt(cadena[2]);


}
public String[] getFechaActual(){
    // Fecha actual
    Calendar calendar = Calendar.getInstance();

    // Año:
    int anio_actual=calendar.get(Calendar.YEAR);
    // Mes:
    int mes_actual=calendar.get(Calendar.MONTH);
    // Dia:
    int dia_actual=calendar.get(calendar.DAY_OF_MONTH);
    //Separo los datos de la fecha
    String[] cadena=fecha_nacimiento.split("-");
    return cadena;
}
}
