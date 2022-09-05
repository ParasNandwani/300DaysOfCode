import org.omg.CORBA.StringHolder;

public class ShiftLetters {

    public static void main(String[] args) {
      String  s = "abc";
      int[] shifts = new int[]{3,5,9};
      System.out.println(shiftStr(s,shifts));
    }

    public static String shiftStr(String s, int[] shifts) {
        int sum  = 0;
        for(int i = 0 ; i < shifts.length ; i++) {
            sum += shifts[i];
        }
        StringBuilder sBuilder = new StringBuilder();
        sBuilder.append("");
        for(int i = 0 ; i < s.length(); i++) {
            char c = (char) (s.charAt(i)+sum);
            sBuilder.append(c);
            sum -= shifts[i];
        }

        return sBuilder.toString();
    }
}
