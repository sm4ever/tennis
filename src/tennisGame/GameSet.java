package tennisGame;

import java.util.LinkedHashMap;
import java.util.Map;

public class GameSet {
	
		
	private Map<Integer,Integer> gameScore = new LinkedHashMap<Integer, Integer>();
	
	
	
	public GameSet() {
	
	}

	public GameSet(Map<Integer, Integer> gameScore) {
		super();
		this.gameScore = gameScore;
	}

	public Map<Integer, Integer> getGameScore() {
		return gameScore;
	}

	public void setGameScore(Map<Integer, Integer> gameScore) {
		this.gameScore = gameScore;
	}
	
	
}
