package middleware;

import syslogistica.Transporte;

public class Main {

    public static void main(String[] args) {

        Admin admin = new Admin("judson.paiva@isptec.co.ao", "12345");
        SistemaExterno emis = new SistemaExterno();

        autenticar(admin, "12345");
        autenticar(emis, "123456");
    }

    public static void autenticar(Autenticavel autenticavel, String senha) {
        IO.println(autenticavel.login(senha));
        autenticavel.logout();
    }
}
