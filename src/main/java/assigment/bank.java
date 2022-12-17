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
    private static List<client> cllient =new ArrayList<>();
	   static Logger l= Logger.getLogger(bank.class.getName());
private static List<client> client = new ArrayList<>();
public static void addclient(Admin employee,client cl) {
if(employee.isLogged() && !signdone(cl.getId())){client.add(cl);}
}
public static boolean signdone(String id) {
for (int i = 0 ; i<client.size();i++) {
	if (client.get(i).getId().equals(id))
		return true;
}
return false;
}

public static List<client> ss(String s){
    List<client> searched=new ArrayList<>();
    
    return searched;
}
public static List<client> getCllient() {
	return cllient;
}

}

