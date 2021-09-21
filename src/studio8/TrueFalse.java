package studio8;

public class TrueFalse extends Question {
    private boolean correctAnswer;
    private boolean userAnswer;

    public TrueFalse(int pointValue, String text, boolean correctAnswer){
        super (pointValue, text);
        this.correctAnswer = correctAnswer;
        setPointValue(pointValue);
    }

    @Override
    public  void displayAnswers () {
        System.out.println();
    }

    @Override
    public  int getAnswers() {

    }
}
