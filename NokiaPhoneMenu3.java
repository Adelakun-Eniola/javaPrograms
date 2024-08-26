import java.util.*;
public class NokiaPhoneMenu3{
	public static void main(String [] args){
		userSelection();
	}


public static void userSelection(){
	String Menu = """
	1 -> PhoneBook
	2 -> Messages
	3 -> Chat
	4 -> Call
	5 ->Tones
	6 ->Settings
	7 -> Call Divert
	8 -> Games
	9 -> Calculator
	10 -> Reminders
	11 -> Clock
	12 -> Profiles
	13 -> SIM Services
	""";
	System.out.println (Menu);
	Scanner menu = new Scanner(System.in);
		System.out.println("Please Enter A Selection:");
		int number = menu.nextInt();
		
		switch(number){
			case 1: phoneBook(); break;

			case 2: System.out.println("Messages");
			String subMenuTwo = """ 
			1.Write Messages
			2.Inbox
			3.Outbox
			4.Picture messages
			5.Templates
			6.Smileys
			7.Message settings
			8.Info Service
			9.Voice Mailbox Number
			10. Service Command
			""";
			System.out.println(subMenuTwo);
			
			Scanner newMenu2 = new Scanner(System.in);
			System.out.println("Please Enter A Selection:");
			int number2 = newMenu2.nextInt();
			switch(number2){
				case 1: System.out.println("Write Message"); break;
				case 2: System.out.println("Inbox"); break;
				case 3: System.out.println("Outbox"); break;
				case 4: System.out.println("Picture Message"); break;
				case 5: System.out.println("Template"); break;
				case 6: System.out.println("Smileys"); break;
				case 7 : messageSettings(); break;
				case 8 : System.out.println("Info Service"); break;
				case 9: System.out.println("Voice Mailbox Number"); break;
				case 10: System.out.println(" Service Command"); break;

			}break;
			
		case 3: System.out.println("Chat"); break;

		case 4:
		System.out.println("---Call Register---");
		String menuFour = """
			1.Missed Calls
			2.Received Calls
			3.Dialled Numbers
			4.Erase Recent Call Lists
			5.Show Call Duration
			6.Show call costs
			7.Call cost settings
			8.Prepaid credit
		""";

		}
	}
		public static void phoneBook() {
			String menuOptionOne = """ 
				--- PHONE BOOK---
				1. Search
				2.Service Nos
				3.Add Name
				4. Erase
				5: Edit
				6: Assign Tone
				7:  Send b'card
				8: Options
				9: Speed Dials
				10: Voice Tags
				""";
			System.out.println(menuOptionOne);
			Scanner newMenuForOprionOne = new Scanner(System.in);
			System.out.println("Please Enter A Selection:");
			int numberOne = newMenuForOprionOne.nextInt();
			switch(numberOne){
				case 1:System.out.println("Search"); break;
				case 2: System.out.println("Service Nos"); break;
				case 3: System.out.println("Add Name"); break;
				case 4: System.out.println("Erase"); break;
				case 5: System.out.println("Edit"); break;
				case 6: System.out.println("Assign Tone"); break;
				case 7: System.out.println("Send b'card"); break;
				case 8: options(); break;
				case 9: System.out.println("Speed dials"); break;
				case 10: System.out.println("Voice Tags"); break;
			
			} 
}
			public static void options() {
					System.out.println("Options");
					System.out.println("Please Enter An Option:");
					System.out.println("    1 Types Of View");
					System.out.println("    2 Memory Status");
					Scanner subMenuFor8 = new Scanner(System.in);
					int numberOneSubSection8 = subMenuFor8.nextInt();
					switch(numberOneSubSection8){
						case 1:
					System.out.println("Types Of View"); break;
						case 2:
					System.out.println("Memory Status"); break;
					}

			}

			public static void messageSettings(){
					System.out.println("Message Settings");
					Scanner subMenuFor7 = new Scanner(System.in);
					int numberOneSubSection7 = subMenuFor7.nextInt();

					System.out.println("Please Enter Sub Option:");
					System.out.println("    1. Set");
					System.out.println("    2. Common");
					switch(numberOneSubSection7){
						case 1:
						System.out.println("Please Select The Options:");
						System.out.println("     1.Message Centre Number");
						System.out.println("     2.Message Sent As");
						System.out.println("     3.Message Validity");
						Scanner subInput = new Scanner(System.in);
						int num1 = subInput.nextInt();
						switch(num1){
							case 1:	
							System.out.println("Message Centre Number"); break;
							case 2:
							System.out.println("Message Sent As"); break;
							case 3:
							System.out.println("Message Validity"); break;
						}
						case 2:
						//System.out.println("Common");
						System.out.println("Please Select The Options:");
						System.out.println("     1.Delivery Reports");
						System.out.println("     2.Reply Via Same Centre");
						System.out.println("     3.Character Support");
						Scanner newSubInput = new Scanner(System.in);
						int num2 = newSubInput.nextInt();
						switch(num2){
							case 1:	
							System.out.println("Delivery Reports"); break;
							case 2:
							System.out.println("Reply Via Same Centre"); break;
							case 3:
							System.out.println("Character Support"); break;
						}

					}
	
	}

}