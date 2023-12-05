package com.example.tritypejunittest;

import static org.junit.Assert.*;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.PrintStream;
public class TritypeTest {
    @Test
    public void testTriang() {
        Tritype tri = new Tritype();
        assertEquals(4, tri.Triang(1, 2, 7));
        assertEquals(4, tri.Triang(-1, -2, -7));
        assertEquals(4, tri.Triang(2, 2, 7));
        assertEquals(2, tri.Triang(7, 2, 7));
        assertEquals(2, tri.Triang(2, 3, 3));
        assertEquals(2, tri.Triang(4, 4, 7));
        assertEquals(3, tri.Triang(7, 7, 7));
        assertEquals(1, tri.Triang(4, 5, 7));
    }
    @Test
    public void testmain(){
        Tritype tri = new Tritype();
        PrintStream concole = System.out;
        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        try{
            System.setOut(new PrintStream(outContent));
            Tritype.main(new String[]{("1,2,7")});
        }finally{
            System.setOut(concole);
        }
        assertEquals("This is the ancient TriTyp program.\n" +
                "Enter three integers that represent the lengths of the sides of a triangle.\n" +
                "The triangle will be categorized as either scalene, isosceles, equilateral\n" +
                "or invalid.\n" +
                "\n" +
                "Enter side 1: \n" +
                "Entry must be a number, choosing 1.\n" +
                "Enter side 2: \n" +
                "Entry must be a number, choosing 1.\n" +
                "Enter side 3: \n" +
                "Entry must be a number, choosing 1.\n" +
                "Result is: equilateral\n",outContent.toString().replaceAll("\r",""));
        /*try{
            System.setOut(new PrintStream(outContent));
            Tritype.main(new String[]{"xc3x28"});
        }finally{
            System.setOut(concole);
        }
        assertEquals("This is the ancient TriTyp program.\n" +
                "Enter three integers that represent the lengths of the sides of a triangle.\n" +
                "The triangle will be categorized as either scalene, isosceles, equilateral\n" +
                "or invalid.\n" +
                "\n" +
                "Enter side 1: \n" +
                "Entry must be a number, choosing 1.\n" +
                "Enter side 2: \n" +
                "Entry must be a number, choosing 1.\n" +
                "Enter side 3: \n" +
                "Entry must be a number, choosing 1.\n" +
                "Result is: equilateral\n"+"This is the ancient TriTyp program.\n" +
                "Enter three integers that represent the lengths of the sides of a triangle.\n" +
                "The triangle will be categorized as either scalene, isosceles, equilateral\n" +
                "or invalid.\n" +
                "\n" +
                "Enter side 1: \n" +
                "Entry must be a number, choosing 1.\n" +
                "Enter side 2: \n" +
                "Entry must be a number, choosing 1.\n" +
                "Enter side 3: \n" +
                "Entry must be a number, choosing 1.\n" +
                "Result is: equilateral\n",outContent.toString().replaceAll("\r",""));*/
    }
}