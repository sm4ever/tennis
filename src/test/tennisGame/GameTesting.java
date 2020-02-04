package test.tennisGame;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import tennisGame.Game;
import tennisGame.GameSet;
import tennisGame.Player;

class GameTesting {

	Game game;
	Player player1;
	Player player2;
		
	@BeforeEach 
	public void beforeGame() {
		player1 = new Player("Player1");
		player2 = new Player("Player2");		
		
		game = new Game(player1,player2);
		game.setGameSets(new GameSet());
	}
	
	@Test
	public void testExample1() {		
		player1.setScore(1);
		player2.setScore(2);
		
		game.getGameSets().getGameScore().put(1, 61);
		game.getGameSets().getGameScore().put(2, 75);
		game.getGameSets().getGameScore().put(3, 10);		
		
		game.printGameDetails();
		//System.out.println("Score : " + game.getMatchScore());
		Assert.assertTrue(game.getScore().equals("15-30"));
		Assert.assertTrue(game.getMatchStatus().equals("in progress"));
	}
	
	@Test
	public void testExample2() {
		player1.setScore(4);
		player2.setScore(4);
		
		game.getGameSets().getGameScore().put(1, 61);
		game.getGameSets().getGameScore().put(2, 75);
		game.getGameSets().getGameScore().put(3, 00);
		
		game.printGameDetails();
		Assert.assertTrue(game.getScore().equals("deuce"));
		Assert.assertTrue(game.getMatchStatus().equals("in progress"));
	}
	
	
	@Test
	public void testExample3() {
		player1.setScore(4);
		player2.setScore(5);
		
		game.getGameSets().getGameScore().put(1, 61);
		game.getGameSets().getGameScore().put(2, 75);
		game.getGameSets().getGameScore().put(3, 10);
		
		game.printGameDetails();
		Assert.assertTrue(game.getScore().equals("advantage"));
		Assert.assertTrue(game.getMatchStatus().equals("in progress"));
	}
	
	@Test
	public void testExample4() {
		player1.setScore(6);
		player2.setScore(4);

		game.getGameSets().getGameScore().put(1, 61);
		game.getGameSets().getGameScore().put(2, 75);
		game.getGameSets().getGameScore().put(3, 60);
		
		game.printGameDetails();		
		Assert.assertTrue(game.getMatchStatus().equals("Player1 wins"));
	}
	
	@Test
	public void testExample5() {
		player1.setScore(4);
		player2.setScore(6);
		
		game.getGameSets().getGameScore().put(1, 61);
		game.getGameSets().getGameScore().put(2, 75);
		game.getGameSets().getGameScore().put(3, 26);
		game.getGameSets().getGameScore().put(3, 67);
		game.getGameSets().getGameScore().put(3, 46);
		
		game.printGameDetails();
		
		
		Assert.assertTrue(game.getMatchStatus().equals("Player2 wins"));
	}

}
