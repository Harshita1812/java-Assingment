class FindBreadth{
    public static void main(String args[]){
        int costs = 1600;
        int lenght = 20;
        int ratePerSqur = 25;
        int fieldArea = costs /ratePerSqur;
        System.out.println("area of the field : "+ fieldArea);
        float breadthOfPark = fieldArea / lenght;
        System.out.println("breadth of the park: "+ breadthOfPark);
        float parkPerimeter = 2 *(lenght + breadthOfPark);
        System.out.println("perimeter of park: "+ parkPerimeter);

    }
}