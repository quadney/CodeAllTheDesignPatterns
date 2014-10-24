package datastructures;

public class LinkedList<T> {
	private Node<T> head;

	public LinkedList(){

	}

	public boolean add(T data){
		Node<T> nodeToAdd = new Node<T>(data);
		
		if(data == null)
			return false;
		else if(head == null){
			head = nodeToAdd;
			return true;
		}
		else{
			Node currentNode = head;
			while(currentNode.hasNext()){
				currentNode = currentNode.getNext();
			}
			currentNode.setNext(nodeToAdd);
			return true;
		}
	}

	public boolean remove(T data){
		Node<T> currentNode = head;

		if(data == null){
			return false;
		}
		else if(head.equalsTo(data)){
			head = head.getNext();
			return true;
		}
		else{
			while(currentNode != null){

				if( (currentNode.getNext()).equalsTo(data) ){
					currentNode.setNext((currentNode.getNext()).getNext());
					return true;
				}
				else {
					currentNode = currentNode.getNext();
				}
			}
		}
        return false;
	}

	public T get(int index){
		Node<T> currentNode = head;
		int i = 0;

		while(currentNode != null){
			if(i == index-1)
				return currentNode.getData();
			
			currentNode = currentNode.getNext();
			i++;
		}

		return null;
	}

	public String toString(){
		String toString = "";

		Node<T> currentNode = head;

		while(currentNode != null){
			toString += "\t" + currentNode.getData().toString() + "\n";
			currentNode = currentNode.getNext();
		}

		return toString;
	}
}