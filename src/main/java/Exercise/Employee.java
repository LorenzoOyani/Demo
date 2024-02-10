package Exercise;

import java.util.Date;

public class Employee extends Persons {
    private String office;
    private double salary = 0;
    private Date dateCreated;

    private String name;

    Employee() {
    }

    Employee(String office,double salary, String name, String address, String phone, String email) {
        super(name, address, phone, email);
        setName(name);
        setPhone(phone);
        setEmail(email);
        setAddress(address);
        this.office = office;
        this.salary = salary;
        this.dateCreated = new Date();


    }

    public Employee(String name, String office) {
        this.name = name;
        this.office = office;

    }

    public void setOffice(String office) {
        this.office = office;
    }

    //    public String getOffice(){
//        return office;
//    }
    public void setNewName(String name) {
        setName(name);
    }


    public Date getDateCreated() {
        return dateCreated;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }


    @Override
    public String toString() {
        return super.toString() + "\n office" + office +
                "\n salary:  " + getSalary() + "\n Date hired: " + getDateCreated();
    }


}