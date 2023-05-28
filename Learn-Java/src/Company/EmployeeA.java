package Company;

public class EmployeeA extends Employee{

    int allowance(){
        if(getworkingLife() < 10){
            return 2_000_000;
        } else {
            return 3_000_000;
        }
    }

    int totalSalary(){
        return basicSalary() + allowance();
    }

    void printInfoEmployee(){
        this.inputData();
        System.out.println("\n------- Employee A -------");
        System.out.println("\nName \t\t\t\t: " + this.getemployeeName());
        System.out.println("ID \t\t\t\t\t: " + this.getemployeeID());
        if(this.getworkingLife() <= 1 && this.getworkingLife() >= 0){
            System.out.println("Work Life \t\t\t: " + this.getworkingLife() + " year");
        } else if (this.getworkingLife() > 1) {
            System.out.println("Work Life \t\t\t: " + this.getworkingLife() + " years");
        }
        System.out.println("Total Salary \t\t: " + this.totalSalary());
    }
}
