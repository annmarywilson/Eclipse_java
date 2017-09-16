package net.opentrends.generics;

public class Geninterfaceclass<T> implements Geninterface<T> {
	
public T t;
public void add(T t) {
	this.t=t;
}
public void display() {
	System.out.println(t);
}
}
