package zeldaminiclone;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Spritesheet {

	public static BufferedImage spritesheet;
	
	public static BufferedImage[] player_front;
	
	public static BufferedImage tileWall;
	
	public static BufferedImage[] enemy_front;
	
	public Spritesheet() {
		try {
			spritesheet = ImageIO.read(getClass().getResource("/spritesheet.png"));
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		player_front = new BufferedImage[2];
		enemy_front = new BufferedImage[2];
		
		player_front[0]=Spritesheet.getSprite(0,11,16,16);
		player_front[1]=Spritesheet.getSprite(16, 11, 16, 16);
		
		enemy_front[0]=Spritesheet.getSprite(284, 241, 16, 16);
		enemy_front[1]=Spritesheet.getSprite(304, 241, 16, 16);
		
		tileWall = Spritesheet.getSprite(256, 241, 16, 16);
	}
	
	public static BufferedImage getSprite(int x, int y, int width, int height) {
		return spritesheet.getSubimage(x, y, width, height);
	}
	
}
