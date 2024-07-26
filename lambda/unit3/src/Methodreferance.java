public class Methodreferance {
    public static void main(String[] args) {
        Thread t=new Thread(()->printmessage());
        t.start();
        Thread t1=new Thread(Methodreferance::printmessage);
        t1.start();
    }
    public static void printmessage(){
        System.out.println("hello");
    }
}
