package com.example.testpdf;

import org.apache.pdfbox.pdmodel.PDDocument;

import org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm;
import org.apache.pdfbox.text.PDFTextStripper;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.apache.pdfbox.pdmodel.interactive.form.PDTextField;

import javax.swing.JFileChooser;
import java.awt.GraphicsEnvironment;
import java.io.File;

@SpringBootApplication
public class Extractor {

    public static void main(String[] args) throws Exception {
    	
    	
    	//Raw test
    	
    	
    	 
        // Path to the PDF form template
        String formTemplate = "C:\\Users\\DELL\\Downloads\\input.pdf";
    
        PDDocument pdfDocument = PDDocument.load(new File(formTemplate));

        // Get the document catalog
        PDAcroForm acroForm = pdfDocument.getDocumentCatalog().getAcroForm();
     

        // Null check for AcroForm entry
        if (acroForm != null) {
            // Retrieve an individual field and set its value.
            PDTextField field = (PDTextField) acroForm.getField("soc");
            field.setValue("Elzei Cons");
            
            
            // Retrieve and set value for the field "company_name"
            PDTextField fieldnext = (PDTextField) acroForm.getField("undefined_2");
            fieldnext.setValue("00000000000000");
            
            
            
            PDTextField field0 = (PDTextField) acroForm.getField("undefined_3");
            field0.setValue("sahloul");
            
            
            PDTextField field1 = (PDTextField) acroForm.getField("fill_18");
            field1.setValue("00/00/0000");
            
            PDTextField field2 = (PDTextField) acroForm.getField("Row1");
            field2.setValue("fff");
            
            PDTextField field3 = (PDTextField) acroForm.getField("Row1_2");
            field3.setValue("periode");
            
        
         
            PDTextField field4 = (PDTextField) acroForm.getField("Row1_3");
            field4.setValue("00/00/0000");
            
            PDTextField field5 = (PDTextField) acroForm.getField("Row1_4");
            field5.setValue("opt");
            
            PDTextField field6 = (PDTextField) acroForm.getField("	 Row1");
            field6.setValue("service");
            
            PDTextField field7 = (PDTextField) acroForm.getField("Row1_5");
            field7.setValue("reg");
            
      
            
            PDTextField field9 = (PDTextField) acroForm.getField("2223");
            field9.setValue("0000");
            
            PDTextField field10 = (PDTextField) acroForm.getField("2229");
            field10.setValue("0000");
            
            PDTextField field11 = (PDTextField) acroForm.getField("2232");
            field11.setValue("0000");
            
            PDTextField field12 = (PDTextField) acroForm.getField(" 70 8 71782 H876 77 9I3 888");
            field12.setValue("elzei_consulting");
            
            PDTextField field13 = (PDTextField) acroForm.getField("7");
            field13.setValue("penalite");
            
            PDTextField field14 = (PDTextField) acroForm.getField("229");
            field14.setValue("0000");
            
            PDTextField field15 = (PDTextField) acroForm.getField("22");
            field15.setValue("0000");
            
            PDTextField field16 = (PDTextField) acroForm.getField("22_2");
            field16.setValue("0000");
            
            PDTextField field17 = (PDTextField) acroForm.getField("  54A 5 	B	 08774");
            field17.setValue("00/00/0000");
            
           
            
            
            
            
            
            PDTextField field19 = (PDTextField) acroForm.getField("2 23 22JJ 229 2293 22J 22F3 22F2 22J2 22FRow1");
            field19.setValue("0000");
            
            PDTextField field20 = (PDTextField) acroForm.getField("233");
            field20.setValue("tva_pred");
            
            PDTextField field21 = (PDTextField) acroForm.getField("1 	 	 3	 Q 	 F");
            field21.setValue("tva_due");
            
           
            
            PDTextField field27 = (PDTextField) acroForm.getField("fill_8");
            field27.setValue("z");
            
            PDTextField field28 = (PDTextField) acroForm.getField("fill_9");
            field28.setValue("z1");
            
            PDTextField field29 = (PDTextField) acroForm.getField("fill_13");
            field29.setValue("tot");
            
            PDTextField field30 = (PDTextField) acroForm.getField("77 770F  8");
            field30.setValue("det");
            
            PDTextField field31 = (PDTextField) acroForm.getField("77 770F  8");
            field31.setValue("det_mon");
         
            
            
            
            
            
            
        }  else {
            System.out.println("The PDF does not contain a form.");
        }
            

        // Save and close the filled out form.
        pdfDocument.save("C:\\Users\\DELL\\Downloads\\output.pdf");
   
        
        // Close the filled form document
        pdfDocument.close();}

    
  
    	
    	
       
//
//        if (isHeadless()) {
//            System.out.println("Running in a headless environment. Skipping GUI operations.");
//            // Handle the headless environment case appropriately
//            // For example, you can provide instructions to the user to specify the PDF file path via command line arguments
//        } else {
//            openFileChooser();
//        }

    private static void openFileChooser() {
        try {
            // Create a file chooser
            JFileChooser fileChooser = new JFileChooser();

            // Show the file chooser dialog
            int result = fileChooser.showOpenDialog(null);

            // Check if a file was selected
            if (result == JFileChooser.APPROVE_OPTION) {
                // Get the selected file
                File selectedFile = fileChooser.getSelectedFile();

                // Process the selected PDF file
                processPDF(selectedFile);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void processPDF(File selectedFile) {
        try {
            // Load the PDF document
            PDDocument document = PDDocument.load(selectedFile);

            // Create PDFTextStripper object
            PDFTextStripper pdfTextStripper = new PDFTextStripper();

            // Extract text from the PDF document
            String text = pdfTextStripper.getText(document);

            // Path to the PDF form template
            String formTemplate = "C:\\Users\\DELL\\Downloads\\output.pdf";

            // Load the form template PDF
            PDDocument pdfDocument = PDDocument.load(new File(formTemplate));

            // Get the document catalog
            PDAcroForm acroForm = pdfDocument.getDocumentCatalog().getAcroForm();

            // Null check for AcroForm entry
            if (acroForm != null) {
                // Retrieve an individual field and set its value.
                PDTextField field = (PDTextField) acroForm.getField("soc");
                field.setValue("Elzei Cons");

                
                

            // Save and close the filled out form.
            pdfDocument.save("C:\\Users\\DELL\\Downloads\\output.pdf");

            // Close the filled form document
            pdfDocument.close();

            // Close the original PDF document
            document.close();
        } }catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static boolean isHeadless() {
        return GraphicsEnvironment.isHeadless();
    }
}
