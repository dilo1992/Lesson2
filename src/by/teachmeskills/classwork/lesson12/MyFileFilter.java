package by.teachmeskills.classwork.lesson12;

import java.io.FileFilter;
import java.io.File;

public class MyFileFilter implements FileFilter {
    @Override
    public boolean accept(File f) {
        return f.getName().endsWith(".txt");
    }
}
