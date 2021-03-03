package com.pi4.mgmtgame.resources;

public class CarrotSeeds extends Grain {
	int growingTime = 1;
	static int price = basePrice;
	@Override
	public Plant getGrownPlant() {
		return new Carrots();
	}
	
	@Override
	public int getGrowingTime() {
		return growingTime;
	}
	public void addPrice(int p) {
		price += p;
	}

	public void subPrice(int p) {
		price -= p;
	}
	public int getPrice() {
		return price;
	}
}