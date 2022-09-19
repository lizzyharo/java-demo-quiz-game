package com.kenzie.app.CluesGame;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CluesDTO {

    @JsonProperty("clues")
    private List<Clues> clues;
    @JsonProperty("game")
    private Game game;
    @JsonProperty("category")
    private Category category;

    @JsonProperty("question")
    private String question;
    @JsonProperty("answer")
    private String answer;
    @JsonProperty("id")
    private int id;


    public List<Clues> getClues() {
        return clues;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public Category getCategory() {
        return category;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


}
