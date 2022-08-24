public class Inverte {
    public static void main(String[] args) {
        System.out.println(inverteString("abcde"));
    }

    public static String inverteString(String string){
        if(string.length() == 1) return string;
        return inverteString(string.substring(1)) + string.substring(0, 1);
    }
}
