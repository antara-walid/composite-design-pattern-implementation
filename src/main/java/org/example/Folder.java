package org.example;

import java.util.ArrayList;
import java.util.List;

public class Folder extends Component {

    List<Component> list = new ArrayList<>();

    public Folder(String name) {
        super(name);
    }

    @Override
    public void display() {
        String tab = tabulation();

        System.out.println(tab + "Folder: " + name);
        // display elements
        for(Component ele : list)
        {
            ele.display();
        }
    }

    public void add(Component component) {
        component.level = this.level + 1;
        list.add(component);
    }
}
