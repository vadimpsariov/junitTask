package model;

import org.junit.jupiter.api.Test;

import java.io.InvalidObjectException;

import static org.junit.jupiter.api.Assertions.*;

class NewMethodTest {

    @Test
    void parcedValueInvalidData() throws Exception {
        Exception e = assertThrows(Exception.class, () -> parse("qwe"));
        assertEquals("Invalid String", e.getMessage());
    }

    @Test
    void parcedValueValidData() throws Exception {
        int result = parse("10");

        assertEquals(10,result);
    }

    int parse(String s1) throws Exception {
        try{
            int parsedValue = Integer.parseInt(s1);
            return parsedValue;
        }
        catch(Exception e){
            throw new InvalidObjectException("Invalid String");
        }
    }


}



