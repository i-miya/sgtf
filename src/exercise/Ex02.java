package exercise;
import java.io.*;
import java.util.*;

public class Ex02 {
	public static void main (String[] args) throws IOException{
		String str;
		List<String> list = new ArrayList<String>();
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
                
        while(true){
        	System.out.println("なんか入力してください.");
        	str = br.readLine();
        	list.add(str);
            for ( int i = 0; i < list.size(); ++i ) {
            	System.out.println( list.get( i ) );
            }
        }
    }
}
