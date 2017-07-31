package gemapack;


import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JLabel;

public class Label extends JLabel {

	private static final long serialVersionUID = 1L;

	protected void paintComponent(Graphics g) {

		super.paintComponent(g);

		Graphics2D g2d = (Graphics2D) g;

		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

		if (Var.inGame) {

			g.drawImage(Var.ib1, 0, Var.backgroundY1, 800, 600, null);
			g.drawImage(Var.ib2, 0, Var.backgroundY2, 800, 600, null);

			for (int i = 0; i <= 4; i++) {
				g.drawImage(Var.iscrap1, Var.scrapx1[i], Var.scrapy1[i], 48, 38, null);
			}
			for (int i = 0; i <= 1; i++) {
				g.drawImage(Var.iscrap2, Var.scrapx2[i], Var.scrapy2[i], 48, 38, null);
			}
			g.drawImage(Var.iscrap3, Var.scrapx3, Var.scrapy3, 48, 38, null);

			for (int i = 0; i <= 4; i++) {
				g.drawImage(Var.ienemy1, Var.enemyx[i], Var.enemyy[i], 80, 60, null);
			}

			if (Var.shotcollision == true) {

				g.drawImage(Var.gifenemy, Var.posenemyx, Var.posenemyy, 104, 95, null);

			}

			if (Var.flameanimation == 0) {
				g.drawImage(Var.iflame1, Var.x, Var.y + 58, 50, 50, null);
			} else if (Var.flameanimation == 1) {
				g.drawImage(Var.iflame2, Var.x, Var.y + 58, 50, 50, null);
			}

			if (Var.shieldnumber > 0 && Var.shieldnumber <= Var.ishield.length) {
				g.drawImage(Var.ishield[Var.shieldnumber - 1], Var.x - 10, Var.y - 10, 70, 90, null);
			} else if (Var.shieldnumber > Var.ishield.length) {

				g.drawImage(Var.ishield[Var.shieldnumbermax], Var.x - 10, Var.y - 10, 70, 90, null);

			}

			if (Var.bolshot == true) {
				g.drawImage(Var.gifshot, Var.shotx, Var.shoty, 20, 40, null);
			}

			if (Var.moveleft) {
				g.drawImage(Var.irocketleft, Var.x, Var.y, 50, 70, null);
			} else if (Var.moveright) {
				g.drawImage(Var.irocketright, Var.x, Var.y, 50, 70, null);
			} else {
				g.drawImage(Var.irocket, Var.x, Var.y, 50, 70, null);
			}

			g.setColor(new Color(0, 230, 115));
			g.setFont(new Font("Arial", Font.BOLD, 35));
			g.drawString("Schrott: " + Var.scrap, 20, 50);

			g.drawImage(Var.ihealth, 600, 500, 50, 50, null);
			g.setFont(new Font("Arial", Font.BOLD, 55));
			g.drawString("" + Var.health, 670, 545);
			g.setFont(new Font("Arial", Font.BOLD, 25));
			g.drawString("/ " + Var.maxhealth, 735, 545);

			g.drawImage(Var.iammo, 20, 495, 56, 65, null);
			g.setFont(new Font("Arial", Font.BOLD, 55));
			g.drawString("" + Var.ammo, 90, 545);
			g.setFont(new Font("Arial", Font.BOLD, 25));
			g.drawString("/ " + Var.maxammo, 155, 545);

			repaint();

			if (Var.collided) {

				if (Var.lost) {
					g.setFont(new Font("Arial", Font.BOLD, 45));
					g.drawString("Schrott verloren " + Var.scrap, 225, 200);
				}

				g.drawImage(Var.gifexplosion, Var.x - 10, Var.y - 10, 71, 100, null);

			}

			repaint();

		} else if (Var.inMenu || Var.inShop) {

			g.drawImage(Var.ib1, 0, Var.backgroundY1, 800, 600, null);
			g.drawImage(Var.ib2, 0, Var.backgroundY2, 800, 600, null);

			if (Var.flameanimation == 0) {
				g.drawImage(Var.iflame1, Var.x, Var.y + 58, 50, 50, null);
			} else if (Var.flameanimation == 1) {
				g.drawImage(Var.iflame2, Var.x, Var.y + 58, 50, 50, null);
			}

			if (Var.bolshot == true) {
				g.drawImage(Var.gifshot, Var.shotx, Var.shoty, 20, 40, null);
			}

			g.drawImage(Var.irocket, Var.x, Var.y, 50, 70, null);

			for (int i = 0; i <= 4; i++) {
				g.drawImage(Var.ienemy1, Var.enemyx[i], Var.enemyy[i], 80, 60, null);
			}

			if (Var.shieldnumber > 0 && Var.shieldnumber <= Var.ishield.length) {
				g.drawImage(Var.ishield[Var.shieldnumber - 1], Var.x - 10, Var.y - 10, 70, 90, null);
			} else if (Var.shieldnumber > Var.ishield.length) {

				g.drawImage(Var.ishield[Var.shieldnumbermax], Var.x - 10, Var.y - 10, 70, 90, null);

			}

			g.setColor(new Color(100, 100, 100, 128));
			g.fillRect(0, 0, Var.screenwidth, Var.screenheight);

			if (Var.lost) {
				g.setColor(new Color(0, 230, 115));
				g.setFont(new Font("Arial", Font.BOLD, 35));
				g.drawString("Schrott: " + Var.scrap, 310, 180);

				repaint();
			}
			if (Var.inShop) {

				g.setColor(new Color(0, 230, 115));
				g.setFont(new Font("Arial", Font.BOLD, 35));
				g.drawString("Schrott: " + Var.scrap, 310, 180);
				g.drawString("MAX Leben", 75, 340);
				g.drawString("Schüsse", 75, 415);
				g.drawString("Plasmashield", 75, 485);

				g.drawString(Var.up1price + "s", 310, 340);
				g.drawString(Var.up2price + "s", 310, 415);
				g.drawString(Var.up3price + "s", 310, 485);

				g.drawString("St. " + Var.up1number, 550, 340);
				g.drawString("St. " + Var.up2number, 550, 415);
				g.drawString("St. " + Var.up3number, 550, 485);

				g.drawString(Var.uphealthprice + "s", 700, 185);
				g.drawString("Leben +1", 525, 235);

				g.setColor(Color.BLACK);
				g.drawLine(50, 362, 750, 362);
				g.drawLine(50, 438, 750, 438);

				g.drawLine(300, 300, 300, 500);

				repaint();

			}

		}

	}

}
