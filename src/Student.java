public class Student {
    private String name;
    private String address;
    private double gpa;

    private Instructor academicAdvisor, thesisAdvisor;

    public Student(String newStudentName){}

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAcademicAdvisor(Instructor academicAdvisor) {
        this.academicAdvisor = academicAdvisor;
        academicAdvisor.academicStudents.add(this);
    }

    public Instructor getThesisAdvisor() {
        return thesisAdvisor;
    }

    public void setThesisAdvisor(Instructor thesisAdvisor) {
        this.thesisAdvisor = thesisAdvisor;
        thesisAdvisor.thesisStudents.add(this);
    }

    public String getName() {
        return name;
    }

    public double getGpa(){return gpa;}

    public Instructor getAcademicAdvisor(){
        return academicAdvisor;
    };

    public void addCourse(Course newCourse){};
    public void computeGPA(Course course, char newGrade){}
}

/**
 x Tambahkan informasi bahwa seorang Student diampu oleh seorang academicAdvisor (Instructor) dan thesisAdvisor (Instructor)
 */