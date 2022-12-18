package assigment;

public class visits {
String time;
String date;
String id;
boolean p;
String notes;
client cl=new client();
public visits() {
	time="";
	date="";
	id="";
	p=false;
	notes="";
}

public String gettime() {
	return time;
	
}

public String getnotes() {
	return notes;
	
}

public String getid() {
	return cl.getId();
}

public String getdate() {
	return date;
}
public void setnotes(String note) {
	this.notes=note;	
}
}