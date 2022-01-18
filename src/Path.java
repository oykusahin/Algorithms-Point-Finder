import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Path {

	public static void main(String[] args) throws IOException {
		
		File f = new File(args[0]); 
		FileReader fr = new FileReader(f);
		
		LineNumberReader lnr = new LineNumberReader(fr);
		 
		int linenumber = 0;
            while (lnr.readLine() != null){
        	linenumber++; 
            }
            
            Graph graph = new Graph(linenumber); 
            Scanner scanner = new Scanner(file);
            String[] cities = new String[linenumber]; 
                
                       
            int from = gIDo(cities,args[1]);    
            int to = gIDof(cities,args[2]); 
                                                        
            BfsPths b = new BfsPths(graph,from);
            Stack<Integer> stack = (Stack<Integer>) b.pathTo(to); 
             
            while (!stack.isEmpty()) 
            {
            	System.out.println(cities[stack.pop()]);
            }
            
	}
}
