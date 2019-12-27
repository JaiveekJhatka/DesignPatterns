package complete;

import complete.dbAccess.BasicDBAccessLevel;
import complete.dbAccess.NoDBAccessLevel;
import complete.salary.InternSalaryLevel;
import complete.salary.JuniorsSalaryLevel;

public class Client{
	
	public static void main(String[] args) {
		Employee creep = new Employee(new JuniorsSalaryLevel(), new BasicDBAccessLevel());
		System.out.println("Creep: " + creep.getDBAccessLevel() + " and " + creep.getSalaryLevel());
		
		
		Employee intern = new Employee(new InternSalaryLevel(), new NoDBAccessLevel());
		System.out.println("Intern: " + creep.getDBAccessLevel() + " and " + creep.getSalaryLevel());
		
		//Any combination of salary level and db access level possible.
	}
}
