package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

//Write unit tests to find the errors in BalancedBrackets.
//
//The tests you write should guide how you revise the sourcecode.
// Use TDD to first write tests that will work for the desired behavior of BalancedBrackets.
// When your tests fail, correct the class to pass your tests.
//
//The content of your tests is up to you, but you should write at least 12 tests.
public class BalancedBracketsTest {

    //TODO: add tests here
    /*@Test
    public void emptyTest() {
        //assertEquals(true, true);
    }
    */
    //1.Assert that brackets are in the correct order, "[]", return true.
    @Test
    public void onlyBracketsReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }
    //BalancedBrackets is essentially a wrapper class for a method. And because it’s only method is static,
    // we don’t need to create an instance to test hasBalancedBrackets().

    // 2. Assert that the brackets are not present , (empty), return true.
    @Test
    public void noBracketsReturnTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    // 3. "[][]" ,return true
    @Test
    public void doubleSquareBracketsReturnTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[][]"));
    }

    // 4. "[[][]]",return true.
    @Test
    public void doubleSquareEnclosedWithSquareBracketsReturnTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[][]]"));
    }

    // 5. "[", return false.
    @Test
    public void singleOpeningBracketReturnFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }
    // 6. "]"  ,return false.
    @Test
    public void singleClosingBracketReturnFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }
    // 7. "][" ,return false.
    @Test
    public void misplacedBracketsReturnFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    // 8. "][][" , return false.
    @Test
    public void misplacedDoubleBracketsReturnFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("][]["));
    }

    // 9. "[]][[]" ,return false.
    @Test
    public void misplacedSquareBracketsReturnFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[]][[]"));
    }

    // 10. "[][[]]",return false.
    @Test
    public void misplacedOneOfTheInnerBracketsReturnFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[][[]]"));
    }

    // 11. "[]][" ,return false.
    @Test
    public void misplacedOneOfTheSquareBracketsReturnFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[]]["));
    }

    // 12. "[[[]" ,return false.
    @Test
    public void notSquareBracketsReturnTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[]]"));
    }
}
