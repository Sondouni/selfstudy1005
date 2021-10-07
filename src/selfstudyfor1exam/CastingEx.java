package others;

public class CastingEx {
    public static void main(String[] args) {
        String str = " Hello World ";
        String str1 = "12345";
        System.out.println(Integer.parseInt(str1));

        int a = 12313;
        char c = 'a';
        System.out.println(String.format("(%d - %c)",a,c));

        String.valueOf(123213+a);
        if(String.valueOf(1234+a) instanceof String){
            System.out.println("True");
        }
        System.out.println(String.valueOf(1+a));
    }
}
