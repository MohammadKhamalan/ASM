package assigment;
import java.util.logging.Level;
import java.util.logging.Logger;

public class money {
	 Logger l=Logger.getLogger(money.class.getName());

private int enteredmoney;
public void setenteredmoney(int enm) {
	this.enteredmoney=enm;
}
public  int getenteredmoney() {
	return enteredmoney;
}
public money() {
	
}
public money(int mo) {
	setenteredmoney(mo);
}
}
