class SquareTile{
    public static void main(String args[]){
        int side = 10;
        int floorLen = 800;
        int floorWid = 900;
        int floorArea = floorLen * floorWid;
        System.out.println("Area of a floor: "+ floorArea);
        int oneTile =  side*side;
        System.out.println("Area of a one tile: "+ oneTile);
        int numberOfTiles =  floorArea / oneTile;
         System.out.println("number of tiles required: "+ numberOfTiles);

    }
}