

import java.io.IOException;

import ca.pfv.spmf.algorithms.sequentialpatterns.BIDE_and_prefixspan.AlgoTSP_nonClosed;
import ca.pfv.spmf.input.sequence_database_list_integers.SequenceDatabase;


/**
 * Example of how to use the PrefixSpanWithSupportRising algorithm in source code.
 * @author Philippe Fournier-Viger
 */
public class MainTestTSP_nonClosed {

	public static void main(String [] arg) throws IOException{    
		// Load a sequence database
		String input = "input/formatted_sequence/successful.txt";
		long startTime = System.currentTimeMillis();
		SequenceDatabase sequenceDatabase = new SequenceDatabase(); 
		sequenceDatabase.loadFile(input);
		System.out.println(System.currentTimeMillis() - startTime + " ms (database load time)");
		// print the database to console
//		sequenceDatabase.print();
			
		AlgoTSP_nonClosed algo = new AlgoTSP_nonClosed(); 
		
        // if you set the following parameter to true, the sequence ids of the sequences where
        // each pattern appears will be shown in the result
        algo.setShowSequenceIdentifiers(false);
		
		int k = 2; // we use a k of 2 sequences.
		
		// execute the algorithm
		algo.runAlgorithm(sequenceDatabase, k);    
		algo.writeResultTofile("output/output_tsp.txt");
		algo.printStatistics(sequenceDatabase.size());
	}
}