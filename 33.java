class GardenArea{
    public static void main(String args[]){
        int gardenLen  = 30;
        int gardenWid = 20;
        int areaOfGarden =  gardenLen *gardenWid;
        System.out.println("Area of a garden : "+ areaOfGarden);
        int pathlen =3;
        int pathwid = 4;
        int fisrtpathArea=  pathlen *pathwid;
        System.out.println("Area of a path: "+ pathArea);
        int usableArea =  areaOfGarden - pathArea;
         System.out.println("Area in usable: "+ usableArea);
    }
}