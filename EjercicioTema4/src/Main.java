public class Main {
    public static void main(String[] args) {

        int numeroIf=0;
        int numeroWhile=0;
        String estacion = "otoño";

        if(numeroIf > 0){
            System.out.println("numeroIf es mayor que 0");
        } else if (numeroIf < 0) {
            System.out.println("numeroIf es menor que 0");
        } else {
            System.out.println("numeroIf es igual a 0");
        }

        while ( numeroWhile < 3){
            numeroWhile++;
            System.out.println(numeroWhile);
        }

        do {
            numeroWhile++;
            System.out.println(numeroWhile);
        } while(numeroWhile==3);

        for(int numeroFor=0 ; numeroFor <= 3; numeroFor++){
            System.out.println(numeroFor);
        }

        switch (estacion){
            case "primavera":
                System.out.println("primavera");
                break;
            case "verano":
                System.out.println("verano");
                break;
            case "otoño":
                System.out.println("otoño");
                break;
            case "invierno":
                System.out.println("invierno");
                break;
            default:
                System.out.println("no es una estacion");
            }
    }
}