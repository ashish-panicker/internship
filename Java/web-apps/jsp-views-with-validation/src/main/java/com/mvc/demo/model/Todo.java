package com.mvc.demo.model;

import java.time.LocalDateTime;
import java.util.Objects;

import javax.validation.constraints.NotBlank;

public class Todo {

    @NotBlank(message = "What do you want to be reminded of?")
    private String description;

    @NotBlank
    private LocalDateTime creationDateTime;

    public Todo() {
    }

    public Todo(String description, LocalDateTime creationDateTime) {
        this.description = description;
        this.creationDateTime = creationDateTime;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getCreationDateTime() {
        return this.creationDateTime;
    }

    public void setCreationDateTime(LocalDateTime creationDateTime) {
        this.creationDateTime = creationDateTime;
    }

    public Todo description(String description) {
        setDescription(description);
        return this;
    }

    public Todo creationDateTime(LocalDateTime creationDateTime) {
        setCreationDateTime(creationDateTime);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Todo)) {
            return false;
        }
        Todo todo = (Todo) o;
        return Objects.equals(description, todo.description) && Objects.equals(creationDateTime, todo.creationDateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, creationDateTime);
    }

    @Override
    public String toString() {
        return "{" + " description='" + getDescription() + "'" + ", creationDateTime='" + getCreationDateTime() + "'"
                + "}";
    }

}
