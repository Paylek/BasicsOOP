package task4.main;

import task4.bean.Cave;
import task4.view.ConsolMenu;

public class Main {

	public static Cave dragon = new Cave("Dragon");

	public static void main(String[] args) {
		ConsolMenu consoleMenu = new ConsolMenu();
		dragon.setNumberOfTreasure(100);
		consoleMenu.startConsoleMenu();
	}
}
