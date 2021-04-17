/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question5;

/**
 *
 * @author Tejaswi Reddy Nallavolu
 */
public class PersonDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        Person p = new Person("Teju", "Hyd", 
                "6605281409", 
                "tejur323@gmail.com");
        System.out.println("\n"+p);
        
        Student s = new Student(5.0, "Tejaswi Reddy", 
                "USA", "6281589525", 
                "reddytejaswi431@gmail.com");
        System.out.println("\n"+s);
        Employee emp = new Employee("Cognizant", 30000, 
                "07/18/2003", 
                "Rishitha Reddy", 
                "Mumbai", "9951208494", "rishireddy1@gmail.com");
        System.out.println("\n"+emp);
        
        Staff staff = new Staff("Teacher", 
                "Slate the school", 
                9000, "09/09/2019",
                "Rithu Reddy", "Kolkatta", "6301231480", 
                "rithureddy123@gmail.com");
        System.out.println("\n"+staff);
        
        
        Faculty F = new Faculty("09:00AM - 7:30 PM", 7, 
                "Kendriya vidyalaya", 60000, "08/16/2015", 
                "Akshitha", "Chennai", "7981615085", "akshithareddy21@gmail.com");
        System.out.println("\n"+F);
    }
    
}
