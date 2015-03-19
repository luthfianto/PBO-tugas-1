import java.util.ArrayList;

public class Instructor {
    StudentArrayList academicStudents, thesisStudents;

    public Instructor(){
        academicStudents=new StudentArrayList();
        thesisStudents=new StudentArrayList();
    }

    public StudentList getStudents(){
        StudentArrayList studentList = new StudentArrayList(academicStudents);
        studentList.addAll(thesisStudents);
        return studentList;
    }
}

/*
Instructor memiliki informasi semua Student yang ia bimbing, baik academicStudent maupun thesisStudent
*/