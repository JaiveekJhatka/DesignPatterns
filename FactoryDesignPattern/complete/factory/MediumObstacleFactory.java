package complete.factory;

import java.util.Random;

import complete.obstacle.BigObstacle;
import complete.obstacle.Obstacle;
import complete.obstacle.SmallObstacle;

public class MediumObstacleFactory implements ObstacleFactory {

	//50% chance big obstacle, 50% small obstacle.
	@Override
	public Obstacle getObstacle() {
		Obstacle obstacle;
		Random random = new Random();
		if(random.nextInt(100) < 50) {
			obstacle = new BigObstacle();
		}else {
			obstacle = new SmallObstacle();
		}
		return obstacle;
	}

}
