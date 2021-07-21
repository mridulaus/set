package com.mradula.mysets.dto;

import java.io.Serializable;

public class KitchenItemDTO implements Serializable , Comparable<KitchenItemDTO>{
private String name;
private int price;
private String usedFor;
private String madeOf;
public KitchenItemDTO(String name, int price, String usedFor, String madeOf) {
	
	this.name = name;
	this.price = price;
	this.usedFor = usedFor;
	this.madeOf = madeOf;
}
public KitchenItemDTO() {
	
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public String getUsedFor() {
	return usedFor;
}
public void setUsedFor(String usedFor) {
	this.usedFor = usedFor;
}
public String getMadeOf() {
	return madeOf;
}
public void setMadeOf(String madeOf) {
	this.madeOf = madeOf;
}
@Override
public String toString() {
	return "KitchenItemDTO [name=" + name + ", price=" + price + ", usedFor=" + usedFor + ", madeOf=" + madeOf + "]";
}
@Override
public int hashCode() {
	
	return super.hashCode();
}
@Override
public boolean equals(Object obj) {

	if (obj == null) //null check
		return false;
if(obj instanceof  KitchenItemDTO ) { // instanceof 
	KitchenItemDTO otherDto = (KitchenItemDTO)obj; //downcasting
if(this.name.equals(otherDto.name)) 
{
	return true;
}
}

	return false;
}


@Override
public int compareTo(KitchenItemDTO o) {
	
	return this.name.compareTo(name);
}



}
