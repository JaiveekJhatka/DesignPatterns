package complete.dbAccess;

public class BasicDBAccessLevel implements IDatabaseAccessLevel{

	@Override
	public String accessLevel() {
		return "You have basic level of DB access";
	}

}
