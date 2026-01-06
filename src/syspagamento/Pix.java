package syspagamento;

public class Pix extends Pagamento {

    public Pix(double valor) {
        super(valor);
    }

    @Override
    public void realizarPagamento() {
        IO.println("Pix realizado com sucesso! "+valor);
    }

}
