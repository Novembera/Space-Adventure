package gemapack;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionHandler implements ActionListener {
	static int tempActionhandler = 0;

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == Var.btnresume) {

			Var.inGame = true;
			Var.inShop = false;
			Var.inMenu = false;
			Var.btnresume.setVisible(false);
			Var.btnshop.setVisible(false);
			Var.btnexit.setVisible(false);

			Var.btnupgrade1.setVisible(false);
			Var.btnupgrade2.setVisible(false);
			Var.btnupgrade3.setVisible(false);
			Var.btnhealth.setVisible(false);

			KeyHandler.tempKeyhandler = 0;
			Update.tempUpdate = 0;
			Update.tempUpdate1 = 0;

			Var.jf1.requestFocus();

		} else if (e.getSource() == Var.btnshop) {

			Var.inGame = false;
			Var.inShop = true;
			Var.inMenu = false;
			Var.btnresume.setVisible(true);
			Var.btnshop.setVisible(false);
			Var.btnexit.setVisible(false);

			Var.btnupgrade1.setVisible(true);
			Var.btnupgrade2.setVisible(true);
			Var.btnupgrade3.setVisible(true);
			Var.btnhealth.setVisible(true);

			

			KeyHandler.tempKeyhandler = 1;

			Var.jf1.requestFocus();

		} else if (e.getSource() == Var.btnexit) {
			System.exit(0);
		}

		else if (e.getSource() == Var.btnupgrade1) {
			if (Var.scrap >= Var.up1price) {

				Var.maxhealth += 1;
				Var.scrap -= Var.up1price;
				Var.up1price = (Var.up1price+Var.up1price/2);
				Var.up1number += 1;
			
			}

		} else if (e.getSource() == Var.btnupgrade2) {
			if (Var.scrap >= Var.up2price) {
				Var.scrap -= Var.up2price;
				Var.up2price = (Var.up2price+Var.up2price/2);
				Var.up2number += 1;
				Var.ammo += 10;
			
			}

		} else if (e.getSource() == Var.btnupgrade3) {
			if (Var.scrap >= Var.up3price) {
				Var.scrap -= Var.up3price;
				Var.up3price = (Var.up3price+Var.up3price/2);
				Var.up3number += 1;
				Var.shieldnumber = Var.up3number;
				
			}
		}else if (e.getSource() == Var.btnhealth){
			if(Var.scrap>=Var.uphealthprice&&Var.health<Var.maxhealth){
				Var.scrap -= Var.uphealthprice;
				Var.health +=1;
			}
		}

	}
	
	

}
