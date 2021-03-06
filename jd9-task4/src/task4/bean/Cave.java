package task4.bean;

import java.util.List;

import task4.logic.TreasureLogic;

public class Cave {

	private String name;
	private int numberOfTreasure;
	private List<Treasure> treasures;
	private TreasureLogic treasureAction;

	public Cave(String name) {
		this.name = name;
		this.numberOfTreasure = 0;
		treasureAction = new TreasureLogic();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumberOfTreasure() {
		return numberOfTreasure;
	}

	public void setNumberOfTreasure(int numberOfTreasure) {
		this.numberOfTreasure = numberOfTreasure;
		this.treasures = treasureAction.fillCaveWithTreasures(numberOfTreasure);
	}

	public List<Treasure> getTreasures() {
		return treasures;
	}

}