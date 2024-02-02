package OOP;

import java.io.PrintWriter;

public class course {
    private String courseName;
    private String[] students = new String[100];
    private int numberOfStudents;

    course(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(String student) {
        students[numberOfStudents] = student;
        numberOfStudents++;
    }
    public static void main(String[] args) {
        PrintWriter print = new PrintWriter(System.out);
        course courses = new course("Geography");
        course courses1 = new course("Agricultural science");
        courses.addStudent("Jerumeh Lawrence");
        courses.addStudent("John chukwuemeka");
        courses1.addStudent("Obasanjo Collins");
        courses1.addStudent("Eunice ageness");
        courses.dropStudent("John chukwuemeka");
        System.out.print("The number of students and courses offered is : \n");
        print.println(STR."The number of student taking new courses are \{courses.getStudent()}But \{courses.students[0]} never took\{courses1.getCourseName()}");


    }



    public String[] getStudent() {
        return students;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseNames) {
        courseName = courseNames;
    }

//    public void dropStudent(String student) {
//        int index = -1;
//        for (int i = 0; i < numberOfStudents; i++) {
//            if (students[i].equals(student)) {
//                index = i;
//                break;
//            }
//        }
//        if (index != -1) {
//            for (int i = 0; i < numberOfStudents; i++) {
//                students[i] = students[i + 1];
//
//            }
//        }
//        students[numberOfStudents - 1] = null;
//        numberOfStudents--;
//    }

    public void dropStudent(String student){
        for(int i =0; i < numberOfStudents; i++) {
            if(students[i] !=null && students[i].equals(student)){
                for(int j = 0; j < numberOfStudents; j++) {
                    students[j] = students[j + 1];
                }
            }
            students[numberOfStudents - 1] = null;
            numberOfStudents--;
            i--;
        }
    }

//    public void  dropStudent(String student){
//        for(int i = 0; i < numberOfStudents; i++) {
//            if(students[i] !=null && students[i].equals(student)) {
//                for(int  j = 0; j < numberOfStudents; j++) {
//                    students[j] = students[j + 1];
//                }
//                students[numberOfStudents - 1] = null;
//                numberOfStudents--;
//                i--;
//            }
//        }
//    }




}



