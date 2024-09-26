import java.util.List;

public class MethodReference {


    public static void convert(String str){
        System.out.println( str.toUpperCase());
    }

    public static void main(String[] args) {

        List<String> names= List.of("Baseeth","pavan","Saleem","Mahesh");
        names.forEach(MethodReference::convert);

    }
}
