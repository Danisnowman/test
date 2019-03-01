import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfPTable;
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
        lista.add("Descripcion: " + iTestResult.getMethod().getDescription() + "Result: Success"+ " Status: " +iTestResult.getStatus());
    }

    public void onTestFailure(ITestResult iTestResult) {
        lista.add("Descripcion: " + iTestResult.getMethod().getDescription() + "Result: Fail" + " Status: " +iTestResult.getStatus());
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
            PdfWriter.getInstance(document, new FileOutputStream("reporte.pdf"));
        } catch (DocumentException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        document.open();
        document.addTitle("REPORTE");
        List unorderedList = new List(List.UNORDERED);
        //PdfPTable table = new PdfPTable(8);
        Font font = FontFactory.getFont(FontFactory.COURIER, 16, BaseColor.BLACK);
        Chunk chunk = new Chunk("REPORTE", font);
        try {
            document.add(chunk);
        } catch (DocumentException e) {
            e.printStackTrace();
        }
        for(int i = 0; i <lista.size(); i++){
            unorderedList.add(new ListItem(lista.get(i)+"\n"));
            try {
                document.add(unorderedList);
            } catch (DocumentException e) {
                e.printStackTrace();
            }
        }


        document.close();
    }
}
