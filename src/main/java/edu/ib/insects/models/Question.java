package edu.ib.insects.models;

import java.util.Objects;

public class Question {
    private int questionId;
    private String question;
    private String[] answers;


    public Question() {
    }

    @Override
    public String toString() {
        return "s";//<<todo
    }

    @Override
    public boolean equals(Object o) { //<todo
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(questionId, question, answers);
    }

}
