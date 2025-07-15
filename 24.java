class BrickCost{
    public static void main(String args[]){
        int brickLong = 25;
        int brickWidth = 10;
        float brickThick  = 7.5f;
        float singleBrick = brickLong * brickWidth * brickThick; 
        System.out.println ("How many bricks: "+ singleBrick);
        /* given data in m so im = 100cm; */
        int wallLong = 20 *100;
        int wallHigh = 2*100;
        float wallThick = 0.75f;
        int wallBrick = wallLong * wallHigh * wallThick ;
        System.out.println ("bricks for wall : "+ wallBrick);
        int brickNumbers = wallBrick / singleBrick ; 
         System.out.println ("number of bricks: "+ brickNumbers);
        int dollarPrice = 900;
    }
}