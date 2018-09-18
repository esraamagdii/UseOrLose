package Entities;

public class TFTemplate extends Template {
     
    public TFTemplate() {
        
    }

    public TFTemplate(String Question, String correctAnswer) {
        this.Question = Question;
        this.correctAnswer = correctAnswer;
    }

    @Override
    public String toString() {
        String Str = this.getQuestion() + "\n" + this.getCorrectAnswer()+ "\n";
        return Str;
    }

    public String getQuestion() {
        return Question;
    }

    public void setQuestion(String Question) {
        this.Question = Question;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }
}
