import org.junit.Assert;
import org.junit.Test;

public class RomanToDecimalTest {


    private void testRomanNumberToDecimal(String romanNumber, int expected) {
        int result = RomanToDecimal.convert(romanNumber);

        Assert.assertEquals(expected, result);
    }

    @Test
    public void test01_GivenIShouldReturn1(){
        testRomanNumberToDecimal("I", 1);
    }

    @Test
    public void test02_GivenIIShouldReturn2(){
        testRomanNumberToDecimal("II", 2);
    }

    @Test
    public void test03_GivenIIIShouldReturn3(){
        testRomanNumberToDecimal("III", 3);
    }

    @Test
    public void test04_GivenIVShouldReturn4(){
        testRomanNumberToDecimal("IV", 4);
    }

    @Test
    public void test05_GivenVShouldReturn5(){
        testRomanNumberToDecimal("V", 5);
    }

    @Test
    public void test06_GivenVIShouldReturn6(){
        testRomanNumberToDecimal("VI", 6);
    }

    @Test
    public void test07_GivenVIIShouldReturn7(){
        testRomanNumberToDecimal("VII", 7);
    }

    @Test
    public void test08_GivenVIIIShouldReturn8(){
        testRomanNumberToDecimal("VIII", 8);
    }

    @Test
    public void test09_GivenIXShouldReturn9(){
        testRomanNumberToDecimal("IX", 9);
    }

    @Test
    public void test10_GivenXShouldReturn10(){
        testRomanNumberToDecimal("X", 10);
    }

    @Test
    public void test11_GivenXIShouldReturn11(){
        testRomanNumberToDecimal("XI", 11);
    }

    @Test
    public void test12_GivenXVIIIShouldReturn18(){
        testRomanNumberToDecimal("XVIII",18);
    }

    @Test
    public void test13_GivenXIXShouldReturn19(){
        testRomanNumberToDecimal("XIX",19);
    }

    @Test
    public void test14_GivenEmptyStringShouldReturn0(){
        testRomanNumberToDecimal("",0);
    }

    @Test
    public void test15_GivenLShouldReturn50(){
        testRomanNumberToDecimal("L",50);
    }

    @Test
    public void test16_GivenXLIXShouldReturn49(){
        testRomanNumberToDecimal("XLIX",49);
    }
}
