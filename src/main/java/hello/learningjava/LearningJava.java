
package hello.learningjava;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.Scanner;

public class LearningJava { 

    public static void main(String[] args) throws UnsupportedEncodingException {
        
        Animal a = new Animal();
        String dog = a.iAmDog();
        System.out.println(dog);
        
        a.doStuff();

    System.out.println("System.getProperty(\"file.encoding\"): " + System.getProperty("file.encoding"));
    System.out.println("Charset.defaultCharset(): " + Charset.defaultCharset());
    System.out.println("System.getProperty(\"java.version\"): " + System.getProperty("java.version"));
        
        NewClassTEST b = new NewClassTEST();
        String TEST = b.aMadeUpString();
        System.out.println(TEST);
        System.setOut(new PrintStream(System.out, true, "UTF8"));
        Scanner scanner = new Scanner(System.in, "UTF-8");
        System.out.println(TEST);
    }
    
   
    }
            

