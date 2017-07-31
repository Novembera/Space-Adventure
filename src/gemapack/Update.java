package gemapack;


import java.util.Timer;
import java.util.TimerTask;

public class Update {
	Timer actual;
	static int tempUpdate = 0, tempUpdate1 = 0;

	public Update() {
		actual = new Timer();
		actual.scheduleAtFixedRate(new TimerTask() {

			@Override
			public void run() {

				if (Var.inMenu) {
					if (tempUpdate == 0) {
						Var.btnresume.requestFocus();
						Var.btnshop.requestFocus();
						Var.btnexit.requestFocus();

						tempUpdate++;

					} else if (tempUpdate == 1) {
						Var.jf1.requestFocus();
					}
				} else if (Var.inShop) {
					if (tempUpdate1 == 0) {
						Var.btnupgrade1.requestFocus();
						Var.btnupgrade2.requestFocus();
						Var.btnupgrade3.requestFocus();
						Var.btnhealth.requestFocus();

						tempUpdate1++;
					} else if (tempUpdate1 == 1) {
						Var.jf1.requestFocus();
					}

				}

			}

		}, 0, 50);
	}

}
