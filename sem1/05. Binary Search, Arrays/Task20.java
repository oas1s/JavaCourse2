public class Task20 {
    public static void main(String[] args) {
        String str = "my name is Azat";
        char[] chars = str.toCharArray();
        char[] chars2 = new char[chars.length];
        for (int i = chars.length-1; i >= 0; i--) {
            chars2[chars.length-1-i] = chars[i];
        }
        System.out.println(new String(chars2));
    }
}
