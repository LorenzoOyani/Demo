package Exercise;

public class Staff extends Employee {

    private  String title;
    Staff(String office, double salary, String name, String address, String phone, String email, String title) {
        super(office, salary,name,address,phone,email);
        this.title = title;

    }

    public void setTitle(String titles){
        title = titles;
    }

    public String getTitle(){
        return title;
    }

    public String toString(){
        return super.toString() + "\n title: " + getTitle();
    }
}