package eu.kapibary.capybaramessengerbot.dao.model;

public class Question {

    private Integer questionId;
    private String question;

    public Question(Integer questionId, String question) {
        this.questionId = questionId;
        this.question = question;
    }

    public Integer getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }
}
