package syspagamento;

public class Main {

    static void main(String[] args) {

        Pagamento cartao = new Cartao(1000000);
        Pagamento boleto = new Boleto(2000000);
        Pix pix = new Pix(1000000);


        realizarPagamento(boleto);
        realizarPagamento(cartao);
        realizarPagamento(pix);
    }

    static void realizarPagamento(Pagamento pagamento) {
        pagamento.realizarPagamento();
    }
}
