public class Usuario {
    String usuario;
    String password;

    public void validarDatos() {
        if (usuario == null || usuario.trim().isEmpty()) {
            throw new IllegalArgumentException("El usuario no puede estar vacio.");
        }
        if (password == null || password.trim().isEmpty()) {
            throw new IllegalArgumentException("La contrasena no puede estar vacia.");
        }
        if (password.length() < 6) {
            throw new IllegalArgumentException("La contrasena debe tener al menos 6 caracteres.");
        }
    }
}
