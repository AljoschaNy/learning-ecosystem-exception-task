import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentRepoTest {
    @Test
    public void findById_whenStudentIsInListOfStudents_ThenReturnStudent() {
        // given
        StudentRepo studentRepository = new StudentRepo();
        Student student = new Student("1", "Max", "Mustermann");
        studentRepository.save(student);

        // when
        Student actual = studentRepository.findById("1");

        // then
        assertEquals(student, actual);
    }

}