
package oop;


public class info {
    
    public static void main(String[] args) {
        
        Teachers teacher1 = new Teachers("Hridoy Krisna Das", "Male", 20);
        /*teacher1.Name = "Hridoy";
        teacher1.Gender = "Male";
        teacher1.Age = 20;*/
        //teacher1.Setinfo("Hridoy Krisna Das", "Male", 20);
        teacher1.Display();
        
        
        Teachers teacher2 = new Teachers("Shimla Das", "Female", 17);
       // teacher2.Setinfo("Shimla Das", "Female", 17);
        teacher2.Display();
        
        Teachers teacher3 = new Teachers();
        teacher3.Display();
        
        
    }
    
}
