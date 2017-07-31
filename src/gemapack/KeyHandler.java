package gemapack;


import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyHandler implements KeyListener {

	static int tempKeyhandler = 0;

	@Override
	public void keyTyped(KeyEvent e) {
	}

	@Override
	public void keyPressed(KeyEvent e) {

		if (e.getKeyCode() == KeyEvent.VK_UP) {
			Var.moveup = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			Var.movedown = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			Var.moveleft = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			Var.moveright = true;
		}

		if (e.getKeyCode() == KeyEvent.VK_W) {
			Var.moveup = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_S) {
			Var.movedown = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_A) {
			Var.moveleft = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_D) {
			Var.moveright = true;
		}

		if (e.getKeyCode() == KeyEvent.VK_SPACE) {

			if (Var.bolshot == false && Var.ammo > 0) {
				Var.bolshot = true;
				Var.shotx = Var.x + 15;
				Var.shoty = Var.y - 45;
				Var.ammo--;

			}
		}

		if (tempKeyhandler == 0) {
			// Menu
			if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
				Var.inGame = false;
				Var.inMenu = true;
				Var.inShop = false;
				Var.btnresume.setVisible(true);
				Var.btnshop.setVisible(true);
				Var.btnexit.setVisible(true);

				tempKeyhandler++;
			}
		} else if (tempKeyhandler == 1) {
			if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
				Var.inGame = true;
				Var.inMenu = false;
				Var.inShop = false;
				Var.btnresume.setVisible(false);
				Var.btnshop.setVisible(false);
				Var.btnexit.setVisible(false);

				Var.btnupgrade1.setVisible(false);
				Var.btnupgrade2.setVisible(false);
				Var.btnupgrade3.setVisible(false);
				Var.btnhealth.setVisible(false);
				tempKeyhandler--;
				Update.tempUpdate = 0;
				Update.tempUpdate1 = 0;
			}
		}

	}

	@Override
	public void keyReleased(KeyEvent e) {

		if (e.getKeyCode() == KeyEvent.VK_UP) {
			Var.moveup = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			Var.movedown = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			Var.moveleft = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			Var.moveright = false;
		}

		
		if (e.getKeyCode() == KeyEvent.VK_W) {
			Var.moveup = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_S) {
			Var.movedown = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_A) {
			Var.moveleft = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_D) {
			Var.moveright = false;
		}

	}

}
