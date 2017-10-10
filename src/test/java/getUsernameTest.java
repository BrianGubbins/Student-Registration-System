/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;
import static org.junit.Assert.*;
import org.joda.time.LocalDate;
import io.github.briangubbins.StudentRegistrationSystem.Student;
/**
 *
 * @author brian
 */
public class getUsernameTest {
    @Test
    public void studentUsernameTest() {
        	LocalDate dob = new LocalDate(1996, 9, 8);
		Student student = new Student("Brian Gubbins", 21, dob, 14435492);
		assertEquals("Brian Gubbins21", student.getUsername());
    }

}
