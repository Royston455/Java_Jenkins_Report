import org.example.Main;
import org.junit.Test;

public class HelloWorldTest
{
    @Test
    public void test1 () {

        System.out.println ("Hello worldo!");
        System.out.println("Yes");git
    }

@Test
    public void test2 () throws Exception {

    System.out.println ("Hello worldo!");
    System.out.println("Yes");
    throw new Exception("unable to print");
    }
}
