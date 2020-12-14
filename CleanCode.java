public class CleanCode {

    public static void main(String[] args) {
        String message = greetUser("Berkley", "Brown");

    }

    public static String greetUser(String firstName, String lastName) {
       return "Hello " + firstName + " " + lastName;
    }
}
