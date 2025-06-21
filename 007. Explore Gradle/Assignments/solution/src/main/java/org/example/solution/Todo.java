package org.example.solution;

public class Todo {

    public int userId;
    public int id;
    public String title;
    public boolean completed;

    @Override
    public String toString() {
        return "Todo{" +
                "userId=" + userId +
                ", id=" + id +
                ", title='" + title + '\'' +
                ", completed=" + completed +
                '}';
    }
}

