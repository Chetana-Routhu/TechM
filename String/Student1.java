package javaProgram;
  class Student1 {
    int id;
    String name;
    Address address; 

     Student1 (int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

     void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Address: " + address.city + ", " + address.state );
    }




    public static void main(String[] args) {
        Address addr1 = new Address("vizag", "AP", "USA");
        Student1 students = new Student1(101, "Alice",addr1);
        students.display();
    }
}


	

	


