package lambda;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName,String lastName,int age){
        super();
        this.firstName=firstName;
        this.lastName=lastName;
        this.age=age;
    }
    public String getFristName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }
    public void setFirstName(String firstName ){
        this.firstName=firstName;
    }
    public void setLastName(String lastName){
        this.lastName=lastName;
    }
    @Override
    public String toString(){
        return "person[firstName="+firstName+", lastName="+lastName+", age="+age+"]";
    }

}
