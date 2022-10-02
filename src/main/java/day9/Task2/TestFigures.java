package day9.Task2;

public class TestFigures {
    public static void main(String[] args) {
        Figure[] figures = {
                new Triangle(10, 10, 10, "Red"),
                new Triangle(10, 20, 30, "Green"),
                new Triangle(10, 20, 15, "Red"),
                new Rectangle(5, 10, "Red"),
                new Rectangle(40, 15, "Orange"),
                new Circle(4, "Red"),
                new Circle(10, "Red"),
                new Circle(5, "Blue"),
                new Triangle(10, 20, 30, null)
        };

        System.out.println(calculateRedArea(figures));
        System.out.println(calculateRedPerimeter(figures));

    }
        public static double calculateRedPerimeter (Figure[] figures){
            double summaPerimeter = 0;
            for (int i = 0; i < figures.length; i++){
                if ("Red".equals(figures[i].getColor())){
                    summaPerimeter = summaPerimeter + figures[i].perimeter();

                }
            }
            return summaPerimeter;
        }

        public static double calculateRedArea (Figure[] figures) {
            double summaArea = 0;
            for (int i = 0; i < figures.length; i++){
                    if ("Red".equals(figures[i].getColor())){
                    summaArea = summaArea + figures[i].area();

                }
            }
            return summaArea;
        }




    }

