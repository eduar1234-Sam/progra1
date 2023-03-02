package test;
import java.util.ArrayList;

public class services {
	
	ArrayList<person> perList = new ArrayList<person>();
	
	public void setPerson(int ag, String nam, int ide, String Typ) {
		person p = new person();
		
		p.setAge(ag);
		p.setName(nam);
		p.setId(ide);
		p.setType(Typ);
			
		perList.add(p);

		System.out.println("Data saved \n");
	}
	
	public ArrayList<person> getList() {
		return this.perList;
	}

}
