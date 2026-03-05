import java.util.ArrayList; 
public class S4P1{
    public static void main(String[] args){
        ArrayList<String>name = new ArrayList<String>();
        name.add("NOOR");
        name.add("BHAWANA");
        name.add("AKRITI");
        name.add("MANDEEP");
        name.add("KRISHNAV");
        for (int i=0;i<= name.size();i++){
            System.out.println( name.get(i));
        }
    }

}