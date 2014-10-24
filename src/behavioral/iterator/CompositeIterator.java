package behavioral.iterator;

import structural.composite.Component;

public class CompositeIterator implements Iter<Component> {
    private Component composite;
    private int currentIndex;

    public CompositeIterator(Component composite){
        this.composite = composite;
       currentIndex = 0;
    }

    @Override
    public boolean hasNext() {
        return (composite.getChild(currentIndex) != null);
    }

    @Override
    public Component currentItem() {
        return composite.getChild(currentIndex);
    }

    @Override
    public void next() {
        currentIndex++;
    }

    @Override
    public void reset() {
        currentIndex = 0;
    }
}
