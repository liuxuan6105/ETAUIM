package ETAUIM;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URL;
/**
 * Example of how to use the ETAUIM algorithm 
 * Thanks to the SPMF for providing the datasets and the compared algorithms' codes.
 */
public class MainTestETAUIM {
	public static void main(String [] arg) throws IOException{		
		String input = fileToPath("retail.txt");
		String output = "D://output1.txt";
		// Applying the ETAUIM algorithm
		int k=500;
		AlgoETAUIM EHAUPM = new AlgoETAUIM();
		EHAUPM.runAlgorithm(input, output,k);
		EHAUPM.printStats();
	}
	public static String fileToPath(String filename) throws UnsupportedEncodingException{
		URL url = MainTestETAUIM.class.getResource(filename);
		return java.net.URLDecoder.decode(url.getPath(),"UTF-8");
	}
}