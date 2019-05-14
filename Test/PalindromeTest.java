import org.junit.*;

import static org.junit.Assert.*;

public class PalindromeTest {


    Palindrome pali;
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
        pali=new Palindrome();

        System.out.println("Inside Before");

    }

    @After
    public void tearDown()
    {
        //arrange
        pali=null;

        System.out.println("Inside After");

    }

    @Test
    public void isPalindrome()
    {


        //act
        String result=pali.checkPalindrome(112211);

        //assert
        assertEquals("palindrome",result);
    }


    @Test
    public void isNotPalindrome()
    {


        //act
        String result=pali.checkPalindrome(1995);

        //assert
        assertEquals("not a palindrome",result);
    }



}