package EjemploHilos;

public class Hilosj extends javax.swing.JFrame implements Runnable {
    Runnable hilo = new Hilo();
    public Thread hilo1 = new Thread(hilo);
     public Thread hilo2 = new Thread(hilo);
      public Thread hilo3 = new Thread(hilo);
      
      public Hilosj(){
          initComponents();
      }
      
      @SuppressWarnings("unchecked")
      //<editor-fold defaulstate="collapsed" desc="Generated Code">
      private void initComponents(){
          
          jButton1=new javax.swing.JButton();
          
          setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
          
          jButton1.setText("Ejecutar");
          jButton1.addActionListener(new java.awt.event.ActionListener(){
          public void actionPerformed(java.awt.event.ActionEvent evt){
              jButton1ActionPerformed(evt);
          }
      });
          
          javax.swing.GroupLayout layout=new javax.swing.GroupLayout(getContentPane());
          getContentPane().setLayout(layout);
          layout.setHorizontalGroup(
                  layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,layout.createSequentialGroup()
                                  .addContainerGap(168,Short.MAX_VALUE)
                                  .addComponent(jButton1)
                                  .addGap(159,159,159))
          );
          layout.setVerticalGroup(
                  layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(layout.createSequentialGroup()
                          .addGap(132,132,132)
                          .addComponent(jButton1)
                          .addContainerGap(145,Short.MAX_VALUE))
          );
          
          pack();
      }//</editor-fold>
      
      private void jButton1ActionPerformed(java.awt.event.ActionEvent evt){
          hilo1.setName("Hilo1");
          hilo2.setName("Hilo2");
          hilo3.setName("Hilo3");
          hilo1.start();   
          hilo2.start();  
          hilo3.start();  
         
                  
      }
      
      public static void main(String[] args) {
        try{
            for(javax.swing.UIManager.LookAndFeelInfo info:javax.swing.UIManager.getInstalledLookAndFeels()){
                if("Nimbus".equals(info.getName())){
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        }catch(ClassNotFoundException ex){
            java.util.logging.Logger.getLogger(Hilosj.class.getName()).log(java.util.logging.Level.SEVERE,null,ex);
        }catch(InstantiationException ex){
            java.util.logging.Logger.getLogger(Hilosj.class.getName()).log(java.util.logging.Level.SEVERE,null,ex);
        }catch(IllegalAccessException ex){
            java.util.logging.Logger.getLogger(Hilosj.class.getName()).log(java.util.logging.Level.SEVERE,null,ex);
        }catch(javax.swing.UnsupportedLookAndFeelException ex){
            java.util.logging.Logger.getLogger(Hilosj.class.getName()).log(java.util.logging.Level.SEVERE,null,ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable(){
            public void run(){
                new Hilosj().setVisible(true);
            }
        });
    }
      
      private javax.swing.JButton jButton1;
      
      @Override
      public void run(){
          throw new UnsupportedOperationException("Not supported yet.");
      }
    
}
