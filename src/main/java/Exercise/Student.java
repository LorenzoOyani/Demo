package Exercise;

public class Student extends Persons {
    private String FRESHMAN;
    private String SOPHOMORE;
    private String JUNIOR;
    private String SENIOR;
    private String status;

    Student() {
    }

    Student(String name,String address, String email, String phone, String status) {
        super(name,address, phone, email);
        setName(name);
        setEmail(email);
        setPhone(phone);
        setAddress(address);
        this.status = status;
    }

    public void setStudentStatus(String status){
        this.status = status;

    }

    public String getStudentStatus() {

        switch (status) {
            case "Freshman":
                status = FRESHMAN;
                break;
            case "Sophomore":
                status = SOPHOMORE;
                break;
            case "Junior":
                status = JUNIOR;
                break;
            case "Senior":
                status = SENIOR;
                break;
        }
        return status;

    }
    @Override
    public String toString(){
        return super.toString() + "\nStatus: "+ getStudentStatus();
    }



}
