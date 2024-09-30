public class AnimalDriver{
	public static void main(String [] args){
		Animal animal = new Animal();
		System.out.println("Animal Type is -----> " + animal.getType());
		animal.setType("Goat");
		System.out.println("Animal Type is -----> " + animal.getType());
		
	}

}