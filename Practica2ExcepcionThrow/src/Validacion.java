import java.util.Scanner;

public class Validacion {
    public static void validarContrasena(String contrasena) throws InvalidPasswordException {
        if (contrasena.length() < 8) {
            throw new InvalidPasswordException("La contraseña debe tener al menos 8 caracteres.");
        }
        if (!contrasena.matches(".*[A-Z].*")) {
            throw new InvalidPasswordException("La contraseña debe contener al menos una letra mayúscula.");
        }
        if (!contrasena.matches(".*[a-z].*")) {
            throw new InvalidPasswordException("La contraseña debe contener al menos una letra minúscula.");
        }
        if (!contrasena.matches(".*\\d.*")) {
            throw new InvalidPasswordException("La contraseña debe contener al menos un número.");
        }
    }

    public static void main(String[] args) {
        try {
            System.out.println("Ingresa la contraseña a crear: ");
            validarContrasena(new Scanner(System.in).nextLine());
        } catch (InvalidPasswordException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
