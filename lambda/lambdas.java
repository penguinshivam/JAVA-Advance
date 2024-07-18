package lambda;
// greetd(()->system.out.print("hello"));
public class lambdas {


    public void greet(greetings greetings){
        greetings.perform();
    }
    public static void main(String[] args) {
        lambdas lam=new lambdas();
        greetings helloworldgreeting = new helloworldgreeting();
        
        greetings myLambdafunc=()->System.out.println("hello worls");
        greetings innerclass=new greetings() {
            public void perform(){
                System.out.println("hello");
            }
        };
        lam.greet(helloworldgreeting);
        innerclass.perform();
        helloworldgreeting.perform();
        myLambdafunc.perform();
        
        // add addfunction = (int a,int b) -> a + b;
    }
}

// interface Mylambda {
//     void foo();
    
// }
interface add{
    int ad(int x,int y);
}