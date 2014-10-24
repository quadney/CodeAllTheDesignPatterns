package datastructures;

public class Node<T> {
	private T data;
	private Node next;

	public Node(T data){
		this.data = data;
	}

	public T getData(){
		return data;
	}

	public Node getNext(){
		return next;
	}

	public void setNext(Node<T> next){
		this.next = next;
	}

	public boolean hasNext(){
		return (this.next != null);
	}

	public boolean equalsTo(T data){
		return (data == getData());
	}
}