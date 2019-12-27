package complete.dbAccess;

public class NoDBAccessLevel implements IDatabaseAccessLevel{

	@Override
	public String accessLevel() {
		return "You have no level of DB access";
	}
	
}
