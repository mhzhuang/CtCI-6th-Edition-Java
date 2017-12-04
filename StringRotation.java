public class StringRotation {

    public static boolean isRotation(String s1, String s2) {
        if(s1.length()==s2.length() && s1.length()>0){
            String s1s1 = s1 + s1;
            return isSubstring(s1s1, s2);
        }
        return false;
    }

    public static boolean isSubstring(String big, String small) {
        if (big.indexOf(small) >= 0)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {

        System.out.println(isRotation("waterbottle","erbottlewat"));
    }
}
