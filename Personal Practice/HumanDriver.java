public class HumanDriver{
	public static void main(String[] args){
		Human human1 = new Human();
		Human human2 = new Human();
		
		System.out.println("Human1 name is " + human1.getName());

		human1.setName("Adam"); 
		human1.setAge(10);
		System.out.println("Human1 name is " + human1.getName());
		System.out.println(human1.getName() + " age is " + human1.getAge());

		human2.setName("Eve");
		System.out.println(human2.getName());

	}
}