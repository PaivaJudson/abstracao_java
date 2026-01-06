package sysnotificacao;

public class SMS implements Notificavel {

    @Override
    public void enviar(String mensagem) {
        IO.println("SMS: " + mensagem);
    }
}
