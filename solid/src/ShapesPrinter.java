public class ShapesPrinter {

    public String json(int sum){
        return "Shapes sum: $s".formatted(sum);
    }

    public String csv(int sum){
        return "Shapes sum, $s".formatted(sum);
    }
    
}
