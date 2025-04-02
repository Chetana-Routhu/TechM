package javaProgram;

abstract class FirstRelease{

	public void classRoom() {
		System.out.println("class room training is started");
	}
	
	public abstract void online(); 
	public abstract void ofline();
}
abstract class SecondRelease extends FirstRelease {
	
	
	public void online() {
		System.out.println("online training is started");
	}
}

 class FinalRelease extends SecondRelease{
	
	
	public void ofline() {
	System.out.println("ofline training is started");
	
	}

	public static void main(String[] args) {
		
		FinalRelease f = new FinalRelease();
		f.classRoom();
		f.online();
		f.ofline();
		
	}
	
	
}


