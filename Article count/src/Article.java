import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Article extends Thread{
	private String line;
	private Integer count = 0;
	
	
	Article() {
	 }
	 Article(String line) {
		 this.line = line;
	 }
	
	
	public String getLine() {
		return line;
	}



	public void setLine(String line) {
		this.line = line;
	}



	public Integer getCount() {
		return count;
	}



	public void setCount(Integer count) {
		this.count = count;
	}



	public void run() {
		Matcher m = Pattern.compile("(?i)\\b((a)|(an)|(the))\\b").matcher(this.line);
		while(m.find()) {
			
			this.count++;
		}
	}
	
}
