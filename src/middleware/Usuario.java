package middleware;

abstract class Usuario {
    protected String login;
    protected String email;


    public Usuario(String login, String email) {
        this.login = login;
        this.email = email;
    }

    public void exibirDados(){
        System.out.println("Login: " + login);
        System.out.println("Email: " + email);
    }

    public abstract String getNivelAcesso();
}
