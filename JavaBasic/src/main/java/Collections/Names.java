package Collections;
import java.util.ArrayList;

public class Names {
    public static void main(String[]args){
        ArrayList<String>names=new ArrayList<>();;

        names.add("Roma");
        names.add("Nikita");
        names.add("Liza");

        System.out.println(names);;
        System.out.println(names.get(2));

        names.remove(1);
        System.out.println(names);
    }
}


