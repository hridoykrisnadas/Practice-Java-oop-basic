
public class Student {

    String Name, Gender;
    static String Institute = "Feni Computer Institute";

    void setinfo(String n, String G) {
        Name = n;
        Gender = G;

    }

    void Display() {
        System.out.println("Name is: " + Name);
        System.out.println("Gender is: " + Gender);
        System.out.println("Institute: " + Institute);
        System.out.println("\n");
    }
}
