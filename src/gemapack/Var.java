package gemapack;


import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;

public class Var {

	static JFrame jf1;
	static int screenwidth = 800, screenheight = 600;
	static int backgroundY1 = 0, backgroundY2 = -600, backgroundspeed = 9;
	static int x = 400, y = 400;
	static int speedup = 2, speeddown = 2, speedleft = 2, speedright = 2;
	static int flameanimation;
	static int scrap = 0, health = 3, maxhealth = 3;
	static int up1price = 0, up2price = 100, up3price = 200, uphealthprice = 50;
	static int up1number = 0, up2number = 0, up3number = 0;
	static int shieldnumber = 0, shieldnumbermax = 3;
	static int ammo = 55, maxammo = 99;

	static JButton btnresume, btnshop, btnexit;
	static JButton btnupgrade1, btnupgrade2, btnupgrade3, btnhealth;
	static Label lbl1;

	static int enemyx[] = new int[5], enemyy[] = new int[5];
	static int enemyspeed[] = new int[5];
	static int scrapx1[] = new int[5], scrapy1[] = new int[5];
	static int scrapx2[] = new int[5], scrapy2[] = new int[5];
	static int scrapx3, scrapy3;
	static int scrapspeed1[] = new int[5], scrapspeed2[] = new int[2], scrapspeed3;
	static int shotx, shoty;
	static int posenemyx, posenemyy;

	static int tracklength;

	static boolean moveup = false, movedown = false, moveleft = false, moveright = false;
	static boolean collided = false, lost = false;
	static boolean inGame = true, inMenu = false, inShop = false;
	static boolean bolshot = false;
	static boolean shotcollision = false;

	static BufferedImage ib1, ib2;
	static BufferedImage irocket, irocketleft, irocketright;
	static BufferedImage iflame1, iflame2;
	static BufferedImage ienemy1;
	static BufferedImage iscrap1, iscrap2, iscrap3;
	static BufferedImage ihealth;
	static BufferedImage ishield[] = new BufferedImage[4];
	static BufferedImage iammo;

	static Image gifexplosion;
	static Image gifshot;
	static Image gifenemy;

	public Var() {

		try {
			// Background
			ib1 = ImageIO.read(new File("rsc/b1.png"));
			ib2 = ImageIO.read(new File("rsc/b1.png"));
			// Rocket
			irocket = ImageIO.read(new File("rsc/rocket.png"));
			irocketleft = ImageIO.read(new File("rsc/rocket_left.png"));
			irocketright = ImageIO.read(new File("rsc/rocket_right.png"));
			// Flame
			iflame1 = ImageIO.read(new File("rsc/flame1.1.png"));
			iflame2 = ImageIO.read(new File("rsc/flame1.2.png"));
			// Enemy
			ienemy1 = ImageIO.read(new File("rsc/enemy1.png"));
			gifenemy = Toolkit.getDefaultToolkit().createImage("rsc/enemy.gif");
			// Bronze
			iscrap1 = ImageIO.read(new File("rsc/scrap1.png"));
			// Silver
			iscrap2 = ImageIO.read(new File("rsc/scrap2.png"));
			// Gold
			iscrap3 = ImageIO.read(new File("rsc/scrap3.png"));
			// Explosion
			gifexplosion = Toolkit.getDefaultToolkit().createImage("rsc/explosion.gif");
			// Health
			ihealth = ImageIO.read(new File("rsc/health.png"));
			// Shield
			for (int i = 0; i < ishield.length; i++) {
				ishield[i] = ImageIO.read(new File("rsc/shield" + (i + 1) + ".png"));
			}
			// Shots
			gifshot = Toolkit.getDefaultToolkit().createImage("rsc/shot.gif");
			// Ammo
			iammo = ImageIO.read(new File("rsc/ammo.png"));

		} catch (IOException e) {

			e.printStackTrace();
			System.out.println("Bilder konnten nicht geladen werden");
		}

		enemyspeed[0] = 3;
		enemyspeed[1] = 4;
		enemyspeed[2] = 3;
		enemyspeed[3] = 4;
		enemyspeed[4] = 3;

		scrapspeed1[0] = 2;
		scrapspeed1[1] = 3;
		scrapspeed1[2] = 2;
		scrapspeed1[3] = 4;
		scrapspeed1[4] = 3;

		scrapspeed2[0] = 4;
		scrapspeed2[1] = 5;

		scrapspeed3 = 6;

		Music.music("audio/track1.wav");

	}

}
