package study;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {
    public Class loadClass(String filename, String className) throws FileNotFoundException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(filename);
        Class c = Class.forName(className);
        return c;

    }

}
