/**
 * Created by rilut on 20/03/2015.
 */
public class Main {
    public static void main(String[] args) {
        Course pbo = new Course("pbo","pbo");
        Student rilut = new Student("rilut");

        //1
        Instructor pak_arif = new Instructor();
        Section section = new Section("1","milan","rabu", pbo);
        section.setInstructor(pak_arif);

        //2
        Instructor pak_janoe = new Instructor();
        rilut.setAcademicAdvisor(pak_janoe);

        //3
        pak_janoe.getStudents();

        //4
        Student mufti = new Student("mufti");
        AcademicStaff akademik = new AcademicStaff();

        akademik.assignAcademicStudent(pak_janoe, mufti);
        akademik.assignThesisStudent(pak_janoe, mufti);
    }
}
/*
Tambahkan informasi bahwa sebuah Section diampu oleh seorang Instructor
Tambahkan informasi bahwa seorang Student diampu oleh seorang academicAdvisor (Instructor) dan thesisAdvisor (Instructor)
Tambahkan informasi bahwa seorang Instructor memiliki informasi semua Student yang ia bimbing, baik academicStudent maupun thesisStudent
Tambahkan kemampuan AcademicStaff untuk assignAcademicStudent dam assignThesisStudent ke seorang Instructor

*/