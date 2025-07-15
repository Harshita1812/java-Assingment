class DistanceCover{
    public static void main(String args[]){
        int len =  50;
        int bread = 30;
        int rectPerimeter = 2 * (len+bread);
        System.out.println("perimeter of rectanlge: "+rectPerimeter);
        int rounds = rectPerimeter * 10;  // in km;
        int distance = rounds /1000;
        System.out.println("Distance cover in km:" + distance);
    }
}