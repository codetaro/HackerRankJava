package advanced;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;


public class SingletonPattern {

    public String str;
    private static SingletonPattern instance;

    private SingletonPattern() {
    }

    public static SingletonPattern getSingleInstance() {
        if (instance == null) {
            instance = new SingletonPattern();
        }
        return instance;
    }
}