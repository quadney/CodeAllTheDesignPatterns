package structural.composite;

public class ArrayComposite extends Composite {
	Component[] children;

	public ArrayComposite(String instanceID, Component...childs){
        setInstanceID(instanceID);
		children = new Component[childs.length];
		for(Component c : childs){
			this.add(c);
		}
	}

	public void operation(){
		// I don't know what this is supposed to do
	}

	public Component getChild(int number){
		if(number < children.length)
            return children[number];
        else
            return null;
	}

	protected boolean doAdd(Component part){
		//check through the children array to find empty slots
		//can't add a child to a full array
		for(int i = 0; i < children.length; i++){
			if(children[i] == null){
				children[i] = part;
				return true;
			}
		}
		return false;
	}

	protected boolean doRemove(Component part){
		for(int i = 0; i < children.length; i++){
			if(children[i] == part){
				children[i] = null;
				return true;
			}
		}
		return false;
	}

}