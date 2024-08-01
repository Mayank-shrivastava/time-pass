package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

class CustomListIterator<T> implements Iterator<T> {
    // members of class
    private List<T> source = null;
    private int index = 0;

    // constructor
    public CustomListIterator(List<T> source) {
        this.source = source;
    }

    @Override
    public boolean hasNext() {
        return this.index <= this.source.size() - 1;
    }

    @Override
    public T next() {
        return this.source.get(this.index++);
    }

}

public class IteratorDemo {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("mayank", "Shubham", "hardik");

        // creating an iterator
        Iterator<String> it = names.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        it.forEachRemaining((element) -> {
            System.out.println(element);
        });

        List<String> list = new ArrayList<>();

        Collections.addAll(list, "element 1", "element 2", "element 3");
        System.out.println(list);
        list.add("ab");
        list.addAll(names);
        list.get(0);
        

    }

}
