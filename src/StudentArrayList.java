import java.util.ArrayList;

public class StudentArrayList extends ArrayList implements StudentList {
    public StudentArrayList(){
        super();
    }

    public StudentArrayList(StudentArrayList s){
        super(s);
    }
}
