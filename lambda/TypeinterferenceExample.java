package lambda;

public class TypeinterferenceExample {
    public static void main(String[] args) {
        stringLength myLambda=s->s.length();
        System.out.println(myLambda.getlength("hello lamda"));
    }


    interface stringLength{
        int getlength(String s);
    }
}
