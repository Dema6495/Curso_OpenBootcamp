
public class Main {
    public static void main(String[] args) {
        int numeroIf = 0;
        int numeroWhile = 0;
        int numeroDoWhile = 0;
        var estacion = "hj";

        if (numeroIf == 0){
            System.out.println ("Es 0");
        } else if (numeroIf < 0){
            System.out.println ("Es negativo");
        } else {
            System.out.println ("Es positivo");
        }

        System.out.println ("");

        while (numeroWhile < 3){
            numeroWhile = numeroWhile + 1;
            System.out.println (numeroWhile);
        }

        System.out.println ("");

        do {
            numeroDoWhile = numeroDoWhile + 1;
            System.out.println ("NumeroDowhile es: " + numeroDoWhile);
        } while (numeroDoWhile < 0);

        System.out.println ("");

        for (int numeroFor = 2; numeroFor <= 3; numeroFor = numeroFor + 1){
            System.out.println ("El numero For es: " + numeroFor);
        }

        System.out.println ("");

        switch (estacion){
            case "Primavera":
                System.out.println ("Es Primavera");
                break;
            case "Verano":
                System.out.println ("Es Verano");
                break;
            case "Otoño":
                System.out.println ("Es Otoño");
                break;
            case "Invierno":
                System.out.println ("Es Invierno");
                break;
            default:
                System.out.println ("No soy ninguna estacion");
        }
    }
}