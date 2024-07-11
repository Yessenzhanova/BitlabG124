package generics;

import java.util.ArrayList;
import java.util.List;

public class Box<T> {

    private List<T> contents = new ArrayList<>();

    public Box() {
    }

    public Box(List<T> contents) {
        this.contents = contents;
    }

    void add(T item){
        contents.add(item);
    }

    List<T> getContents(){
        return contents;
    }
}
