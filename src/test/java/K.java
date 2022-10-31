public class K {

    public static final String USERS = "https://jsonplaceholder.typicode.com/users";
    public static final String ID = "id=";
    public static final String NAME = "name=";

    public static final String LOCAL = "http://localhost:3000/people";


    public static String findById(int id){
        return USERS + "?" + ID + id;
    }

}
