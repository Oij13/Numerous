package edu.bsu.cs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ConverterTest {

    @Test
    public void convert1toITest(){
        Assertions.assertEquals("I", Converter.convert(1));
    }
    @Test
    public void convert3toIIITest(){
        Assertions.assertEquals("III", Converter.convert(3));
    }
    @Test
    public void convert5toVTest(){
        Assertions.assertEquals("V", Converter.convert(5));
    }
    @Test
    public void convert10toXTest(){
        Assertions.assertEquals("X", Converter.convert(10));
    }
    @Test
    public void convert4toIVTest(){
        Assertions.assertEquals("IV", Converter.convert(4));
    }
    @Test
    public void convert100tocTest(){
        Assertions.assertEquals("C", Converter.convert(100));
    }
    @Test
    public void convert500toiTest(){
        Assertions.assertEquals("D", Converter.convert(500));
    }
    @Test
    public void convert1000tomTest(){
        Assertions.assertEquals("M", Converter.convert(1000));
    }
    @Test
    public void convert3000toMMMTest(){
        Assertions.assertEquals("MMM", Converter.convert(3000));
    }
    @Test
    public void convert2034toiTest(){
        Assertions.assertEquals("MMXXXIV", Converter.convert(2034));
    }

}
