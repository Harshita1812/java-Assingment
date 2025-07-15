class FindBase{
    public static void main(String args[]){
        int altitudeCm= 20;
        /* 1m^2 = (100cm)^2 = 10000 cm^2
           0.8 m^2 = 0.8 * 10000cm^2 = 8000 cm^2
           */
        double area = 0.8;
        double altitudeM = altitudeCm / 100;

        double base = area *2 / altitudeM;
        System.out.println("Base: "+ base);

    }
}