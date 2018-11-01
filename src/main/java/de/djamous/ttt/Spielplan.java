package de.djamous.ttt;

import org.springframework.stereotype.Component;

@Component
public class Spielplan {
	private char[][] brett;

	public Spielplan() {
		if (this.brett == null) {
			this.initializeBrett();
		}
	}

	public char[][] getBrett() {
		return brett;
	}

	public void initializeBrett() {
		brett = new char[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				brett[i][j] = '-';
			}
		}
	}

	public char[][] setFeld(int x, int y, char spieler) {
		if (this.brett[x][y] == '-') {
			this.brett[x][y] = spieler;
		}
		return this.brett;
	}

	public char checkWinner(char[][] brett) {
		return 0;
	}

}
