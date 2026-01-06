package sysnotificacao;

public class Main {
    public static void main(String[] args) {

        Email email = new Email();
        SMS sms = new SMS();
        WhatsApp whatsapp = new WhatsApp();

        String mensagem = " com interface";

        enviar(email, mensagem);
        enviar(sms, mensagem);
        enviar(whatsapp, mensagem);

    }

    public static void enviar(Notificavel notificavel, String mensagem) {
        notificavel.enviar(mensagem);
    }

}
