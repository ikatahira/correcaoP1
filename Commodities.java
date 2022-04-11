public class Commodities {

    public static void main(String[] args) {
        
        String commodities[]=new String[2];
        double precoCommodities[] = new double [2];

        commodities[0]="carne";
        precoCommodities[0]=351.60;

        commodities[1]="milho";
        precoCommodities[1]=92.04;
       
        for (int i = 0; i < precoCommodities.length; i++) {
            System.out.println(commodities[i] + " preço: "+ precoCommodities[i]);
        }
    }
    
}
