package srp.before;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== CÓDIGO ORIGINAL (CON VIOLACIÓN DE SRP) ===\n");
        
        UserManager userManager = new UserManager();
        
        System.out.println("Caso 1: Usuario válido");
        userManager.addUser("example@domain.com", "password123");
        
        System.out.println("\nCaso 2: Email inválido");
        userManager.addUser("invalid-email", "password123");
        
        System.out.println("\nCaso 3: Contraseña corta");
        userManager.addUser("valid@email.com", "1234");
    }
}