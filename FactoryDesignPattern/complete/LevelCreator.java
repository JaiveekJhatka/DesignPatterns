package complete;

import complete.factory.ObstacleFactory;
import complete.obstacle.Obstacle;

public class LevelCreator {
	private ObstacleFactory obstacleFactory;
	
	public LevelCreator(ObstacleFactory obstacleFactory) {
		this.obstacleFactory = obstacleFactory;
	}
	
	public void create() {
		System.out.println("\n----Level starts, prepare to dodge----");
		for(int i=0; i<5; i++) {
			Obstacle obstacle = obstacleFactory.getObstacle();
			obstacle.display();
		}
	}
}
