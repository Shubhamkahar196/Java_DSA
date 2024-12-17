public class Access_modifiers {

    public static void main (String args[]){
            
            BankAccount myAcc = new BankAccount();
            myAcc.username = " Shubham";
            myAcc.setPassword("shubhamILikeYou");
    }
}

class BankAccount {
    public String username;
    private String password;
    default void setPassword (String pwd){
        password = pwd;
    }
}