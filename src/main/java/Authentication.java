/**
 * Created by vaun-pierrewynter on 11/11/2016.
 */
public class Authentication {

    // instance variables
    private String password;
    private String userName;

    public Authentication(String userName, String password){
        System.out.printf("Your username is: %s and Password %s", userName, password);
    }

    public void save(){
        System.out.printf("Your credentials was saved");
    }
}
