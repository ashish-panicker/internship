public class Inheritance {
    public static void main(String[] args) {

        Employee e = new Engineer();

        Employee m = new Manager();

        // e.id = "skdjfjnbbskdfj";
        
        ProcessManager pm = new ProcessManager();

        pm.printSalarySlipForEngineer(e);

        pm.printSalarySlipForEngineer(m);
      
    }
}

class ProcessManager {

    public void printSalarySlipForEngineer(Employee e) {

        Object salSlip = e.generateSalarySlip();
        System.out.println(salSlip);
    }

}
