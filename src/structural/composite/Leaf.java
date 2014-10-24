package structural.composite;

public class Leaf extends Composite {

	public Leaf(String instanceVariable){
        setInstanceID(instanceVariable);
	}

	public void operation(){

	}

	public Component getChild(int number){
		return null;
	}

	protected boolean doAdd(Component part){
		return false;
	}

	protected boolean doRemove(Component part){
		return false;
	}
}