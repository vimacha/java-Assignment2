import org.junit.*;

import static org.junit.Assert.*;

public class PowerTest {
    Power power;
    @BeforeClass
    public static void setUpBeforeClass()
    {


        System.out.println("Inside BeforeClass");

    }

    @AfterClass
    public static void tearDownAfterClass()
    {


        System.out.println("Inside AfterClass");

    }

    @Before
    public void setUp()
    {
        //arrange
        power=new Power();

        System.out.println("Inside Before");

    }

    @After
    public void tearDown()
    {
        //arrange
        power=null;

        System.out.println("Inside After");

    }

    @Test
    public void isEven()
    {


        //act
        boolean result=power.isPower(256);

        //assert
        assertEquals(true,result);
    }


    @Test
    public void isOdd()
    {


        //act
        boolean result=power.isPower(155);

        //assert
        assertEquals(false,result);
    }

}
