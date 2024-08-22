package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentListTest {
    StudentList studentList;

    @BeforeEach
    void init() {
        studentList = new StudentList();
    }

    @Test
    void testAddNewStudent() {
        assertEquals(0, studentList.getStudents().size());
        studentList.addNewStudent("6610451109", "warit");
        assertEquals(1, studentList.getStudents().size());
    }


    @Test
    void testFindStudentById() {
        studentList.addNewStudent("6610451109", "warit");
        Student student = studentList.findStudentById("6610451109");
        assertEquals("warit", student.getName());
    }

    @Test
    void testGiveScoreToId() {
        studentList.addNewStudent("6610451109", "warit", 0.0);
        studentList.giveScoreToId("6610451109", 80.0);
        Student student = studentList.findStudentById("6610451109");
        assertEquals(80.0, student.getScore());
    }

    @Test
    void testViewGradeOfId() {
        studentList.addNewStudent("6610451109", "warit", 80.0);
        String grade = studentList.viewGradeOfId("6610451109");
        assertEquals("A", grade);
    }
}
