class CostTile{
    public static void main(String args[]){
        int landPlotLen = 300;
        int landPlotwid = 150;
        int dollarRate = 6;
        int rectArea = landPlotLen * landPlotwid;
        System.out.println("area of land " + rectArea);
        int areaHundredSuqre = rectArea/100;
        int totalCost  = areaHundredSuqre * dollarRate;
        System.out.println("total cost: "+ totalCost + " in Dollar");


    }
    }