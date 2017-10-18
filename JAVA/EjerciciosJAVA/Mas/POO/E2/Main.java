package POO.E2;

public class Main {

    public static void main(String[] args){

        Electrodomestico[] arrayElectrodomesticos = new Electrodomestico[10];

        arrayElectrodomesticos[0] = new Lavarropas();
        arrayElectrodomesticos[1] = new Lavarropas();
        arrayElectrodomesticos[2] = new Television();
        arrayElectrodomesticos[3] = new Electrodomestico();
        arrayElectrodomesticos[4] = new Television();
        arrayElectrodomesticos[5] = new Electrodomestico();
        arrayElectrodomesticos[6] = new Television();
        arrayElectrodomesticos[7] = new Electrodomestico();
        arrayElectrodomesticos[8] = new Television();
        arrayElectrodomesticos[9] = new Lavarropas();

        double totalEletrodomestico = 0, totalLavarropas = 0,totalTelevisor = 0;

        for (int i = 0; i < arrayElectrodomesticos.length;i++){
           // System.out.println(arrayElectrodomesticos[i].precioFinal(i*10));
            if ( arrayElectrodomesticos[i] instanceof Lavarropas ){
                totalLavarropas += arrayElectrodomesticos[i].precioFinal(i*10);
            }else
                if (arrayElectrodomesticos[i] instanceof Television){
                totalTelevisor += arrayElectrodomesticos[i].precioFinal(i*10);
                }else
                    if(arrayElectrodomesticos[i] instanceof Electrodomestico){
                    totalEletrodomestico += arrayElectrodomesticos[i].precioFinal(i*10);
                }
System.out.println(arrayElectrodomesticos[i].precioFinal(i*10));
        }


        System.out.println("Total Electrodomesticos: "+totalEletrodomestico);
        System.out.println("Total Labarropas: "+totalLavarropas);
        System.out.println("Total Televisores: "+totalTelevisor);
    }
}
