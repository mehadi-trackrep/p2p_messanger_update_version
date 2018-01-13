
package mychatappp.gui;
import javax.swing.SwingUtilities;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JRootPane;
import mychatappp.networking.MessageListener;
import mychatappp.networking.MessageTransmitter;
import mychatappp.networking.ShowMessage;
import mychatappp.networking.WritableGUI;


public class MainScreen extends javax.swing.JFrame implements WritableGUI {

    /**
     * Creates new form MainScreen
     */
    public int choose_file = 0, disconnected = 1, ForTheFirstTime = 1, color = 0;  //CK triggerForSendingFile = 0,
    public static int comingFromListeningClasstoChangeColor = 0;
    MessageListener listener;
    String chatHistory = "";
    String filePath = "";

    public MainScreen() {
        
        initComponents();
        ImageIcon image = new ImageIcon("F:\\main_logo.png");
        logo.setIcon(image);
        logo1.setIcon(image);
        //getContentPane().setBackground(new java.awt.Color(10, 48, 100)); //The gui started here
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ipTextField = new javax.swing.JTextField();
        targetPort = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        chat = new javax.swing.JTextArea();
        message = new javax.swing.JTextField();
        sendButton = new javax.swing.JButton();
        listenButton = new javax.swing.JButton();
        receivePort = new javax.swing.JTextField();
        user_name = new javax.swing.JTextField();
        history = new javax.swing.JButton();
        FileSending = new javax.swing.JButton();
        Disconnect = new javax.swing.JButton();
        bcolor = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        logo1 = new javax.swing.JLabel();
        history1 = new javax.swing.JButton();
        choose_fileBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ipTextField.setText("localhost");
        ipTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ipTextFieldActionPerformed(evt);
            }
        });

        targetPort.setText("Dest  Port");
        targetPort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                targetPortActionPerformed(evt);
            }
        });

        chat.setEditable(false);
        chat.setColumns(20);
        chat.setRows(5);
        jScrollPane1.setViewportView(chat);

        message.setBackground(new java.awt.Color(237, 187, 153));
        message.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                messageFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                messageFocusLost(evt);
            }
        });
        message.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                messageActionPerformed(evt);
            }
        });

        sendButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        sendButton.setText("Send");
        sendButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendButtonActionPerformed(evt);
            }
        });

        listenButton.setText("Connect");
        listenButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listenButtonActionPerformed(evt);
            }
        });

        receivePort.setText("Src  Port");
        receivePort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                receivePortActionPerformed(evt);
            }
        });

        user_name.setText("Name");
        user_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                user_nameActionPerformed(evt);
            }
        });

        history.setText("Save Chat History");
        history.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                historyActionPerformed(evt);
            }
        });

        FileSending.setBackground(new java.awt.Color(237, 187, 153));
        FileSending.setText("File Send");
        FileSending.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FileSendingActionPerformed(evt);
            }
        });

        Disconnect.setText("Disconnect");
        Disconnect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DisconnectActionPerformed(evt);
            }
        });

        bcolor.setText("BackGround Color");
        bcolor.setToolTipText("");
        bcolor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bcolorActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 128, 0));
        jLabel1.setText("P2P Messenger");

        logo.setText("d");

        logo1.setText("d");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(logo1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, Short.MAX_VALUE)
                    .addComponent(logo1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        history1.setText("Show History");
        history1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                history1ActionPerformed(evt);
            }
        });

        choose_fileBtn.setText("Choose File");
        choose_fileBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choose_fileBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(message, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sendButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(user_name, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Disconnect, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(listenButton, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(receivePort, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ipTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(targetPort, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(bcolor, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(history, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(history1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(choose_fileBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(FileSending, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ipTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(targetPort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(listenButton)
                    .addComponent(receivePort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(user_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Disconnect))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(message, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sendButton, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(history1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(choose_fileBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bcolor, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(history, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FileSending, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(94, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void listenButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listenButtonActionPerformed
        //pressing the connect button it will create a connection with other side.
        
        if(targetPort.getText().equals("T port") || receivePort.getText().equals("R Port") ){ //CK    || key.getText().equals("En Key")
            
            WritableGUI gui = this;
            gui.write("You did not correctly inserted En Key or R port or T port. You are requested to verify these please");
            
        }
        
        else if(!targetPort.getText().equals("T Port") && !receivePort.getText().equals("R Port") ){ //CK  && !key.getText().equals("En Key")
            
            disconnected = 0;
            this.write("Connected.");
            listener = new MessageListener(this,Integer.parseInt(receivePort.getText()));  //CK  , Integer.parseInt(key.getText()) 
            listener.start(); // Connection thread will start.
            getContentPane().setBackground(new java.awt.Color(10, 48, 100));
        }
    }//GEN-LAST:event_listenButtonActionPerformed

    
    
    private void sendButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendButtonActionPerformed

        if (disconnected == 0) {
            MessageTransmitter transmitter
                    = new MessageTransmitter(this, message.getText(), ipTextField.getText(), Integer.parseInt(targetPort.getText()), Integer.parseInt(receivePort.getText()), user_name.getText(), 0); //CK  Integer.parseInt(key.getText()), 0
            //triggerForSendingFile = 0;
            
            message.setText("");  // .........................................
            
            transmitter.start();
            // This section will start the class for message transmitting.
        } else {
            this.write("You are not connected");
        }
    }//GEN-LAST:event_sendButtonActionPerformed

    private void ipTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ipTextFieldActionPerformed

    }//GEN-LAST:event_ipTextFieldActionPerformed

    private void targetPortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_targetPortActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_targetPortActionPerformed

    private void historyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_historyActionPerformed

        WritableGUI gui = this;
        try {
            String s = ".\\" + user_name.getText() + ".txt";
            File file = new File(s);        //CK   ".\\ChatHistory.txt"  instead of s

            //Creating Chat history file
            if (!file.exists()) {
                {
                    file.createNewFile();
                    BufferedWriter out = null;
                    FileWriter fstream = new FileWriter(s, true); //CK ".\\ChatHistory.txt"  instead of s
                    out = new BufferedWriter(fstream);
                    out.write(chatHistory + System.lineSeparator());
                    out.close();
                }
                //end creation
            } else {
                // Writing the chat history on the file
                try {
                    BufferedWriter out = null;
                    FileWriter fstream = new FileWriter(s, true); //CK ".\\ChatHistory.txt"  instead of s    //true tells to append data.
                    out = new BufferedWriter(fstream);
                    out.write(chatHistory + System.lineSeparator());
                    out.close();
                } catch (IOException e) {

                }
            }
        } catch (IOException ex) {
            Logger.getLogger(MainScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
        //Writing ends

        gui.write("Chat history is saved in your project folder named as " + user_name.getText() +".txt");
    }//GEN-LAST:event_historyActionPerformed

    private void FileSendingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FileSendingActionPerformed
        WritableGUI gui = this;
        //this.write("Please write down the file path on sendbox area:");
        if(this.choose_file == 0){
            this.write("Please choose a file");
        }else{
            if(disconnected == 0){
                MessageTransmitter transmitter
                    = new MessageTransmitter(this, filePath, ipTextField.getText(), Integer.parseInt(targetPort.getText()), Integer.parseInt(receivePort.getText()), user_name.getText(), 1);
                
                transmitter.start();
                // This section will start the class for message transmitting.
            } else {
                this.write("You are not connected");
            }
            this.choose_file = 0;
        }
        //triggerForSendingFile = 1;// Trigger activated for sending file. If specified path is correct it will send file 
    }//GEN-LAST:event_FileSendingActionPerformed

    private void DisconnectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DisconnectActionPerformed
        
        listener.stop(); // When disconnected button is pressed it will stop the thread so all connection will be cut off.
        try {
            listener.server.close();
        } catch (IOException ex) {
            Logger.getLogger(MainScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
        disconnected = 1;
        this.write("Disconnected");

        getContentPane().setBackground(new java.awt.Color(10, 100, 100));
    }//GEN-LAST:event_DisconnectActionPerformed

    private void user_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_user_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_user_nameActionPerformed

    private void bcolorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bcolorActionPerformed
        
        //In here background colors are changed whern pressing the Button Background
        if (color == 0) {

            getContentPane().setBackground(new java.awt.Color(000, 255, 000));
            chat.setBackground(new java.awt.Color(255, 255, 255));
            chat.repaint();

        }

        if (color == 1) {
            WritableGUI gui = this;
            getContentPane().setBackground(new java.awt.Color(001, 000, 000));
            chat.setBackground(new java.awt.Color(0, 100, 0));
            chat.repaint();
            gui.write("Night mode on");
        }
        if (color == 2) {
            getContentPane().setBackground(new java.awt.Color(255, 000, 000));
            chat.setBackground(new java.awt.Color(0, 255, 0));
            chat.repaint();
        }

        if (color == 3) {

            getContentPane().setBackground(new java.awt.Color(10, 48, 100));
            chat.setBackground(new java.awt.Color(255, 255, 255));
            chat.repaint();
        }

        
        color++;
        if (color == 4) {
            color = 0;
        }

    }//GEN-LAST:event_bcolorActionPerformed

    private void receivePortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_receivePortActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_receivePortActionPerformed

    private void history1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_history1ActionPerformed
        // TODO add your handling code here:
        
        String s = user_name.getText();
        String outstr = ""; ///outstr is the string to be put in new pop up window
        
        try {
            String filetoread = ".//"+s+".txt"; ///string s=user name
            File file2;
            file2 = new File(filetoread);
            BufferedReader br = new BufferedReader(new FileReader(file2));

            String st;
            while ((st = br.readLine()) != null) {
                System.out.println(st);
                outstr=outstr+st+"\n";
            }
            System.out.println("==> "+ outstr);  // ................................................
            br.close();
       }
       catch(Exception e){
       }
        
       System.out.println("======>" + s + "   " + outstr);   // ................................................
       
       ShowMessage obj = new ShowMessage();
       obj.set_chats(outstr);
       obj.setVisible(true);
       obj.setResizable(false);
    }//GEN-LAST:event_history1ActionPerformed

    private void messageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_messageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_messageActionPerformed

    private void messageFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_messageFocusGained
        // TODO add your handling code here:
        JRootPane rootPane = SwingUtilities.getRootPane(sendButton); 
        rootPane.setDefaultButton(sendButton);
    }//GEN-LAST:event_messageFocusGained

    private void messageFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_messageFocusLost

    }//GEN-LAST:event_messageFocusLost

    private void choose_fileBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choose_fileBtnActionPerformed
        // TODO add your handling code here:
        JFileChooser fileopen = new JFileChooser();

        int ret = fileopen.showDialog(null, "Select a file");

        if (ret == JFileChooser.APPROVE_OPTION) {
            choose_file = 1;
            filePath = fileopen.getSelectedFile().toString();
            System.out.println("-----------> filePath: " + filePath); // ..............................
            //Client.sender_file = fileopen.getSelectedFile();
            //System.out.println("file path ===> "+Client.sender_file);
        }
    }//GEN-LAST:event_choose_fileBtnActionPerformed

    public static void main(String args[]) {

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
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MainScreen mscr = new MainScreen();
                mscr.setVisible(true);
                mscr.setResizable(false);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Disconnect;
    private javax.swing.JButton FileSending;
    private javax.swing.JButton bcolor;
    private javax.swing.JTextArea chat;
    private javax.swing.JButton choose_fileBtn;
    private javax.swing.JButton history;
    private javax.swing.JButton history1;
    private javax.swing.JTextField ipTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton listenButton;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel logo1;
    private javax.swing.JTextField message;
    private javax.swing.JTextField receivePort;
    private javax.swing.JButton sendButton;
    private javax.swing.JTextField targetPort;
    private javax.swing.JTextField user_name;
    // End of variables declaration//GEN-END:variables

    @Override
    public void write(String s) {

        //Time getting
        int minute, hour, second;
        String zone = "am";
        String time = "";

        Calendar calendar = Calendar.getInstance();
        minute = calendar.get(Calendar.MINUTE);
        hour = calendar.get(Calendar.HOUR_OF_DAY);
        if (hour >= 12) {
            zone = "pm";
        }
        if (hour > 12) {
            hour = hour % 12;
        }
        second = calendar.get(Calendar.SECOND);

        time = hour + ":" + minute + ":" + second + " " + zone;

//Time getting ends
        // Writing on the main screen
        chat.append(s + "  " + "(" + time + ")" + System.lineSeparator());
        scrollDown();
        if (s.equals("You are not connected") 
                || s.equals("Unable to open file")
                || s.equals("Chat history downloaded in your project folder named as :: ChatHistory.txt")
                || s.equals("Please write down the file path on sendbox area:")
                || s.equals("Unable to open file") 
                || s.equals("The other side is not connected") 
                || s.equals("Night mode on")
                ||s.equals("You did not correctly inserted En Key or R port or T port. You are requested to verify these please")){
                
                
        } else {
            chatHistory += s + "  " + "(" + time + ")" + System.lineSeparator(); //Saving the chat history in a string so when pressed 
            // button it will store all these in a file
        }

    }

    //auto scrolling

    public void scrollDown() {
        chat.setCaretPosition(chat.getText().length());
    }
    //auto scrolling ends
}
