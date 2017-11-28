// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html

class PeekingIterator implements Iterator&lt;Integer&gt; {
    Iterator&lt;Integer&gt; iter;
    Integer next_elem;

    public PeekingIterator(Iterator&lt;Integer&gt; iterator) {
        // initialize any member here.
        this.iter = iterator;
        if(iter.hasNext()) {
            this.next_elem = iter.next();
        }
        else{
            this.next_elem = null;
        }
    }

    // Returns the next element in the iteration without advancing the iterator.
    public Integer peek() {
        return next_elem;
    }

    // hasNext() and next() should behave the same as in the Iterator interface.
    // Override them if needed.
    //@Override
    public Integer next() {
        Integer temp = next_elem;
        if(temp == null){
            return null;
        }
        if(iter.hasNext()){
            this.next_elem = iter.next();
        }
        else{
            this.next_elem = null;
        }
        return temp;
    }

    //@Override
    public boolean hasNext() {
        return next_elem != null;
    }
}