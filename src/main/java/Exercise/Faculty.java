package Exercise;

public class Faculty extends Employee {

    private  String officeHours;
    private  String rank;
    Faculty(String name, String address, String phone, String email, String officeHours
    , String rank, double salary, double office){
        super(name,office, address, phone, email, String.valueOf(salary));
        setName(name);
        setOffice(String.valueOf(office));
        this.officeHours = officeHours;
        this.rank = rank;
    }

    public String getOfficeHours(){
        return officeHours;
    }
    public void setOfficeHours(String officeHourss) {
        officeHours = officeHourss;

    }

    public String getRank(){
        return rank;
    }
    public void setRank(String ranks){
        rank = ranks;
    }
    public String toString(){
        return super.toString()+ "office hours: " +
                officeHours + "\n rank:" + rank;
    }
}