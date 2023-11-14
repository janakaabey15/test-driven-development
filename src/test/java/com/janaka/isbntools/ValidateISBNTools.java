package com.janaka.isbntools;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ValidateISBNTools {

   @Test
    public void checkValid10DigitISBN(){
     ValidateISBN validateISBN = new ValidateISBN();
     boolean result = validateISBN.checkISBN("0140449116");
     assertTrue(result,"First value");
     result = validateISBN.checkISBN("0140177396");
     assertTrue(result,"Second Value");
   }

   @Test
   public void checkValid13DigitsISBN(){
       ValidateISBN validateISBN = new ValidateISBN();
       boolean result = validateISBN.checkISBN("9781853260087");
       assertTrue(result,"First Value");
       result = validateISBN.checkISBN("9781853267338");
       assertTrue(result,"Second Value");

   }
   @Test
   public void validWhenIsbn10DigitEndsWithX(){
       ValidateISBN validateISBN = new ValidateISBN();
       boolean result = validateISBN.checkISBN("012000030X");
       assertTrue(result);
   }

    @Test
    public void checkAnInValid10DigitISBN(){
        ValidateISBN validateISBN = new ValidateISBN();
        boolean result = validateISBN.checkISBN("0140449117");
        assertFalse(result);
    }
    @Test
    public void checkAnInValid13DigitISBN(){
       ValidateISBN validateISBN = new ValidateISBN();
        boolean result = validateISBN.checkISBN("9781853267334");
        assertFalse(result);


    }
    @Test
    public void nineDigitISBNAreNotAllowed(){
     ValidateISBN validateISBN = new ValidateISBN();
     assertThrows(NumberFormatException.class,
             ()-> validateISBN.checkISBN("123456789"));

    }

    @Test
    public void noneNumericIsbnNotAllowed(){
       ValidateISBN validateISBN = new ValidateISBN();
        assertThrows(NumberFormatException.class,
                ()-> {
            validateISBN.checkISBN("HelloWorld");
                });
    }
}
