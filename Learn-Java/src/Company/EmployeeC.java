package Company;

public class EmployeeC extends Employee{
    int numCertificates;

    int allowance(){
        if(getworkingLife() < 10 && numCertificates == 0){
            return 4_000_000;
        } else if (getworkingLife() < 10 && numCertificates > 0) {
            return 5_000_000;
        } else if (getworkingLife() >= 10 && numCertificates == 0) {
            return 4_500_000;
        } else{
            return 5_500_000;
        }
    }

    int totalSalary(){
        return basicSalary() + allowance();
    }

    void inputDataC(){
        this.inputData();
        System.out.print("Number Certificate : ");
        this.numCertificates = this.inputUser.nextInt();
    }

    void printEmployeeC(){
        inputDataC();
        System.out.println("\n------- Employee C -------");
        System.out.println("\nName \t\t\t\t: " + this.getemployeeName());
        System.out.println("ID \t\t\t\t\t: " + this.getemployeeID());
        if (this.getworkingLife() <= 1 && this.getworkingLife() >= 0){
            System.out.println("Work Life \t\t\t: " + this.getworkingLife() + " year");
        } else if (this.getworkingLife() > 1) {
            System.out.println("Work Life \t\t\t: " + this.getworkingLife() + " years");
        }
        System.out.println("Number Certificates : " + this.numCertificates);
        System.out.println("Total Salary \t\t: " + this.totalSalary());
    }
}
