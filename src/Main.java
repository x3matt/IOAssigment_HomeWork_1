import java.io.BufferedReader;
import java.io.FileReader;

public class Main {

	public static void main(String[] args) throws Exception {
		System.out.println(sumDigitsFromFile("Digits.txt"));
	}
	public static Integer sumDigitsFromFile(String fileName) 

throws Exception {
		BufferedReader dr = new BufferedReader(new FileReader(fileName)); 
		return dr.lines().map(Integer::valueOf).reduce(0, (a,b) -> a+b);
	}
}
