package earlyJavaObjects.chapter9;

public class FillInQuestion extends Question {

    public FillInQuestion(String str){
        String[] strings = new String[3];
        for (int i = 0; i< strings.length; i++){
            strings[i] = String.valueOf(str.split("_"));
        }

        this.setAnswer(strings[1]);
        this.setText(strings[0] + "_______");
    }
}
