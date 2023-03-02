package test;
import java.util.Scanner; 
import java.util.ArrayList;


public class functions {
	int opt = 0;
	Scanner readLine = new Scanner(System.in);
	services serv = new services();
	//object
	int age;
	String name; 
	int id;
	String type;
	
	public void menu() {
		while(opt != 9) {
			System.out.println("Select an option: \n" +
								"1) Insert a new person. \n" +
								"2) Get List. \n" +
								"9) Exit.");
			this.opt = readLine.nextInt();
			
			switch(opt) {
			
			case 1:
				System.out.println("Enter a valid age");
				this.age = readLine.nextInt();
				System.out.println("Enter a valid name");
				this.name = readLine.next();
				System.out.println("Enter a valid ID");
				this.id = readLine.nextInt();
				System.out.println("Enter a valid Type	");
				this.type = readLine.next();
				
				serv.setPerson(this.age, this.name, this.id, this.type);
				break;
			case 2:
				this.printList(serv.getList());
				break;
			default:
				break;
			
			}
			
			
		}
		System.out.println("Exit...");		
	}
	
	public void printList(ArrayList<person>per) {
		System.out.println("[ ");
		for(int i = 0; i<per.size(); i++) {
			System.out.println("name: " + per.get(i).name);
			System.out.println("age: " + per.get(i).age);
			System.out.println("id: " + per.get(i).id);
			System.out.println("type: " + per.get(i).type + ", \n");	
		}
		System.out.println(" ]");
	}

}
