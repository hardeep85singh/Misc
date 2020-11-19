package earlyJavaObjects.chapter9;

public class Question {
    private String text;
    private String answer;

    public Question(){
        text = "";
        answer = "";
    }
    public String addText(){
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setAnswer(String answer){
        this.answer = answer;
    }

    public boolean checkAnswer(String response){
        return response.equalsIgnoreCase(answer);
    }

    public void display(){
        System.out.println(text);
    }
}
