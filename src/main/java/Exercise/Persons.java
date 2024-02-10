package Exercise;

public class Persons {
    private String name;
    private String phone;
    private String email;
    private String address;

    Persons() {
        this("unknown", "unknown", "unknown", "unknown");
    } // no-arg constructor

    Persons(String name, String address, String phone, String email) {
        this.name = name;
        this.address = address;
        this.email = email;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String new_name) {
        this.name = new_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String new_email) {
        this.email = new_email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getAddress(){
        return address;
    }

    public void setAddress(String address){
        this.address = address;
    }

    @Override
    public String toString() {
        return "\n" + this.name + "\n email is: " + email + "\n phone is:" + phone + "\n address: " + address;
    }


}