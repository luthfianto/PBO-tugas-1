import java.util.LinkedList;

public class StudentLinkedList extends LinkedList<Student> implements StudentList {
    public StudentLinkedList(){
        super();
    }

    public StudentLinkedList(StudentLinkedList s){
        super(s);
    }
}
