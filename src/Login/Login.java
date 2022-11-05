package Login;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        String userName, password, newPassword, loginPassword;
        loginPassword = "1234";
        String resetPassword;
        Scanner input = new Scanner(System.in);
        System.out.println("Username:");
        userName = input.nextLine();
        System.out.println("Password:");
        password = input.nextLine();

        /**
         * Check username and password
         */
        if (userName.equals("User") && password.equals(loginPassword)) {
            System.out.println("Login is successfull");
        } else {
            System.out.println("I forgot my password.Do you want to reset?");
            resetPassword = input.nextLine();
            switch (resetPassword) {
                case "yes":
                    System.out.println("New password?");
                    newPassword = input.nextLine();
                    if (newPassword.equals(password) || newPassword.equals(loginPassword)) {
                        System.out.println("Password is not created please try else password");
                        break;
                    } else {
                        System.out.println("Password is created");
                    }
                case "no":
                    break;
            }
        }

    }
}
