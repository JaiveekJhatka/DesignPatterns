package complete.dbAccess;

public class AdminDBAccessLevel implements IDatabaseAccessLevel{

	@Override
	public String accessLevel() {
		return "God mode for DB access";
	}

}
