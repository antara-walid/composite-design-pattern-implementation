package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Folder mainFolder = new Folder("mainFolder");
        File file1 = new File("file1");
        File file2 = new File("file2");
        File file3 = new File("file3");
        Folder folder2 = new Folder("folder2");


        mainFolder.add(file1);
        mainFolder.add(folder2);
        folder2.add(file2);
        folder2.add(file3);

        mainFolder.display();




    }
}
