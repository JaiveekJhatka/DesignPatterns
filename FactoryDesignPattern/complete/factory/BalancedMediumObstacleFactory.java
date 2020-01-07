package complete.factory;

import java.util.Random;

import complete.obstacle.BigObstacle;
import complete.obstacle.Obstacle;
import complete.obstacle.SmallObstacle;

public class BalancedMediumObstacleFactory implements ObstacleFactory{
	private int smallObstacleCount = 0;
	private int bigObstacleCount = 0;
	
	//Small and big obstacle count can have max difference of 1.
	@Override
	public Obstacle getObstacle() {
		Obstacle obstacle;
		Random random = new Random();
		if(smallObstacleCount == bigObstacleCount) {
			if(random.nextInt(100) < 50) {
				obstacle = new BigObstacle();
				bigObstacleCount++;
			}else {
				obstacle = new SmallObstacle();
				smallObstacleCount++;
			}
		}else if(smallObstacleCount > bigObstacleCount) {
			obstacle = new BigObstacle();
			bigObstacleCount++;
		}else {
			obstacle = new SmallObstacle();
			smallObstacleCount++;
		}
		return obstacle;
	}
}
