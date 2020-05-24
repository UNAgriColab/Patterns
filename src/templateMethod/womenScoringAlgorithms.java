package templateMethod;

public class womenScoringAlgorithms extends baseScoreAlgorithm {

    @Override
    public int CalculateBaseScore(int hits) {
        return hits * 100;
    }

    @Override
    public int  CalculateReduction(Period time) {
        return (time.getSecs()/4);
    }

    @Override
    public int CalculateOverallScore(int score , int reduction) {
        return score - reduction;
    }
}