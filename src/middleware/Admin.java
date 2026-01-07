package middleware;

public class Admin extends Usuario implements Autenticavel {
    private String senhaMestra = "12345";

    public Admin(String login, String senha) {
        super(login, senha);
    }

    @Override
    public String getNivelAcesso() {
        return "TOTAL_CONTROL";
    }

    @Override
    public boolean login(String senha) {
        return this.senhaMestra.equals(senha);
    }

    @Override
    public void logout() {
        IO.println("LOGOUT");
    }
}
