class Sentence{
    String sentence;
    Sentence(String sen){
        this.sentence=sen;
    }
    void display(){
        System.out.println("Sentence: "+sentence);
    }
     void split(){
        String[] words = sentence.split(" ");
        System.out.println("Words in the sentence:");
        for(String word : words) {
            System.out.println(word);
        }
}
}
public class S7P10 {
    public static void main(String[] args) {
        Sentence s1 = new Sentence("Bonjour,Madame");
        s1.display();
        s1.split();
    }
}