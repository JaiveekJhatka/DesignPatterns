package complete;

import complete.factory.BalancedMediumObstacleFactory;
import complete.factory.EasyObstacleFactory;
import complete.factory.MediumObstacleFactory;

public class Client {

	public static void main(String[] args) {
		LevelCreator easyLevel = new LevelCreator(new EasyObstacleFactory());
		easyLevel.create();
		
		LevelCreator mediumLevel = new LevelCreator(new MediumObstacleFactory());
		mediumLevel.create();
		
		LevelCreator balancedMediumLevel = new LevelCreator(new BalancedMediumObstacleFactory());
		balancedMediumLevel.create();
	}

}
