public class Course {
    private String id, name, description;
    private int numberOfCredits;

    public Course(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public void setNumberOfCredits(int numberOfCredits) {
        this.numberOfCredits = numberOfCredits;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

//    public Section createSection(String semester, String place, String time){
//        return new Section(this, semester, place, time)
//    }
}
