public class SkipDefault {
    public static void main(String[] args) {
        System.out.println(SkipAppNotApple("bacapplcdah"));

    }
    static String SkipAppNotApple(String up){
        if (up.isEmpty()) {
            return "";
        }

        if (up.startsWith( "app") && !up.startsWith( "apple")) {
            return SkipAppNotApple(up.substring(3));
        } else {
            return up.charAt(0) + SkipAppNotApple(up.substring(1));
        }
    }
}
