

public class Manager extends Employee {

    @Override
    protected Object generateSalarySlip() { // overriddenn
        System.out.println("Salary slip for manager.");
    }

    @Override
    protected void print(){
        System.out.println("Print from Manager....");
    }
}