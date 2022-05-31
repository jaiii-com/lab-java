import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("Hello, World!");

        AreaCalculator areaCaculator = new AreaCalculator();

        Circle cricle = new Circle(10);
        Square square = new Square(10);

        ShapesPrinter printer = new ShapesPrinter();

        List<Object> shapes = List.of(cricle, square);

        int sum = areaCaculator.sum(shapes);

        // System.out.println("sum = " + sum);
        // ->
        // System.out.println(areaCaculator.json(shapes));
        // System.out.println(areaCaculator.csv(shapes));
        // -> 
        System.out.println(printer.json(sum));
        System.out.println(printer.csv(sum));


    }
}
