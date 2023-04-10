 import java.awt.*;
  import java.applet.*;
 import java.awt.event.*; 

/*  <applet 
        code = Apletsqrbutton.java  width = 500  height= 250 >   
          
     </applet>
 */
    public class Apletsqrbutton extends Applet implements ActionListener
{        
     Button b ; 
     TextField inp , outp;
      
      public void init()
     {    b = new Button(" sqare it !"  );
          inp = new TextField(10); 
          outp = new TextField(10);
          
           add(inp);              //  to place these components on the container [ applet ] 
           add(b);  
           add(outp);
           
           b.addActionListener(this);  //  registering button with action listener
      }//--------------------------  
  
         public void actionPerformed(ActionEvent e)
     {    String str = new String();
                   str = inp.getText();
            int num = Integer.parseInt(str);

                num= num*num; 

              outp.setText(" "+num );
     
      }    
     
      

} // ------  end of the class



   create an applet to display the grade card of a student.
   display name , roll no , class , along with other input values and the output vallues.
   input : marks in 3 subjects
   output : total , average and grade 
   get output on the click of a button. 


               


























