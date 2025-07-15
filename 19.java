class MoreVolume{
    public static void main(String args[]){
        int cubeEdge = 7;
        int cubeVol = cubeEdge * cubeEdge*cubeEdge;
        System.out.println("volume of cube: "+cubeVol);
        int cuboidLen = 7;
        int cuboidWid = 4;
        int cuboidHei = 8;
        int cuboidVol = cuboidLen * cuboidWid *cuboidHei ;
        System.out.println("volume of cuboid: "+ cuboidVol);

        System.out.println("volume of cube is more which is :" + cubeVol);

    }
}