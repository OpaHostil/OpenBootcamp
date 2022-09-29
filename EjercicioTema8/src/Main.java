import java.io.Console;

public class Main {
    public static void main(String[] args) {

        Persona miPersona = new Persona();
        miPersona.setEdad(41);
        miPersona.setNombre("Israel");
        miPersona.setTelefono("456328934");

        System.out.println(miPersona.getEdad());
        System.out.println(miPersona.getNombre());
        System.out.println(miPersona.getTelefono());

    }
}

class Persona {
    private int edad; String nombre; String telefono;

    public void setEdad(int edad){
        this.edad = edad;
    }
    public int getEdad(){
        return this.edad;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setTelefono(String telefono){
        this.telefono = telefono;
    }
    public String getTelefono(){
        return this.telefono;
    }

}