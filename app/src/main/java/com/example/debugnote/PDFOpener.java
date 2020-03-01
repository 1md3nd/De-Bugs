package com.example.debugnote;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.WindowManager;

import com.github.barteksc.pdfviewer.PDFView;

public class PDFOpener extends AppCompatActivity {

    PDFView myPDFViewer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_SECURE, WindowManager.LayoutParams.FLAG_SECURE);
        setContentView(R.layout.activity_pdfopener);

        myPDFViewer = (PDFView) findViewById(R.id.pdfViewer);

        String getItem = getIntent().getStringExtra("pdfFileName");

        if(getItem.equals("Physics(Applied Sciences)"))
        {
            myPDFViewer.fromAsset("physics module 2.pdf").load();
        }
        if(getItem.equals("Chemistry(Applied Sciences)"))
        {
            myPDFViewer.fromAsset("chemistry module 1.pdf").load();
        }
        if(getItem.equals("Computer(Applied Sciences)"))
        {
            myPDFViewer.fromAsset("c programming module 1.pdf").load();
        }
        if(getItem.equals("Analog Circuits(ECE)"))
        {
            myPDFViewer.fromAsset("ANALOG CIRCUITS UNIT 3.pdf").load();
        }
        if(getItem.equals("DataStructures(CSE)"))
        {
            myPDFViewer.fromAsset("Stack Notes.pdf").load();
        }
        if(getItem.equals("Electrical(Applied Sciences)"))
        {
            myPDFViewer.fromAsset("physcis module 5.pdf").load();
        }
    }
}
