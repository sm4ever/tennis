package tennisGame;

import java.util.Iterator;

public class Game {

	private Player player1;
	private Player player2;

	GameSet gameSets;

	public Game(Player player1, Player player2) {
		super();
		this.player1 = player1;
		this.player2 = player2;
	}

	public String getScore() {
		String score = "";
		if (checkGameIsDeuce())
			score = "deuce";
		else if (checkGameIsAdvantage())
			score = "advantage";
		else
			score = player1.getScoreDescription() + "-" + player2.getScoreDescription();

		return score;
	}

	private boolean checkGameIsWon() {
		return (player1.getScore() > 3 && player2.getScore() > 3
				&& Math.abs(player1.getScore() - player2.getScore()) >= 2);
	}

	private boolean checkGameIsAdvantage() {
		return (player1.getScore() > 3 && player2.getScore() > 3 
				&& player1.getScore() != player2.getScore()
				);
	}

	private boolean checkGameIsDeuce() {
		return (player1.getScore() > 3 && player2.getScore() > 3 
				&& player1.getScore() == player2.getScore());

	}

	public GameSet getGameSets() {
		return gameSets;
	}

	public void setGameSets(GameSet gameSets) {
		this.gameSets = gameSets;
	}

	public String getMatchStatus() {
		if (checkGameIsWon()) {
			return getWinner() + " wins";
		} else {			
			return "in progress";
		}
	}

	public String getMatchScore() {
		Iterator<Integer> iterator = getGameSets().getGameScore().keySet().iterator();
		String score = "";
		while (iterator.hasNext()) {
			Integer key = iterator.next();
			String gameSet = getGameSets().getGameScore().get(key).toString();
			if (gameSet.equals("0"))
				score += "(0-0)";
			else
				score += "(" + gameSet.substring(0, 1) + "-" + gameSet.substring(1, 2) + ")";
		}
		return score;
	}

	public void printGameDetails() {
		System.out.println("**************************************");
		System.out.println("Score : " + getMatchScore());
		System.out.println(checkGameIsWon()? "" : "Current game status : " + getScore());
		System.out.println("Match Status : " + getMatchStatus());
		System.out.println("**************************************");
	}

	private String getWinner() {
		return (player1.getScore() > player2.getScore() ? player1.getName() : player2.getName());
	}

}
