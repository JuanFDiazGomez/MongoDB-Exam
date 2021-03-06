/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.miguel.examenmongodb;

import com.mongodb.MongoClient;
import com.mongodb.client.DistinctIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Accumulators;
import static com.mongodb.client.model.Accumulators.avg;
import static com.mongodb.client.model.Accumulators.sum;
import com.mongodb.client.model.Aggregates;
import static com.mongodb.client.model.Aggregates.count;
import static com.mongodb.client.model.Aggregates.group;
import static com.mongodb.client.model.Aggregates.match;
import static com.mongodb.client.model.Aggregates.project;
import com.mongodb.client.model.Collation;
import com.mongodb.client.model.Filters;
import static com.mongodb.client.model.Filters.and;
import static com.mongodb.client.model.Filters.eq;
import static com.mongodb.client.model.Filters.gt;
import static com.mongodb.client.model.Filters.or;
import static com.mongodb.client.model.Indexes.descending;
import com.mongodb.client.model.Projections;
import static com.mongodb.client.model.Projections.excludeId;
import static com.mongodb.client.model.Projections.fields;
import static com.mongodb.client.model.Projections.include;
import com.mongodb.client.model.Sorts;
import com.mongodb.client.model.Updates;
import static com.mongodb.client.model.Updates.inc;
import static com.mongodb.client.model.Updates.set;
import com.mongodb.client.result.DeleteResult;
import com.mongodb.client.result.UpdateResult;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.bson.Document;
/**
 *
 * @author miguel
 */
public class MainFormMongoDB extends javax.swing.JFrame {
    MongoCollection<Document> collection;
    /**
     * Creates new form MainFormMongoDB
     */
    public MainFormMongoDB() {
        initComponents();
        crearConexionMongoDB();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        botonConsulta1 = new javax.swing.JButton();
        botonInsertarFicheroBD = new javax.swing.JButton();
        botonConsulta2 = new javax.swing.JButton();
        botonConsulta3 = new javax.swing.JButton();
        botonConsulta4 = new javax.swing.JButton();
        botonConsulta5 = new javax.swing.JButton();
        botonInsertarRegistroBD = new javax.swing.JButton();
        botonActualizarRegistroBD = new javax.swing.JButton();
        botonBorrarRegistroBD = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaTextoPrincipal = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Gestión Pruebas MongoDB Spotify");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Opciones Gestion MongoDB"));

        botonConsulta1.setText("Consulta 1 (Año 1970)");
        botonConsulta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonConsulta1ActionPerformed(evt);
            }
        });

        botonInsertarFicheroBD.setText("Insertar Documentos BD");
        botonInsertarFicheroBD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonInsertarFicheroBDActionPerformed(evt);
            }
        });

        botonConsulta2.setText("Consulta 2 (Media Año 67)");
        botonConsulta2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonConsulta2ActionPerformed(evt);
            }
        });

        botonConsulta3.setText("Consulta 3 (Productores)");
        botonConsulta3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonConsulta3ActionPerformed(evt);
            }
        });

        botonConsulta4.setText("Consulta 4 (Media Duración por Año)");
        botonConsulta4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonConsulta4ActionPerformed(evt);
            }
        });

        botonConsulta5.setText("Consulta 5 (Géneros de la BD)");
        botonConsulta5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonConsulta5ActionPerformed(evt);
            }
        });

        botonInsertarRegistroBD.setText("Insertar Registro BD");
        botonInsertarRegistroBD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonInsertarRegistroBDActionPerformed(evt);
            }
        });

        botonActualizarRegistroBD.setText("Actualizar Registro BD");
        botonActualizarRegistroBD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonActualizarRegistroBDActionPerformed(evt);
            }
        });

        botonBorrarRegistroBD.setText("Borrar Registro BD");
        botonBorrarRegistroBD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBorrarRegistroBDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botonInsertarRegistroBD, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonInsertarFicheroBD, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonActualizarRegistroBD, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonBorrarRegistroBD, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botonConsulta2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonConsulta1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonConsulta3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonConsulta4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 443, Short.MAX_VALUE)
                    .addComponent(botonConsulta5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 443, Short.MAX_VALUE))
                .addGap(110, 110, 110))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(botonConsulta1)
                        .addComponent(botonInsertarFicheroBD))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botonInsertarRegistroBD)
                            .addComponent(botonConsulta2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botonActualizarRegistroBD)
                            .addComponent(botonConsulta3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botonBorrarRegistroBD)
                            .addComponent(botonConsulta4))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonConsulta5)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        areaTextoPrincipal.setColumns(20);
        areaTextoPrincipal.setRows(5);
        areaTextoPrincipal.setBorder(javax.swing.BorderFactory.createTitledBorder("Area Texto Principal"));
        jScrollPane1.setViewportView(areaTextoPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 664, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonInsertarFicheroBDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonInsertarFicheroBDActionPerformed
        FileReader fr = null;
        BufferedReader br = null;
        try{
            File file = new File("recursos/canciones.json");
            fr = new FileReader(file);
            br = new BufferedReader(fr);
            String linea = null;
            while((linea = br.readLine()) != null){
                collection.insertOne(Document.parse(linea));
            }
            areaTextoPrincipal.append(new java.util.Date().toString()+": Fichero Canciones.json insertado corretamente en la BD\n");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(MainFormMongoDB.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(MainFormMongoDB.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if(br != null){
                try {
                    br.close();
                    fr.close();
                } catch (IOException ex) {
                    Logger.getLogger(MainFormMongoDB.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        
        
    }//GEN-LAST:event_botonInsertarFicheroBDActionPerformed

    private void botonInsertarRegistroBDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonInsertarRegistroBDActionPerformed
        String cancion = JOptionPane.showInputDialog("Introduce el nombre de la cancion: ");
        String artista = JOptionPane.showInputDialog("Introduce el nombre del artista: ");
        String album = JOptionPane.showInputDialog("Introduce el nombre del album: ");
        String nombreProductor = JOptionPane.showInputDialog("Introduce el nombre del productor");
        String ape1Productor = JOptionPane.showInputDialog("Introduce el primer apellido");
        String ape2Productor = JOptionPane.showInputDialog("Introduce el nombre");
        String duracion = JOptionPane.showInputDialog("Introduce la duracion");
        String anyo = JOptionPane.showInputDialog("Introduce el año");
        String genero = JOptionPane.showInputDialog("Introduce el genero");
        Document nuevoDocumento = 
                new Document("nombre",cancion)
                .append("artista", artista)
                .append("album", album)
                .append("productores",new Document("nombre",nombreProductor)
                        .append("ape1", ape1Productor)
                        .append("ape2", ape2Productor))
                .append("duracion", duracion)
                .append("anyo", anyo)
                .append("generos", genero);
        collection.insertOne(nuevoDocumento);
        areaTextoPrincipal.append(new java.util.Date().toString()+": Registro insertado con exito\n");
        areaTextoPrincipal.append(nuevoDocumento.toJson()+"\n");
    }//GEN-LAST:event_botonInsertarRegistroBDActionPerformed

    private void botonActualizarRegistroBDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonActualizarRegistroBDActionPerformed
        String cancion = JOptionPane.showInputDialog("Introduce el nombre de la cancion: ");
        String nombreProductor = JOptionPane.showInputDialog("Introduce el nombre del productor");
        String ape1Productor = JOptionPane.showInputDialog("Introduce el primer apellido");
        String ape2Productor = JOptionPane.showInputDialog("Introduce el nombre");
        collection.updateOne(
                Filters.eq("nombre", cancion),
                Updates.set("productores", 
                        new Document("nombre",nombreProductor)
                                .append("ape1", ape1Productor)
                                .append("ape2", ape2Productor)
                )
        );
        areaTextoPrincipal.append(new java.util.Date().toString()+": El productor de la cancion "+cancion+" ha sido actualizado con exito\n");
    }//GEN-LAST:event_botonActualizarRegistroBDActionPerformed

    private void botonBorrarRegistroBDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBorrarRegistroBDActionPerformed
        String cancion = JOptionPane.showInputDialog("Introduce el nombre de la cancion: ");
        collection.deleteOne(Filters.eq("nombre",cancion));
        areaTextoPrincipal.append(new java.util.Date().toString()+": La cancion "+cancion+" ha sido borrada con exito\n");
    }//GEN-LAST:event_botonBorrarRegistroBDActionPerformed

    private void botonConsulta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonConsulta1ActionPerformed
        List<Document> consulta = collection.find(
                Filters.and(
                        Filters.eq("anyo",1970),
                        Filters.eq("generos","Rock")))
                .sort(Sorts.descending("nombre"))
                .into(new ArrayList<Document>());
        areaTextoPrincipal.append(new java.util.Date().toString()+": Resultados de la ejecucion de la consulta 1\n");
        for(Document doc : consulta){
            areaTextoPrincipal.append(doc.toJson()+"\n\n");
        }
    }//GEN-LAST:event_botonConsulta1ActionPerformed

    private void botonConsulta2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonConsulta2ActionPerformed
        Document doc = collection.aggregate(Arrays.asList(
                Aggregates.match(Filters.eq("anyo",1977)),
                Aggregates.project(Projections.include("anyo","duracion")),
                Aggregates.group("$anyo", Accumulators.avg("media", "$duracion")))
        ).first();
        areaTextoPrincipal.append(new java.util.Date().toString()+": Resultados de la ejecucion de la consulta 2\n");
        areaTextoPrincipal.append(doc.toJson()+"\n");
    }//GEN-LAST:event_botonConsulta2ActionPerformed

    private void botonConsulta3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonConsulta3ActionPerformed
        List<Document> consulta = collection.find(
                Filters.gte("anyo",1980))
                .projection(Projections.fields(
                        Projections.include("productores"),
                        Projections.excludeId()))
                .into(new ArrayList<Document>());
        areaTextoPrincipal.append(new java.util.Date().toString()+": Resultados de la ejecucion de la consulta 3\n");
        for(Document doc : consulta){
            areaTextoPrincipal.append(doc.toJson()+"\n");
        }
    }//GEN-LAST:event_botonConsulta3ActionPerformed

    private void botonConsulta4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonConsulta4ActionPerformed
        List<Document> consulta = collection.aggregate(Arrays.asList(
                Aggregates.group("$anyo", Accumulators.sum("sumaduracion", "$duracion")))
        ).into(new ArrayList<Document>());
        areaTextoPrincipal.append(new java.util.Date().toString()+": Resultados de la ejecucion de la consulta 4\n");
        for(Document doc : consulta){
            areaTextoPrincipal.append(doc.toJson()+"\n");
        }
    }//GEN-LAST:event_botonConsulta4ActionPerformed

    private void botonConsulta5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonConsulta5ActionPerformed
        List<Document> docs = collection.aggregate(Arrays.asList(group("$generos"))).into(new ArrayList<Document>());
        for(Document doc : docs){
            areaTextoPrincipal.append(doc.toJson()+"\n");
        }
        
        docs = collection.aggregate(Arrays.asList(project(Projections.fields(include("generos"),excludeId())))).into(new ArrayList<Document>());
        areaTextoPrincipal.append(new java.util.Date().toString()+": Resultados de la ejecucion de la consulta 4\n");
        ArrayList<String> generos = new ArrayList<String>();
        for(Document doc : docs){
            ArrayList<String> listado = (ArrayList<String>) doc.get("generos");
            for(String genero : listado){
                if(generos.indexOf(genero)<0){
                    generos.add(genero);
                }
            }
        }
        areaTextoPrincipal.append(new Document("generosdiferentes",generos.size()).toJson()+"\n");
    }//GEN-LAST:event_botonConsulta5ActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFormMongoDB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFormMongoDB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFormMongoDB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFormMongoDB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFormMongoDB().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaTextoPrincipal;
    private javax.swing.JButton botonActualizarRegistroBD;
    private javax.swing.JButton botonBorrarRegistroBD;
    private javax.swing.JButton botonConsulta1;
    private javax.swing.JButton botonConsulta2;
    private javax.swing.JButton botonConsulta3;
    private javax.swing.JButton botonConsulta4;
    private javax.swing.JButton botonConsulta5;
    private javax.swing.JButton botonInsertarFicheroBD;
    private javax.swing.JButton botonInsertarRegistroBD;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private void crearConexionMongoDB() {
        String col = "ColeccionExamen";
        MongoClient cliente = new MongoClient();
        MongoDatabase db = cliente.getDatabase("mibasedatos");
        //db.createCollection(col);
        collection = db.getCollection(col);
        areaTextoPrincipal.append(new java.util.Date().toString()+": Coleccion "+col+" creada con exito\n");
    }
}
