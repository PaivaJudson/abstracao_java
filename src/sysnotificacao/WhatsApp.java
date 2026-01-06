package sysnotificacao;

public class WhatsApp implements Notificavel {
    public void enviar(String mensagem) {
        IO.println("WhatsApp: " + mensagem);
    }
}
