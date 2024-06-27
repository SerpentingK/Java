package EjercicioInjusto;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        String nombre;
        Float abono;
        ArrayList<Producto> productos = new ArrayList<Producto>();
        productos.add(new Producto("A03", "Samsung", 50000, Producto.tipo.CelularAndroid));
        productos.add(new Producto("A14", "Samsung", 60000, Producto.tipo.CelularIphone));
        ArrayList<Compra> compras = new ArrayList<Compra>();
        compras.add(new Compra("Carrillo", productos, 20000));
        productos = new ArrayList<Producto>();
        productos.add(new Producto("A04", "Samsung", 30000, Producto.tipo.CelularAndroid));
        productos.add(new Producto("A24", "Samsung", 60000, Producto.tipo.CelularIphone));
        compras.add(new Compra("David", productos, 20000));
        productos = new ArrayList<Producto>();
        productos.add(new Producto("A34", "Samsung", 30000, Producto.tipo.CelularAndroid));
        productos.add(new Producto("A74", "Samsung", 65000, Producto.tipo.CelularIphone));
        compras.add(new Compra("Juan", productos, 20000));

        boolean salir = false;
        do {
            System.out.println("\n---- MENÚ ----");
            System.out.println("1. Registrar nuevos clientes.");
            System.out.println("2. Consultar Cliente por código.");
            System.out.println("3. Consultar Clientes por fecha.");
            System.out.println("4. Actualizar cliente por código específico.");
            System.out.println("5. Eliminar cliente por código específico.");
            System.out.println("6. Consultar lista de clientes.");
            System.out.println("7. Consultar cliente por nombre.");
            System.out.println("8. Cambiar estado de producto");
            System.out.println("9. Cambiar estado Entregado.");
            System.out.println("Seleccione una opción:");

            int opcion = scan.nextInt();
            scan.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    do {
                        productos = new ArrayList<Producto>();
                        System.out.println("---- INGRESO DE CLIENTE ----");
                        System.out.println("Ingrese nombre del cliente: ");
                        nombre = scan.nextLine();
                        
                        do {
                            productos = Funciones.AñadirProductos(productos);
                            System.out.println("Deseas Añadir otro producto? ");
                            String r = scan.nextLine().toLowerCase();
                            if (r.equals("si")) {
                                continue;
                            } else {
                                break;
                            }
                        } while (true);

                        System.out.println("Ingrese abono del cliente: ");
                        abono = scan.nextFloat();
                        scan.nextLine();
                        
                        compras = Funciones.crearCliente(nombre, compras,productos, abono);

                        System.out.println("¿Desea ingresar otro cliente? (si/no)");
                        String respuesta = scan.nextLine();

                        if (respuesta.equalsIgnoreCase("no")) {
                            break;
                        }
                    } while (true);
                    break;
                case 2:
                    ArrayList<String> codigos = Funciones.Codigos(compras);
                    System.out.println("Ingrese codigo a buscar");
                    String codigo = scan.nextLine();
                    if (codigos.contains(codigo)) {
                        Compra compraBuscada = Funciones.BuscarPorCodigo(compras, codigo);
                        compraBuscada.String();
                    } else {
                        System.out.println("Codigo no encontrado en la base.");
                    }

                    System.out.println("Presione Enter para continuar...");
                    scan.nextLine();
                    break;
                case 3:
                    System.out.println("Ingrese la fecha inicial (formato dd/mm/yyyy): ");
                    String fechaInicial = scan.nextLine();

                    System.out.println("Ingrese la fecha final (formato dd/mm/yyyy): ");
                    String fechaFinal = scan.nextLine();

                    ArrayList<Compra> clientesEnRango = Funciones.ConsultarPorRangoFecha(compras, fechaInicial,
                            fechaFinal);

                    if (clientesEnRango.isEmpty()) {
                        System.out.println("No hay clientes en el rango de fechas especificado.");
                    } else {
                        System.out.println("Clientes en el rango de fechas:");
                        for (Compra compra : clientesEnRango) {
                            compra.String();
                        }
                    }
                    break;
                case 4:
                    System.out.println("Ingrese codigo a editar: ");
                    ArrayList<String> codigosEditar = Funciones.Codigos(compras);
                    String codigoBuscar = scan.next();
                    if (codigosEditar.contains(codigoBuscar)) {
                        compras = Funciones.ActualizarCliente(compras, codigoBuscar);
                    } else {
                        System.out.println("Codigo no encontrado en la base.");
                    }
                    break;
                case 5:
                    System.out.println("Ingrese codigo a eliminar: ");
                    ArrayList<String> codigosEliminar = Funciones.Codigos(compras);
                    String codigoEliminar = scan.next();
                    if (codigosEliminar.contains(codigoEliminar)) {
                        compras = Funciones.EliminarCliente(compras, codigoEliminar);
                    } else {
                        System.out.println("Codigo no encontrado en la base.");
                    }
                    break;
                case 6:
                    for (Compra compra : compras) {
                        compra.String();
                    }
                    System.out.println("Presione Enter para continuar...");
                    scan.nextLine();
                    break;
                case 7:
                    ArrayList<String> nombres = Funciones.Nombres(compras);
                    System.out.println("Ingrese nombre a buscar");
                    String nombreBuscar = scan.nextLine();
                    if (nombres.contains(nombreBuscar)) {
                        Compra compraBuscada = Funciones.BuscarPorNombre(compras, nombreBuscar);
                        compraBuscada.String();
                    } else {
                        System.out.println("Nombre no encontrado en la base.");
                    }

                    System.out.println("Presione Enter para continuar...");
                    scan.nextLine();
                    break;
                case 8:
                    ArrayList<String> codigosCambiar = Funciones.Codigos(compras);
                    System.out.println("Ingrese codigo a buscar");
                    String codigoCambiar = scan.nextLine();
                    if (codigosCambiar.contains(codigoCambiar)) {
                        Compra codigoBuscado = Funciones.BuscarPorCodigo(compras, codigoCambiar);
                        codigoBuscado.String();
                        for (int i = 0; i < codigoBuscado.getProductos().size(); i++) {
                            System.err.println(i + 1 + ". " + codigoBuscado.getProductos().get(i).getMarca() + "" + " "
                                    + codigoBuscado.getProductos().get(i).getModelo());
                        }
                        System.out.println("Ingresa qué dispositivo deseas cambiar el estado: ");
                        int r = Integer.parseInt(scan.nextLine());
                        if (r <= codigoBuscado.getProductos().size() && r > 0) {
                            codigoBuscado.getProductos().set(r - 1, Funciones.cambiarEstado(codigoBuscado.getProductos().get(r - 1)));
                            System.out.println(codigoBuscado.getProductos().get(r - 1).isRealizado());
                        } else {
                            System.out.println("Opción no válida.");
                        }
                    } else {
                        System.out.println("Codigo no encontrado en la base.");
                    }
                
                    System.out.println("Presione Enter para continuar...");
                    scan.nextLine();
                    break;
                    case 9:
                        // Obtener los códigos de todas las compras
                        ArrayList<String> codigosEntregar = Funciones.Codigos(compras);
                        System.out.println("Ingrese codigo a buscar");
                        String codigoEntregar = scan.nextLine();
                        if (codigosEntregar.contains(codigoEntregar)) {
                            // Buscar la compra correspondiente al código ingresado
                            Compra codigoBuscado = Funciones.BuscarPorCodigo(compras, codigoEntregar);
                            // Mostrar los datos del cliente y los productos comprados
                            codigoBuscado.String();
                            for (int i = 0; i < codigoBuscado.getProductos().size(); i++) {
                                System.err.println(i + 1 + ". " + codigoBuscado.getProductos().get(i).getMarca() + "" + " "
                                        + codigoBuscado.getProductos().get(i).getModelo());
                            }
                            System.out.println("Ingresa que dispositivo ha sido entregado: ");
                            // Leer el número de producto entregado
                            int r = Integer.parseInt(scan.nextLine());
                            if (r <= codigoBuscado.getProductos().size()) {
                                codigoBuscado.getProductos().set(r - 1, Funciones.cambiarEntregado(codigoBuscado.getProductos().get(r - 1)));
                                codigoBuscado.getProductos().set(r - 1, Funciones.cambiarEstado(codigoBuscado.getProductos().get(r - 1)));

                            } else {
                                System.out.println("Opción no válida.");
                            }
                        } else {
                            System.out.println("Codigo no encontrado en la base.");
                        }

                        System.out.println("Presione Enter para continuar...");
                        scan.nextLine();
                        break;

                
                case 10:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
                    break;
            }

        } while (!salir);

    }

}
