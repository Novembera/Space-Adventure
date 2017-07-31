package gemapack;


import java.util.Timer;
import java.util.TimerTask;

public class ScrapCollision {
	Timer collision;

	public ScrapCollision() {
		collision = new Timer();
		collision.scheduleAtFixedRate(new TimerTask() {

			@Override
			public void run() {

				// Bronze
				for (int i = 0; i <= 4; i++) {

					if (Var.x >= Var.scrapx1[i] - 50 && Var.x <= Var.scrapx1[i] + 70 && Var.y >= Var.scrapy1[i] - 50
							&& Var.y <= Var.scrapy1[i] + 50) {

						Var.scrap += 1;
						Var.scrapy1[i] = -200;
					}

				}

				// Silver
				for (int i = 0; i <= 1; i++) {

					if (Var.x >= Var.scrapx2[i] - 50 && Var.x <= Var.scrapx2[i] + 70 && Var.y >= Var.scrapy2[i] - 50
							&& Var.y <= Var.scrapy2[i] + 50) {

						Var.scrap += 5;
						Var.scrapy2[i] = -1500;
					}

				}

				// Gold
				if (Var.x >= Var.scrapx3 - 50 && Var.x <= Var.scrapx3 + 70 && Var.y >= Var.scrapy3 - 50
						&& Var.y <= Var.scrapy3 + 50) {

					Var.scrap += 10;
					Var.scrapy3 = -4000;
				}

			}

		}, 0, 15);
	}

}
