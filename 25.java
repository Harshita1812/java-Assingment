class PathArea{
    public static void main(String args[]){
        int len = 24;
        int wid = 15;
        int bricks = 100;
        int area =  len * wid ;
        System.out.println("area of one brick:" + area);
        int totalArea = bricks * area; 
        System.out.println("area of path:" + totalArea);
        
    }
}