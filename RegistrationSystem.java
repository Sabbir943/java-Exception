class WeakPasswordException extends Exception{
    WeakPasswordException(String msg){
        super(msg);
    }
}

class UserAccount{
    String passsword;
    void validatePassword(String password) throws WeakPasswordException{
        if(password.length()<8) throw new WeakPasswordException("Invaild password");

    }

    void setPasssword(String passsword) throws WeakPasswordException{
        validatePassword(passsword);
        this.passsword=passsword;
        System.out.println("The vaild Passworld is:"+passsword);
    }
}


public class RegistrationSystem {
    public static void main(String[] args) {
       UserAccount user=new UserAccount();
       try{
           user.setPasssword("abc123");
       }

       catch (WeakPasswordException e){
           System.out.println("Error"+ e.getMessage());
       }

        try{
            user.setPasssword("12345678");
        }

        catch (WeakPasswordException e){
            System.out.println("Error"+ e.getMessage());
        }
    }
}
