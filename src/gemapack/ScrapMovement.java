package gemapack;


import java.util.Timer;
import java.util.TimerTask;

public class ScrapMovement {
	Timer movement;
	private int temp = 0;

	public ScrapMovement() {

		for (int i = 0; i <= 4; i++) {
			Var.scrapx1[i] = 20 + temp;
			Var.scrapy1[i] = -200 - temp;

			temp += 160;
		}

		Var.scrapx2[0] = 266;
		Var.scrapx2[1] = 532;
		Var.scrapy2[0] = -1000;
		Var.scrapy2[1] = -1500;

		Var.scrapx3 = 375;
		Var.scrapy3 = -4000;

		movement = new Timer();
		movement.scheduleAtFixedRate(new TimerTask() {

			@Override
			public void run() {

				if (Var.inGame) {
					
					// Bronze
					for (int i = 0; i <= 4; i++) {
						Var.scrapy1[i] += Var.scrapspeed1[i];

						if (Var.scrapy1[i] >= Var.screenheight) {
							Var.scrapy1[i] = -350;
						}
					}
					
					// Silver
					for (int i = 0; i <= 1; i++) {
						Var.scrapy2[i] += Var.scrapspeed2[i];

						if (Var.scrapy2[i] >= Var.screenheight) {
							Var.scrapy2[i] = -1500;
						}
					}

					// Gold
					Var.scrapy3 += Var.scrapspeed3;
					if (Var.scrapy3 >= Var.screenheight) {
						Var.scrapy3 = -4000;
					}

				}
			}

		}, 0, 9);
	}

}
