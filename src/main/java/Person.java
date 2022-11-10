public class Person {

    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public void printName(){
        System.out.println(name);
    }

    public static void printName2(){
        System.out.println("i am static");
    }


}
