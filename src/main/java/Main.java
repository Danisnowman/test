public class Main {
    Persona persona = new Persona();
    public boolean pedirNombre(String nombre, String ap){
        boolean respuesta = false;
        if(nombre!=""){
            if(nombre.length()<=11){
               persona.setNombre(nombre);
               respuesta = true;
            }else{
                System.out.println("nombre no puede ser mayor a 10 caracteres");
            }
        }else{
            System.out.println("Nombre no puede ser vacio");
        }
        return respuesta;
    }
    public boolean pedirDPI(String dpi){ //funcione= 1234567891 falle=""  falle=12345678901234567  falle= 123456789012c
        boolean ret = false;
        if(dpi == ""){
            System.out.println("Error, " + dpi + "is empty.");
        } else if (!(dpi.length() == 13 )){
            System.out.println("Error, " + dpi + "is not a DPI number.");
        } else if (!dpi.matches(".\\d+.")){
            System.out.println("Error, " + dpi + "contains invalid characters.");
        }else{
            ret = true;
        }
        return ret;
    }

    public boolean pedirEdad(int edad){ //funcione= 23  falle= 0  falle= -32  falle= 234
        boolean ret = false;
        if(edad == 0){
            System.out.println("Error, " + edad + "cannot be 0.");
        } else if (edad < 0){
            System.out.println("Error, " + edad + "cannot be a negative number.");
        } else if (edad > 140){
            System.out.println("Error, " + edad + "is too big.");
        }else{
            ret = true;
        }
        return  ret;
    }


    public boolean pedirCorreo(String correo){ //funcione=danisnowman@gmail.com  falle=""  falle= danisnowman  falle= j@gmail.com
        boolean ret = false;
        if(correo == "") {
            System.out.println("Error, " + correo + " is empty.");
        } else if(correo.length()<10){
            System.out.println("Error, " + correo + " is not a valid email.");
        } else if(!correo.endsWith(".com") || !correo.endsWith(".edu") || !correo.endsWith(".io")){
            System.out.println("Error, " + correo + " is not on a valid mail domain name.");
        } else if(!correo.contains("@")){
            System.out.println("Error, " + correo + " Invalid email address");
        }else{
            ret = true;
        }
        return ret;
    }

    public boolean pedirDireccion(String direccion){//funcione= Guatemala carretra a el salvador km 17 colinas de andalucia  falle=""  falle= guatemala  falle= carretra a el salvador km 17 colinas de andalucia
        boolean ret = false;
        if(direccion == "") {
            System.out.println("Error, " + direccion + "is empty.");
        } else if(!direccion.toLowerCase().contains("guatemala")){
            System.out.println("Error, " + direccion + "is not located in Guatemala.");
        } else if(direccion.length()<20){
            System.out.println("Error, " + direccion + " is to ambiguous.");
        }else{
            ret = true;
        }
        return ret;
    }

    public boolean pedirTelefono(String telefono){ //funcione=30232185  falle=""  falle= 3023218  falle= 302321b5
        boolean ret = false;
        if(telefono == ""){
            System.out.println("Error, " + telefono + "is too small to be a phone number.");
        }
        else if(telefono.length() < 8){
            System.out.println("Error, " + telefono + "is too small to be a phone number.");
        } else if (telefono.matches("-?\\d+")){
            System.out.println("Error, " + telefono + "is not a phone number.");
        }else{
            ret = true;
        }
        return ret;
    }

}
