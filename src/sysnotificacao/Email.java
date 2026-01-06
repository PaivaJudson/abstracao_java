package sysnotificacao;

public class Email implements Notificavel {

    public void enviar(String mensagem) {
        IO.println("Email: " + mensagem);
    }
}
