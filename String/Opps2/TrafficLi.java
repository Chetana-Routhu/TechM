package Opps2;

 class TrafficLi {
	String colour;
	int duration;
	TrafficLi(String colour,int duration){
		this.colour = colour;
		this.duration = duration;
		
	}
	void changeColour(String newcolour) {
		colour = newcolour;
		System.out.println("tarffic colour changes to "+colour);
	}
	boolean Red() {
		return colour.equals("red");
	}
	boolean blue() {
		return colour.equals("blue");
	}
	int getDuration() {
		return duration;
		
	}
	void setDuration(int newDuration) {
		duration = newDuration;
		System.out.println("duration of traffic light is updated to: " +duration+ "seconds");
	}

	public static void main(String[] args) {
		TrafficLi Tl = new TrafficLi("red",30);
		if(Tl.Red()) {
			System.out.println("the traffic light is red");
		}
		Tl.changeColour("green");
		if(Tl.blue()) {
			System.out.println("now the traffic light is blue");
			
		}
		System.out.println("current light duration" +Tl. getDuration()+"second" );
		Tl.setDuration(70);
		

	}

}
