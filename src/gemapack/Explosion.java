package gemapack;


import java.util.Timer;
import java.util.TimerTask;

public class Explosion {
	Timer exp;
	private int temp = 0;

	public Explosion() {
		exp = new Timer();
		exp.scheduleAtFixedRate(new TimerTask() {

			@Override
			public void run() {

				if (Var.inGame) {

					if (Var.collided) {

						if (temp < 23) {

							temp++;
						} else if (temp == 23) {

							Var.gifexplosion.flush();
							temp = 0;
							Var.collided = false;
						}
					}
				}
			}

		}, 0, 50);
	}

}
