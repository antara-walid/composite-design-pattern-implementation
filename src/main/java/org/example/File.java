package org.example;

public class File extends Component {


    public File(String name) {
        super(name);
    }

    @Override
    public void display() {
        String tab = tabulation();

        System.out.println(tab + "file: " + name );
    }
}
