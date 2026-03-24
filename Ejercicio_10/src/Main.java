public class Main {
    public static void main(String[] args) {
        try {
            Usuario usuario = new Usuario();
            usuario.usuario = "ismael";
            usuario.password = "abc123";

            usuario.validarDatos();

            System.out.println("Usuario valido: " + usuario.usuario);
            System.out.println("Password valida: " + usuario.password);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
