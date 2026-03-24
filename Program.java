package org.Employee;
import java.util.Scanner;
public class Program {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int count = 0;
        int choice;
        int addEmployeeChoice;
        int displayChoice;
        int SortChoice = 0;
        
        final int MENU_ADD = 1;
        final int MENU_DISPLAY = 2;
        final int MENU_SORT = 3;
        final int ADDMANAGER = 1;
        final int ADDENGINEER = 2;
        final int ADDSALESPERSON = 3;
        
        Employee[] arrEmployees = new Employee[100];
        
        do {
            System.out.println("1. Add an Employee\n"+ "2. Display\n"+ "3. Sort\n"+ "4. Save to File\n"+ "5. Load from File\n " + "6. Exit");
            choice = sc.nextInt();
            sc.nextLine(); // Clears the "Enter" key from the buffer

            switch (choice) {
                case MENU_ADD:
                    do {
                        System.out.println("1. Manager 2. Engineer 3. Sales Person 4. Exit");
                        addEmployeeChoice = sc.nextInt();
                        sc.nextLine(); // Clear buffer
                        
                        if (addEmployeeChoice == 4) break;

                        System.out.println("Enter name :");
                        String name = sc.nextLine();
                        
                        
                        System.out.println("Enter address :");
                        String address = sc.nextLine();
                        
                        System.out.println("Enter age :");
                        int age = sc.nextInt();
                        sc.nextLine(); // Clear buffer after int
                        
                        System.out.println("Enter gender :");
                        String gender = sc.nextLine();
                        
                        System.out.println("Enter Basic Salary :");
                        float basicSalary = sc.nextFloat();
                        sc.nextLine(); // Clear buffer after float

                        switch (addEmployeeChoice) {
                            case ADDMANAGER:
                                System.out.println("Enter HRA Salary :");
                                float hra = sc.nextFloat();
                                sc.nextLine();
                                arrEmployees[count++] = new Manager(name, address, age, gender, basicSalary, hra);
                                break;
                            case ADDENGINEER:
                                System.out.println("Enter OverTime :");
                                float overTime = sc.nextFloat();
                                sc.nextLine();
                                arrEmployees[count++] = new Engineer(name, address, age, gender, basicSalary, overTime);
                                break;
                            case ADDSALESPERSON:
                                System.out.println("Enter Commission:");
                                float commission = sc.nextFloat();
                                sc.nextLine();
                                arrEmployees[count++] = new SalesPerson(name, address, age, gender, basicSalary, commission);
                                break;
                        }
                    } while (addEmployeeChoice != 4);
                    break;

                case MENU_DISPLAY:
                    do {
                        System.out.println("\n1. All Employee 2. First Employee  3. Last Employee 4.All Managers 5.All Engineers 6. All Sales 7. Exit");
                        displayChoice = sc.nextInt();
                        
                        if (count == 0 && displayChoice != 7) {
                            System.out.println("No employees to show!");
                            continue;
                        }

                        switch (displayChoice) {
                            case 1: 
                                for (int i = 0; i < count; i++) {
                                    String details =arrEmployees[i].display();
                                    System.out.println(details);
                                }
                                break;
                            case 2:{
                                String details =arrEmployees[0].display();
                                System.out.println(details);
                            }
                                break;
                            case 3:{
                                String details =arrEmployees[count - 1].display();
                                System.out.println(details);
                            }
                                break;
                            case 4: 
                                for (int i = 0; i < count; i++) {
                                    if (arrEmployees[i] instanceof Manager) { 
                                        String details =arrEmployees[i].display();
                                        System.out.println(details);
                                    }
                                }
                                break;
                            case 5: 
                                for (int i = 0; i < count; i++) {
                                    if (arrEmployees[i] instanceof Engineer) {
                                        String details = arrEmployees[i].display();
                                        System.out.println(details);
                                    }
                                }
                                break;
                            case 6: 
                                for (int i = 0; i < count; i++) {
                                    if (arrEmployees[i] instanceof SalesPerson) {
                                        String details = arrEmployees[i].display();
                                        System.out.println(details);
                                    }
                                }
                                break;
                            case 7: System.out.println("Exit");
                                break;
                        }
                    } while (displayChoice != 7);
                    break;

                case MENU_SORT:
                    do {
                        System.out.println("1. All Managers\n"+ "2. All Engineers\n" +"3. All Sales Person\n"+ "4. All Employees Alphabetic order ascending\r\n"+ "5. All Employees Alphabetic order descending\n"+ "6.Exit to Main Menu\n");
                        SortChoice = sc.nextInt();

                        for (int i = 0; i < count - 1; i++) {
                            for (int j = 0; j < count - i - 1; j++) {
                                boolean swap = false;
                                switch (SortChoice) {
                                    case 1: 
                                        if (!(arrEmployees[j] instanceof Manager) && (arrEmployees[j+1] instanceof Manager)) swap = true;
                                        break;
                                    case 2: 
                                        if (!(arrEmployees[j] instanceof Engineer) && (arrEmployees[j+1] instanceof Engineer)) swap = true;
                                        break;
                                    case 3: 
                                        if (!(arrEmployees[j] instanceof SalesPerson) && (arrEmployees[j+1] instanceof SalesPerson)) swap = true;
                                        break;
                                    case 4: 
                                        if (arrEmployees[j].getName().compareToIgnoreCase(arrEmployees[j+1].getName()) > 0) swap = true;
                                        break;
                                }
                                if (swap) {
                                    Employee temp = arrEmployees[j];
                                    arrEmployees[j] = arrEmployees[j+1];
                                    arrEmployees[j+1] = temp;
                                }
                            }
                        }
                    } while (SortChoice != 6);
                    break;
                
                case 4: System.out.println("Save to file");
                    break;
                case 5: System.out.println("Load the file ");
                    break;
                case 6: System.out.println("Exit");
                    break;
            }
        } while (choice != 6);
        sc.close();
    }
    
}
