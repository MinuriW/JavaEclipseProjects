import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of lines");
		int num = sc.nextInt();
		sc.nextLine();
		
		String[] lineList = new String[num];
		
		for (int i = 0; i < num ; i++) {
			
			System.out.println("Enter line " + (i+1) );
			String inputLine = sc.nextLine();
			
			lineList[i] = inputLine;
		}
		
		List<Article> articleList = new ArrayList<Article>();
		
		
		for (int i = 0; i < num ; i++) {
			Article article = new Article(lineList[i]);
			articleList.add(article);
			article.start();
		}
		
		try {
			Thread.sleep(3000);
		}catch(InterruptedException ex){
			
		}
		
		int totalCount = 0;
		for(Article article:articleList) {
			totalCount += article.getCount();
		}	
		
		System.out.println("There are "+totalCount+ " articles in the given input");
		
		
	}
}
