package structural.composite;

import datastructures.LinkedList;

public class LinkedListComposite extends Composite {
	LinkedList<Component> children = new LinkedList<Component>();

	public LinkedListComposite(String instanceID, Component...children){
        setInstanceID(instanceID);
		// children is an array
		// add the children to the linked list
		for(Component c : children){
			this.add(c);
		}
	}

	public void operation(){
		// I don't know what this is supposed to do
	}

	public Component getChild(int number){
		return children.get(number);
	}

	protected boolean doAdd(Component part){
		return children.add(part);
	}

	protected boolean doRemove(Component part){
		return children.remove(part);
	}

}