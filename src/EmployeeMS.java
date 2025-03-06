abstract class Employee implements Payable{
    String name;
    String id;
    int baseSalary;

    public Employee(String name, String id, int baseSalary) {
        this.name = name;
        this.id = id;
        this.baseSalary = baseSalary;
    }

    public void calculateSalary() {
        System.out.println(baseSalary);
    }
    public String displayEmployeeInfo(){
        return "name: "+name+"id: "+id+"baseSalary: "+baseSalary;

}
    @Override
    public void getPaymentAmount() {
        System.out.print("total salary: ");
        calculateSalary();
    }
}

interface Payable{
    public void getPaymentAmount();
}
class FullTimeEmployee extends Employee{
    double benefits;

    public FullTimeEmployee(String name, String id, int baseSalary) {
        super(name, id, baseSalary);
        this.benefits = (double) (baseSalary * 2) /10;
    }

    public void calculateResult(){
        System.out.println(baseSalary+benefits);
    }
    public void calculateSalary() {
        calculateResult();
    }
    public String displayEmployeeInfo(){
        return "name: "+name+" id: "+id+" baseSalary: "+baseSalary+" benefits: "+benefits;
    }


}

class ContractEmployee extends Employee{
    int hourly;

    public ContractEmployee(String name, String id, int baseSalary, int hourly) {
        super(name, id, baseSalary);
        this.hourly = hourly;
    }
    public String displayEmployeeInfo(){
        return "name: "+name+"id: "+id+"baseSalary: "+baseSalary+"hourly: "+hourly;
    }
}

public class EmployeeMS {
    public static void main(String[] args){
        Employee[] employees=new Employee[2];
        employees[0]=new FullTimeEmployee("Alym","101",1000000);
        employees[1]=new ContractEmployee("aza","100",70000,23);
        for (Employee e:employees){
            System.out.println(e.displayEmployeeInfo());
            e.calculateSalary();
            e.getPaymentAmount();
        }
    }}

