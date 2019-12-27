package complete;

import complete.dbAccess.IDatabaseAccessLevel;
import complete.salary.ISalaryLevel;

public class Employee {
	ISalaryLevel salaryLevel;
	IDatabaseAccessLevel dbAccessLevel;
	
	public Employee(ISalaryLevel salaryLevel, IDatabaseAccessLevel dbAccessLevel) {
		this.salaryLevel = salaryLevel;
		this.dbAccessLevel = dbAccessLevel;
	}
	
	public String getSalaryLevel() {
		return salaryLevel.salary();
	}
	
	public String getDBAccessLevel() {
		return dbAccessLevel.accessLevel();
	}
}
