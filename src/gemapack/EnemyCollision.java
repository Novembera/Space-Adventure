package gemapack;


import java.util.Timer;
import java.util.TimerTask;

public class EnemyCollision {
	Timer collision;
	private int temp = 0;

	public EnemyCollision() {
		collision = new Timer();
		collision.scheduleAtFixedRate(new TimerTask() {

			@Override
			public void run() {
				if (Var.inGame) {

					for (int i = 0; i <= 4; i++) {
						if (temp == 0) {
							if (Var.x >= Var.enemyx[i] - 40 && Var.x <= Var.enemyx[i] + 73
									&& Var.y >= Var.enemyy[i] - 70 && Var.y <= Var.enemyy[i] + 35) {

								Var.collided = true;

								Var.enemyy[i] = -100;

								if (Var.shieldnumber > 0) {
									Var.shieldnumber -= 1;
								} else if (Var.shieldnumber == 0) {
									if (Var.health >= 1) {
										Var.health -= 1;
									}
									if (Var.health == 0) {
										Var.lost = true;

									} else if (Var.health > 0) {
										Var.lost = false;
									}
								}

								temp++;
							}
						}
					}

					if (temp >= 1 && temp <= 65) {
						temp++;
					} else if (temp == 66) {
						temp = 0;
					}
				}

			}

		}, 0, 15);
	}

}
