package Company;

import java.util.Scanner;

public class Employee {
    Scanner inputUser = new Scanner(System.in);
    private String employeeID, employeeName;
    private int workingLife;

    int basicSalary(){
        return 3_000_000;
    }

    void inputData() {
        System.out.println("\n-=-=-=- Input Data -=-=-=-");
        System.out.print("Masukkan nama : ");
        this.employeeName = this.inputUser.nextLine();
        System.out.print("Masukkan ID   : ");
        this.employeeID = this.inputUser.nextLine();
        System.out.print("Working life  : ");
        this.workingLife = this.inputUser.nextInt();
    }


    String getemployeeID(){
        return this.employeeID;
    }

    String getemployeeName(){
        return this.employeeName;
    }
    int getworkingLife(){
        return this.workingLife;
    }

}
