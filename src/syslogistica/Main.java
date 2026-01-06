package syslogistica;

public class Main {
    public static void main(String[] args) {
        Transporte caminhao = new Caminhao("LD-68-42-HX", 5.0);
        Transporte navio = new Navio("LD  -68-42-HX", 5.0);

        IO.println(caminhao);
        IO.println(navio);

        calcularFrete(caminhao, 5, 10.5);
        calcularFrete(navio, 5, 10.5);

    }

    public  static void calcularFrete(Transporte transsporte, double distancia, double peso) {
        IO.println("Calculo do Frete: " + transsporte.calcularFrete(distancia, peso));
    }


}
