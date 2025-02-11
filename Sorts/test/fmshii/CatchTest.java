package fmshii;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CatchTest {
    @Test
    public void isPhoneNumberValid(){
        String phoneNumber = "00087654876";
        assertTrue(PhoneNumberValidator.isPhoneNumberValid(phoneNumber));
    }

    @Test
    public void startsWithTrippleZero(){
        String phoneNUmberOne = "08199999673";
        assertTrue(PhoneNumberValidator.startsWith(phoneNUmberOne));
    }

    private static class PhoneNumberValidator {

        public static boolean isPhoneNumberValid(String phoneNumber) {
             phoneNumber = "00087654876";
             String pattern = "\\d{11}";
             boolean result = phoneNumber.matches(pattern);
             return result;
        }

        public static boolean startsWith(String phoneNUmberOne){
            phoneNUmberOne = "08199999673";
            String patternOne = ("[0]\\d{0}[7-9]\\d{0}[0-1]\\d{0}\\d{8}");
            boolean resultOne = phoneNUmberOne.matches(patternOne);
            return resultOne;
        }

        public static boolean startsWithCountryCode(){
            
        }

    }
}
