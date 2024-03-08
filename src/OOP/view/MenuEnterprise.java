package OOP.view;

import java.util.Scanner;

public class MenuEnterprise {
    public static void main(String[] args) {

        boolean exit = false;
        Scanner sc = new Scanner(System.in);

        while (!exit) {
            mainMenu();
            String response = sc.nextLine();
            // Clear console
            System.out.print("\033[H\033[2J");
            System.out.flush();
            switch (response) {
                case "0":
                    System.out.println("employees");
                    break;
                case "9":
                    System.out.println("Exit...");
                    System.exit(0);
                    exit = true;
                    break;
                default:
                    System.out.println("Write a correct answer please");
                    break;

            }

            System.out.println("Press any key to continue...");
            sc.nextLine();
        }
        sc.close();

    }

    public static void mainMenu() {

        // Options
        String zero = "\n* 0. Show employees";
        String one = "\n* 1. Update employees";
        String two = "\n* 2. Delete employees";
        String three = "\n* 3. Sort employees (by name, lastName or ID)";
        String four = "\n* 4. Select departments";
        String exit = "\n* 9. Exit";
        System.out.format(
                "*********************************************%s%s%s%s%s%s\n*********************************************\n",
                zero,
                one,
                two, three, four, exit);
    }

    public static void departmentsMenu() {
        // TODO
    }
}
