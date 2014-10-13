package exercise;
import java.io.*;

public class Ex01 {
	public static void main (String[] args) throws IOException{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("なんか入力してください.");
        String str = br.readLine();
        System.out.println(str);
    }
}
