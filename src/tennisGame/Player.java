package tennisGame;

import java.util.Arrays;
import java.util.List;

public class Player {

	private String name;
	private Integer score;	
	
	public static final List<String> pointsDescription = Arrays.asList("0", "15", "30", "40");
	
	public Player(String name) {
		super();
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getScore() {
		return score;
	}
		
	public void setScore(Integer score) {
		this.score = score;
	}
	
	public void currentScore(Integer scored) {
        this.score = scored;
    }
	
	public String getScoreDescription(){
        return pointsDescription.get(score);
    }
	
}
