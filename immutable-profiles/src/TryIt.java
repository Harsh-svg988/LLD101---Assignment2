import com.example.profiles.*;

public class TryIt {
    public static void main(String[] args) {
        ProfileService svc = new ProfileService();

        UserProfile p = svc.createMinimal("u1", "a@b.com");
        System.out.println("Email: " + p.getEmail());

        UserProfile p2 = svc.updateDisplayName(p, "Harsh Kumar");

        System.out.println("Original DisplayName: " + p.getDisplayName());
        System.out.println("Updated DisplayName: " + p2.getDisplayName());
    }
}
