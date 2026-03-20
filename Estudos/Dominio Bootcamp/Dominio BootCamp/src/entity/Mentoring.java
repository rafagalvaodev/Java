package entity;

import java.time.LocalDate;

public class Mentoring extends Content{
    private LocalDate date;

    public Mentoring() {
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return String.format("Mentoria: %s , %s , %s ", getTittle(), getDescription(), date);
    }
}
