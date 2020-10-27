package practice.headfirstjava;

public class QuizCard {

    private String question;
    private String answer;

    public QuizCard(String question, String answer){
        question = this.question;
        answer = this.answer;
    }

    public String getQuestion(){
        return this.question;
    }

    public String getAnswer(){
        return this.answer;
    }
}
