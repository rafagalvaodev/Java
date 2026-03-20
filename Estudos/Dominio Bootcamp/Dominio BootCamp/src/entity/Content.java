package entity;

public class Content {
    protected static final double STANDARD_XP = 10d;

    private String tittle;
    private String description;

    public double calculateXP() {
        return 0;
    }


    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
