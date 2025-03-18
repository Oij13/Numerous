package edu.bsu.cs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ConverterTest {

    @Test
    public void convert1toiTest(){
        Converter converter = new Converter();
        Assertions.assertEquals("I",converter.convert(1));
    }
    @Test
    public void convert3toiiiTest(){
        Converter converter = new Converter();
        Assertions.assertEquals("III",converter.convert(3));
    }
    @Test
    public void convert5toVTest(){
        Converter converter = new Converter();
        Assertions.assertEquals("V",converter.convert(5));
    }
    @Test
    public void convert10toXTest(){
        Converter converter = new Converter();
        Assertions.assertEquals("X",converter.convert(10));
    }
    @Test
    public void convert4toIVTest(){
        Converter converter = new Converter();
        Assertions.assertEquals("IV",converter.convert(4));
    }
    @Test
    public void convert100tocTest(){
        Converter converter = new Converter();
        Assertions.assertEquals("C",converter.convert(100));
    }
    @Test
    public void convert500toiTest(){
        Converter converter = new Converter();
        Assertions.assertEquals("D",converter.convert(500));
    }
    @Test
    public void convert1000tomTest(){
        Converter converter = new Converter();
        Assertions.assertEquals("M",converter.convert(1000));
    }

}
