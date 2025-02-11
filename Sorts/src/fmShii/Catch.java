package fmShii;

public class Catch {
    public static void main(String[] args) {
        String text = "Today Is MOnday";
        String pattern = "\\w|\\s";
        boolean result = text.matches(pattern);
        System.out.println(result);


        String phoneNumber = "00087654876";
//             String pattern = "\\d{11}";
        String patterTwo = "^(000)";
        boolean answer = phoneNumber.matches(patterTwo);
        System.out.println(answer);
    }
}

