package structural.composite;

public class BinaryComposite extends Composite {
	Component child;

	public BinaryComposite(String instanceID, Component child){
        setInstanceID(instanceID);
		this.add(child);
	}

    @Override
	public void operation(){
		// I don't know what this is supposed to do
	}

    @Override
	public Component getChild(int number){
		return this.child;
	}

    @Override
	protected boolean doAdd(Component part){
		if(child != null) 
			return false;
		else
			child = part;
		return true;
	}

    @Override
	protected boolean doRemove(Component part){
		if(child != part)
			return false;
		else
			child = null;
		return true;
	}
}