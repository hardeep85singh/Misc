package earlyJavaObjects.chapter9;

public class NumericQuestion extends Question {

    @Override
    public boolean checkAnswer(String response) {
        int answer = Integer.parseInt(response);
        if (answer >= answer + .01 && answer <= answer + .01){
            return true;
        } else{
            return false;
        }
    }
}
