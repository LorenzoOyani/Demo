package OOP;

public class BMI {
    private final double KILOGRAM_PER_POUNDS = 0.45359237;
    private final double METERS_PER_INCH = 0.0254;
    private int weight;
    private double height;
    private String name;
    private int age;

    BMI(String name, int age, int weight, double height) {
        this.name = name;
        this.weight = weight;
        this.height = height;
        this.age = age;


    }

    BMI() {
        this("", 20, 3, 8);

    }

    public static void main(String[] args) {
        BMI myBmi = new BMI("Jerumeh Lawrence", 28, 70, 5.10);
        System.out.println("The Bmi for " + myBmi.getName() + " is " + myBmi.getBmi()+ "kg" + " " + myBmi.getStatus());
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public double getBmi() {
        double bmi = weight * KILOGRAM_PER_POUNDS /
                (weight * METERS_PER_INCH) * (height * METERS_PER_INCH);
        return Math.round(bmi * 100) / 100.0;
    }

    public String getStatus() {
        double bmi = getBmi();
        if (bmi < 18.5) {
            return "underweight";
        }
        if (bmi < 25) {
            return "Normal";
        }
        if (bmi < 30) {
            return "overWeight";
        } else {
            return "obese";
        }

    }

    public int getAge() {
        return age;
    }

    public void setAge(int newAge) {
        this.age = newAge;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(int newHeight) {
        this.height = newHeight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int newWeight) {
        this.weight = newWeight;
    }
}