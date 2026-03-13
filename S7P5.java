class Student{
    int[] marks;
Student(int[] m ){
    marks=m;
} 
void average(){
    int sum=0;
    for(int i=0;i<marks.length;i++){
        sum=sum+marks[i];
    }
    double avg=sum/marks.length;
    System.out.println("Average marks:"+avg);
}
}
public class S7P5{
    public static void main(String[] args){
        int[] m1={80,90,85};
        Student s1 = new Student(m1);
        s1.average();
    }
}
   