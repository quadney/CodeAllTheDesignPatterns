package structural.composite;

import behavioral.iterator.CompositeIterator;

public abstract class Component {
	private Component parent = null;
    private String instanceID;

	final public Component add(Component child){
		try{
			// let the composites define how children are managed
			//template method
			if(doAdd(child)){
				child.setParent(this);
			}

		} catch (RuntimeException e) {
			throw e;
		}

		return this;
	}

	final public Component remove(Component child) {
		try{
			//let the Composites define how children are managed
			if(doRemove(child))
				child.setParent(null);

		} catch(RuntimeException e) {
			throw e;
		}
		return this;
	}
	
	protected Component getParent() {
		return parent;
	}

	private void setParent(Component newParent) {
		this.parent = newParent;
	}

    protected void setInstanceID(String id){
        this.instanceID = id;
    }

    protected String getInstanceID(){
        return this.instanceID;
    }

	// METHODS THAT COMPOSITES WILL OVERRIDE
	abstract public void operation();

	public Component getChild(int number) {
		return null;
	}

	protected boolean doAdd(Component part) {
		throw new RuntimeException("add() not supported");
	}

	protected boolean doRemove(Component part) {
		throw new RuntimeException("remove() not supported");
	}

    //TODO
    protected void makePreOrderIterator(){}

    abstract public CompositeIterator makeIterator();

    public String toString(){
        return (getParent() == null) ? getInstanceID()+" is the root" : getInstanceID()+" is the child of "+getParent().toString();
    }
}