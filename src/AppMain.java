public class AppMain {
	public static void main(String[] args) throws Exception {
		//Model model = new Model();
		//model.evaluateModelBy3Folds();
		//model.provideFrequencyDistributionOfSequence();
		//System.out.println("\nFinished execution.");
		UtilityClass.preprocessMITranscripts("data/input", "data/output/");
	}
}
