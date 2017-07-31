package gemapack;


import java.util.Timer;
import java.util.TimerTask;

public class EnemyMovement {
	Timer movement;
	private int temp = 0;

	public EnemyMovement() {

		for (int i = 0; i <= 4; i++) {
			Var.enemyx[i] = 20 + temp;
			Var.enemyy[i] = -100 - temp;
			temp += 160;
		}

		movement = new Timer();
		movement.scheduleAtFixedRate(new TimerTask() {

			@Override
			public void run() {
				if (Var.inGame) {
					for (int i = 0; i <= 4; i++) {
						Var.enemyy[i] += Var.enemyspeed[i];
						
						if (Var.enemyy[i] >= Var.screenheight) {
							Var.enemyy[i] = -150;
						}
					}
				}
			}

		}, 0, 9);

	}

}
