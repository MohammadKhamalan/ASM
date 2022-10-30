package assigment;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import assigment.Admin;
 
import assigment.bank;
import assigment.client;
   
public class bank {
	private static List<money> mon=new ArrayList<>();
    private static List<client> cllient =new ArrayList<>();
	   static Logger l= Logger.getLogger(bank.class.getName());
private static List<client> client = new ArrayList<>();
public static void addclient(Admin employee,client cl) {
if(employee.isLogged() && !signdone(cl.getId())){client.add(cl);}
else if(!employee.isLogged()) l.log(Level.INFO,"Admin login is required");
}
public static boolean signdone(String id) {
for (int i = 0 ; i<client.size();i++) {
	if (client.get(i).getId().equals(id))
		return true;
}
return false;
}
public static void deposite(int amount,client cl) {
	//if(cl.isLogged()) {
		//mon+=amount;
	}
	//else {
		 
	  //          l.log(Level.INFO,"you Should log in");

	//}
//}
public static List<client> ss(String s){
    List<client> searched=new ArrayList<>();
    for(int i = 0; i< getCllient().size(); i++){
        if(getCllient().get(i).getSignature().contains(s))
            searched.add(getCllient().get(i));
    }
    return searched;
}
public static List<client> getCllient() {
	return cllient;
}
public static void setCllient(List<client> cllient) {
	bank.cllient = cllient;
}
public void close(Admin admin) {
	 if (!admin.isLogged()) {
		 return;
		 }
	 else {
	 bank.client.remove(this);
}}

}