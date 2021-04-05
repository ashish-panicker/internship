

public abstract class Employee {

    private String id; //E######
    private String name;
    private String email;
    private double salary;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        if(!id.startsWith("E") && id.length() > 7){
            System.err.println("Employee id is in the wrong format.");
            return;
        }
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // protected void generateSalarySlip() { //behaviour
    // System.out.println("Salary slip for employee.");
    // }

    protected abstract Object generateSalarySlip();

    protected void print(){
        System.out.println("Print from Employee....");
    }
}