public class FacebookUser {

    // Fields for the FacebookUser class
      String id;
      String password;
      String name;
      String email;
     int age;

    // Method to display user details
    public void displayDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Age: " + age + " years");
        System.out.println("Password: " + password); // For demonstration only (not recommended in real applications)
    }

    // Method to initialize user details
    public void initialize(String id, String password, String name, String email, int age) {
        this.id = id;
        this.password = password;
        this.name = name;
        this.email = email;
        this.age = age;
    }

    public static void main(String[] args) {
        // Create and initialize first Facebook user
        FacebookUser user1 = new FacebookUser();
        user1.initialize("user123", "password123", "Alice Johnson", "alice@example.com", 25);
        user1.displayDetails();

        System.out.println();

        // Create and initialize second Facebook user
        FacebookUser user2 = new FacebookUser();
        user2.initialize("user456", "secure456", "Bob Smith", "bob@example.com", 30);
        user2.displayDetails();
    }
}
