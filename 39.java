class SurfaceCyclinder{
    public static void main(String args[]){
        int diameter  = 12;
        int radius =  diameter/2;
        int height  = 9; 
        double surfaceOfCyclinder = (2 * 3.14* radius * (radius+height));
        System.out.println("surface of cyclinder: "+ surfaceOfCyclinder);
        
    }
}