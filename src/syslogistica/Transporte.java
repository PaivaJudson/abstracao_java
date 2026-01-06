package syslogistica;

public abstract class Transporte {

    protected String placa;
    protected double capacidadeMax;

    public Transporte(String placa, double capacidadeMax) {
        this.placa = placa;
        this.capacidadeMax = capacidadeMax;
    }

    public void ligarMotor(){
        IO.println("Ligando motor " + placa);
    }

    public abstract double calcularFrete(double distancia, double peso);


    @Override
    public String toString() {
        return "Transporte{" +
                "placa='" + placa + '\'' +
                ", capacidadeMax=" + capacidadeMax +
                '}';
    }
}
