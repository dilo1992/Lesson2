package by.teachmeskills.homework.lesson18;

import java.io.File;
import java.io.FilenameFilter;

public class MyNameFileFilter implements FilenameFilter {

    private final String extension;

    public MyNameFileFilter(String extension) {
        this.extension = extension.toLowerCase();
    }

    @Override
    public boolean accept(File dir, String name) {
        return name.toLowerCase().endsWith(this.extension);
    }
}
