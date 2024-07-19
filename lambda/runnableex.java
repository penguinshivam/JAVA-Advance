package lambda;

public class runnableex {
    public static void main(String[] args) {
        Thread myThread = new Thread(new Runnable() {
            
            @Override
            public void run(){
                System.out.println("print inside");
            }
        });

        myThread.run();

        Thread myLambdaThread = new Thread(()->System.out.println("printed inside lamda"));
        myLambdaThread.run();
    }
}
