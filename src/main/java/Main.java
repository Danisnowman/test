public class Main {
    public void pedirNombre(String nombre){
        if(nombre == ""){
            System.out.println("Error, " + nombre + "is empty.");
        } else if (nombre.length()<3 ){
            System.out.println("Error, " + nombre + "is too small, please do not use abbreviations.");
        } else if (nombre.matches(".*\\d+.*")){
            System.out.println("Error, " + nombre + "contains invalid characters.");
        }
    }

    public void pedirDPI(String dpi){
        if(dpi == ""){
            System.out.println("Error, " + dpi + "is empty.");
        } else if (!(dpi.length() == 13 )){
            System.out.println("Error, " + dpi + "is not a DPI number.");
        } else if (!dpi.matches(".*\\d+.*")){
            System.out.println("Error, " + dpi + "contains invalid characters.");
        }
    }

    public void pedirEdad(int edad){
        if(edad == 0){
            System.out.println("Error, " + edad + "cannot be 0.");
        } else if (edad < 0){
            System.out.println("Error, " + edad + "cannot be a negative number.");
        } else if (edad > 140){
            System.out.println("Error, " + edad + "is too big.");
        }
    }


    public void pedirCorreo(String correo){
        if(correo == "") {
            System.out.println("Error, " + correo + " is empty.");
        } else if(correo.length()<10){
            System.out.println("Error, " + correo + " is not a valid email.");
        } else if(!correo.endsWith(".com") || !correo.endsWith(".edu") || !correo.endsWith(".io")){
            System.out.println("Error, " + correo + " is not on a valid mail domain name.");
        } else if(!correo.contains("@")){
            System.out.println("Error, " + correo + " Invalid email address");
        }
    }

    public void pedirDireccion(String direccion){
        if(direccion == "") {
            System.out.println("Error, " + direccion + "is empty.");
        } else if(!direccion.toLowerCase().contains("guatemala")){
            System.out.println("Error, " + direccion + "is not located in Guatemala.");
        } else if(direccion.length()<20){
            System.out.println("Error, " + direccion + " is to ambiguous.");
        }
    }

    public void pedirTelefono(String telefono){
        if(telefono == ""){
            System.out.println("Error, " + telefono + "is too small to be a phone number.");
        }
        else if(telefono.length() < 8){
            System.out.println("Error, " + telefono + "is too small to be a phone number.");
        } else if (telefono.matches("-?\\d+")){
            System.out.println("Error, " + telefono + "is not a phone number.");
        }
    }
}
