public class userRegistertion{
    void register(String name,int userID){
        System.out.println("Registered user:"+"User Name: "+name+" User ID: "+userID);
        
    }
    void register(int userID,String name){
        System.out.println("Registered user:"+"User ID: "+userID+" User Name: "+name);

    }
}
class Main{
    public static void main(String[] args) {
        userRegistertion ur = new userRegistertion();
        ur.register("John", 123);
        ur.register(456, "Jane");
    }
}