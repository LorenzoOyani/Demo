package others;

public class FindBook {
    private int[] grades;
    private String course;

    public FindBook(int[] grades, String course) {
        this.course = course;
        this.grades = grades;
    }
    public FindBook(){
        this(1,"chemistry"); // using this to call a constructor.
    }

    public FindBook(int i, String chemistry) {
    }

    public void setBooks(String courseName) {
        this.course = courseName;

    }
    public String getCourse() {
        return course;
    }

    public void outputGrades (){
        for(int i = 0; i < grades.length; i++) {
            System.out.println(STR."The stduents grades \{i + 1} is  \{grades[i]}" );
        }
    }

    public int getLowerGrades() {
        int lowerGrades = grades[0];
        for(int  i = 0; i < grades.length; i++) {
            if(grades[i] < lowerGrades) {
                lowerGrades = grades[i];
            }
        }
        return lowerGrades;
    }

    public int getHigherGrades() {
        int higherGrades = grades[0];
        for(int grade : grades ) {
            if(grade > higherGrades) {
                higherGrades = grade;
            }
        }
        return higherGrades;
    }
    public int calculateAverage() {
        int total = 0;
        for(int  i = 0; i < grades.length; i++) {
            total +=grades[i];

        }
        return total / grades.length;
    }

}