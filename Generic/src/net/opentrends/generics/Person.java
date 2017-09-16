package net.opentrends.generics;

public class Person<E> {
	public E e;
	public void setPerson(E e) {
		this.e=e;
	}
	public E getPerson() {
		return this.e;
	}
}
