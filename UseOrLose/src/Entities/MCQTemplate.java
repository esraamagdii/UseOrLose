package Entities;

public class MCQTemplate extends Template {

    private String [] Answers ;


    public MCQTemplate(String Question , String firstAnswer , String secondAnwer ,
            String thirdAnswer , String fourtAnswer , String correctAnswer) {
        this.Question = Question ;
        Answers = new String[4];
        Answers[0] = firstAnswer ;
        Answers[1] = secondAnwer ;
        Answers[2] = thirdAnswer ;
        Answers[3] = fourtAnswer ;
        this.correctAnswer = correctAnswer ;
    }

    public MCQTemplate() {
        
    }

    @Override
    public String toString() {
        String Str = this.getQuestion() + "\n" + this.getCorrectAnswer() ;
        for(String Answer : Answers) {
            Str += "," + Answer ;
        }
        Str += "\n" ;
        return Str ;
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
    
    public String[] getAnswers() {
        return Answers;
    }

    public void setAnswers(String[] Answers) {
        this.Answers = Answers;
    }
    
    
    
}
