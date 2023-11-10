package com.janaka.isbntools;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ValidateISBNTools {

   @Test
    public void checkValidISBN(){
     ValidateISBN validateISBN = new ValidateISBN();
     boolean result = validateISBN.checkISBN("0140449116");
     assertTrue(result,"First value");
     result = validateISBN.checkISBN("0140177396");
     assertTrue(result,"Second Value");
   }

    @Test
    public void checkAnInValidISBN(){
        ValidateISBN validateISBN = new ValidateISBN();
        boolean result = validateISBN.checkISBN("0140449117");
        assertFalse(result);
    }

}
