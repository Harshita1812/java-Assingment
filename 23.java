class FindBoxes{
public static void main(String args[]){
    int cubicSide = 3;
    int boxVol = cubicSide*cubicSide*cubicSide;
    System.out.println("Area of th cubical box : " + boxVol);
    int cartonLen =  15;
    int cartonWid = 9;
    int cartonHei = 12;
    int cartonVol = cartonLen * cartonWid * cartonHei;
    System.out.println("Carton volume: "+ cartonVol);
    int numberOfBoxes = cartonVol / boxVol ;
     System.out.println("number of boxex for catons: "+ numberOfBoxes);
}
}