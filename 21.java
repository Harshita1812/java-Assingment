class BricksCount {
    public static void main(String args[]){
        int bricklen = 15;
        int brickWid = 8;
        int brickhei = 5;
        int brickMeasure = bricklen * brickWid *brickhei;
        System.out.println("brick size: "+ brickMeasure);
        /* in m to cm  1m = 100cm; */
        int wallLen = 15*100;
        int wallbread = 10 *100;
        int wallHeight = 8*100;
        int wallMeasure = wallLen * wallbread * wallHeight;
        System.out.println("total wall brick: " + wallMeasure);
        int requireBrick = wallMeasure / brickMeasure;
        System.out.println("total bricks: "+requireBrick);

    }
}