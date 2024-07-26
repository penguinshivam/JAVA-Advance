package lambda;

public class ThisReferenceExample {
    public void doProcess(int i,Process p){
        p.process(i);
    }

    public void execute(){
        doProcess(10,i->{
            System.out.println("value"+i);
            System.out.println(this);
        });
    }
    public static void main(String[] args) {
        ThisReferenceExample thisReferenceExample=new ThisReferenceExample();
        // thisReferenceExample.doProcess(10,i->{
        //     System.out.println("value"+i);
        //     // System.out.println(this);
        // });
        thisReferenceExample.execute();
    }
    public String toString(){
        return "main this";
    }
}
