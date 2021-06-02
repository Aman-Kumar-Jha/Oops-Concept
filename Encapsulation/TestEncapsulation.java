package Encapsulation;


public class TestEncapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Encapsulate obj = new Encapsulate(); 
        
        // setting values of the variables  
        obj.setName("Tiger"); 
        obj.setAge(19); 
        obj.setUid(1727); 
          
        // Displaying values of the variables 
        System.out.println("Student's name: " + obj.getName()); 
        System.out.println("Student's age: " + obj.getAge()); 
        System.out.println("Student's Uid: " + obj.getUid()); 
          
       
    } 

	}


