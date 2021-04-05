

public class Engineer extends Employee {

    @Override
    protected Object generateSalarySlip() { // overriddenn
        System.out.println("Salary slip for engineer.");
    }

    @Override
    protected void print(){
        System.out.println("Print from Engineer....");
    }
}