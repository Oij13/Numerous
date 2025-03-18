package edu.bsu.cs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ConverterTest {

    @Test
    public void convert1toiTest(){
        Converter converter = new Converter();
        Assertions.assertEquals("I",converter.convert(1));

    }
}
