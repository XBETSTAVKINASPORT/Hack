Данный код описывает, как сделать fileChooser на ЯП Java С помощью Java GUI


private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        String filename = f.getAbsolutePath();
        try{
            FileReader reader = new FileReader(filename);
            BufferedReader br = new BufferedReader(reader);
            jTextArea1.read(br, null);
            br.close();
            jTextArea1.requestFocus();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        jTextField1.setText(filename);
    }                                        

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        System.exit(0);
    }                                        

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        jTextArea1.setText("");
        jTextField1.setText("");
    }

