class TilesRect{
    public static void main(String args[]){
        int oneTileLen = 13;
        int oneTilebre = 7;
        int areaOneTileRect = oneTileLen * oneTilebre;
        System.out.println("one tile area: "+ areaOneTileRect);
        int tileLenght = 520;
        int tileBreadth = 140;
        int tileAreaRect = tileLenght * tileBreadth;
        System.out.println("area of tiles: "+ tileAreaRect);
        int requireTile = tileAreaRect / areaOneTileRect;
        System.out.println("Require tiles: "+ requireTile);


    }
}
