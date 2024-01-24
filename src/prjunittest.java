package prjunittest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class pkgunit115Test {
    pkgunit115 test =new pkgunit115();

    @Test
    public void testconcate() {
        String result=test.concate("one", "two");
        assertEquals("onetwo",result);


    @Test
    public void testMultiply() {
        int result=test.multiply(5, 7);
        assertEquals(35,result);
    }




}