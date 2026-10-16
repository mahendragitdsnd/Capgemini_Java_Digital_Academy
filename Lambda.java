import java.util.function.Function;
public class lambda {
    public static void main(String args[]){
        Function<String,Integer>getLength=name-> name.length();
        System.out.println(getLength.apply("Java"));
        System.out.println(getLength.apply("John"));
    }

    
}
