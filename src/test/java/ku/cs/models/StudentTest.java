package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    Student s1;

    @BeforeEach //เพื่อแยกของใครของมัน
    void init() {
        s1 = new Student("6610451109","ohm",50);
    }

    @Test
    void testAddScore(){
        s1.addScore(10.5);
        assertEquals(60.5, s1.getScore());
        s1.addScore(50);
        assertEquals(110.5, s1.getScore());
    }

    @Test
    void testCalculateGrade() {
        s1.addScore(20);
        assertEquals("B", s1.grade());
    }

    @Test
    void testChangeName() {
        s1.changeName("warit");
        assertEquals("warit", s1.getName());
    }

    @Test
    void testIsId() {
        boolean test = s1.isId("6610451109");
        boolean correct = true;
        assertEquals(test,correct);
    }
}