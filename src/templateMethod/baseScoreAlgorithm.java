package templateMethod;


public abstract class baseScoreAlgorithm {

    public int GenerateScore(int hits, Period time)
    {
        int score = CalculateBaseScore(hits);
        int reduction = CalculateReduction(time);
        return CalculateOverallScore(score, reduction);
    }

    public  int CalculateBaseScore(int hits){
        return 0;
    }

    public  int CalculateReduction(Period time){
        return 0;
    }

    public  int CalculateOverallScore(int score, int reduction){
        return 0;
    }
}
