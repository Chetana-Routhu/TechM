package oopsConcept;
abstract class Bank2 {
	
    abstract double getRateOfInterest();
}
class SBI extends Bank2 {  
    double getRateOfInterest() {
        return 5.4; 
    }
}
class HDFC extends Bank2 {
    
    double getRateOfInterest() {
        return 6.8; 
    }
}
public class Bank {
    public static void main(String[] args) {
        Bank2 sbi = new SBI();
        Bank2 hdfc = new HDFC(); 
        System.out.println("SBI Rate of Interest: " + sbi.getRateOfInterest() + "%");
        System.out.println("HDFC Rate of Interest: " + hdfc.getRateOfInterest() + "%");
    }
}


