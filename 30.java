class Tile{
    public static void main(String args[]){
        int tileLen = 5;
        int tileBread = 8;
        int bedLen = 200;
        int bedWide = 400;
        int tileArea = tileLen * tileBread;
        System.out.println("Area of tile: "+ tileArea);
        int roomArea = bedLen * bedWide;
        System.out.println("Area of room: "+ roomArea);
        int requireTiles = roomArea / tileArea;
        System.out.println("Require tiles for room: "+requireTiles);
    }
}