package oopsConcept;
	abstract class Bank3 {
	    abstract void getRateOfInterest();
	}
	class SBI1 extends Bank3{
	    void getRateOfInterest() {
	        System.out.println("SBI Rate of Interest: 5.4%"); 
	    }
	}
	class HDFC1 extends Bank3 {
	    void getRateOfInterest() {
	        System.out.println("HDFC Rate of Interest: 6.8%"); 
	    }
	}	
	public class Banks{
	    public static void main(String[] args) {
	        Bank3 sbi = new SBI1(); 
	        Bank3 hdfc = new HDFC1(); 
	        
	        sbi.getRateOfInterest();
	        hdfc.getRateOfInterest();
	    }
	}


	
		

	


