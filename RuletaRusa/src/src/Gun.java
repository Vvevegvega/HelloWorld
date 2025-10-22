package src;

import java.util.Random;

import src.chambers.*;

public class Gun {
	private int numberOfChambers;
	private int actualChamber;
	private Chamber[] chambers;

	public Gun(int i) {
		this.actualChamber = 0;
		this.chambers = new Chamber[i];
		this.numberOfChambers = i;
	}

	public void load(int i) {
		int bullets = i;
		int position;
		Random random = new Random();
		
		do {
			position = random.nextInt(numberOfChambers);
			if(chambers[position] == null) {
				chambers[position]= new Bullet();
				bullets--;
			}
		}while(bullets>0);
		
		for(int j = 0; j < numberOfChambers ; j++) {
			if(chambers[j] == null) {
				chambers[j] = new Empty();
			}
		}
	}

	public void shoot() {
		chambers[actualChamber].shoot();
		actualChamber++;
	}

	public boolean hasChambersLeft() {
		return actualChamber < numberOfChambers;
	}

}
