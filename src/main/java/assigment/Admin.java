package assigment;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Admin {
     int id;
     int pass;
    boolean flag;
    Logger l= Logger.getLogger(Admin.class.getName());
    public  Admin(){
        this.setId(119);
        this.setPass(123);
        this.setLogged(false);
    }


    public boolean isLogged() {
        return flag;
    }

    public boolean login(int a , int b) {
        if(a==this.id&&b==this.pass){
            flag=true;
            l.log(Level.INFO,"logged in successfully");
        }
        else
            l.log(Level.INFO,"you entered wrong information either id or password");
        return flag;
    }
  

    public void setLogged(boolean done) {
        this.flag = done;
    }


//    public int getId() {
//        return id;
//    }
//
//    public int getPass() {
//        return pass;
//    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPass(int pass) {
        this.pass = pass;
    }
  

	public void logOut() {
		// TODO Auto-generated method stub
        flag=false;

	}

}