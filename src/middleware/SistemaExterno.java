package middleware;

public class SistemaExterno implements Autenticavel {
    private String tokenKey = "12345";

    @Override
    public boolean login(String senha) {
        return tokenKey.equals(senha);
    }

    @Override
    public void logout() {
        IO.println("Conexao de API encerrada com sucesso");
    }
}
