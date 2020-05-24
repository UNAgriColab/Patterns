package templateMethod;

public class Main {

    public static void main(String[] args) {
	System.out.println("templateMethod lab");

	baseScoreAlgorithm algorithm;

	System.out.print("Man ");
	algorithm = new menScoringAlgorithms();
	System.out.println(algorithm.GenerateScore(8,
            new Period(0, 1, 31 )));

	System.out.print("Woman ");
	algorithm = new womenScoringAlgorithms();
	System.out.println(algorithm.GenerateScore(9,
            new Period(0, 1, 49)));

	System.out.print("Child ");
	algorithm = new childrensScoringAlgorithm();
	System.out.println(algorithm.GenerateScore(5,
            new Period(0, 3, 2)));
    }
}
