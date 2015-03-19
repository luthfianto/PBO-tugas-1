public class Section {
    private String semester, place, daysAndTimes;
    private Course course;
    private Instructor instructor;

    public Section(String semester, String place, String daysAndTimes, Course course) {
        this.semester = semester;
        this.place = place;
        this.daysAndTimes = daysAndTimes;
        this.course = course;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    public String getSemester() {
        return semester;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getDaysAndTimes() {
        return daysAndTimes;
    }

    public void setDaysAndTimes(String daysAndTimes) {
        this.daysAndTimes = daysAndTimes;
    }

    public Course getCourse() {
        return course;
    }
}
/**
 x Tambahkan informasi bahwa sebuah Section diampu oleh seorang Instructor
 */
