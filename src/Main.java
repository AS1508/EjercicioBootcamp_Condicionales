public class Main {
    public static void main(String[] args) {

        int numeroIf = 12;
        if(numeroIf>0){
            System.out.println(numeroIf + "es postivo");
        } else if (numeroIf == 0) {
            System.out.println(numeroIf + "es cero");
        }else{
            System.out.println(numeroIf + "es negativo");
        }

        int numeroWhile = 0 ;
        while (numeroWhile<3){
            System.out.println("numeroWhile: " + numeroWhile);
            numeroWhile++;
        }

        int numeroDoWhile = 3;
        do{
            System.out.println("numeroDoWhile: " + numeroDoWhile);
            numeroDoWhile++;
        }while(numeroDoWhile<3);

        for(int i=0; i<=3; i++){
            System.out.println("numeroFor: " + i);
        }

        String Estacion = "otoño";
        switch (Estacion){
            case "verano":
                System.out.println("Nos encontramos en " + Estacion);
                break;
            case "otoño":
                System.out.println("Nos encontramos en " + Estacion);
                break;
            case "invierno":
                System.out.println("Nos encontramos en " + Estacion);
                break;
            case "primavera":
                System.out.println("Nos encontramos en " + Estacion);
                break;
            default:
                System.out.println("no es una estacion");

        }

    }
}