class TrapezoidArea{
    public static void main(String args[]){
        int base = 128;
        int a = 92;
        int h = 40;
        double trapezoidArea = 0.5 * (base + a) * h;
        System.out.println("Area of a Trapezoid: "+ trapezoidArea);
        int walkway =  4;
        int walkwayLen = h;
        int walkwayArea = walkway *walkwayLen;
         System.out.println("Area of a walkway: "+ walkwayArea);
        double walkwayAdd = trapezoidArea - walkwayArea;
        System.out.println("Area after adding walkway : "+ walkwayAdd);

    }
}