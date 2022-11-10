public class Main {

    public static void main(String[] args) {

        Person p1 = new Person("A",1);
        Person p2 = new Person("B",2);
        Person.printName2();

    }

    public static void func1(){
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }

    public static void func2(int a, int b){
        System.out.println(a + b);
    }

    public static int func3(){
        System.out.println(1);
        return 2;
    }

    public static String func4(String word1, String word2 ){
        return word1 + word2;
    }


}
