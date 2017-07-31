package gemapack;


import java.util.Timer;
import java.util.TimerTask;

public class Shot {
	Timer shottimer;
	private int temp = 0;

	public Shot() {
		shottimer = new Timer();
		shottimer.scheduleAtFixedRate(new TimerTask() {

			@Override
			public void run() {

				if (Var.bolshot == true) {
					Var.shoty -= 3;
				}

				for (int i = 0; i <= 4; i++) {

					if (Var.shotx >= Var.enemyx[i] - 25 && Var.shotx <= Var.enemyx[i] + 73
							&& Var.shoty >= Var.enemyy[i] - 70 && Var.shoty <= Var.enemyy[i] + 35) {

						Var.shotcollision = true;
						Var.bolshot = false;

						Var.shotx = Var.screenwidth + 100;
						Var.shoty = Var.screenheight + 100;

						Var.posenemyx = Var.enemyx[i] - 10;
						Var.posenemyy = Var.enemyy[i] - 10;

						Var.enemyy[i] = -150;
					}

				}
				for (int i = 0; i <= 4; i++) {
					if (Var.shoty <= 0) {
						Var.bolshot = false;

						Var.shotx = Var.screenwidth + 100;
						Var.shoty = Var.screenheight + 100;

					}
				}

				if (Var.shotcollision == true) {
					if (temp < 37) {

						temp++;

					} else if (temp == 37) {
						Var.shotcollision = false;

						Var.gifenemy.flush();
						temp = 0;
					}

				}

			}

		}, 0, 8);
	}

}
