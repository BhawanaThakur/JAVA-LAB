class Message{
    String s;
Message(String t){
    s = t;
}
void length(){
    System.out.println("Length of string is " + s.length());
}
void uppercase(){
    System.out.println("Uppercase string is" + s.toUpperCase());

}   
}
public class S7P7{
   public static void main(String[] args){
      Message m1 = new Message("Hello World");
      m1.length();
      m1.uppercase();
    }
}
