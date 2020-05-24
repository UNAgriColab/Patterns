package templateMethod;


public class childrensScoringAlgorithm extends baseScoreAlgorithm {
    @Override
    public int CalculateBaseScore(int hits) {
        return hits * 200;
    }

    @Override
    public int  CalculateReduction(Period time) {
        return (time.getSecs()/2);
    }

    @Override
    public int CalculateOverallScore(int score , int reduction) {
        if(score>reduction){
            return score - reduction;
        }else{
            return 0;
        }

    }
}
