
public class main {
    
    public static void main(String[] args) {
        int conter = 0;
        float total = 0;
        electrodomestico array[] = {
            new lavadora(),
            new lavadora(150, 39),
            new lavadora(120, 50, "rojo", "b", 25),
            new television(),
            new television(260, 65),
            new television(260, 65, "negro", "C", 25, true ),
            new lavadora(150, 39),
            new television(),
            new television(260, 65),
            new television(230, 65, "gris", "e", 35, false )
        };
        System.out.println("");
        System.out.println("TELEVISORES: \n");
        for(int i = 0; i< array.length; i++) {
            if(array[i] instanceof television) {
                conter++;
                System.out.println("Precio televisor " + conter + " : " +  array[i].getPrecio());
            }
            total += array[i].getPrecio();
        }
        System.out.println("");
        conter = 0;
        System.out.println("LAVADORAS: \n");
        for(int i = 0; i< array.length; i++) {
            if(array[i] instanceof lavadora) {
                conter++;
                System.out.println("Precio lavadora " + conter + " : " +  array[i].getPrecio());
            }
            total += array[i].getPrecio();
        }

        System.out.println("Total: " + total);
        
    }

}
