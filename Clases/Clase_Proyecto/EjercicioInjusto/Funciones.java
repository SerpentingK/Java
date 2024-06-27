package EjercicioInjusto;


import java.util.Date;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class Funciones {
    static Scanner scan = new Scanner(System.in);

    public static ArrayList<Compra> crearCliente(String nombre, ArrayList<Compra> list, ArrayList<Producto> productos, float abono) {
        ArrayList<Compra> compras = list;
        compras.add(new Compra(nombre, productos, abono));
        return compras;
    }

    public static ArrayList<String> Codigos(ArrayList<Compra> list){
        ArrayList<String> codigos = new ArrayList<String>();
        for (Compra compra : list) {
            codigos.add(compra.getNumeroFactura());
        }
        return codigos;
    }
    public static ArrayList<String> Nombres(ArrayList<Compra> list){
        ArrayList<String> nombres = new ArrayList<String>();
        for (Compra compra : list) {
            nombres.add(compra.getCliente());
        }
        return nombres;
    }

    public static Compra BuscarPorCodigo(ArrayList<Compra> list, String codigo) {
        for (int i = 0; i < list.size(); i++) {
            Compra compra = list.get(i);
            if (compra.getNumeroFactura().equals(codigo)) {
                return compra;
            }
        }
        return null; // Retornar null si no se encuentra el código en la lista
    }
    public static Compra BuscarPorNombre(ArrayList<Compra> list, String nombre){
        for (int i = 0; i < list.size(); i++) {
            Compra compra = list.get(i);
            if (compra.getCliente().equals(nombre)) {
                return compra;
            }
        }
        return null;
    }

    
    public static ArrayList<Compra> ConsultarPorRangoFecha(ArrayList<Compra> list, String fechaInicialStr, String fechaFinalStr) {
        ArrayList<Compra> comprasEnRango = new ArrayList<>();

        // Convertir las fechas de String a Date
        Date fechaInicial = parseFecha(fechaInicialStr);
        Date fechaFinal = parseFecha(fechaFinalStr);

        for (Compra compra : list) {
            Date fechaCompra = parseFecha(compra.getFecha());

            // Comparar las fechas
            if (fechaCompra.compareTo(fechaInicial) >= 0 && fechaCompra.compareTo(fechaFinal) <= 0) {
                comprasEnRango.add(compra);
            }
        }

        return comprasEnRango;
    }

    // Método para convertir String a Date
    private static Date parseFecha(String fechaStr) {
        try {
            // Suponiendo que las fechas siempre están en formato dd/MM/yyyy
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            return sdf.parse(fechaStr);
        } catch (ParseException e) {
            // Manejar la excepción apropiadamente
            return null;
        }
    }

    public static ArrayList<Compra> ActualizarCliente(ArrayList<Compra> list,String codigo){
        ArrayList <Compra> result = list;
        for (int i = 0; i < result.size(); i++) {
            Compra compra = result.get(i);
            if (compra.getNumeroFactura().equals(codigo)) {
                
                MenuActualizar();
                String r = scan.nextLine();
                switch (r) {
                    case "1":
                        System.out.println("Ingrese nuevo valor: ");
                        String nuevoNombre = scan.nextLine();
                        compra.setCliente(nuevoNombre);
                        break;
                    case "2":
                        System.out.println("Ingrese nuevo valor: ");
                        String nuevaFecha = scan.nextLine();
                        compra.setFecha(nuevaFecha);
                        break;
                    case "3":
                        System.out.println("Saliendo");
                        break;
                    default:
                        System.out.println("Valor invalido");
                        break;
                }
            }
        }
        System.out.println("Edicion terminada");
        return result;
    
    }
    public static ArrayList<Compra> EliminarCliente(ArrayList<Compra> list, String codigo){
        ArrayList <Compra> result = list;
        for (int i = 0; i < result.size(); i++) {
            Compra compra = result.get(i);
            if (compra.getNumeroFactura().equals(codigo)) {
                result.remove(result.indexOf(compra));
            }
        }
        System.out.println("Compra eliminado");
        return result;
    }

    private static void MenuActualizar(){
        System.out.println("1. Editar Nombre. ");
        System.out.println("2. Editar fecha compra.");
        System.out.println("3. Salir");
    }

    public static ArrayList<Producto> AñadirProductos(ArrayList<Producto> productos){
        System.out.println("Ingrese Marca del producto: ");
        String marca = scan.nextLine();
        System.out.println("Ingrese el modelo del producto: ");
        String modelo = scan.nextLine();
        System.out.println("Ingrese costo del producto: ");
        float costo = scan.nextFloat();
        scan.nextLine();
        System.out.println("Seleccione tipo de dispositivo: ");
        System.out.println("1. Celular Android");
        System.out.println("2. Celular Iphone");
        System.out.println("3. Bafle");
        System.out.println("4. Tablet");
        System.out.println("5. Ipad");
        System.out.println("6. Indefinido");
        int numTipo = scan.nextInt();
        scan.nextLine();
        Producto.tipo tipo = Producto.tipo.CelularAndroid;
        switch (numTipo) {
            case 1:
                tipo = Producto.tipo.CelularAndroid;
                break;
            case 2:
                tipo = Producto.tipo.CelularIphone;
                break;
            case 3:
                tipo = Producto.tipo.Bafle;
                break;
            case 4:
                tipo = Producto.tipo.Tablet;
                break;
            case 5:
                tipo = Producto.tipo.Ipad;
                break;
            case 6:
                tipo = Producto.tipo.Indefinido;
                break;
            default:
                tipo = Producto.tipo.Indefinido;

        }
        

        productos.add(new Producto(modelo, marca, costo, tipo));
        return productos;
    }

    public static Producto cambiarEstado(Producto producto){
        producto.setRealizado(!producto.isRealizado());
        return producto;
    }
    public static Producto cambiarEntregado(Producto producto){
        producto.setEntregado(!producto.isEntregado());
        return producto;
    }


}
