import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfWriter;
import org.testng.*;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.sql.SQLOutput;
import java.util.ArrayList;

public class ListenerTest implements ITestListener, ISuiteListener
{
    public static Document document = new Document();
    public static ArrayList<String> lista = new ArrayList<String>();


    public void onTestStart(ITestResult iTestResult) {

    }

    public void onTestSuccess(ITestResult iTestResult) {
        lista.add("Descripcion: " + iTestResult.getMethod().getDescription() + "Result: Success");
    }

    public void onTestFailure(ITestResult iTestResult) {
        lista.add("Descripcion: " + iTestResult.getMethod().getDescription() + "Result: Fail");
        String s = iTestResult.getMethod().getDescription();
        System.out.println(s);
    }

    public void onTestSkipped(ITestResult iTestResult) {

    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    public void onStart(ITestContext iTestContext) {

    }

    public void onFinish(ITestContext iTestContext) {

    }

    public void onStart(ISuite iSuite) {

    }

    public void onFinish(ISuite iSuite) {
        System.out.println("Description Suite");
        document = new Document();
        try {
            PdfWriter.getInstance(document, new FileOutputStream("iTextHelloWorld.pdf"));
        } catch (DocumentException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        document.open();
        Font font = FontFactory.getFont(FontFactory.COURIER, 16, BaseColor.BLACK);
        for(int i = 0; i <lista.size(); i++){
            Chunk chunk = new Chunk(lista.get(i)+"\n", font);
            Chunk chunk1 = new Chunk("\n", font);
            try {
                document.add(chunk);
                document.add(chunk1);
            } catch (DocumentException e) {
                e.printStackTrace();
            }
        }


        document.close();
    }
}
