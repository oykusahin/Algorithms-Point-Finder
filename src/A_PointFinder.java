import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.Scanner;


public class A_PointFinder {

	public static void main(String[] args) throws IOException {
		
		File file = new File(args[0]); 
		FileReader fr = new FileReader(file);
		LineNumberReader lnr = new LineNumberReader(fr);
		  int linenumber = 0;
            while (lnr.readLine() != null){
        	linenumber++; 
            }
       
            Scanner scanner = new Scanner(file);
            String[] cities = new String[linenumber]; 
            
            for(int i = 0;i<linenumber;i++) 
            {
            	String line = scanner.nextLine();
            	String[] lineElements = line.split(" ");
            	cities[Integer.parseInt(lineElements[0])] = lineElements[1];
            }
            scanner.close();
           
		
        A_Point ap = new A_Point(graph);
               for (int v = 0; v < graph.V(); v++) 
            if (ap.isArticulation(v)) System.out.println(cities[v]);

	}
}
