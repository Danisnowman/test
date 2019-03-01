
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class dataProvider {

    @DataProvider(name = "nombre", parallel = true)
    public static Object[][] nombre() {
        return new Object[][]{
                {"andres", "bolanos"},
                {"bolanos aaaa", "bolanos"},
                {"", "hola"}
        };
    }
    /*public Object[][] locales() {
        List<Object[]> data = new ArrayList<Object[]>();
        /*for (int i = 0; i < 15; i++){
            data.add(new Integer[]{i});
        }
        String[][] strings = new String[3][3];
        strings[0][0] = "andres";
        strings [0][1] = "bolanos";
        data.add(strings);
        return strings;
    }*/

    @Test(dataProvider = "nombre", groups = {"testing"}, description = "Test pedirNombre ")
    public void testNombre(String nombre, String ap) throws InterruptedException {
        Main main = new Main();
        Assert.assertEquals(true, main.pedirNombre(nombre, ap));
    }

    @DataProvider(name = "edad", parallel = true)
    public static Object[][] edad() {
        return new Object[][]{
                {23},
                {-32},
                {0},
                {234}
        };
    }
    @Test(dataProvider = "edad", groups = {"testing"}, description = "Test pedirEdad ")
    public void testEdad(int edad) throws InterruptedException {
        Main main = new Main();
        Assert.assertEquals(true, main.pedirEdad(edad));
    }


    @DataProvider(name = "dpi", parallel = true)
    public static Object[][] dpi() {
        return new Object[][]{
                {"dpi"}
        };
    }
    @Test(dataProvider = "dpi", groups = {"testing"}, description = "Test pedirDpi ")
    public void testDpi(String dpi) throws InterruptedException {
        Main main = new Main();
        Assert.assertEquals(true, main.pedirDPI(dpi));
    }

    @DataProvider(name = "direccion", parallel = true)
    public static Object[][] direccion() {
        return new Object[][]{
                {"direccion"}
        };
    }
    @Test(dataProvider = "direccion", groups = {"testing"}, description = "Test pedirDireccion ")
    public void testDireccion(String direccion) throws InterruptedException {
        Main main = new Main();
        Assert.assertEquals(true, main.pedirDireccion(direccion));
    }

    @DataProvider(name = "correo", parallel = true)
    public static Object[][] correo() {
        return new Object[][]{
                {"correo"}
        };
    }
    @Test(dataProvider = "correo", groups = {"testing"}, description = "Test pedirCorreo ")
    public void testCorreo(String correo) throws InterruptedException {
        Main main = new Main();
        Assert.assertEquals(true, main.pedirCorreo(correo));
    }

    @DataProvider(name = "telefono", parallel = true)
    public static Object[][] telefono() {
        return new Object[][]{
                {"telefono"}
        };
    }
    @Test(dataProvider = "telefono", groups = {"testing"}, description = "Test pedirTelefono ")
    public void testTelefono(String telefono) throws InterruptedException {
        Main main = new Main();
        Assert.assertEquals(true, main.pedirTelefono(telefono));
    }
}