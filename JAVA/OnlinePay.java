import java.util.Scanner;

class OnlinePayInfo {
    private int password;
    private double mobileNumber;
    private String name;
    private double accountBalance = 100000;
    private double accountNumber;

    void setCredentials(int password, double mobileNumber) {
        this.password = password;
        this.mobileNumber = mobileNumber;
    }

    boolean verifyPassword(int password) {
        return this.password == password;
    }

    void setAccountInfo(String name, double accountNumber) {
        this.name = name;
        this.accountNumber = accountNumber;
    }

    String getName() {
        return name;
    }

    double getMobileNumber() {
        return mobileNumber;
    }

    double getAccountNumber() {
        return accountNumber;
    }

    double getAccountBalance() {
        return accountBalance;
    }

    void updateBalance(double amount) {
        accountBalance -= amount;
    }
}

class Open {
    private Scanner sc = new Scanner(System.in);
    private OnlinePayInfo user = new OnlinePayInfo();

    void registerUser() {
        try {
            System.out.println("Enter Your Name: ");
            String name = sc.nextLine();

            System.out.println("Enter Your Account Number: ");
            double accountNumber = sc.nextDouble();

            System.out.println("Enter Your Mobile Number: ");
            double mobileNumber = sc.nextDouble();

            System.out.println("Enter New Password: ");
            int password = sc.nextInt();
            sc.nextLine();

            user.setAccountInfo(name, accountNumber);
            user.setCredentials(password, mobileNumber);
            System.out.println("\nRegistration Successful!\n");
        } catch (Exception e) {
            System.out.println("Invalid input! Please enter correct values.");
            sc.nextLine();
            registerUser();
        }
    }

    void withdraw() {
        while (true) {
            System.out.println("\n1. Mobile Recharge\n2. Send Money\n3. Check Balance\n4. Exit\n");
            System.out.print("Enter Your Choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    processRecharge();
                    break;
                case 2:
                    processMoneyTransfer();
                    break;
                case 3:
                    checkBalance();
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Invalid Choice! Try Again.");
            }
        }
    }

    private void processRecharge() {
        try {
            System.out.println("Enter Mobile Number for Recharge: ");
            double rechargeNumber = sc.nextDouble();

            System.out.println("Enter Recharge Amount: ");
            double amount = sc.nextDouble();

            if (authenticate()) {
                if (user.getAccountBalance() >= amount) {
                    user.updateBalance(amount);
                    System.out.println("Recharge Successful for Number: " + rechargeNumber);
                } else {
                    System.out.println("Insufficient Balance!");
                }
            }
        } catch (Exception e) {
            System.out.println("Invalid input! Please try again.");
            sc.nextLine();
        }
    }

    private void processMoneyTransfer() {
        try {
            System.out.println("Enter Receiver's Mobile Number: ");
            double receiverNumber = sc.nextDouble();

            System.out.println("Enter Amount to Send: ");
            double amount = sc.nextDouble();

            if (authenticate()) {
                if (user.getAccountBalance() >= amount) {
                    user.updateBalance(amount);
                    System.out.println("Money Sent Successfully to Number: " + receiverNumber);
                } else {
                    System.out.println("Insufficient Balance!");
                }
            }
        } catch (Exception e) {
            System.out.println("Invalid input! Please try again.");
            sc.nextLine();
        }
    }

    private void checkBalance() {
        System.out.println("Your Current Balance is: " + user.getAccountBalance());
    }

    private boolean authenticate() {
        System.out.println("Enter Your Password: ");
        int inputPassword = sc.nextInt();
        sc.nextLine();

        if (user.verifyPassword(inputPassword)) {
            return true;
        } else {
            System.out.println("Incorrect Password!");
            return false;
        }
    }
}

public class OnlinePay {
    public static void main(String[] args) {
        System.out.println("\n**** Welcome to Online Pay System ****\n");
        Open session = new Open();
        session.registerUser();
        session.withdraw();
    }
}
