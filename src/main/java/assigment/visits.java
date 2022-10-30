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
public void settime(String time1) {
	this.time=time1;
}
public String gettime() {
	return time;
	
}

public String getnotes() {
	return notes;
	
}
public void setid(String id1) {
cl.setId(id1);
}
public String getid() {
	return cl.getId();
}
public void setdate(String date1) {
this.date=date1;
}
public String getdate() {
	return date;
}
public void setnotes(String note) {
	this.notes=note;	
}
}