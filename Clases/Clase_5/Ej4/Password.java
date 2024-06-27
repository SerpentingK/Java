package Ej4;

public class Password {
    int longitud = 8;
    String contraseña = "";
    char[] caracteres = {
            'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
            'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z',
            'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M',
            'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z',
            '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
            '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
            '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'
    };

    public Password() {
        contraseña = generarContraseña(this.longitud);
    }

    public Password(int longi) {
        contraseña = generarContraseña(longi);
    }

    public String generarContraseña(int l) {
        int numeroAleatorio = 0;
        String nuevaContraseña = "";
        for (int i = 0; i < l; i++) {
            numeroAleatorio = (int) (Math.random() * (caracteres.length));
            nuevaContraseña += caracteres[numeroAleatorio];
        }

        return nuevaContraseña;
    }

    public boolean esFuerte() {
        int mayus = 0, minus = 0, digits = 0;
        for (int i = 0; i < contraseña.length(); i++) {
            char caracter = contraseña.charAt(i);
            if (Character.isUpperCase(caracter)) {
                mayus++;
            } else if (Character.isLowerCase(caracter)) {
                minus++;
            } else if (Character.isDigit(caracter)) {
                digits++;
            }
        }
        return (mayus > 2 && minus > 1 && digits > 5);
    }

    public int getLongitud(){
        return longitud;
    }

    public void setLongitud(int l){
        longitud = l;
    }

    public String getContraseña(){
        return contraseña;
    }

}
