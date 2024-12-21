import org.example.Main;
import org.junit.Test;

public class HelloWorldTest
{
@Test
    public void test () throws Exception {

    System.out.println ("Hello worldo!");
    System.out.println("Yes");
    throw new Exception("unable to print");
    }
}
