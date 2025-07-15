class BiggerGarden{
    public static void main(String args[]){
        int len = 22;
        int bread = 15;
        int rectArea = len * bread;
        System.out.println("shelly garden : "+ rectArea);
        int side = 21;
        int squrArea = side *side;
        System.out.println("Rachel garden :" + squrArea);
        int bigGarden = squrArea - rectArea;
        System.out.println("Rachel Garden is bigger by "+ bigGarden);
    }
}