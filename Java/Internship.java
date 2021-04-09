public class Internship {

    private Integer empId;

    private String name;

    private String email;

    private Gender gender;

    private Qualification qualification; // B.Tech/B.E/MCA

    private Level level; //

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public void setQualification(Qualification qualification) {
        this.qualification = qualification;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

   public Level getLevel() {
       return level;
   }

    public static void main(String[] args) {
        Internship intern = new Internship();

        intern.setGender(Gender.MALE);
        intern.setQualification(Qualification.MCA);
        intern.setLevel(Level.BEGINER);

        System.out.println(intern.getLevel());
        System.out.println(intern.getLevel().getLevelCode());
    }

}

enum Level {

    BEGINER(1), INTERMEDIATE(2), ADVANCED(3);

    private int levelCode;

    Level(int levelCode) {
        this.levelCode = levelCode;
    }

    public int getLevelCode() {
        return levelCode;
    }
}

enum Qualification {
    B_TECH,
    B_E,
    MCA
}

enum Gender {
    MALE, FEMALE
}
