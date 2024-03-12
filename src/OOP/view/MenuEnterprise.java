package OOP.view;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import OOP.entity.Departments;
import OOP.entity.Enterprise;
import OOP.entity.Persona;
import OOP.services.EnterpriseController;
import OOP.services.IEnterpriseDAO;
import OOP.utils.PersonasUtils;

public class MenuEnterprise {
    public static void main(String[] args) {

        boolean exit = false;
        Scanner sc = new Scanner(System.in);

        //Aqui tenemos la lista con los empleados originales
        List<Persona> employeesOriginal = PersonasUtils.getPersonList();

        //creamos la empresa
        Enterprise enterprise = new Enterprise(employeesOriginal); 
        IEnterpriseDAO enterpriseController = new EnterpriseController();

        while (!exit) {
            mainMenu();
            String response = sc.nextLine();
            // Clear console
            System.out.print("\033[H\033[2J");
            System.out.flush();
            switch (response) {
                case "0":
                    showEmployees(enterpriseController.getAllEmployees(enterprise));
                    break;
                case "1":
                    Persona persona = new Persona();
                    System.out.println("Nombre empleado ");
                    String name = sc.nextLine();
                    persona.setNombre(name);

                    System.out.println("Apellido empleado ");
                    String lastName = sc.nextLine();
                    persona.setApellido(lastName);

                    System.out.println("Numero de telefono ");
                    double numTlf = sc.nextDouble();
                    persona.setNumTelefono(numTlf);

                    System.out.println("Dni empleado ");
                    String dni = sc.next();
                    persona.setDni(dni);

                    System.out.println("Indique departamento empleado "+ Arrays.toString(Departments.values()));
                    String responseDeparments = sc.next();
                    List<Departments> departments = Arrays.asList(Departments.values());
                    if(departments.contains(responseDeparments.toUpperCase())){
                        persona.setDepartment(departments.get(departments.indexOf(responseDeparments)));
                    }
                    enterpriseController.addPersona(persona, enterprise);
                    System.out.println(persona);
                    
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
        String one = "\n* 1. Add employees";
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

    //aqui mostramos los empleados de manera personalizada con el for
    public static void showEmployees(List<Persona> employees){
        for (Persona persona : employees) {
            System.out.println(persona);
        }
    }
}
