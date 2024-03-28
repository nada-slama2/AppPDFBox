package com.example.testpdf;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDDocumentCatalog;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm;
import org.apache.pdfbox.pdmodel.interactive.form.PDField;

import java.io.File;
import java.io.IOException;

public class PDFFormFiller {

    public static void main(String[] args) {
        try {
            // Load the existing PDF form
            File file = new File("C:\\Users\\DELL\\Downloads\\tvaaaaa.pdf");
            PDDocument document = PDDocument.load(file);

            // Get the document catalog
            PDDocumentCatalog catalog = document.getDocumentCatalog();

            // Get the acroform
            PDAcroForm acroForm = catalog.getAcroForm();

            // Retrieve all fields from the form
            for (PDField field : acroForm.getFields()) {
                // Identify the field by its name
                String fieldName = field.getFullyQualifiedName();

                // Check if it's a text field
                if (field instanceof PDField) {
                    // Set the value for the field
                    field.setValue("testing");
                }
                // Add other conditions for different types of fields (e.g., checkboxes, radio buttons, etc.)
            }

            // Save the modified PDF
            document.save("C:\\\\Users\\\\DELL\\\\Downloads\\tvaaaaa1.pdf");

            // Close the document
            document.close();

            System.out.println("PDF form filled successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

