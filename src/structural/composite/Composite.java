package structural.composite;

import behavioral.iterator.CompositeIterator;

public abstract class Composite extends Component {
	abstract public void operation();

    @Override
    public CompositeIterator makeIterator() {
        return new CompositeIterator(this);
    }
}