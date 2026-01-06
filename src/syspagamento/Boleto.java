package syspagamento;

public class Boleto extends Pagamento {

    public Boleto(double valor) {
        super(valor);
    }

    @Override
    public void realizarPagamento() {
        IO.println("Boleto realizando pagamento "+ valor);
    }
}
