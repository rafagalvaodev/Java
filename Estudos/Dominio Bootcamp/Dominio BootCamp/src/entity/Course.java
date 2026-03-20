package entity;

public class Course extends Content{
    private int courseLoad;

    public Course() {
    }

    public int getCourseLoad() {
        return courseLoad;
    }

    public void setCourseLoad(int courseLoad) {
        this.courseLoad = courseLoad;
    }

    @Override
    public double calculateXP(){
        return STANDARD_XP * courseLoad;
    }

    @Override
    public String toString() {
        return String.format("Curso: %s , %s , %d ", getTittle(), getDescription(), courseLoad);
    }
}
