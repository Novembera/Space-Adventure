package gemapack;


import java.util.Timer;
import java.util.TimerTask;

public class Defeat {
	Timer loose;
	private int temp = 0, temp1 = 0, temp2 = 0;

	public Defeat() {
		loose = new Timer();
		loose.scheduleAtFixedRate(new TimerTask() {

			@Override
			public void run() {

				if (Var.lost) {
					if (temp >= 0 && temp <= 55) {
						temp++;
					} else if (temp == 56) {

						// Menu
						Var.inGame = false;
						Var.inMenu = false;
						Var.inShop = true;
						Var.btnresume.setVisible(true);
						Var.btnshop.setVisible(false);
						Var.btnexit.setVisible(false);
						Var.btnupgrade1.setVisible(true);
						Var.btnupgrade2.setVisible(true);
						Var.btnupgrade3.setVisible(true);
						Var.btnhealth.setVisible(true);

						KeyHandler.tempKeyhandler++;
						Var.btnresume.requestFocus();
						Var.jf1.requestFocus();

						// Scrap position
						for (int i = 0; i <= 4; i++) {
							Var.scrapx1[i] = 20 + temp1;
							Var.scrapy1[i] = -200 - temp1;
							temp1 += 160;
						}

						Var.scrapx2[0] = 266;
						Var.scrapx2[1] = 532;
						Var.scrapy2[0] = -1000;
						Var.scrapy2[1] = -1500;
						
						Var.scrapx3 = 375;
						Var.scrapy3 = -4000;

						// Enemy position
						for (int i = 0; i <= 4; i++) {
							Var.enemyy[i] = 0;
						}

						for (int i = 0; i <= 4; i++) {
							Var.enemyy[i] = -100 - temp2;
							temp2 += 160;
						}

						temp = 0;
						Var.scrap = 0;
						Var.health = Var.maxhealth;
						Var.lost = false;
					}
				}

			}

		}, 0, 15);
	}

}
