// GUI and main program for the Training Record
package com.stir.cscu9t4practical1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TrainingRecordGUI extends JFrame implements ActionListener {

    private JTextField projectType = new JTextField(18);
    private JTextField type = new JTextField(10);
    private JTextField size = new JTextField(3);
    private JTextField bedrooms = new JTextField(2);
    private JTextField landSize = new JTextField(2);
    private JTextField bathrooms = new JTextField(2);
    private Choice floodingRisk = new Choice();
    private JTextField material = new JTextField(5);
    private JTextField roof = new JTextField(5);
    private JTextField budget = new JTextField(4);
    private JTextField manager = new JTextField(7);
    private JTextField loc = new JTextField(9);
    private JTextField custID = new JTextField(10);
    private JTextField dur = new JTextField(3);
    private JTextField estStart = new JTextField(8);
    private JTextField actStart = new JTextField(8);
    private JTextField actEnd = new JTextField(8);
    private JTextField accCost = new JTextField(5);
    private JTextField excav = new JTextField(10);
    private JTextField width = new JTextField(2);
    private JTextField overlay = new JTextField(5);
    private JTextField span = new JTextField(3);
    private JTextField compos = new JTextField(5);
    private JTextField length = new JTextField(3);
    private JTextField stability = new JTextField(2);

    private JLabel labPT = new JLabel(" Project type:");
    private JLabel labT = new JLabel(" type:");
    private JLabel labS = new JLabel(" Size:");
    private JLabel labBed = new JLabel(" Bedrooms:");
    private JLabel lablS = new JLabel("Land size:");
    private JLabel labBath = new JLabel(" Bathrooms:");
    private JLabel labFR = new JLabel(" Flooding risk:");
    private JLabel labM = new JLabel(" Building material:");
    private JLabel labR = new JLabel(" Roof:");
    private JLabel labBudg = new JLabel("Budget:");
    private JLabel labMan = new JLabel("Project manager:");
    private JLabel labLoc = new JLabel("Location:");
    private JLabel labCustID = new JLabel("Customer id:");
    private JLabel labEstDur = new JLabel("Estimated duration:");
    private JLabel labEstStart = new JLabel("Estimated start:");
    private JLabel labActStart = new JLabel("Actual start:");
    private JLabel labActEnd = new JLabel("Actual end:");
    private JLabel labAccCost = new JLabel("Accumulated Cost:");
    private JLabel labExc = new JLabel("Excavating:");
    private JLabel labWidth = new JLabel("Width:");
    private JLabel labOverlay = new JLabel("Overlay:");
    private JLabel labSpan = new JLabel("Span:");
    private JLabel labComp = new JLabel("Current Composition:");
    private JLabel labLength = new JLabel("Length:");
    private JLabel labStab = new JLabel("Ground structural stability");


    private JButton addR = new JButton("Add");
    private JButton lookUpByDate = new JButton("Look Up");
    private JButton findAllByDate = new JButton("Find all");
    private JButton removeButton = new JButton("Remove Entry");
    private JRadioButton hasGarageButton = new JRadioButton("Garage");
    private JRadioButton notRenovatedButton = new JRadioButton("New");
    private JRadioButton safetyTunnelButton = new JRadioButton("Safety tunnel");
    private JRadioButton naturalReservesButton = new JRadioButton("Natural Reserves");


    private boolean hasGarage = false;
    private boolean notRenovated = false;
    private boolean safetyTunnel = false;
    private boolean naturalReserves = false;

    private JRadioButton houseButton = new JRadioButton("House");
    private JRadioButton landButton = new JRadioButton("Land");
    private JRadioButton tunnelButton = new JRadioButton("Tunnel");
    private JRadioButton bridgeButton = new JRadioButton("Bridge");
    private boolean house = false;
    private boolean land = false;
    private boolean tunnel = false;
    private boolean bridge = false;


    private TrainingRecord myAthletes = new TrainingRecord();

    private JTextArea outputArea = new JTextArea(20, 50);

    public static void main(String[] args) {
        TrainingRecordGUI applic = new TrainingRecordGUI();
    } // main

    // set up the GUI
    public TrainingRecordGUI() {
        super("Training Record");
        setLayout(new FlowLayout());
        outputArea.setLineWrap(true);
        outputArea.setWrapStyleWord(true);
        add(labPT);
        add(projectType);
        add(houseButton);
        houseButton.addActionListener(this);
        add(landButton);
        landButton.addActionListener(this);
        add(tunnelButton);
        tunnelButton.addActionListener(this);
        add(bridgeButton);
        bridgeButton.addActionListener(this);
        projectType.setEditable(true);
        add(labT);
        add(type);
        type.setEditable(true);
        add(labS);
        add(size);
        size.setEditable(true);
        add(labBed);
        add(bedrooms);
        bedrooms.setEditable(true);
        add(lablS);
        add(landSize);
        landSize.setEditable(true);
        add(labBath);
        add(bathrooms);
        bathrooms.setEditable(true);
        add(labFR);
        add(floodingRisk);
        floodingRisk.add("0");
        floodingRisk.add("1");
        floodingRisk.add("2");
        floodingRisk.add("3");
        floodingRisk.add("4");
        floodingRisk.add("5");
        add(labM);
        add(material);
        material.setEditable(true);
        add(labR);
        add(roof);
        roof.setEditable(true);
        add(labBudg);
        add(budget);
        budget.setEditable(true);
        add(labMan);
        add(manager);
        manager.setEditable(true);
        add(labLoc);
        add(loc);
        loc.setEditable(true);
        add(labCustID);
        add(custID);
        custID.setEditable(true);
        add(labEstDur);
        add(dur);
        dur.setEditable(true);
        add(labEstStart);
        add(estStart);
        estStart.setEditable(true);
        add(labActStart);
        add(actStart);
        actStart.setEditable(true);
        add(labActEnd);
        add(actEnd);
        actEnd.setEditable(true);
        add(labAccCost);
        add(accCost);
        accCost.setEditable(true);
        add(labExc);
        add(excav);
        excav.setEditable(true);
        add(labWidth);
        add(width);
        width.setEditable(true);
        add(labOverlay);
        add(overlay);
        overlay.setEditable(true);
        add(labSpan);
        add(span);
        span.setEditable(true);
        add(labComp);
        add(compos);
        compos.setEditable(true);
        add(labLength);
        add(length);
        length.setEditable(true);
        add(labStab);
        add(stability);
        stability.setEditable(true);
        //Radio buttons for Entry type selection
        add(hasGarageButton);
        add(notRenovatedButton);
        add(safetyTunnelButton);
        add(naturalReservesButton);
        hasGarageButton.addActionListener(this);
        notRenovatedButton.addActionListener(this);
        safetyTunnelButton.addActionListener(this);
        naturalReservesButton.addActionListener(this);
        //
        add(addR);
        addR.addActionListener(this);
        add(findAllByDate);
        findAllByDate.addActionListener(this);
        add(removeButton);
        removeButton.addActionListener(this);
        add(outputArea);
        outputArea.setEditable(false);

        Entry a;
        String row = "";
        try {
            BufferedReader csvReader = new BufferedReader(new FileReader("jenga_projects.csv"));
            int k = 0;
            while ((row = csvReader.readLine()) != null) {
                if (k == 0) {
                    k++;
                }
                String[] data = row.split(",");
                SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");

                if (data[0].contains("House")) {
                    if (data[16] == "") {
                        data[16] = "0000-00-00";
                    }
                    if (data[17] == "") {
                        data[17] = "0000-00-00";
                    }
                    if (data[18] == "") {
                        data[18] = "0000-00-00";
                    }
                    a = new House(data[0], data[1], Integer.parseInt(data[10]), data[11], data[12], data[14],
                            Integer.parseInt(data[15]), date.parse(data[16]), date.parse(data[17]), date.parse(data[18]),
                            Integer.parseInt(data[19]), Boolean.parseBoolean(data[13]), Integer.parseInt(data[2].replace(" m2", "")),
                            Float.parseFloat(data[3]), Float.parseFloat(data[4].replace(" acres", "")), Float.parseFloat(data[5]),
                            Float.parseFloat(data[6]), Boolean.parseBoolean(data[7]), data[8], data[9]);
                    myAthletes.addEntry(a);
                } else if (data[0].contains("Land")) {
                    if (data[16] == "") {
                        data[16] = "0000-00-00";
                    }
                    if (data[17] == "") {
                        data[17] = "0000-00-00";
                    }
                    if (data[18] == "") {
                        data[18] = "0000-00-00";
                    }
                    a = new House(data[0], data[1], Integer.parseInt(data[10]), data[11], data[12], data[14],
                            Integer.parseInt(data[15]), date.parse(data[16]), date.parse(data[17]), date.parse(data[18]),
                            Integer.parseInt(data[19]), Boolean.parseBoolean(data[13]), Integer.parseInt(data[2].replace(" m2", "")),
                            Float.parseFloat(data[3]), Float.parseFloat(data[4].replace(" acres", "")), Float.parseFloat(data[5]),
                            Float.parseFloat(data[6]), Boolean.parseBoolean(data[7]), data[8], data[9]);
                    myAthletes.addEntry(a);
                } else if (data[0].contains("Tunnel")) {
                    if (data[16] == "") {
                        data[16] = "0000-00-00";
                    }
                    if (data[17] == "") {
                        data[17] = "0000-00-00";
                    }
                    if (data[18] == "") {
                        data[18] = "0000-00-00";
                    }
                    a = new Tunnel(data[0], data[1], Integer.parseInt(data[10]), data[11], data[12], data[14],
                            Integer.parseInt(data[15]), date.parse(data[16]), date.parse(data[17]), date.parse(data[18]),
                            Integer.parseInt(data[19]), Boolean.parseBoolean(data[13]), data[20],
                            Integer.parseInt(data[21].replace(" m", "")), data[22], Boolean.parseBoolean(data[23]),
                            Integer.parseInt(data[26].replace(" m","")), Float.parseFloat(data[28]));
                    myAthletes.addEntry(a);
                } else if (data[0].contains("Bridge")) {
                    if (data[16] == "") {
                        data[16] = "0000-00-00";
                    }
                    if (data[17] == "") {
                        data[17] = "0000-00-00";
                    }
                    if (data[18] == "") {
                        data[18] = "0000-00-00";
                    }
                    a = new Bridge(data[0], data[1], Integer.parseInt(data[10]), data[11], data[12], data[14],
                            Integer.parseInt(data[15]), date.parse(data[16]), date.parse(data[17]), date.parse(data[18]),
                            Integer.parseInt(data[19]), Boolean.parseBoolean(data[13]), Float.parseFloat(data[6]), data[8],
                            Integer.parseInt(data[21].replace(" m", "")), data[22],Integer.parseInt(data[24].replace(" m", "")));
                    myAthletes.addEntry(a);
                }
                else if (data[0].contains("Land")) {
                    if (data[16] == "") {
                        data[16] = "0000-00-00";
                    }
                    if (data[17] == "") {
                        data[17] = "0000-00-00";
                    }
                    if (data[18] == "") {
                        data[18] = "0000-00-00";
                    }
                    a = new Land(data[0], data[1], Integer.parseInt(data[10]), data[11], data[12], data[14],
                            Integer.parseInt(data[15]), date.parse(data[16]), date.parse(data[17]), date.parse(data[18]),
                            Integer.parseInt(data[19]), Boolean.parseBoolean(data[13]),
                            Integer.parseInt(data[2].replace(" acres", "")), data[25],Boolean.parseBoolean(data[27]));
                    myAthletes.addEntry(a);
                }
                }
            csvReader.close();
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
        setLocation(350, 200);
        setSize(1300, 700);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

//        blankDisplay();

        // To save typing in new entries while testing, uncomment
        // the following lines (or add your own test cases)

    } // constructor

    // listen for and respond to GUI events
    public void actionPerformed(ActionEvent event) {
        String message = "";
        if (hasGarageButton.isSelected()) {
            hasGarage = true;
        }
        if (safetyTunnelButton.isSelected()) {
            safetyTunnel = true;
        }
        if (notRenovatedButton.isSelected()) {
            notRenovated = true;
        }
        if (naturalReservesButton.isSelected()) {
            naturalReserves = true;
        }
        if (event.getSource() == addR) {
            message = addEntry("generic");
//            blankDisplay();
        }
        if (event.getSource() == findAllByDate) {
            message = lookupEntries();
//            blankDisplay();
        }
        if (event.getSource() == removeButton) {
            message = removeEntry();
//            blankDisplay();
        }
        if (event.getSource() == houseButton) {
            house = true;
            tunnelButton.setSelected(false);
            bridgeButton.setSelected(false);
            landButton.setSelected(false);
        }
        if (event.getSource() == tunnelButton) {
            tunnel = true;
            houseButton.setSelected(false);
            bridgeButton.setSelected(false);
            landButton.setSelected(false);
        }
        if (event.getSource() == bridgeButton) {
            bridge = true;
            houseButton.setSelected(false);
            tunnelButton.setSelected(false);
            landButton.setSelected(false);
        }
        if (event.getSource() == landButton) {
            land = true;
            houseButton.setSelected(false);
            tunnelButton.setSelected(false);
            bridgeButton.setSelected(false);
        }
        outputArea.setText(message);

    } // actionPerformed

    public String addEntry(String what) {
        String message = "Cannot add entry when one or more fields are empty.";

        try {
            String pt = projectType.getText();
            String t = type.getText();
            int b = Integer.parseInt(budget.getText());
            String mngr = manager.getText();
            String l = loc.getText();
            boolean notR = Boolean.valueOf(notRenovated);
            String id = custID.getText();
            int ed = Integer.parseInt(dur.getText());
            Date es = new SimpleDateFormat("dd/MM/yyyy").parse(estStart.getText());
            Date as = new SimpleDateFormat("dd/MM/yyyy").parse(actStart.getText());
            Date ae = new SimpleDateFormat("dd/MM/yyyy").parse(actEnd.getText());
            int acc = Integer.parseInt(accCost.getText());

            Entry e;
            if (house) {
                int s = Integer.parseInt(size.getText());
                int bed = Integer.parseInt(bedrooms.getText());
                float ls = Float.parseFloat(landSize.getText());
                int bath = Integer.parseInt(bathrooms.getText());
                int fr = Integer.parseInt(floodingRisk.getSelectedItem());
                boolean g = Boolean.valueOf(hasGarage);
                String mat = material.getText();
                String r = roof.getText();
                e = new House(pt, t, b, mngr, l, id, ed, es, as, ae, acc, notR, s, bed, ls, bath, fr, g, mat, r);
            } else if (land) {
                String c = compos.getText();
                boolean nr = Boolean.valueOf(naturalReserves);
                int s = Integer.parseInt(size.getText());

                e = new Land(pt, t, b, mngr, l, id, ed, es, as, ae, acc, notR, s, c, nr);
            } else if (tunnel) {
                String ex = excav.getText();
                String o = overlay.getText();
                boolean st = Boolean.valueOf(safetyTunnel);
                int le = Integer.parseInt(length.getText());
                int gss = Integer.parseInt(stability.getText());
                int w = Integer.parseInt(width.getText());
                e = new Tunnel(pt, t, b, mngr, l, id, ed, es, as, ae, acc, notR, ex, w, o, st, le, gss);
            } else if (bridge) {
                int sp = Integer.parseInt(span.getText());
                int fr = Integer.parseInt(floodingRisk.getSelectedItem());
                String mat = material.getText();
                String o = overlay.getText();
                int w = Integer.parseInt(width.getText());
                e = new Bridge(pt, t, b, mngr, l, id, ed, es, as, ae, acc, notR, fr, mat, w, o, sp);
            } else {
                e = new Entry(pt, t, b, mngr, l, id, ed, es, as, ae, acc, notR);
            }
            message = myAthletes.addEntry(e);
            System.out.println("Adding an entry to the records");
        } catch (Exception e) {
            System.out.println(e);
        }

        return message;
    }

    public String lookupEntries() {
        String message = "Cannot lookup when fields are empty.";
        try {
            String m = loc.getText();
            outputArea.setText("looking up records ...");
            message = myAthletes.lookupEntries(m);
        } catch (Exception e) {
            //
        }
        return message;
    }

    public String removeEntry() {
        String message = "Please.";
        try {
            String n = projectType.getText();
            message = myAthletes.removeEntry(n);
        } catch (Exception e) {
            //
        }
        return message;
    }

    public void blankDisplay() {
        projectType.setText("");
        type.setText("");
        size.setText("");
        bedrooms.setText("");
        landSize.setText("");
        bathrooms.setText("");
        material.setText("");
        roof.setText("");
        budget.setText("");
        manager.setText("");
        loc.setText("");
        custID.setText("");
        floodingRisk.select(0);
        dur.setText("");
        estStart.setText("");
        actStart.setText("");
        actEnd.setText("");
        accCost.setText("");
        excav.setText("");
        width.setText("");
        overlay.setText("");
        span.setText("");
        compos.setText("");
        length.setText("");
        stability.setText("");

    }// blankDisplay
}
    // TrainingRecordGUI

