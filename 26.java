class CountBricks {
    public static void main(String args[]){
        int pathLen = 120*100;
        float pathBreadth = 2.4f *100.0f;
        float pathArea = pathLen*pathBreadth;
        System.out.println("area of the path: "+ pathArea);
        int brickLen = 24;
        int brickwid = 15;
        int areaBrick = brickLen * brickwid ;
        System.out.println("area of the one brick: "+ areaBrick);
        float totalRequireArea = pathArea/areaBrick;
        System.out.println("required bricks for the path: "+ totalRequireArea);


    }
}