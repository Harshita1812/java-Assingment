import java.lang.Math;
class TriangleArea{
    public static void main(String args[]){
        double s1 = 10;
        double s2 = 9;
        double perimeter = 36;
        double s3 = perimeter - s1- s2;
        System.out.println("s3: " + s3);
        double semiPerimeter = (s1 + s2 + s3)/ 2;
        System.out.println("semiperimeter: "+ semiPerimeter);
        double area = Math.sqrt(semiPerimeter*(semiPerimeter-s1)*(semiPerimeter-s2)*(semiPerimeter-s3));
        System.out.println("area of triangle: "+ area);

    }
}
