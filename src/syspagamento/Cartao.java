package syspagamento;

public class Cartao extends Pagamento{

    public Cartao(double valor) {
        super(valor);
    }

    @Override
    public void realizarPagamento() {
        IO.println("Processando "+ valor + " no credito...");
    }
}
