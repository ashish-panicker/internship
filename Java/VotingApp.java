public class VotingApp {

    public static void main(String[] args) {

        Voter arun = new Voter(18, "Arun");
        Voter ajay = new Voter(17, "Ajay");

        try {
            checkVotingEligibility(arun);
            checkVotingEligibility(ajay);
        } catch (InvalidVotingAgeException e) {
            System.err.println(e.getMessage());
        }
        
        System.out.println("Terminating the program...");
    }

    static void checkVotingEligibility(Voter voter) throws InvalidVotingAgeException, IllegalArgumentException {
        if (voter.getAge() >= 18) {
            System.out.println(voter + " is eliglible to vote");
        } else {
            throw new InvalidVotingAgeException(voter + " is not eligible to vote.");
        }
    }

    static void exceptionDemo() {
        int result = 0;

        try {
            result = 5 / 5;
        } catch (ArithmeticException e) {
            System.err.println("ArithmeticException in the program.");
            System.err.println(e.getMessage());
        } catch (Exception e) {
            System.err.println("Exception in the program.");
            System.err.println(e.getMessage());
        } finally {
            System.out.println("Quotient = " + result);
        }
        System.out.println("Exiting....");

    }

}

class Voter {

    private int age;
    private String name;

    public Voter(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Name: " + this.name + " Age: " + this.age;
    }
}

class InvalidVotingAgeException extends RuntimeException {

    InvalidVotingAgeException(String message) {
        super(message);
    }

}
