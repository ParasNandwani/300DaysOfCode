import org.omg.CORBA.StringHolder;

public class ShiftLetters {

    public static void main(String[] args) {
        String s = "abc";
        int[] shifts = new int[]{3, 5, 9};
        System.out.println(shiftingLetters(s, shifts));
    }


    public static String shiftingLetters(String s, int[] shifts) {
        int sum = 0;
        for (int i = 0; i < shifts.length; i++) {
            sum += shifts[i];
        }
        StringBuilder sBuilder = new StringBuilder();
        sBuilder.append("");
        for (int i = 0; i < s.length(); i++) {
            int sumAscii = sum % 26;
            char c = (char) (((s.charAt(i) - 'a') + sumAscii) % 26 + 'a');
            sBuilder.append(c);
            sum -= shifts[i];
        }
        return sBuilder.toString();
    }

}

