import java.util.ArrayList;

public class Instructor {
    StudentList academicStudents, thesisStudents;

    public Instructor(){
        academicStudents=new StudentArrayList();
        thesisStudents=new StudentArrayList();
    }

    public StudentList getStudents(){
        StudentArrayList studentList = (StudentArrayList) new ArrayList<Student>(academicStudents);
        studentList.addAll(thesisStudents);
        return studentList;
    }
}

/*
Instructor memiliki informasi semua Student yang ia bimbing, baik academicStudent maupun thesisStudent
*/