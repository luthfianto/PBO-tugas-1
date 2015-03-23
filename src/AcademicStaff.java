public class AcademicStaff {
    void assignAcademicStudent(Instructor instructor, Student student) {
        instructor.academicStudents.add(student);
        student.setAcademicAdvisor(instructor);
    }

    void assignThesisStudent(Instructor instructor, Student student) {
        instructor.thesisStudents.add(student);
        student.setThesisAdvisor(instructor);
    }
}

/*
Tambahkan kemampuan AcademicStaff untuk assignAcademicStudent dam assignThesisStudent ke seorang Instructor
*/
