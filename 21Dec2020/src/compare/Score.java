package compare;

public class Score implements Comparable<Score>{
	private int score;
	private String name;
	
	public Score() {}

	public Score(int score, String name) {
		super();
		this.score = score;
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Score [score=" + score + ", name=" + name + "]\n";
	}
	
  @Override
  public int compareTo(Score s)
  {
	 int d=this.score-s.score;
	 return -d;
  }
}
