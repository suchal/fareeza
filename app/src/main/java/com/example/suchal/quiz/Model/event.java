package com.example.suchal.quiz.Model;

import java.util.Date;

/**
 * Created by Hashim Ali Khan on 1/4/2018.
 */

public class event {
    String title;
    String description;
    Date deadline;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }
}
