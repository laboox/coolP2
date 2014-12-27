import org.antlr.v4.runtime.Token;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by sina on 12/26/14.
 */
public class ErrorHandler {

    static private ArrayList<String> lines;
    static private boolean anyError = false;

    public static void setCoolFile(FileReader coolFile) throws IOException {
        BufferedReader coolFileReader = new BufferedReader(coolFile);
        lines = new ArrayList<String>();
        while(coolFileReader.ready()){
            lines.add(coolFileReader.readLine());
        }
        coolFileReader.close();
    }

    static void printTokenLine(Token t){
        int ln = t.getLine();
        int sc = t.getCharPositionInLine() +1;
        System.out.printf("in line: %d at char: %d\n%s\n",ln,sc,lines.get(ln-1));
        anyError =true;
        /*for (int i = 0; i <sc ; i++) {
            System.out.print(' ');
        }
        System.out.println("^");*/
    }

    static void noSuchParent(Type t){
        System.out.println("parent of type");
        printTokenLine(t.getToken());
        System.out.println("is not defined or is not inheritable.");
        System.out.println();
        anyError =true;
    }

    static void duplicateTypes(Type t1, Type t2){
        System.out.println("types");
        printTokenLine(t1.getToken());
        printTokenLine(t2.getToken());
        System.out.println("are redefined.");
        System.out.println();
        anyError =true;
    }

    public static void noSuchType(Token token) {
        System.out.println("type of");
        printTokenLine(token);
        System.out.println("is not exist.");
        System.out.println();
        anyError =true;
    }

    public static void invalidFeatureRedefine(Feature f1, Feature f2){
        System.out.println("features");
        printTokenLine(f1.getToken());
        printTokenLine(f2.getToken());
        System.out.println("are redefined invalidly.");
        System.out.println();
        anyError =true;
    }

    public static void invalidFeatureName(Feature f){
        System.out.println("cant name feature");
        printTokenLine(f.getToken());
        System.out.println(f.getName());
        System.out.println();
        anyError =true;
    }

    public static void repeatedFormals(Formal f1, Formal f2){
        System.out.println("formals");
        printTokenLine(f1.getToken());
        printTokenLine(f2.getToken());
        System.out.println("are repeated.");
        anyError =true;
    }


    public static void cyclicGraph(Type head) {
        System.out.println("inheritance graph is cyclic");
        String start = head.getName();
        while(!head.getFather().matchName(start)){
            System.out.print(head.getName() + " -> ");
            head = head.getFather();
        }
        System.out.println(start);
    }
}