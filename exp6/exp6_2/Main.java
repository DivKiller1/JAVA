// SecuritySystem.java
final class SecuritySystem {
    void authenticateUser(String username, String password) {
        if ("admin".equals(username) && "password123".equals(password)) {
            System.out.println("Authentication successful!");
        } else {
            System.out.println("Authentication failed!");
        }
    }
}

// AdvancedSecurity.java (Invalid)
// class AdvancedSecurity extends SecuritySystem { // ❌ Compilation Error: Cannot inherit from final class
//     void authenticateUser(String u, String p) {
//         System.out.println("Overridden");
//     }
// }

// Main.java
public class Main {
    public static void main(String[] args) {
        SecuritySystem ss = new SecuritySystem();
        ss.authenticateUser("admin", "password123");  // success
        ss.authenticateUser("user", "123");           // fail
    }
}
