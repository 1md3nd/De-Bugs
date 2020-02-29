package com.example.debugnote;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class PDFOpener extends AppCompatActivity {

    PDFView myPDFViewer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdfopener);

        myPDFViewer = (PDFView) findViewById(R.id.pdfViewer);

        String getItem = getIntent().getStringExtra("pdfFileName");

        if(getItem.equals("Physics"))
        {
            myPDFViewer.fromAsset("physics module 2.pdf");
        }
        if(getItem.equals("Chemistry"))
        {
            myPDFViewer.fromAsset("chemistry module 1.pdf");
        }
        if(getItem.equals("Computer"))
        {
            myPDFViewer.fromAsset("c programming module 1.pdf");
        }
        if(getItem.equals("Circuits"))
        {
            myPDFViewer.fromAsset("ANALOG CIRCUITS UNIT 3.pdf");
        }
        if(getItem.equals("DataStructures"))
        {
            myPDFViewer.fromAsset("Stack Notes.pdf");
        }
        if(getItem.equals("Electrical"))
        {
            myPDFViewer.fromAsset("physcis module 5.pdf");
        }
    }
}
