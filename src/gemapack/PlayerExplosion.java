package gemapack;


import java.util.Timer;
import java.util.TimerTask;

public class PlayerExplosion {
	Timer expl;
	private int temp = 0;

	public PlayerExplosion() {
		expl = new Timer();
		expl.scheduleAtFixedRate(new TimerTask() {

			@Override
			public void run() {

				if (Var.collided == true && Var.lost == true) {
					if (temp < 10) {
						temp++;
					} else if (temp == 10) {
						temp = 0;
					}

				}

			}

		}, 0, 8);
	}

}
