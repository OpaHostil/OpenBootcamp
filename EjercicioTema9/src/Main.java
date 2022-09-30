public class Main {
    public static void main(String[] args) {

        Cliente miCliente = new Cliente();
        miCliente.edad = 10;
        miCliente.telefono = "633879123";
        miCliente.nombre = "Gilito";
        miCliente.credito = 1000000;
        System.out.println(miCliente.edad);
        System.out.println(miCliente.telefono);
        System.out.println(miCliente.nombre);
        System.out.println(miCliente.credito);
        
    }
}

class Persona {

    public int edad;
    public String nombre;
    public String telefono;

}

class Cliente extends Persona { int credito; }

class Trabajador extends Persona { int salario; }

