package oop;

public class Teachers {

    String Name, Gender;
    int Age;

    Teachers(String n, String g, int a) {
        Name = n;
        Gender = g;
        Age = a;
    }
    
    Teachers(){
        System.out.println("No Value");
}

    public void Setinfo(String n, String g, int a) {
        Name = n;
        Gender = g;
        Age = a;

    }

    public void Display() {

        System.out.println("Name is: " + Name);
        System.out.println("Teacher Gender  is: " + Gender);
        System.out.println("Teacher age is: " + Age);
        System.out.println("");

    }

}
