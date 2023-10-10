import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentRepoTest {
    @Test
    public void findById_whenStudentIsInListOfStudents_thenReturnStudent() {
        //GIVEN
        StudentRepo studentRepository = new StudentRepo();
        Student student = new Student("1", "Max", "Mustermann");
        studentRepository.save(student);

        //WHEN
        Student actual = studentRepository.findById("1");

        //THEN
        assertEquals(student, actual);
    }

    @Test
    public void findById_whenStudentIsNotInList_thenThrowStudentNotFoundException() {
        //GIVEN
        StudentRepo studentRepository = new StudentRepo();
        Student student = new Student("1", "Max", "Mustermann");
        studentRepository.save(student);
        //THEN
        assertThrows(StudentNotFoundException.class, () -> {
            Student actual = studentRepository.findById("2");
        });
    }


}