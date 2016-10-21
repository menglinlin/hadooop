package mystring;

import java.io.Serializable;



public class User implements Serializable{

private String name;
private String sex;
private String ageString;

public User() {
	super();
}

public User(String name, String sex, String ageString) {
	super();
	this.name = name;
	this.sex = sex;
	this.ageString = ageString;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getSex() {
	return sex;
}

public void setSex(String sex) {
	this.sex = sex;
}

public String getAgeString() {
	return ageString;
}

public void setAgeString(String ageString) {
	this.ageString = ageString;
}

@Override
public String toString() {
	return "User [name=" + name + ", sex=" + sex + ", ageString=" + ageString
			+ "]";
}


}
