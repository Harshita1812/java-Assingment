class SurfaceCyc{
    public static void main(String args[]){
        int volume = 1287;
        int radius = 10;
        double height = volume /3.14*radius*radius;
        double surfaceArea = 2*3.14*radius *(radius+height);
        System.out.println("Surface area of cyclinder: " + surfaceArea);
    }
}