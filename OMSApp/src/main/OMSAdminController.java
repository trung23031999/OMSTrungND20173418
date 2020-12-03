package main;

import editdialog.EditBookController;

import javax.swing.*;

public class OMSAdminController{
    private EditBookController controller;

    public OMSAdminController() {
        controller = new EditBookController();
    }

    public JPanel getBookPage() {
        return controller.getDataPagePane();
    }
}
