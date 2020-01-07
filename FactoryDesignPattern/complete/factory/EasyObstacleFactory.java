package complete.factory;

import java.util.Random;

import complete.obstacle.BigObstacle;
import complete.obstacle.Obstacle;
import complete.obstacle.SmallObstacle;

public class EasyObstacleFactory implements ObstacleFactory {
	
	//10% chance big obstacle, 90% small obstacle.
	@Override
	public Obstacle getObstacle() {
		Obstacle obstacle;
		Random random = new Random();
		if(random.nextInt(100) < 10) {
			obstacle = new BigObstacle();
		}else {
			obstacle = new SmallObstacle();
		}
		return obstacle;
	}
	
}
