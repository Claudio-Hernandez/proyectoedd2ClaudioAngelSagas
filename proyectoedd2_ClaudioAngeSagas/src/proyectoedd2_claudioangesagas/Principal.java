/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoedd2_claudioangesagas;

import java.awt.BorderLayout;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
//Las del video
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Attr;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;

/**
 *
 * @author Usuario
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        
        initComponents();
        if (registros.isEmpty()&&llaves.isEmpty()) {
            jButton19.setEnabled(false);
            jButton9.setEnabled(false);
            jButton29.setEnabled(false);
            jButton20.setEnabled(false);
        }
        this.setLocationRelativeTo(null);
        buttonGroup1.add(rb_si);
        buttonGroup1.add(rb_no);
        jComboBox2.setSelectedIndex(1);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        campos = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jLabel8 = new javax.swing.JLabel();
        rb_si = new javax.swing.JRadioButton();
        rb_no = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtable_campos = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        misArchivos = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        arbolArchivos = new javax.swing.JTree();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jt_archivoActual = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        buttonGroup1 = new javax.swing.ButtonGroup();
        registros_gui = new javax.swing.JDialog();
        jPanel4 = new javax.swing.JPanel();
        botonGuardarRegistros = new javax.swing.JButton();
        botonBuscarRegistro = new javax.swing.JButton();
        botonEliminarRegistro = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabla_registro = new javax.swing.JTable();
        jButton17 = new javax.swing.JButton();
        fecha_de_modificacion = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        campoFiltro = new javax.swing.JTextField();
        textoFiltro = new javax.swing.JLabel();
        jButton26 = new javax.swing.JButton();
        botonModificarRegistro = new javax.swing.JButton();
        estandarizacion = new javax.swing.JDialog();
        botonExcel = new javax.swing.JButton();
        botonXML = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        crearIndices_reindexar = new javax.swing.JDialog();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        reindexar = new javax.swing.JDialog();
        jButton25 = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        jt_reindexar = new javax.swing.JTable();
        guiModificarRegistro = new javax.swing.JDialog();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabla_registro2 = new javax.swing.JTable();
        jButton16 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        campoFiltro2 = new javax.swing.JTextField();
        textoFiltro2 = new javax.swing.JLabel();
        guiBorrarRegistro = new javax.swing.JDialog();
        jScrollPane6 = new javax.swing.JScrollPane();
        tabla_registro3 = new javax.swing.JTable();
        botonBuscarRegistroBorrar = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        campoFiltro3 = new javax.swing.JTextField();
        textoFiltro3 = new javax.swing.JLabel();
        guiAgregarRegistro = new javax.swing.JDialog();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tablaguardarRegistros = new javax.swing.JTable();
        jButton15 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jd_archivoCruzar = new javax.swing.JDialog();
        jScrollPane8 = new javax.swing.JScrollPane();
        jt_campos1 = new javax.swing.JTable();
        jButton30 = new javax.swing.JButton();
        jScrollPane9 = new javax.swing.JScrollPane();
        jt_campos2 = new javax.swing.JTable();
        jButton31 = new javax.swing.JButton();
        jScrollPane10 = new javax.swing.JScrollPane();
        jt_camposCruzados = new javax.swing.JTable();
        jButton32 = new javax.swing.JButton();
        pop_camposMenu = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton12 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();

        campos.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                camposWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                camposWindowClosing(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(45, 64, 89));

        jTextField1.setBackground(new java.awt.Color(222, 205, 195));
        jTextField1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setText("CAMPOS");

        jButton3.setBackground(new java.awt.Color(234, 84, 85));
        jButton3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton3.setText("Volver");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(234, 84, 85));
        jButton4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton4.setText("Agregar nuevo campo");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(234, 84, 85));
        jButton7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton7.setText("Eliminar campo");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(234, 84, 85));
        jButton8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton8.setText("Modificar campo");
        jButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton8MouseClicked(evt);
            }
        });

        jLabel5.setText("Nombre del campo");

        jLabel6.setText("Tipo");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "int", "char", "double", "String", "boolean" }));
        jComboBox2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox2ItemStateChanged(evt);
            }
        });
        jComboBox2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBox2MouseClicked(evt);
            }
        });

        jLabel7.setText("Longitud");

        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(1, 1, 10, 1));

        jLabel8.setText("Es llave primaria?");

        rb_si.setText("Si");

        rb_no.setText("No");

        jtable_campos.setFont(new java.awt.Font("Segoe UI Symbol", 0, 12)); // NOI18N
        jtable_campos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Tipo", "Longitud", "Llave Primaria"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtable_campos.setGridColor(new java.awt.Color(51, 51, 51));
        jtable_campos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtable_camposMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtable_campos);

        jLabel9.setText("Para modificar/eliminar seleccione uno de la tabla");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jSpinner1))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addGap(18, 18, 18)
                                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(rb_si)
                                .addGap(18, 18, 18)
                                .addComponent(rb_no)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 313, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(79, 79, 79))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jButton3)
                                .addGap(324, 324, 324)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jButton4)
                                .addGap(18, 18, 18)
                                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton7)))
                        .addGap(0, 565, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel6)
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(26, 26, 26)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel7)
                                .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(rb_si)
                                .addComponent(rb_no)
                                .addComponent(jLabel8))
                            .addGap(180, 180, 180))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(jLabel9)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(354, 354, 354)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(57, 57, 57))))
        );

        javax.swing.GroupLayout camposLayout = new javax.swing.GroupLayout(campos.getContentPane());
        campos.getContentPane().setLayout(camposLayout);
        camposLayout.setHorizontalGroup(
            camposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        camposLayout.setVerticalGroup(
            camposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        misArchivos.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                misArchivosWindowClosing(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(12, 34, 51));

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 87, 34));
        jLabel3.setText("Mis archivos");

        arbolArchivos.setBackground(new java.awt.Color(6, 84, 113));
        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Mis archivos");
        arbolArchivos.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        arbolArchivos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                arbolArchivosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(arbolArchivos);

        jButton5.setBackground(new java.awt.Color(243, 10, 73));
        jButton5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(0, 0, 0));
        jButton5.setText("Atras");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(243, 10, 73));
        jButton6.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Guardar en este archivo seleccionado");
        jButton6.setEnabled(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton10.setBackground(new java.awt.Color(243, 10, 73));
        jButton10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton10.setForeground(new java.awt.Color(255, 255, 255));
        jButton10.setText("Abrir archivo");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setBackground(new java.awt.Color(243, 10, 73));
        jButton11.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton11.setForeground(new java.awt.Color(255, 255, 255));
        jButton11.setText("Nuevo archivo");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jt_archivoActual.setEditable(false);
        jt_archivoActual.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Archivo Actual:");

        jButton13.setBackground(new java.awt.Color(243, 10, 73));
        jButton13.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButton13.setForeground(new java.awt.Color(255, 255, 255));
        jButton13.setText("Cerrar Archivo");
        jButton13.setEnabled(false);
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton14.setBackground(new java.awt.Color(243, 10, 73));
        jButton14.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton14.setForeground(new java.awt.Color(255, 255, 255));
        jButton14.setText("Listar Archivo");
        jButton14.setEnabled(false);
        jButton14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton14MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(200, 200, 200)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 579, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jt_archivoActual, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jt_archivoActual, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(124, 124, 124))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout misArchivosLayout = new javax.swing.GroupLayout(misArchivos.getContentPane());
        misArchivos.getContentPane().setLayout(misArchivosLayout);
        misArchivosLayout.setHorizontalGroup(
            misArchivosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        misArchivosLayout.setVerticalGroup(
            misArchivosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        registros_gui.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                registros_guiWindowClosing(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(0, 102, 153));
        jPanel4.setForeground(new java.awt.Color(0, 102, 102));

        botonGuardarRegistros.setBackground(new java.awt.Color(51, 0, 102));
        botonGuardarRegistros.setForeground(new java.awt.Color(255, 255, 255));
        botonGuardarRegistros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/disquete.png"))); // NOI18N
        botonGuardarRegistros.setText("Guardar Registros");
        botonGuardarRegistros.setEnabled(false);
        botonGuardarRegistros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonGuardarRegistrosMouseClicked(evt);
            }
        });
        botonGuardarRegistros.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                botonGuardarRegistrosKeyPressed(evt);
            }
        });

        botonBuscarRegistro.setBackground(new java.awt.Color(51, 0, 102));
        botonBuscarRegistro.setForeground(new java.awt.Color(255, 255, 255));
        botonBuscarRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/buscarusar.png"))); // NOI18N
        botonBuscarRegistro.setText("BuscarRegistro");
        botonBuscarRegistro.setEnabled(false);
        botonBuscarRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarRegistroActionPerformed(evt);
            }
        });

        botonEliminarRegistro.setBackground(new java.awt.Color(51, 0, 102));
        botonEliminarRegistro.setForeground(new java.awt.Color(255, 255, 255));
        botonEliminarRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/borrar.png"))); // NOI18N
        botonEliminarRegistro.setText("Borrar Registros");
        botonEliminarRegistro.setEnabled(false);
        botonEliminarRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarRegistroActionPerformed(evt);
            }
        });

        tabla_registro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(tabla_registro);

        jButton17.setBackground(new java.awt.Color(0, 204, 102));
        jButton17.setText("Atras");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        fecha_de_modificacion.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        fecha_de_modificacion.setText("Fecha de modificacion");

        jLabel10.setBackground(new java.awt.Color(0, 153, 204));
        jLabel10.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel10.setText("Ultima modificacion del archivo:");

        textoFiltro.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        textoFiltro.setText("Buscar registro con  ");

        jButton26.setBackground(new java.awt.Color(51, 0, 102));
        jButton26.setForeground(new java.awt.Color(255, 255, 255));
        jButton26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/galeria.png"))); // NOI18N
        jButton26.setText("Cargar registros");
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });

        botonModificarRegistro.setBackground(new java.awt.Color(51, 0, 102));
        botonModificarRegistro.setForeground(new java.awt.Color(255, 255, 255));
        botonModificarRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/modificar(1).png"))); // NOI18N
        botonModificarRegistro.setText("Modificar");
        botonModificarRegistro.setEnabled(false);
        botonModificarRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarRegistroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton17)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fecha_de_modificacion)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(textoFiltro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(campoFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 1086, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botonBuscarRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonEliminarRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                    .addComponent(jButton26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonModificarRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonGuardarRegistros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(fecha_de_modificacion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textoFiltro)
                            .addComponent(campoFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(botonGuardarRegistros, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botonBuscarRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(botonEliminarRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botonModificarRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(105, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout registros_guiLayout = new javax.swing.GroupLayout(registros_gui.getContentPane());
        registros_gui.getContentPane().setLayout(registros_guiLayout);
        registros_guiLayout.setHorizontalGroup(
            registros_guiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        registros_guiLayout.setVerticalGroup(
            registros_guiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        estandarizacion.setBackground(new java.awt.Color(0, 102, 153));
        estandarizacion.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                estandarizacionWindowClosing(evt);
            }
        });

        botonExcel.setBackground(new java.awt.Color(0, 153, 51));
        botonExcel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        botonExcel.setForeground(new java.awt.Color(0, 0, 0));
        botonExcel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/excel.png"))); // NOI18N
        botonExcel.setText("Exportar a Excel");
        botonExcel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonExcelMouseClicked(evt);
            }
        });

        botonXML.setBackground(new java.awt.Color(204, 204, 0));
        botonXML.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        botonXML.setForeground(new java.awt.Color(0, 0, 0));
        botonXML.setIcon(new javax.swing.ImageIcon(getClass().getResource("/xml.png"))); // NOI18N
        botonXML.setText("Exportar a XML");
        botonXML.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonXMLMouseClicked(evt);
            }
        });

        jButton22.setBackground(new java.awt.Color(0, 102, 102));
        jButton22.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton22.setForeground(new java.awt.Color(0, 0, 0));
        jButton22.setText("Volver");
        jButton22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton22MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout estandarizacionLayout = new javax.swing.GroupLayout(estandarizacion.getContentPane());
        estandarizacion.getContentPane().setLayout(estandarizacionLayout);
        estandarizacionLayout.setHorizontalGroup(
            estandarizacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(estandarizacionLayout.createSequentialGroup()
                .addGroup(estandarizacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(estandarizacionLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(botonExcel, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67)
                        .addComponent(botonXML, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(estandarizacionLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        estandarizacionLayout.setVerticalGroup(
            estandarizacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(estandarizacionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(estandarizacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonExcel, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonXML, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(82, 82, 82))
        );

        crearIndices_reindexar.setBackground(new java.awt.Color(204, 102, 255));
        crearIndices_reindexar.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                crearIndices_reindexarWindowClosing(evt);
            }
        });

        jButton23.setBackground(new java.awt.Color(51, 204, 0));
        jButton23.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton23.setText("Crear Indices");
        jButton23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton23MouseClicked(evt);
            }
        });

        jButton24.setBackground(new java.awt.Color(0, 51, 153));
        jButton24.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton24.setText("Reindexar");
        jButton24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton24MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout crearIndices_reindexarLayout = new javax.swing.GroupLayout(crearIndices_reindexar.getContentPane());
        crearIndices_reindexar.getContentPane().setLayout(crearIndices_reindexarLayout);
        crearIndices_reindexarLayout.setHorizontalGroup(
            crearIndices_reindexarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, crearIndices_reindexarLayout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );
        crearIndices_reindexarLayout.setVerticalGroup(
            crearIndices_reindexarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, crearIndices_reindexarLayout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addGroup(crearIndices_reindexarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
        );

        reindexar.setBackground(new java.awt.Color(102, 0, 255));

        jButton25.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton25.setText("Reindexar");
        jButton25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton25MouseClicked(evt);
            }
        });

        jt_reindexar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jt_reindexar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Campos"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(jt_reindexar);

        javax.swing.GroupLayout reindexarLayout = new javax.swing.GroupLayout(reindexar.getContentPane());
        reindexar.getContentPane().setLayout(reindexarLayout);
        reindexarLayout.setHorizontalGroup(
            reindexarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(reindexarLayout.createSequentialGroup()
                .addGroup(reindexarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(reindexarLayout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(reindexarLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 613, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        reindexarLayout.setVerticalGroup(
            reindexarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(reindexarLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabla_registro2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane4.setViewportView(tabla_registro2);

        jButton16.setBackground(new java.awt.Color(0, 51, 102));
        jButton16.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton16.setForeground(new java.awt.Color(0, 0, 0));
        jButton16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/buscarusar.png"))); // NOI18N
        jButton16.setText("Buscar");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jButton18.setBackground(new java.awt.Color(204, 153, 0));
        jButton18.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton18.setForeground(new java.awt.Color(0, 0, 0));
        jButton18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/modificar(1).png"))); // NOI18N
        jButton18.setText("Modificar");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        campoFiltro2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoFiltro2ActionPerformed(evt);
            }
        });

        textoFiltro2.setText("Buscar Registros que contengan  ");

        javax.swing.GroupLayout guiModificarRegistroLayout = new javax.swing.GroupLayout(guiModificarRegistro.getContentPane());
        guiModificarRegistro.getContentPane().setLayout(guiModificarRegistroLayout);
        guiModificarRegistroLayout.setHorizontalGroup(
            guiModificarRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(guiModificarRegistroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(guiModificarRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(guiModificarRegistroLayout.createSequentialGroup()
                        .addComponent(textoFiltro2, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(170, 170, 170)
                        .addComponent(campoFiltro2, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 876, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(guiModificarRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(87, Short.MAX_VALUE))
        );
        guiModificarRegistroLayout.setVerticalGroup(
            guiModificarRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(guiModificarRegistroLayout.createSequentialGroup()
                .addGroup(guiModificarRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(guiModificarRegistroLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(guiModificarRegistroLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(guiModificarRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campoFiltro2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoFiltro2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(121, Short.MAX_VALUE))
        );

        guiBorrarRegistro.setBackground(new java.awt.Color(0, 51, 102));

        tabla_registro3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane6.setViewportView(tabla_registro3);

        botonBuscarRegistroBorrar.setBackground(new java.awt.Color(0, 51, 102));
        botonBuscarRegistroBorrar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        botonBuscarRegistroBorrar.setForeground(new java.awt.Color(0, 0, 0));
        botonBuscarRegistroBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/buscarusar.png"))); // NOI18N
        botonBuscarRegistroBorrar.setText("Buscar");
        botonBuscarRegistroBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarRegistroBorrarActionPerformed(evt);
            }
        });

        jButton27.setBackground(new java.awt.Color(102, 0, 153));
        jButton27.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton27.setForeground(new java.awt.Color(0, 0, 0));
        jButton27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/borrar.png"))); // NOI18N
        jButton27.setText("Borrar");
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });

        campoFiltro3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoFiltro3ActionPerformed(evt);
            }
        });

        textoFiltro3.setText("Buscar Registros que contengan  ");

        javax.swing.GroupLayout guiBorrarRegistroLayout = new javax.swing.GroupLayout(guiBorrarRegistro.getContentPane());
        guiBorrarRegistro.getContentPane().setLayout(guiBorrarRegistroLayout);
        guiBorrarRegistroLayout.setHorizontalGroup(
            guiBorrarRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(guiBorrarRegistroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(guiBorrarRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, guiBorrarRegistroLayout.createSequentialGroup()
                        .addComponent(textoFiltro3, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(170, 170, 170)
                        .addComponent(campoFiltro3, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 876, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(guiBorrarRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton27, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                    .addComponent(botonBuscarRegistroBorrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(85, Short.MAX_VALUE))
        );
        guiBorrarRegistroLayout.setVerticalGroup(
            guiBorrarRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(guiBorrarRegistroLayout.createSequentialGroup()
                .addGroup(guiBorrarRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(guiBorrarRegistroLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(botonBuscarRegistroBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton27, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(guiBorrarRegistroLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(guiBorrarRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(campoFiltro3)
                    .addComponent(textoFiltro3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(76, Short.MAX_VALUE))
        );

        guiAgregarRegistro.setUndecorated(true);

        jPanel5.setBackground(new java.awt.Color(0, 51, 102));

        tablaguardarRegistros.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tablaguardarRegistros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane7.setViewportView(tablaguardarRegistros);

        jButton15.setBackground(new java.awt.Color(0, 153, 102));
        jButton15.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButton15.setForeground(new java.awt.Color(0, 0, 0));
        jButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mas.png"))); // NOI18N
        jButton15.setText("Agregar espacio nuevo");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jButton21.setBackground(new java.awt.Color(0, 102, 153));
        jButton21.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButton21.setForeground(new java.awt.Color(0, 0, 0));
        jButton21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guardarR.png"))); // NOI18N
        jButton21.setText("Guardar Registros");
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });

        jButton28.setText("atras");
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 893, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jButton28)))
                .addContainerGap(92, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)
                        .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton28)
                        .addGap(38, 38, 38)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 526, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(92, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout guiAgregarRegistroLayout = new javax.swing.GroupLayout(guiAgregarRegistro.getContentPane());
        guiAgregarRegistro.getContentPane().setLayout(guiAgregarRegistroLayout);
        guiAgregarRegistroLayout.setHorizontalGroup(
            guiAgregarRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        guiAgregarRegistroLayout.setVerticalGroup(
            guiAgregarRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jd_archivoCruzar.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                jd_archivoCruzarWindowClosing(evt);
            }
        });

        jt_campos1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Campos Archivo Actual"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane8.setViewportView(jt_campos1);

        jButton30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cruzarArchivo.png"))); // NOI18N
        jButton30.setText("Cruzar Archivos");
        jButton30.setEnabled(false);
        jButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton30ActionPerformed(evt);
            }
        });

        jt_campos2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Campos Archivo 2"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane9.setViewportView(jt_campos2);

        jButton31.setText("Seleccionar Archivo");
        jButton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton31ActionPerformed(evt);
            }
        });

        jt_camposCruzados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Campos Cruzados"
            }
        ));
        jt_camposCruzados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jt_camposCruzadosMouseClicked(evt);
            }
        });
        jScrollPane10.setViewportView(jt_camposCruzados);

        jButton32.setText("Agregar Campo a Campos Cruzados");
        jButton32.setEnabled(false);
        jButton32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton32ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jd_archivoCruzarLayout = new javax.swing.GroupLayout(jd_archivoCruzar.getContentPane());
        jd_archivoCruzar.getContentPane().setLayout(jd_archivoCruzarLayout);
        jd_archivoCruzarLayout.setHorizontalGroup(
            jd_archivoCruzarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_archivoCruzarLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jd_archivoCruzarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton31, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE))
                .addGap(80, 80, 80)
                .addGroup(jd_archivoCruzarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton32, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(jd_archivoCruzarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE))
                .addGap(67, 67, 67))
        );
        jd_archivoCruzarLayout.setVerticalGroup(
            jd_archivoCruzarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_archivoCruzarLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jd_archivoCruzarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jd_archivoCruzarLayout.createSequentialGroup()
                        .addGroup(jd_archivoCruzarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jd_archivoCruzarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton31)
                            .addComponent(jButton30)
                            .addComponent(jButton32))))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jMenuItem1.setText("Eliminar Campo");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        pop_camposMenu.add(jMenuItem1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(26, 26, 46));

        jButton1.setBackground(new java.awt.Color(78, 17, 132));
        jButton1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/campos.png"))); // NOI18N
        jButton1.setText("Agregar campo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(78, 17, 132));
        jButton2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carpeta.png"))); // NOI18N
        jButton2.setText("Archivos");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setText("Bienvenido");

        jButton12.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton12.setText("APAGAR");
        jButton12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton12MouseClicked(evt);
            }
        });

        jButton20.setBackground(new java.awt.Color(78, 17, 132));
        jButton20.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton20.setForeground(new java.awt.Color(255, 255, 255));
        jButton20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/registro.png"))); // NOI18N
        jButton20.setText("Registros");
        jButton20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton20MouseClicked(evt);
            }
        });
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });

        jButton19.setBackground(new java.awt.Color(78, 17, 132));
        jButton19.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton19.setForeground(new java.awt.Color(255, 255, 255));
        jButton19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/indice.png"))); // NOI18N
        jButton19.setText("Indices");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        jButton9.setBackground(new java.awt.Color(78, 17, 132));
        jButton9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/estandarizacion.png"))); // NOI18N
        jButton9.setText("Estandarizaci??n");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton29.setBackground(new java.awt.Color(78, 17, 132));
        jButton29.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton29.setForeground(new java.awt.Color(255, 255, 255));
        jButton29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cruzarArchivo.png"))); // NOI18N
        jButton29.setText("Cruzar Archivos");
        jButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton29ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                    .addComponent(jButton20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton29, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                    .addComponent(jButton19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(72, 72, 72))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton12)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(252, 252, 252))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(88, 88, 88))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton29)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jButton12)
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        campos.pack();
        campos.setLocationRelativeTo(this);
        campos.setVisible(true);
        this.setVisible(false);

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        actualizarArchivos();

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        //Guardar campos 
        JOptionPane.showMessageDialog(null, "Estas seguro que quieres guardar en este archivo ?\n recurda que puedes cambiarlo cuando desees.");
        try {
            try {

                if (!metadata.getCampos().isEmpty() && !ubicacionActual.equals("")) {//Tiene que haber campos para guardar y una ubicacion actual

                    metadata.escribirCampos(new File(ubicacionActual));
                } else {
                    JOptionPane.showMessageDialog(campos, "Campos vacios" + "\n"
                            + "Para guardar se necesitan campos");
                }

            } catch (NullPointerException ex) {//Si no
                JOptionPane.showMessageDialog(campos, "Archivo no seleccionado");
            }
        } catch (IOException ex) {
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        misArchivos.dispose();
        this.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void arbolArchivosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_arbolArchivosMouseClicked

    }//GEN-LAST:event_arbolArchivosMouseClicked

    /**
     *
     */
    public void actualizarArchivos() {

        DefaultTreeModel m = (DefaultTreeModel) arbolArchivos.getModel();
        m.setRoot(new DefaultMutableTreeNode(file.getName()));
        listar_no_orden(file, (DefaultMutableTreeNode) m.getRoot());
        misArchivos.pack();
        misArchivos.setLocationRelativeTo(null);
        misArchivos.setVisible(true);
        this.setVisible(false);

    }
    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        String rutaAcrear = "./registros/";

        String nombre = JOptionPane.showInputDialog(misArchivos, "Escribe el nombre del nuevo archivo");

        if (nombre.equals("")) {
            while (nombre.equals("")) {
                nombre = JOptionPane.showInputDialog(misArchivos, "El nombre no admitado\nEscribe el nombre del nuevo archivo");
            }
        }

        nombre += ".txt";
        File file = new File(rutaAcrear + nombre);
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;

        try {

            fw = new FileOutputStream(file);
            bw = new ObjectOutputStream(fw);
            bw.flush();
            JOptionPane.showMessageDialog(misArchivos, "El archivo fue guardado con exito");
            misArchivos.dispose();
            actualizarArchivos();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(misArchivos, "Hubo un error");

            try {
                if (file.createNewFile()) {
                    JOptionPane.showMessageDialog(misArchivos, "El archivo fue creado con exito");
                    misArchivos.dispose();
                    actualizarArchivos();
                } else {
                    JOptionPane.showMessageDialog(misArchivos, "Hubo un error");
                }
            } catch (IOException ex1) {

            }

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(misArchivos, "Hubo un error");
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        if (jtable_campos.getSelectedRow() >= 0) {

            DefaultTableModel modelo
                    = (DefaultTableModel) jtable_campos.getModel();

            if ((boolean) modelo.getValueAt(jtable_campos.getSelectedRow(), 3)) {
                JOptionPane.showMessageDialog(null, "No puede eliminar este campo, porque es llave primaria");
            } else {

                if (metadata.getCampos().isEmpty() != true) {

                    metadata.getCampos().remove(jtable_campos.getSelectedRow());
                }

                modelo.removeRow(jtable_campos.getSelectedRow());

                jtable_campos.setModel(modelo);

                JOptionPane.showMessageDialog(null, "El registro se elimin?? con ??xito");
            }
            jtable_campos.clearSelection();
        } else {
            JOptionPane.showMessageDialog(null, "No se ha seleccionado ning??n elemento de la tabla para eliminar");
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    boolean yaHayLlave() {//Para saber si ya hay una llave primaria en la tabla de camapos
        boolean yaHayLlave = false;
        for (int i = 0; i < jtable_campos.getRowCount(); i++) {
            if ((boolean) jtable_campos.getValueAt(i, 3)) {
                yaHayLlave = true;
                break;
            } else {
                yaHayLlave = false;
            }
        }
        return yaHayLlave;
    }

    boolean yaHayCampoConEseNombre() {
        boolean ya = false;
        String x = jTextField1.getText().toLowerCase(), y;
        for (int i = 0; i < jtable_campos.getRowCount(); i++) {
            y = ((String) jtable_campos.getValueAt(i, 0)).toLowerCase();
            if (x.equals(y)) {
                ya = true;
                break;
            } else {
                ya = false;
            }
        }
        return ya;
    }

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if (jTextField1.getText().equals("") || (rb_si.isSelected() == false && rb_no.isSelected() == false)) {
            JOptionPane.showMessageDialog(null, "Faltan datos para crear campo");
        } else {
            if (yaHayLlave() && rb_si.isSelected()) {
                JOptionPane.showMessageDialog(null, "Ya existe una llave primaria en la tabla de campos");
                buttonGroup1.clearSelection();
            } else if (!yaHayCampoConEseNombre()) {
                String nombreCampo = jTextField1.getText();
                String tipoCampo = "";
                tipoCampo = (String) jComboBox2.getModel().getSelectedItem();
                int bo = (int) jSpinner1.getModel().getValue();
                boolean lp = false; //llave primaria
                if (rb_si.isSelected()) {
                    lp = true;
                } else if (rb_no.isSelected()) {
                    lp = false;
                }
                metadata.addCampo(new Campos(nombreCampo, tipoCampo, bo, lp));
                DefaultTableModel modelo = (DefaultTableModel) jtable_campos.getModel();
                Object[] newrow = {
                    nombreCampo, tipoCampo, bo, lp
                };
                modelo.addRow(newrow);
                jtable_campos.setModel(modelo); //*

                JOptionPane.showMessageDialog(null, "Se agreg?? el campo");
                jTextField1.setText("");
                buttonGroup1.clearSelection();
                jSpinner1.setValue(1);
                jComboBox2.setSelectedIndex(1);
            } else {
                JOptionPane.showMessageDialog(null, "Ya existe un campo con ese nombre, ingrese un nombre distinto");
                jTextField1.setText("");
            }

        }
        jtable_campos.clearSelection();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        if (!yaHayLlave() && jtable_campos.getRowCount() >= 1) {
            JOptionPane.showMessageDialog(null, "ERROR, No hay ning??n campo seleccionado como llave primaria. Por favor, escoja un"
                    + " campo de los existentes y modif??quelo para que sea campo llave, o cree un campo nuevo que sea campo llave");
        } else {
            campos.dispose();
            this.setVisible(true);
        }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jtable_camposMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtable_camposMouseClicked

    }//GEN-LAST:event_jtable_camposMouseClicked

    private void jButton8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseClicked
        if (jtable_campos.getSelectedRow() >= 0) {

            if (jTextField1.getText().equals("") || (int) jSpinner1.getValue() == 0
                    || (rb_si.isSelected() == false && rb_no.isSelected() == false)) {
                JOptionPane.showMessageDialog(null, "Ingrese datos v??lidos para modificar el campo");
            } else {
                if (yaHayLlave() && rb_si.isSelected() && (boolean) jtable_campos.getValueAt(jtable_campos.getSelectedRow(), 3) == false) {
                    JOptionPane.showMessageDialog(null, "Ya existe una llave primaria en la tabla de campos");
                    buttonGroup1.clearSelection();
                } else {
                    DefaultTableModel modelo
                            = (DefaultTableModel) jtable_campos.getModel();
                    //modelo.removeRow(jtable_campos.getSelectedRow());
                    modelo.setValueAt(jTextField1.getText(), jtable_campos.getSelectedRow(), 0);
                    modelo.setValueAt((String) jComboBox2.getSelectedItem(), jtable_campos.getSelectedRow(), 1);
                    modelo.setValueAt((int) jSpinner1.getValue(), jtable_campos.getSelectedRow(), 2);
                    boolean b = false;
                    if (rb_si.isSelected()) {
                        b = true;
                    } else if (rb_no.isSelected()) {
                        b = false;
                    }

                    // MODIFICAR ARRAYLIST DE CAMPOS
                    if (metadata.getCampos().isEmpty() != true) {
                        metadata.getCampos().get(jtable_campos.getSelectedRow()).setNombre(jTextField1.getText());
                        metadata.getCampos().get(jtable_campos.getSelectedRow()).setTipo((String) jComboBox2.getSelectedItem());
                        metadata.getCampos().get(jtable_campos.getSelectedRow()).setByteoffset((int) jSpinner1.getValue());
                        metadata.getCampos().get(jtable_campos.getSelectedRow()).setLlavePrimaria(b);
                    }

                    modelo.setValueAt(b, jtable_campos.getSelectedRow(), 3);
                    buttonGroup1.clearSelection();
                    jTextField1.setText("");

                    jtable_campos.clearSelection();
                    JOptionPane.showMessageDialog(null, "EL registro se modific?? con ??xito");

                }
                jtable_campos.clearSelection();
            }

        } else {
            JOptionPane.showMessageDialog(null, "No se ha seleccionado ning??n campo de la tabla");
        }

    }//GEN-LAST:event_jButton8MouseClicked

    /**
     *este metodo lo que es cargar la metadata
     * @throws FileNotFoundException excepcion para verificar si no existe el archivo al que se quiere accesar
     */
    public void cargarMetadata() throws FileNotFoundException {
        try {

            Scanner myReader = new Scanner(new File(ubicacionActual));
            DefaultTableModel modelo = (DefaultTableModel) jtable_campos.getModel();
            DefaultTableModel modelo1 = (DefaultTableModel) jt_campos1.getModel();

            borrarElementosTabla();//Limpiar tabla
            metadata.getCampos().clear();//Se limpia todo lo que pueda haber en la metadata
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                String[] camposLinea = data.split(";");

                for (String Campo : camposLinea) {

                    //Conseguir el nombre
                    try {

                        String[] campSpLit = Campo.split(":"); //Nombre:Tipo[num] = (Nombre)(Tipo[num]llave)
                        String nom = campSpLit[0];
                        String tipo = "";

                        //Conseguir el tipo
                        String[] typeSplit = campSpLit[1].split("\\[");// Tipo[Num] = (Tipo)(num]llave)
                        tipo = typeSplit[0];

                        //Conseguir llave primaria
                        String[] split = typeSplit[1].split("]");

                        boolean getLlave = false;
                        if (split[1].equals("1")) {
                            getLlave = true;
                        }

                        int len = Integer.parseInt(split[0]);

                        //Agregar a la tabla
                        Object[] newrow = {
                            nom, tipo, len, getLlave
                        };

                        String temp = nom + ":" + tipo + "[" + len + "]" + split[1];
                        //Agregar a la tabla
                        Object[] newrow2 = {
                            temp
                        };

                        modelo1.addRow(newrow2);

                        metadata.getCampos().add(new Campos(nom, tipo, len, getLlave));

                        //Ojo cambiar como saber si es llaveprimaria
                        modelo.addRow(newrow);

                    } catch (ArrayIndexOutOfBoundsException ex) {
                    }
                }
            }
            jtable_campos.setModel(modelo);
        } catch (NullPointerException ex) {

        }
        
        jButton20.setEnabled(true);
        jButton29.setEnabled(true);

    }


    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // ABRIR ARCHIVO

        try {

            DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) arbolArchivos.getSelectionPath().getLastPathComponent();

            if (selectedNode.getUserObject().toString().equals("Registros1.txt") || selectedNode.getUserObject().toString().equals("Registros2.txt")) {
                JOptionPane.showMessageDialog(campos, "Selecciono un archivo de registros");
            } else {
                if (new File(("./registros/" + selectedNode.getUserObject().toString())).isFile()) {
                    if (new File(("./registros/" + selectedNode.getUserObject().toString())).exists()) {
                        jt_archivoActual.setText(selectedNode.getUserObject().toString());

                        ubicacionActual = rutaArchivo + selectedNode.getUserObject().toString();

                        //Cargar Arbol
                        AdminArbol adar = new AdminArbol("./registros/" + "Arbol.indices");
                        if (adar.getArchivo().exists()) {
                            adar.setArbol(arbolB);
                            adar.cargarArchivo();
                            arbolB = adar.getArbol();
                        }
                        //Habilitar opciones de archivos
                        jButton6.setEnabled(true);
                        jButton13.setEnabled(true);
                        jButton14.setEnabled(true);

                        registros.clear();
                        llaves.clear();
                    }
                } else {
                    JOptionPane.showMessageDialog(campos, "Archivo no seleccionado");
                }

            }
        } catch (NullPointerException ex) {//Si no
            JOptionPane.showMessageDialog(campos, "Archivo no seleccionado");
        }
    }//GEN-LAST:event_jButton10ActionPerformed

    /**
     *
     */
    public void borrarElementosTabla() {
        DefaultTableModel dm1 = (DefaultTableModel) jtable_campos.getModel();
        dm1.setRowCount(0);
    }


    private void jButton12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton12MouseClicked
        // APAGAR SYSTEMA
        int showConfirmDialog = JOptionPane.showConfirmDialog(campos, "??Seguro que desea salir?");
        if (showConfirmDialog == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_jButton12MouseClicked

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // Cerrar Archivo

        //Habilitar opciones de archivos
        jButton6.setEnabled(false);
        jButton13.setEnabled(false);
        jButton14.setEnabled(false);

        jt_archivoActual.setText("");
        ubicacionActual = "";
        metadata.getCampos().clear();
        borrarElementosTabla();

        JOptionPane.showMessageDialog(campos, "Archivo cerrado");
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jComboBox2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox2MouseClicked


    }//GEN-LAST:event_jComboBox2MouseClicked

    private void jComboBox2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox2ItemStateChanged
        if (jComboBox2.getSelectedItem().equals("int")) {
            jSpinner1.setEnabled(false);
            jSpinner1.setValue(4);
        } else if (jComboBox2.getSelectedItem().equals("char")) {
            jSpinner1.setEnabled(false);
            jSpinner1.setValue(1);
        } else if (jComboBox2.getSelectedItem().equals("double")) {
            jSpinner1.setEnabled(false);
            jSpinner1.setValue(8);
        } else if (jComboBox2.getSelectedItem().equals("boolean")) {
            jSpinner1.setEnabled(false);
            jSpinner1.setValue(2);
        } else {
            jSpinner1.setEnabled(true);
            jSpinner1.setValue(1);
        }
    }//GEN-LAST:event_jComboBox2ItemStateChanged

    /**
     *
     */
    public void abrirVentanaP() {
        //Abrir pantalla principal
        this.pack();
        this.setLocationRelativeTo(this);
        this.setVisible(true);
    }


    private void camposWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_camposWindowClosing
        //Volver abrir la pantalla principal cuando se cierra el JDialog campos 
        abrirVentanaP();
    }//GEN-LAST:event_camposWindowClosing

    private void camposWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_camposWindowClosed

    }//GEN-LAST:event_camposWindowClosed

    private void misArchivosWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_misArchivosWindowClosing
        abrirVentanaP();
    }//GEN-LAST:event_misArchivosWindowClosing

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        int showConfirmDialog = JOptionPane.showConfirmDialog(campos, "??Seguro que desea salir?");
        if (showConfirmDialog == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_formWindowClosing

    private void jButton14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton14MouseClicked
        try {
            if (!ubicacionActual.equals("")) {
                cargarMetadata();
                
                JOptionPane.showMessageDialog(campos, "Campos Cargados exitosamente");
            } else {
                JOptionPane.showMessageDialog(campos, "Tiene que abrir un archivo primero");
            }

        } catch (FileNotFoundException ex) {

        }
    }//GEN-LAST:event_jButton14MouseClicked

    private void botonBuscarRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarRegistroActionPerformed
        activarFiltro();


    }//GEN-LAST:event_botonBuscarRegistroActionPerformed

    private void jButton20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton20MouseClicked

        campoFiltro.setVisible(false);
        textoFiltro.setVisible(false);
        File registrosPrueba = new File(ubicacionActual);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        fecha_de_modificacion.setText(sdf.format(registrosPrueba.lastModified()));

        DefaultTableModel modelotablaCampos = (DefaultTableModel) jtable_campos.getModel();
        int numerodeColumnas = modelotablaCampos.getRowCount();
        ArrayList<Class> types = new ArrayList();
        for (int i = 0; i < modelotablaCampos.getRowCount(); i++) {

            String tipo = modelotablaCampos.getValueAt(i, 1).toString();
            switch (tipo) {
                case "boolean": {

                    types.add(java.lang.Boolean.class);

                    break;
                }
                case "String": {
                    types.add(java.lang.String.class);

                    break;
                }
                case "char": {
                    types.add(java.lang.Character.class);

                    break;
                }
                case "double": {
                    types.add(java.lang.Double.class);

                    break;
                }
                case "int": {
                    types.add(java.lang.Integer.class);//agrego la clase correspondiente
                    break;
                }

            }

        }//tomo las clases

        //System.out.println(types);
        DefaultTableModel modelopersonalizado = new DefaultTableModel() {

            ArrayList<Class> clases = types;

            @Override
            public Class getColumnClass(int columnIndex) {
                return types.get(columnIndex);
            }
        };

        modelopersonalizado.setColumnCount(0);
        for (int i = 0; i < modelotablaCampos.getRowCount(); i++) {
            //modeloTablaRegistros.addColumn(modelotablaCampos.getValueAt(i, 0));
            modelopersonalizado.addColumn(modelotablaCampos.getValueAt(i, 0));

        }
        tabla_registro.setModel(modelopersonalizado);
        DefaultTableModel modeloRegistros = (DefaultTableModel) tabla_registro.getModel();

        this.setVisible(false);
        if (registros.isEmpty()) {
            botonBuscarRegistro.setEnabled(false);
            botonEliminarRegistro.setEnabled(false);
            //  botonAgregarEspacio.setEnabled(false);
            botonGuardarRegistros.setEnabled(false);
            botonModificarRegistro.setEnabled(false);
        }

        cargarRegistros();

        registros_gui.pack();
        registros_gui.setLocationRelativeTo(this);
        registros_gui.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton20MouseClicked
    /**
     * este metodo lo que hace es organizar la tabla con el formato que debe llevar
     * @param evt 
     */
    private void botonGuardarRegistrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonGuardarRegistrosMouseClicked

        //=================================================
        DefaultTableModel modelotablaCampos = (DefaultTableModel) jtable_campos.getModel();
        int numerodeColumnas = modelotablaCampos.getRowCount();
        ArrayList<Class> types = new ArrayList();
        for (int i = 0; i < modelotablaCampos.getRowCount(); i++) {

            String tipo = modelotablaCampos.getValueAt(i, 1).toString();
            switch (tipo) {
                case "boolean": {

                    types.add(java.lang.Boolean.class);

                    break;
                }
                case "String": {
                    types.add(java.lang.String.class);

                    break;
                }
                case "char": {
                    types.add(java.lang.Character.class);

                    break;
                }
                case "double": {
                    types.add(java.lang.Double.class);

                    break;
                }
                case "int": {
                    types.add(java.lang.Integer.class);//agrego la clase correspondiente
                    break;
                }

            }

        }//tomo las clases

        //System.out.println(types);
        DefaultTableModel modelopersonalizado = new DefaultTableModel() {

            ArrayList<Class> clases = types;

            @Override
            public Class getColumnClass(int columnIndex) {
                return types.get(columnIndex);
            }
        };

        modelopersonalizado.setColumnCount(0);
        for (int i = 0; i < modelotablaCampos.getRowCount(); i++) {
            //modeloTablaRegistros.addColumn(modelotablaCampos.getValueAt(i, 0));
            modelopersonalizado.addColumn(modelotablaCampos.getValueAt(i, 0));

        }
        tablaguardarRegistros.setModel(modelopersonalizado);
        guiAgregarRegistro.pack();
        guiAgregarRegistro.setLocationRelativeTo(null);
        registros_gui.dispose();
        guiAgregarRegistro.setVisible(true);

        // registroTemp="";

    }//GEN-LAST:event_botonGuardarRegistrosMouseClicked

    /**
     * este metodo lo que hace es escribir el registro dado
     * @param registro el registro que quiero escribir y que forme anteriormente
     * @throws IOException excepcion si no se encuentra el archivo
     */
    public void escribirRegistros(String registro) throws IOException {
        File registroArchivo = new File(ubicacionActual);
        FileWriter fw = new FileWriter(registroArchivo, true);
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter pw = new PrintWriter(bw);

        pw.print(registro);
        pw.println();

        // pw.println();
        pw.flush();

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        fecha_de_modificacion.setText(sdf.format(registroArchivo.lastModified()));
        pw.close();

    }
    private void botonGuardarRegistrosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_botonGuardarRegistrosKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonGuardarRegistrosKeyPressed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        registros_gui.dispose();
        this.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        // Abrir indices
        crearIndices_reindexar.pack();
        crearIndices_reindexar.setLocationRelativeTo(this);
        crearIndices_reindexar.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        estandarizacion.pack();
        estandarizacion.setLocationRelativeTo(this);
        estandarizacion.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void botonExcelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonExcelMouseClicked
        if (ubicacionActual.equals("") || ubicacionActual.equals(null)) {
            JOptionPane.showMessageDialog(null, "No se ha abierto ning??n archivo");
        } else {
            File prueba = new File(ubicacionActual);
            if (prueba.exists()) {
                FileReader fr = null;
                BufferedReader br = null;
                try {
                    fr = new FileReader(prueba);
                    br = new BufferedReader(fr);
                    String read;
                    String[] array = new String[0];
                    //String[] encabezado = {"City ID", "City Name"};

                    //Ponerle el encabezado de los registros en la primera fila de excel, ejemplo: Nombre, Apellido, Edad
                    Workbook wb = new XSSFWorkbook();
                    Sheet sheet = wb.createSheet("Registros");
                    Row rowCol = sheet.createRow(0);
                    for (int i = 0; i < jtable_campos.getRowCount(); i++) {
                        Cell cell = rowCol.createCell(i);
                        if (jtable_campos.getValueAt(i, 0) != null) {
                            cell.setCellValue((String) jtable_campos.getValueAt(i, 0));
                        }
                    }
                    //FIN de ponerle el encabezado

                    int j = 0;
                    boolean oneMore = false;
                    while ((read = br.readLine()) != null) {
                        if (read.equals("@@@")) {
                            oneMore = true;
                        }
                        if (oneMore == true && !read.equals("@@@")) {
                            array = read.split("\\|");

                            Row row = sheet.createRow(j + 1);
                            for (int k = 0; k < array.length; k++) {
                                Cell cell = row.createCell(k);
                                if (array[k] != null) {
                                    cell.setCellValue(array[k]);
                                }
                            }
                            j++;
                        }
                    }
                    FileOutputStream out = new FileOutputStream(new File("RegistrosExportados.xlsx"));
                    wb.write(out);

                    /*for(int i=0; i<array.length; i++){
                    System.out.println(array[i]);
                }*/
                    System.out.println("Todo sali?? bien");
                    JOptionPane.showMessageDialog(null, "Registros exportados a Excel satisfactoriamente");
                } catch (Exception e) {
                    System.out.println(e);
                }
                try {
                    br.close();
                    fr.close();
                } catch (IOException ex) {
                    System.out.println(ex);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Archivo no encontrado");
            }
        }

    }//GEN-LAST:event_botonExcelMouseClicked

    private void jButton22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton22MouseClicked
        estandarizacion.dispose();
        this.setVisible(true);
    }//GEN-LAST:event_jButton22MouseClicked

    private void botonXMLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonXMLMouseClicked
        if (ubicacionActual.equals("") || ubicacionActual == null) {
            JOptionPane.showMessageDialog(null, "No se ha abierto ning??n archivo");
        } else {
            if (jtable_campos.getRowCount() == 0) {
                JOptionPane.showMessageDialog(null, "A??n no se han cargado o creado campos, la tabla de campos est?? vac??a");
            } else {
                try {
                    crearXML("Campos");
                } catch (TransformerException ex) {
                    Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                }
                JOptionPane.showMessageDialog(null, "El archivo XML se cre?? con ??xito");
            }
        }
    }//GEN-LAST:event_botonXMLMouseClicked

    private void jButton23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton23MouseClicked
        // Crear Indices
        if (arbolB.getRaiz() != null) {
            System.out.println("tiene raiz");
            AdminArbol adar = new AdminArbol("./registros/" + "Arbol.indices");
            adar.setArbol(arbolB);
            adar.escribirArchivo();
            JOptionPane.showMessageDialog(this, "Se ha guardado el archivo del arbol ", "Informaci??n", JOptionPane.INFORMATION_MESSAGE);
        }

    }//GEN-LAST:event_jButton23MouseClicked

    private void crearIndices_reindexarWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_crearIndices_reindexarWindowClosing
        abrirVentanaP();
    }//GEN-LAST:event_crearIndices_reindexarWindowClosing

    private void registros_guiWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_registros_guiWindowClosing
        abrirVentanaP();
    }//GEN-LAST:event_registros_guiWindowClosing

    private void estandarizacionWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_estandarizacionWindowClosing
        abrirVentanaP();
    }//GEN-LAST:event_estandarizacionWindowClosing

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton24MouseClicked
        String temp = "";

        DefaultTableModel model = (DefaultTableModel) jt_reindexar.getModel();

        for (int i = 0; i < metadata.getCampos().size(); i++) {
            int llave = 0;
            if (!metadata.getCampos().get(i).isLlavePrimaria()) {
                llave = 1;
            }
            model.addRow(new Object[]{metadata.getCampos().get(i).getNombre() + ":" + metadata.getCampos().get(i).getTipo() + "[" + metadata.getCampos().get(i).getByteoffset() + "]" + llave});

        }

        reindexar.pack();
        reindexar.setLocationRelativeTo(this);
        reindexar.setVisible(true);
        reindexar.setModal(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton24MouseClicked

    private void jButton25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton25MouseClicked
        // Reindexar
        if (jt_reindexar.getSelectedRow() >= 0) {
            AdminArbol adar = new AdminArbol("./registros/" + "Arbol.indices");
            adar.setArbol(arbolB);
            adar.escribirArchivo();
            JOptionPane.showMessageDialog(this, "Se han reindexado los registros exitosamente", "Informaci??n", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Ningun campo seleccionado");
        }


    }//GEN-LAST:event_jButton25MouseClicked
    /**
     * metodo cargar registros
     * este metodo lo que hace es cargar registros desde el archivo de prueba al que se esta usando
     * @param evt 
     */
    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
        // TODO add your handling code here:
        String archivo = "";

        if (ubicacionActual.equals("./registros/personfile.txt")) {
            archivo = "./registros/Registros1.txt";

        } else if (ubicacionActual.equals("./registros/cityfile.txt")) {

            archivo = "./registros/Registros2.txt";

        }
        File archivoCargar = new File(archivo);

        if (archivoCargar.exists() && registros.isEmpty()) {

            FileReader fr = null;
            BufferedReader br = null;
            try {
                fr = new FileReader(archivoCargar);
                br = new BufferedReader(fr);
                String linea = "";
                while ((linea = br.readLine()) != null) {
                    String[] registro = linea.split("[|]");
                    int tamanoLlave = 0;
                    for (int i = 0; i < registro.length; i++) {
                        tamanoLlave += registro[i].length();
                    }
                    Llave llave = new Llave();
                    llave.setLlave(registro[0]);
                    llave.setTamanio(tamanoLlave + 3);
                    registros.add(linea);
                    llaves.add(llave);
                }

                guardarRegistroEnArchivo();
                botonBuscarRegistro.setEnabled(true);
                botonEliminarRegistro.setEnabled(true);
                botonGuardarRegistros.setEnabled(true);
                botonModificarRegistro.setEnabled(true);

                registros_gui.dispose();
                cargarRegistros();
                registros_gui.pack();
                registros_gui.setLocationRelativeTo(null);
                registros_gui.setVisible(true);
                
                jButton19.setEnabled(true);
                jButton9.setEnabled(true);
                
                JOptionPane.showMessageDialog(this, "Se ha cargado el archivo exitosamente", "Informaci??n", JOptionPane.INFORMATION_MESSAGE);
            } catch (Exception e) {
            }
            try {
                br.close();
                fr.close();
            } catch (IOException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(registros_gui, "Ya esta cargado el archivo o El archivo no existe");
        }
    }//GEN-LAST:event_jButton26ActionPerformed

    private void botonEliminarRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarRegistroActionPerformed
        // borrar
        DefaultTableModel modelotablaCampos = (DefaultTableModel) jtable_campos.getModel();
        int numerodeColumnas = modelotablaCampos.getRowCount();
        ArrayList<Class> types = new ArrayList();
        for (int i = 0; i < modelotablaCampos.getRowCount(); i++) {

            String tipo = modelotablaCampos.getValueAt(i, 1).toString();
            switch (tipo) {
                case "boolean": {

                    types.add(java.lang.Boolean.class);

                    break;
                }
                case "String": {
                    types.add(java.lang.String.class);

                    break;
                }
                case "char": {
                    types.add(java.lang.Character.class);

                    break;
                }
                case "double": {
                    types.add(java.lang.Double.class);

                    break;
                }
                case "int": {
                    types.add(java.lang.Integer.class);//agrego la clase correspondiente
                    break;
                }

            }

        }
        //tomo las clases

        //System.out.println(types);
        DefaultTableModel modelopersonalizado = new DefaultTableModel() {

            ArrayList<Class> clases = types;

            @Override
            public Class getColumnClass(int columnIndex) {
                return types.get(columnIndex);
            }
        };

        modelopersonalizado.setColumnCount(0);
        for (int i = 0; i < modelotablaCampos.getRowCount(); i++) {
            //modeloTablaRegistros.addColumn(modelotablaCampos.getValueAt(i, 0));
            modelopersonalizado.addColumn(modelotablaCampos.getValueAt(i, 0));

        }
        tabla_registro3.setModel(modelopersonalizado);
        guiBorrarRegistro.pack();
        guiBorrarRegistro.setLocationRelativeTo(null);
        guiBorrarRegistro.setVisible(true);


    }//GEN-LAST:event_botonEliminarRegistroActionPerformed

    /**
     *
     */
    public void activarFiltro() {
        campoFiltro.setVisible(true);//los hago visibles
        textoFiltro.setText("Buscar registros con " + tabla_registro.getColumnName(0));
        textoFiltro.setVisible(true);//los hago visibles
        TableRowSorter<TableModel> filtrarResultados = new TableRowSorter<>(tabla_registro.getModel());//este el sorteador de las filas
        tabla_registro.setRowSorter(filtrarResultados);//asigno este nuevo sorteador a la fila
        campoFiltro.getDocument().addDocumentListener(new DocumentListener() {//hago el listener para que escuche entradas y se cambie
            //esto solo son metodos abstractos 
            @Override
            public void insertUpdate(DocumentEvent e) {
                String text = campoFiltro.getText();

                if (text.trim().length() == 0) {
                    filtrarResultados.setRowFilter(null);//si no hay nada ingresado el sorteador nor ecibe actualizacion
                } else {
                    filtrarResultados.setRowFilter(RowFilter.regexFilter("(?i)" + text));//si hay algo ingresado hace la busqueda con el texto que se obtiene
                }
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                String text = campoFiltro.getText();//este metodo es un lisener para cuando se va eliminando del campo texto/ al irse eliminando voy actualizando el sorteador

                if (text.trim().length() == 0) {
                    filtrarResultados.setRowFilter(null);
                } else {
                    filtrarResultados.setRowFilter(RowFilter.regexFilter("(?i)" + text));

                }
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

        });

    }

    private void botonModificarRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarRegistroActionPerformed
        DefaultTableModel modelotablaCampos = (DefaultTableModel) jtable_campos.getModel();
        int numerodeColumnas = modelotablaCampos.getRowCount();
        ArrayList<Class> types = new ArrayList();
        for (int i = 0; i < modelotablaCampos.getRowCount(); i++) {

            String tipo = modelotablaCampos.getValueAt(i, 1).toString();
            switch (tipo) {
                case "boolean": {

                    types.add(java.lang.Boolean.class);

                    break;
                }
                case "String": {
                    types.add(java.lang.String.class);

                    break;
                }
                case "char": {
                    types.add(java.lang.Character.class);

                    break;
                }
                case "double": {
                    types.add(java.lang.Double.class);

                    break;
                }
                case "int": {
                    types.add(java.lang.Integer.class);//agrego la clase correspondiente
                    break;
                }

            }

        }
        //tomo las clases

        //System.out.println(types);
        DefaultTableModel modelopersonalizado = new DefaultTableModel() {

            ArrayList<Class> clases = types;

            @Override
            public Class getColumnClass(int columnIndex) {
                return types.get(columnIndex);
            }
        };

        modelopersonalizado.setColumnCount(0);
        for (int i = 0; i < modelotablaCampos.getRowCount(); i++) {
            //modeloTablaRegistros.addColumn(modelotablaCampos.getValueAt(i, 0));
            modelopersonalizado.addColumn(modelotablaCampos.getValueAt(i, 0));

        }
        tabla_registro2.setModel(modelopersonalizado);
        guiModificarRegistro.pack();
        guiModificarRegistro.setLocationRelativeTo(null);
        guiModificarRegistro.setVisible(true);


    }//GEN-LAST:event_botonModificarRegistroActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed

        if (campoFiltro2.getText().equals("")) {
            JOptionPane.showMessageDialog(guiModificarRegistro, "No puede estar vac??o el campo", "Informaci??n", JOptionPane.INFORMATION_MESSAGE);
        } else {
            Llave temp = new Llave();
            temp.setLlave(campoFiltro2.getText());
            //NodoArbol nodo = arbolB.buscar(temp);
            temp = encontrarLlave(campoFiltro2.getText());
            if (temp == null) {
                JOptionPane.showMessageDialog(guiModificarRegistro, "No se encontr?? la llave", "Informaci??n", JOptionPane.INFORMATION_MESSAGE);
            } else {
                //temp = buscarLlave(campoFiltro2.getText(), nodo);
                llaveActual = temp;
                try {
                    llenarTabla(tabla_registro2, temp);
                } catch (IOException ex) {
                    Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

    }//GEN-LAST:event_jButton16ActionPerformed

    /**
     * este metodo lo que hace es encontrar la llave con el texto dado en todas las llaves indexadas
     * @param text texto a buscar, cada llave lleva un texto
     * @return la llave que encontro
     */
    public Llave encontrarLlave(String text) {

        for (int i = 0; i < llaves.size(); i++) {

            if (llaves.get(i).getLlave().equals(text)) {

                return llaves.get(i);
            }
        }

        return null;

    }

    /**
     *este metodo busca una llave dada en el nodo dado
     * @param llave esta llave se busca en el nodo
     * @param nodo nodo en el que buscar
     * @return retorna llave encontrada
     */
    public Llave buscarLlave(String llave, NodoArbol nodo) {
        for (int i = 0; i < nodo.getLlaves().length; i++) {
            if (nodo.getLlaves()[i].getLlave().equals(llave)) {

                return nodo.getLlaves()[i];
            }

        }
        return null;
    }

    /**
     * este metodo llena la tabla dada con la llave dada esto se hace en modificar y eliminar registros
     * @param tabla la tabla que quiero 
     * @param llave la llave que quiero agregar
     * @throws IOException excepcion por si no encuentra nada
     */
    public void llenarTabla(JTable tabla, Llave llave) throws IOException {

        tabla.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{},
                new String[]{}
        ));
        DefaultTableModel modeloT = (DefaultTableModel) tabla.getModel();
        String cabezas[] = new String[metadata.getCampos().size()];
        for (int i = 0; i < cabezas.length; i++) {
            cabezas[i] = metadata.getCampos().get(i).getNombre();
        }
        for (Object a : cabezas) {
            modeloT.addColumn(a);
        }
        tabla.setModel(modeloT);

        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
        String row[] = new String[metadata.getCampos().size()];
        byte[] temp = new byte[300];
        int pos = 0;
        for (long i = llave.getByteoffset(); i < (llave.getByteoffset() + llave.getTamanio()); i++) {
            archivoAhorita.seek(i);
            temp[pos] = archivoAhorita.readByte();
            pos++;
        }
        String tempString = new String(temp);
        String[] registro = tempString.split("[|]");
        for (int i = 0; i < row.length; i++) {
            row[i] = registro[i];
        }
        modelo.addRow(row);
        tabla.setModel(modelo);
    }

    /**
     * este metodo llena la tabla de modificacion
     * @param llave la llave a usar
     * @throws IOException excepcion si la llave no existe
     */
    public void llenarTablaModificacion(Llave llave) throws IOException {
        archivoAhorita.seek(llave.getByteoffset());
        String linea;
        linea = archivoAhorita.readLine();
        System.out.println(linea);
        DefaultTableModel modeloTablaModificacion = (DefaultTableModel) tabla_registro2.getModel();
        modeloTablaModificacion.setRowCount(0);
        if (linea != null) {
            Object[] row = new Object[modeloTablaModificacion.getColumnCount()];
            String[] registrosc = linea.split("[|]");
            for (int i = 0; i < registrosc.length; i++) {
                row[i] = registrosc[i];
            }
            modeloTablaModificacion.addRow(row);
        }

    }

    /**
     *llena la tabla de borrado con la llave dada
     * @param llave la llave que quiero poner
     * @throws IOException excepcion por si no encuentra nada
     */
    public void llenarTablaBorrar(Llave llave) throws IOException {
        archivoAhorita.seek(llave.getByteoffset());
        String linea;
        linea = archivoAhorita.readLine();
        System.out.println(linea);
        DefaultTableModel modeloTablaModificacion = (DefaultTableModel) tabla_registro3.getModel();
        modeloTablaModificacion.setRowCount(0);
        if (linea != null) {
            Object[] row = new Object[modeloTablaModificacion.getColumnCount()];
            String[] registrosc = linea.split("[|]");
            for (int i = 0; i < registrosc.length; i++) {
                row[i] = registrosc[i];
            }
            modeloTablaModificacion.addRow(row);
        }

    }

    /**
     * otro metodo para recuperar una llave, lo que hace es buscar en el arbol la llave que quiero encontrar
     * @param buscar la llave que quiero
     * @return la llave en el nodo qe devuelve el nodo, si no la encuentra devuelve null
     */
    public Llave recuperaLLave(Llave buscar) {

        NodoArbol n = arbolB.buscar(buscar);
        for (int i = 0; i < n.getLlaves().length; i++) {
            if (n.getLlaves()[i].getLlave().equals(buscar.getLlave())) {
                buscar = n.getLlaves()[i];
                return buscar;

            }
        }
        return null;

    }
    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        DefaultTableModel modeloRegistros = (DefaultTableModel) tabla_registro2.getModel();

        Llave temporal = new Llave();
        boolean flag = true;
        for (int i = 0; i < modeloRegistros.getRowCount(); i++) {
            for (int j = 0; j < modeloRegistros.getRowCount(); j++) {
                if (modeloRegistros.getValueAt(i, j) == null) {
                    JOptionPane.showMessageDialog(guiModificarRegistro, "No pueden estar vacios");
                    flag = false;
                    break;
                } else {
                    temporal.setLlave(modeloRegistros.getValueAt(0, 0).toString());
                    System.out.println(temporal.getLlave());
                    if (encontrarLlave(temporal.getLlave()) == null) {
                        JOptionPane.showMessageDialog(guiModificarRegistro, "No puedes modificar la llave primaria");
                        flag = false;
                        break;

                    }

                }
            }
        }
        if (flag == true) {

            temporal = encontrarLlave(modeloRegistros.getValueAt(0, 0).toString());
            String nuevoRegistro = "";
            for (int i = 0; i < modeloRegistros.getColumnCount(); i++) {
                if (modeloRegistros.getColumnCount() - i == 1) {
                    nuevoRegistro += modeloRegistros.getValueAt(0, i);

                } else {

                    nuevoRegistro += modeloRegistros.getValueAt(0, i);
                    nuevoRegistro += "|";

                }
            }
            try {
                archivoAhorita.seek(temporal.getByteoffset());
                if (archivoAhorita.readLine().length() >= nuevoRegistro.length()) {
                    archivoAhorita.seek(temporal.getByteoffset());
                    int resta = archivoAhorita.readLine().length() - nuevoRegistro.length();
                    for (int i = 0; i < resta; i++) {
                        nuevoRegistro += " ";
                    }
                }
                archivoAhorita.seek(temporal.getByteoffset());
                archivoAhorita.writeBytes(nuevoRegistro);
                JOptionPane.showMessageDialog(guiModificarRegistro, "Registro modificado");
                modeloRegistros.setRowCount(0);
                cargarRegistros();

            } catch (IOException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton18ActionPerformed

    private void campoFiltro2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoFiltro2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoFiltro2ActionPerformed
/**
 * este metodo lo que hace es buscar en el arbol las llaves que coincidan con la que se introdujo
 * @param evt 
 */
    private void botonBuscarRegistroBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarRegistroBorrarActionPerformed

        if (campoFiltro3.getText().equals("")) {
            JOptionPane.showMessageDialog(guiModificarRegistro, "No puede estar vac??o el campo", "Informaci??n", JOptionPane.INFORMATION_MESSAGE);
        } else {
            Llave temp = new Llave();
            temp.setLlave(campoFiltro3.getText());
            //NodoArbol nodo = arbolB.buscar(temp);
            temp = encontrarLlave(campoFiltro3.getText());
            if (temp == null) {
                JOptionPane.showMessageDialog(guiBorrarRegistro, "No se encontr?? la llave", "Informaci??n", JOptionPane.INFORMATION_MESSAGE);
            } else {
                try {
                    llenarTabla(tabla_registro3, temp);
                } catch (IOException ex) {
                    Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_botonBuscarRegistroBorrarActionPerformed
/**
 * este metodo lo que se hace es modificar el registro dado, se busca de nuevo en el arbol y se obtiene el byteoffset
 * @param evt 
 */
    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
        //boton borrar registro guiborrar
        DefaultTableModel modeloRegistros = (DefaultTableModel) tabla_registro3.getModel();
        Llave temporal = new Llave();
        String llaveText = modeloRegistros.getValueAt(0, 0).toString();
        temporal = encontrarLlave(llaveText);
        String marca = "";
        for (int i = 0; i < temporal.getTamanio(); i++) {
            marca += "*";
        }
        try {
            archivoAhorita.seek(temporal.getByteoffset());
            archivoAhorita.write(marca.getBytes());

            JOptionPane.showMessageDialog(guiModificarRegistro, "Registro borrado");
            metadata.getAvaiList().inserta(temporal, metadata.getAvaiList().tamanio + 1);
            elimninarLlave(temporal);
            modeloRegistros.setRowCount(0);
            cargarRegistros();

        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton27ActionPerformed

    /**
     *este metodo elimina la llave que le doy
     * @param llave que quiero encontrar y eliminar
     */
    public void elimninarLlave(Llave llave) {
        for (int i = 0; i < llaves.size(); i++) {
            if (llaves.get(i).getLlave().equals(llave.getLlave())) {
                llaves.remove(i);
                break;
            }
        }
    }
    private void campoFiltro3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoFiltro3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoFiltro3ActionPerformed

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed
        guiAgregarRegistro.dispose();
        cargarRegistros();
        registros_gui.pack();
        registros_gui.setLocationRelativeTo(null);
        registros_gui.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton28ActionPerformed
    /**
     * este metodo lo que hace es agregar una fila a la tabla para poder agregar
     * @param evt 
     */
    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel modeloTablaRegistros = (DefaultTableModel) tablaguardarRegistros.getModel();
        Object[] b = {};
        modeloTablaRegistros.addRow(b);
        JOptionPane.showMessageDialog(guiAgregarRegistro, "LLena los espacios correspondiente en la nueva fila que se creo en la tabla");
    }//GEN-LAST:event_jButton15ActionPerformed
    /**
     * este metodo lo que hace es verificar si hay algun slot disponible en el availist si lo hay toma su llave y hace el guardado en ese lugar y elimina el slot  que se uso
     * si no hay espacio lo guarda normal en el archvivo que se tiene abierto, una vez se agrego eso, se agrega al arbol
     * @param evt 
     */
    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        //guardar registrossssssssss
        String registroTemp = "";
        Llave llaveTemp;
        DefaultTableModel modeloTablaRegistros = (DefaultTableModel) tablaguardarRegistros.getModel();
        boolean flag = true;

        for (int i = 0; i < modeloTablaRegistros.getRowCount(); i++) {
            for (int k = 0; k < modeloTablaRegistros.getColumnCount(); k++) {
                if (modeloTablaRegistros.getValueAt(i, k) == null) {

                    flag = false;
                    break;

                } else {
                    if (modeloTablaRegistros.getColumnCount() - k == 1) {
                        registroTemp += modeloTablaRegistros.getValueAt(i, k);

                    } else {
                        registroTemp += modeloTablaRegistros.getValueAt(i, k);
                        registroTemp += "|";
                    }

                }

            }
            //System.out.println(registroTemp);

            if (flag) {

                Llave llave = new Llave();
                String llavePrimaria = modeloTablaRegistros.getValueAt(i, 0).toString();
                llave.setLlave(llavePrimaria);
                llave.setTamanio(registroTemp.length());

                if (encontrarLlave(llavePrimaria) != null) {
                    JOptionPane.showMessageDialog(registros_gui, "No pueden haber llaves repetidas");
                    break;
                } else {

                    if (!metadata.getAvaiList().estaVacia()) {
                        int p2 = 0;
                        boolean flag2 = false;
                        for (int p = 1; p <= metadata.getAvaiList().tamanio; p++) {
                            if (metadata.getAvaiList().elementoPosicion(p).getTamanio() >= registroTemp.length()) {
                                flag2 = true;
                                p2 = p;
                                break;
                            }

                        }
                        if (flag2) {// se hace esto si encontro un lugar adecuado
                            Llave llaveresultante = metadata.getAvaiList().elementoPosicion(p2);
                            try {
                                archivoAhorita.seek(llaveresultante.getByteoffset());
                                String cadenaflag = archivoAhorita.readLine();
                                if (cadenaflag.length() >= registroTemp.length()) {
                                    int n = cadenaflag.length() - registroTemp.length();
                                    for (int j = 0; j < n; j++) {
                                        registroTemp += " ";
                                    }
                                }
                                llaveresultante.setLlave(llavePrimaria);
                                llaves.add(llaveresultante);
                                archivoAhorita.seek(llaveresultante.getByteoffset());
                                archivoAhorita.write(registroTemp.getBytes());
                                metadata.getAvaiList().suprimir(p2);

                            } catch (IOException ex) {
                                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                            }

                        } else {

                            try {
                                posArchivo = archivoAhorita.length();
                                archivoAhorita.seek(posArchivo);
                                llave.setByteoffset(posArchivo);
                                llaves.add(llave);
                                archivoAhorita.write(registroTemp.getBytes());
                                //System.out.println(registroTemp);
                            } catch (IOException ex) {
                                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                            }

                        }

                    } else {
                        try {
                            posArchivo = archivoAhorita.length();
                            archivoAhorita.seek(posArchivo);
                            llave.setByteoffset(posArchivo);
                            llaves.add(llave);
                            archivoAhorita.write(registroTemp.getBytes());

                        } catch (IOException ex) {
                            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                        }

                    }

                    registros.add(registroTemp);

                }

                JOptionPane.showMessageDialog(guiAgregarRegistro, "Registro guardado con exito");
                vaciarTabla();

            } else {
                JOptionPane.showMessageDialog(guiAgregarRegistro, "No pueden haber espacios en blanco");

            }
            registroTemp = "";

        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton29ActionPerformed

        jd_archivoCruzar.pack();
        jd_archivoCruzar.setLocationRelativeTo(this);
        jd_archivoCruzar.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton29ActionPerformed

    private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton30ActionPerformed
        // Cruzar Archivos
        int contLlaves = 0;
        String out = "";
        for (int i = 0; i < metaDataCruzada.getCampos().size(); i++) {
            if (metaDataCruzada.getCampos().get(i).isLlavePrimaria()) {
                contLlaves++;
                out += i + "- " + metaDataCruzada.getCampos().get(i).toString() + "\n";
            }
        }

        int op = 0;
        if (contLlaves > 1) {
            try {
                op = Integer.parseInt(JOptionPane.showInputDialog("Hay mas de una llave primaria, debe elejir solo una: " + "\n" + out));
            } catch (NumberFormatException ex) {
                System.out.println("No selecciona nada, abortando operacion...");
            }

            for (int i = 0; i < metaDataCruzada.getCampos().size(); i++) {
                if (i != op) {
                    metaDataCruzada.getCampos().get(i).setLlavePrimaria(false);
                }
            }

            escribirMetadaCampos(metaDataCruzada);

        } else if (contLlaves == 0) {//Sino hay ninguna llave primaria
            try {

                out = "";
                for (int i = 0; i < metaDataCruzada.getCampos().size(); i++) {
                    out += i + "- " + metaDataCruzada.getCampos().get(i).toString() + "\n";
                }

                op = Integer.parseInt(JOptionPane.showInputDialog("No hay ninguna llave primaria, debe elejir solo una: " + "\n" + out));

                metaDataCruzada.getCampos().get(op).setLlavePrimaria(true);

                escribirMetadaCampos(metaDataCruzada);

            } catch (NumberFormatException ex) {
                System.out.println("No selecciona nada, abortando operacion...");
            }

        } else {
            escribirMetadaCampos(metaDataCruzada);
        }

        DefaultTableModel model = (DefaultTableModel) jt_camposCruzados.getModel();
        model.setRowCount(0);

    }//GEN-LAST:event_jButton30ActionPerformed

    /**
     * escribo en la matadata 
     * @param metadata el objeto de la metadata con la informacion que necesito
     */
    public void escribirMetadaCampos(Metadata metadata) {
        try {
            String nombre = JOptionPane.showInputDialog("Ingrese el nombre del nuevo archivo");
            if (new File("./registros/" + nombre + ".txt").exists()) {
                while (new File("./registros/" + nombre + ".txt").exists()) {
                    nombre = JOptionPane.showInputDialog("Ese archivo ya existe cambie el nombre edel archivo");
                }
                metadata.escribirCampos(new File("./registros/" + nombre + ".txt"));
                JOptionPane.showMessageDialog(jd_archivoCruzar, "Archivo Cruzado Creado");
            } else {
                metadata.escribirCampos(new File("./registros/" + nombre + ".txt"));
                JOptionPane.showMessageDialog(jd_archivoCruzar, "Archivo Cruzado Creado");
            }

        } catch (IOException ex) {
        }
    }

    private void jButton31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton31ActionPerformed
        archivoCruzar = null;
        JFileChooser jfc = new JFileChooser("./");
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivos de Texto", "txt");
        jfc.addChoosableFileFilter(filtro);
        jfc.setAcceptAllFileFilterUsed(false);
        int seleccion = jfc.showOpenDialog(this);
        String pathArchivoCruzar = "";
        if (seleccion == JFileChooser.APPROVE_OPTION) {
            try {
                archivoCruzar = new RandomAccessFile(jfc.getSelectedFile(), "rw");
            } catch (FileNotFoundException ex) {
            }
            pathArchivoCruzar = jfc.getSelectedFile().getAbsolutePath();

            pathArchivoCruzar = pathArchivoCruzar.substring(0, pathArchivoCruzar.length() - 4);
            JOptionPane.showMessageDialog(jd_archivoCruzar, "El archivo se ha abierto exitosamente", "Informaci??n", JOptionPane.INFORMATION_MESSAGE);
        }

        metaData2 = new Metadata();
        metaDataCruzada = new Metadata();
        try {
            pathArchivoCruzar += ".txt";
            File temp = new File(pathArchivoCruzar);
            if (temp.exists()) {
                Scanner myReader = new Scanner(new File(pathArchivoCruzar));
                DefaultTableModel modelo = (DefaultTableModel) jt_campos2.getModel();

                borrarElementosTabla();//Limpiar tabla
                metaData2.getCampos().clear();//Se limpia todo lo que pueda haber en la metadata
                while (myReader.hasNextLine()) {
                    String data = myReader.nextLine();
                    String[] camposLinea = data.split(";");

                    for (String Campo : camposLinea) {

                        //Conseguir el nombre
                        try {

                            String[] campSpLit = Campo.split(":"); //Nombre:Tipo[num] = (Nombre)(Tipo[num]llave)
                            String nom = campSpLit[0];
                            String tipo = "";

                            //Conseguir el tipo
                            String[] typeSplit = campSpLit[1].split("\\[");// Tipo[Num] = (Tipo)(num]llave)
                            tipo = typeSplit[0];

                            //Conseguir llave primaria
                            String[] split = typeSplit[1].split("]");

                            boolean getLlave = false;
                            if (split[1].equals("1")) {
                                getLlave = true;
                            }

                            int len = Integer.parseInt(split[0]);

                            String temp1 = nom + ":" + tipo + "[" + len + "]" + split[1];
                            //Agregar a la tabla
                            Object[] newrow2 = {
                                temp1
                            };

                            metaData2.getCampos().add(new Campos(nom, tipo, len, getLlave));

                            //Ojo cambiar como saber si es llaveprimaria
                            modelo.addRow(newrow2);

                        } catch (ArrayIndexOutOfBoundsException ex) {
                        }
                    }
                }
                jt_campos2.setModel(modelo);

            }
            jButton32.setEnabled(true);

        } catch (NullPointerException ex) {

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton31ActionPerformed

    private void jt_camposCruzadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jt_camposCruzadosMouseClicked
        if (evt.isMetaDown()) {
            pop_camposMenu.show(evt.getComponent(),
                    evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_jt_camposCruzadosMouseClicked

    private void jButton32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton32ActionPerformed
        //Agregar Campo a campos cruzados
        int row = jt_campos1.getSelectedRow();
        int row1 = jt_campos2.getSelectedRow();
        if (row != -1) {//Si selecciono un campo de la tabla 1
            DefaultTableModel model = (DefaultTableModel) jt_camposCruzados.getModel();
            String value = jt_campos1.getModel().getValueAt(row, 0).toString();

            //Agregar a La metadata de campos cruzada
            String[] camposLinea = value.split(";");

            for (String Campo : camposLinea) {

                //Conseguir el nombre
                try {

                    String[] campSpLit = Campo.split(":"); //Nombre:Tipo[num] = (Nombre)(Tipo[num]llave)
                    String nom = campSpLit[0];
                    String tipo = "";

                    //Conseguir el tipo
                    String[] typeSplit = campSpLit[1].split("\\[");// Tipo[Num] = (Tipo)(num]llave)
                    tipo = typeSplit[0];

                    //Conseguir llave primaria
                    String[] split = typeSplit[1].split("]");

                    boolean getLlave = false;
                    if (split[1].equals("1")) {
                        getLlave = true;
                    }

                    int len = Integer.parseInt(split[0]);

                    metaDataCruzada.getCampos().add(new Campos(nom, tipo, len, getLlave));

                } catch (ArrayIndexOutOfBoundsException ex) {
                }
            }

            //Agregar a la tabla
            Object[] newrow = {
                value
            };
            model.addRow(newrow);
            JOptionPane.showMessageDialog(jd_archivoCruzar, "Campo agregado a CamposCruzados");
        } else if (row1 != -1) {
            DefaultTableModel model = (DefaultTableModel) jt_camposCruzados.getModel();
            String value = jt_campos2.getModel().getValueAt(row1, 0).toString();

            //Agregar a La metadata de campos cruzada
            String[] camposLinea = value.split(";");

            for (String Campo : camposLinea) {

                //Conseguir el nombre
                try {

                    String[] campSpLit = Campo.split(":"); //Nombre:Tipo[num] = (Nombre)(Tipo[num]llave)
                    String nom = campSpLit[0];
                    String tipo = "";

                    //Conseguir el tipo
                    String[] typeSplit = campSpLit[1].split("\\[");// Tipo[Num] = (Tipo)(num]llave)
                    tipo = typeSplit[0];

                    //Conseguir llave primaria
                    String[] split = typeSplit[1].split("]");

                    boolean getLlave = false;
                    if (split[1].equals("1")) {
                        getLlave = true;
                    }

                    int len = Integer.parseInt(split[0]);

                    metaDataCruzada.getCampos().add(new Campos(nom, tipo, len, getLlave));

                } catch (ArrayIndexOutOfBoundsException ex) {
                }
            }

            Object[] newrow = {
                value
            };
            model.addRow(newrow);
            JOptionPane.showMessageDialog(jd_archivoCruzar, "Campo agregado a CamposCruzados");
        }

        jt_campos1.clearSelection();
        jt_campos2.clearSelection();

        if (jt_camposCruzados.getRowCount() >= 1) {
            jButton30.setEnabled(true);
        }

    }//GEN-LAST:event_jButton32ActionPerformed

    private void jd_archivoCruzarWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_jd_archivoCruzarWindowClosing
        jd_archivoCruzar.setVisible(false);
        this.setVisible(true);
    }//GEN-LAST:event_jd_archivoCruzarWindowClosing

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        //Eliminar campo de camposCruzados
        int getSelectedRowForDeletion = jt_camposCruzados.getSelectedRow();
        if (getSelectedRowForDeletion != -1) {
            String value = jt_camposCruzados.getModel().getValueAt(getSelectedRowForDeletion, 0).toString();

            ((DefaultTableModel) jt_camposCruzados.getModel()).removeRow(getSelectedRowForDeletion);

            String[] campSpLit = value.split(":"); //Nombre:Tipo[num] = (Nombre)(Tipo[num]llave)
            String nom = campSpLit[0];

            int index = buscarCampoCruzado(nom);

            metaDataCruzada.getCampos().remove(index);
            if (jt_camposCruzados.getRowCount() == 1) {

                jButton30.setEnabled(false);
            }

            JOptionPane.showMessageDialog(null, "Campo eliminado");
        } else {
            JOptionPane.showMessageDialog(null, "No Hay campo seleccionado");
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    /**
     *
     */
    public void actualizarTablaRegistros() {
        // cargarRegistros();
        registros_gui.dispose();
        registros_gui.pack();
        registros_gui.setLocationRelativeTo(null);
        registros_gui.setVisible(true);

    }

    /**
     *
     */
    public void vaciarTabla() {
        DefaultTableModel modeloRegistros = (DefaultTableModel) tablaguardarRegistros.getModel();
        modeloRegistros.setRowCount(0);
    }

    /**
     * este metodo busca entre los campos que recupere
     * @param nombre el nombre del campo que quiero verificar
     * @return el indice de donde esta
     */
    public int buscarCampoCruzado(String nombre) {
        int index = 0;
        for (int i = 0; i < metaDataCruzada.getCampos().size(); i++) {
            if (metaDataCruzada.getCampos().get(i).getNombre().equals(nombre)) {
                return i;
            }
        }

        return index;
    }
    /**
     * este metodo lo que hace es indexar los registros, guarda las llaves correspondientes de cada uno y guarda todo en el arbol
     * @throws FileNotFoundException excepcion por si hay un error a la hora de encontrar el archivo
     * @throws IOException  excepcion para verificar si no hay un error a la hora de escritura o lectura
     */
    public void guardarRegistroEnArchivo() throws FileNotFoundException, IOException {
        archivoAhorita = new RandomAccessFile(new File(ubicacionActual), "rw");
        String saltoLinea = "\n";
        posArchivo = archivoAhorita.length();
        boolean flag = false;

        for (int i = 0; i < registros.size(); i++) {
            try {
                llaves.get(i).setByteoffset(posArchivo);
                arbolB.insertar(llaves.get(i));
                archivoAhorita.seek(posArchivo);
                long posTemp = posArchivo;
                archivoAhorita.write(registros.get(i).getBytes());
                posArchivo += registros.get(i).length();
                archivoAhorita.seek(posArchivo);
                archivoAhorita.write(saltoLinea.getBytes());
                posArchivo++;
            } catch (IOException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    /**
     * este metodo lo que hace es cargar los registros del archivo e irlos desplegando en la tabla
     */
    public void cargarRegistros() {
        DefaultTableModel modeloRegistros = (DefaultTableModel) tabla_registro.getModel();
        modeloRegistros.setRowCount(0);
        File registrosPrueba = new File(ubicacionActual);
        if (registrosPrueba.exists()) {
            FileReader fr = null;
            BufferedReader br = null;
            try {
                fr = new FileReader(registrosPrueba);
                br = new BufferedReader(fr);
                String linea = "";
                boolean flag = false;
                while ((linea = br.readLine()) != null) {
                    if (flag == true) {
                        if (!linea.contains("*")) {

                            String[] registro = linea.split("[|]");

                            Object[] row = new Object[modeloRegistros.getColumnCount()];

                            for (int i = 0; i < registro.length; i++) {

                                if (registro[i].equals("true")) {
                                    boolean v;
                                    v = true;
                                    row[i] = v;

                                } else if (registro[i].equals("false")) {
                                    boolean c;
                                    c = false;
                                    row[i] = false;

                                } else {

                                    row[i] = registro[i];
                                }

                            }
                            modeloRegistros.addRow(row);
                        }

                    }
                    if (linea.equals("@@@")) {
                        flag = true;
                    }

                }

                // Object[] registroNuevo =  new Object[tamanio];
            } catch (Exception e) {
            }
            try {
                br.close();
                fr.close();
            } catch (IOException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    /**
     * este metodo es para crear un xml
     * @param filename el nombre del archivo
     * @throws TransformerException excepcion si la transformacion del archivo recibio un error
     */
    public void crearXML(String filename) throws TransformerException {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder builder = factory.newDocumentBuilder();
            DOMImplementation implementation = builder.getDOMImplementation();
            Document document = (Document) implementation.createDocument(null, filename, null);
            document.setXmlVersion("1.0");

            //Obtener los valores de la tabla
            ArrayList<String> nombres = new ArrayList();
            ArrayList<String> tipos = new ArrayList();
            ArrayList<String> longitud = new ArrayList();
            ArrayList<String> llaveprimaria = new ArrayList();

            for (int i = 0; i < jtable_campos.getRowCount(); i++) {
                nombres.add((String) jtable_campos.getValueAt(i, 0));
                tipos.add((String) jtable_campos.getValueAt(i, 1));

                //Integer
                Integer n = (Integer) jtable_campos.getValueAt(i, 2);
                String x = n.toString();
                longitud.add(x);

                //Boolean
                boolean b = (boolean) jtable_campos.getModel().getValueAt(i, 3);
                String valor = "";
                if (b) {
                    valor = "SI";
                } else {
                    valor = "NO";
                }
                llaveprimaria.add(valor);
            }
            //FIN de obtener los valores de la tabla

            //NODO RAIZ
            Element raiz = document.getDocumentElement();
            for (int i = 0; i < nombres.size(); i++) {
                Element itemNode = document.createElement("Campo_" + (i + 1));

                Element nameNode = document.createElement("NOMBRE");
                Text nodeNameValue = document.createTextNode("" + nombres.get(i));
                nameNode.appendChild(nodeNameValue);

                Element typeNode = document.createElement("TIPO");
                Text nodeTypeValue = document.createTextNode("" + tipos.get(i));
                typeNode.appendChild(nodeTypeValue);

                Element lengthNode = document.createElement("LONGITUD");
                Text nodeLengthValue = document.createTextNode("" + longitud.get(i));
                lengthNode.appendChild(nodeLengthValue);

                Element isKey = document.createElement("LLAVE");
                Text nodeIsKey = document.createTextNode("" + llaveprimaria.get(i));
                isKey.appendChild(nodeIsKey);

                itemNode.appendChild(nameNode);
                itemNode.appendChild(typeNode);
                itemNode.appendChild(lengthNode);
                itemNode.appendChild(isKey);

                raiz.appendChild(itemNode);
            }

            //GENERA XML
            Source source = new DOMSource(document);
            //DONDE SE GUARDARA
            Result result = new StreamResult(new java.io.File(filename + ".xml"));
            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            transformer.transform(source, result);

        } catch (ParserConfigurationException e) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    /**
     * este metodo ordena de manera recursiva el arbol de archivos en el gui de archivos
     * @param p_raiz raiz es el archivo raiz del cual ire partiendo
     * @param nodo el nodo del arbol es el que tiene el archivo atual y que es hijo de la raiz
     */
    public void listar_no_orden(File p_raiz, DefaultMutableTreeNode nodo) {
        try {
            for (File temp : p_raiz.listFiles()) {
                if (temp.isFile()) {
                    DefaultMutableTreeNode n = new DefaultMutableTreeNode(
                            temp.getName());
                    nodo.add(n);
                } else {
                    DefaultMutableTreeNode n = new DefaultMutableTreeNode(
                            temp.getName());
                    nodo.add(n);
                    listar_no_orden(temp, n);
                }
            }
        } catch (Exception e) {
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Dark Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    //Variables Globales
    ArrayList<String> registros = new ArrayList<String>();
    ArrayList<Llave> llaves = new ArrayList();
    String rutaArchivo = "./registros/";
    File file = new File(rutaArchivo);//el archivo al que vamos a guardar
    Metadata metadata = new Metadata();

    RandomAccessFile archivoCruzar;
    Metadata metaData2;
    Arbol arbolBCruzar = new Arbol(6);
    Metadata metaDataCruzada;

    String ubicacionActual = "";
    Arbol arbolB = new Arbol(6);
    Llave llaveactual = null;
    RandomAccessFile archivoAhorita;
    long posicionArchivo;

    /////////////////////////////////////////////////////////////////////////////////////////////////////////

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTree arbolArchivos;
    private javax.swing.JButton botonBuscarRegistro;
    private javax.swing.JButton botonBuscarRegistroBorrar;
    private javax.swing.JButton botonEliminarRegistro;
    private javax.swing.JButton botonExcel;
    private javax.swing.JButton botonGuardarRegistros;
    private javax.swing.JButton botonModificarRegistro;
    private javax.swing.JButton botonXML;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField campoFiltro;
    private javax.swing.JTextField campoFiltro2;
    private javax.swing.JTextField campoFiltro3;
    private javax.swing.JDialog campos;
    private javax.swing.JDialog crearIndices_reindexar;
    private javax.swing.JDialog estandarizacion;
    private javax.swing.JLabel fecha_de_modificacion;
    private javax.swing.JDialog guiAgregarRegistro;
    private javax.swing.JDialog guiBorrarRegistro;
    private javax.swing.JDialog guiModificarRegistro;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JDialog jd_archivoCruzar;
    private javax.swing.JTextField jt_archivoActual;
    private javax.swing.JTable jt_campos1;
    private javax.swing.JTable jt_campos2;
    private javax.swing.JTable jt_camposCruzados;
    private javax.swing.JTable jt_reindexar;
    private javax.swing.JTable jtable_campos;
    private javax.swing.JDialog misArchivos;
    private javax.swing.JPopupMenu pop_camposMenu;
    private javax.swing.JRadioButton rb_no;
    private javax.swing.JRadioButton rb_si;
    private javax.swing.JDialog registros_gui;
    private javax.swing.JDialog reindexar;
    private javax.swing.JTable tabla_registro;
    private javax.swing.JTable tabla_registro2;
    private javax.swing.JTable tabla_registro3;
    private javax.swing.JTable tablaguardarRegistros;
    private javax.swing.JLabel textoFiltro;
    private javax.swing.JLabel textoFiltro2;
    private javax.swing.JLabel textoFiltro3;
    // End of variables declaration//GEN-END:variables
    long posArchivo;
    Llave llaveActual = null;
}
