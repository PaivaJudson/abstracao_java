package middleware;

public interface Autenticavel {
    boolean login(String senha);
    void logout();
}
