package CircleObjects;

import java.util.Date;
import java.util.HashMap;

public class DynamicBinding {
    void main(){}
}
class GraduateClass extends Student{}

class Student{
    private Date dateCreated;
    private String grades;
    private int numberOfStudents;
    private int size;
    private String[] students;
    Student(Date d, String grades, int numberOfStudents){
        this.dateCreated = d;
        this.grades = grades;
        this.numberOfStudents = numberOfStudents;
    }
    Student(){}

    public void addStudent(String student){
        students[numberOfStudents] = student;
        numberOfStudents++;

    }

    public void CreatedStudent(String student){
        if(size > students.length) {
            String[] temp = new String[students.length * 2];
            System.arraycopy(students, 0, temp,0, students.length);
            students = temp;
        }
        students[numberOfStudents - 1] =student;
        numberOfStudents++;
        size++;
    }

    public void ComputeStudentGrades(){
        int[] temp = {'a', 'b', 'c', 'd'};
       HashMap<Integer, Integer> map = new HashMap<>();
       for(int  i =0; i < numberOfStudents; i++) {
           int grades = temp[i];

           map.put(i, grades);
       }
       for(int studentIndex : map.keySet()){
           int studentGrades = map.get(studentIndex).intValue();
           System.out.println(STR."student grades of students: \{studentIndex} is : \{studentGrades}");
       }

    }
    public void getTotalGrades(){
        int total = 0;

    }


    public void removeStudent(String student){
        if(size > 0){
            for(int i =0; i < numberOfStudents; i++){
                if(students[i] !=null && students.equals(student)) {
                    students[i] = students[i + 1];
                }
            }
            students[numberOfStudents - 1] = null;
            numberOfStudents--;
            size--;
        }
    }
// @Override    public String toString(){
////        return "This string is "
//
//
}
