public class Main {
    public static void main(String[] args) {

        int resultado;
        resultado = suma(10,20,30);
        Coche miCoche = new Coche();
        miCoche.AddPuertas();
        System.out.println(miCoche.puertas);

    }
    static int suma(int param1,int param2,int param3) {
        return param1 + param2 + param3;
    }

}

class Coche {

    public int puertas = 0;

    public void AddPuertas() {
        this.puertas++;
    }
}