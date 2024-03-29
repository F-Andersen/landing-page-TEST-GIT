
import java.util.LinkedList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import sumdu.edu.ua.studentweb.CustomExceptions.EmailException;
import sumdu.edu.ua.studentweb.Support.Student;
import sumdu.edu.ua.studentweb.Support.Utils;


/**
 *
 * @author Vladyslav
 */
public class StatsCalculatorTest {    
    static LinkedList<Student> studs;
    
    @BeforeAll
    public static void setupData(){
        studs=new LinkedList<>();
        studs.add(new Student("Test1","Test1","20","test1@test.ua","test","test"));
        studs.add(new Student("Test2","Test2","23","test2@test.ua","test","test"));
        studs.add(new Student("Test3","Test3","20","test3@test.ua","test","test"));
        studs.add(new Student("Test4","Test4","22","test1@test.ua","test","test"));
        studs.add(new Student("Test5","Test5","21","test2@test.ua","test","test"));
        studs.add(new Student("Test6","Test6","20","test3@test.ua","test","test"));
    }
    @Test
    public void getEmailDomainTest(){
    String result=Utils.getEmailDomain("test@gmail.com");
    assertEquals(result,"gmail.com");
    }
    @Test
    public void whenExceptionThrown_thenExpectationSatisfied1() throws EmailException {
    studs.add(new Student("Exception","Exception","-1","email","test","test"));
    	Assertions.assertThrows(EmailException.class, () -> {
		Utils.calculatePopularDomain(studs);
	});
    studs.remove(6);
    }
    @Test
    public void whenExceptionThrown_thenExpectationSatisfied2() throws EmailException {
    studs.add(new Student("Exception","Exception","21","","test","test"));
    	Assertions.assertThrows(EmailException.class, () -> {
		Utils.calculatePopularDomain(studs);
	});
    studs.remove(6);
    }
    @Test
    public void whenExceptionThrown_thenExpectationSatisfied3() throws EmailException {
    studs.add(new Student("Exception","Exception","0","email","test","test"));
    	Assertions.assertThrows(EmailException.class, () -> {
		Utils.calculatePopularDomain(studs);
	});
    studs.remove(6);
    }
    @Test
    public void patternMatchesTest() {
    String emailAddress = "username@domain.com";
    assertTrue(Utils.patternMatches(emailAddress));
    }
    @Test
    public void calculatePopularDomainTest() throws EmailException{
    String result=Utils.calculatePopularDomain(studs);
    assertEquals("test.ua",result);
    }
    @Test
    public void calculateMeanAgeTest(){
    double result=Utils.calculateMeanAge(studs);
    assertEquals(21,result);
    }
}