
/**
 * Write a description of class ATM here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
public class A2
{
    Button b1,b2,b3,b4,b5,b6,b7;
    Label l1,l2,l3,l4,l5,l6;
    TextField t1,t2,t3,t4;
    int k=0,p1=0,p2=0,p3=0;
     public static ArrayList<Integer> acc= new ArrayList<Integer>();
     public static ArrayList<Integer> pinno= new ArrayList<Integer>();
     public static ArrayList<Double> bal=new ArrayList<Double>();
       public static void acc(){
    acc.add(123456);
    acc.add(234567);
    acc.add(345678);
    pinno.add(1111);
    pinno.add(2222);
    pinno.add(3333);
    bal.add(12345.98);
    bal.add(32345.18);
    bal.add(145.98);
   
   }
    public A2(){
        Frame f1=new Frame();
        l1=new Label(" ACCOUNT NO " );
        l1.setBounds(50,100,150,50);
        l2=new Label(" PIN NO. ");
        l2.setBounds(50,170,150,50);
        b1=new Button(" ENTER ");
        b1.setBounds(60,240,100,50);
        b2= new Button(" New User? " );
        b2.setBounds(180,240,100,50);
        t1=new TextField();
        t1.setBounds(220,100,150,50);
        t2=new TextField();
        t2.setBounds(220,170,150,50);
        b7=new Button("EXIT");
        b7.addActionListener(new ActionListener() {
       public void actionPerformed(ActionEvent e) {
       System.exit(0);
       }
        });
        //b1.addActionListener(this);
        // b1.setBounds(50,80,60,30);
          b1.addActionListener(new ActionListener(){  
             public void actionPerformed(ActionEvent e){
                 int s1=Integer.parseInt(t1.getText());  
                 /*Label l5 = new Label(" k");
                 l5.setBounds(120,110,230,80);
                 f1.add(l5);*/
                 int s2=Integer.parseInt(t2.getText());
                 boolean b=check(s1,s2);
                 if(b==true){
                     Frame f2 = new Frame();
                     Button b3=new Button("Cash Withdrawl");
                             b3.setBounds(100,300,100,50);
                            Button b4=new Button("Deposit money");
                            b4.setBounds(220,300,100,50);
                                 Button b5=new Button("Check Balance");
                                 b5.setBounds(340,300,100,50);
                                 b7.setBounds(450,450,30,30);
                                 f2.add(b7);
                                 
                      b3.addActionListener(new ActionListener(){  
             public void actionPerformed(ActionEvent e){
                 Frame f3 =new Frame();
                 l5 = new Label(" Enter amount to be withdrawn");
                 l5.setBounds(100,100,200,50);
                 f3.add(l5);
                 t3=new TextField();
                 t3.setBounds(320,100,100,50);
                 f3.add(t3);
                 b6=new Button(" ENTER ");
                 b6.setBounds(150,200,100,50);
                 f3.add(b6);
                 b7.setBounds(450,450,30,30);
                 f3.add(b7);
                 f3.setSize(500,500);
                     f3.setLayout(null);
                     f3.setVisible(true);    
                     b6.addActionListener(new ActionListener(){  
             public void actionPerformed(ActionEvent e){
                 //try{
                     System.out.println(bal.get(k));
                 int s2=Integer.parseInt(t3.getText()); //}
                 //catch(Exception m){
                 boolean d=withdraw(s2);
                 if(d==true){
                                                 l4=new Label(" New balance "+bal.get(k) );
                                                      l4.setBounds(300,200,150,100);
                                                 f3.add(l4);
                                        }  
                                        else{
                                           l4 = new Label(" Insufficient balance" );
                                           l4.setBounds(300,200,150,100);
                                           f3.add(l4);//CHECK
                                           }
                                     //   }
                                    }
                                }
                                );
                }
            }
            );
                f2.add(b3);
                                 f2.add(b4);
                                 f2.add(b5);
                     f2.setSize(500,500);
                     f2.setLayout(null);
                     f2.setVisible(true);    
                     b4.addActionListener(new ActionListener(){  
             public void actionPerformed(ActionEvent e){
                 
                 Frame f4 =new Frame();
                 l5 = new Label(" Enter amount to be deposited");
                 l5.setBounds(50,100,200,50);
                 f4.add(l5);
                 t3=new TextField();
                 t3.setBounds(320,100,100,50);
                 f4.add(t3);
                 b7.setBounds(450,450,30,30);
                 f4.add(b7);
                 b6=new Button(" ENTER ");
                 b6.setBounds(150,200,70,40);
                 f4.add(b6);
                 
           
                     b6.addActionListener(new ActionListener(){  
             public void actionPerformed(ActionEvent e){
                 // try{
                 p3=Integer.parseInt(t3.getText());
                //}
                //catch(Exception l){}
            bal.set(k,((Double)bal.get(k)+p3));
                 l4=new Label(" New balance "+(bal.get(k)) );
                 l4.setBounds(240,200,150,100);
               
                 f4.add(l4);
                }
            });
                 
        //}
                  f4.setSize(500,500);
                     f4.setLayout(null);
                     f4.setVisible(true);
                 
                }
            });
             b5.addActionListener(new ActionListener(){  
             public void actionPerformed(ActionEvent e){
                 Frame f3 =new Frame();
                 l4=new Label(" Current balance "+bal.get(k));
                  l4.setBounds(200,250,150,100);
                 f3.add(l4);
                 b7.setBounds(450,450,30,30);
                 f3.add(b7);
                  f3.setSize(500,500);
                     f3.setLayout(null);
                     f3.setVisible(true);
               
                }
            });
           
            //here
                    }
                    else{
                        l4 = new Label("INVALID USERNAME OR PASSWORD" );
                        l4.setBounds(200,250,250,100);
                        f1.add(l4);
                    }
                 
                
             }  
         }
          );  
         
          b2.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
         Frame f2=new Frame();
         l3=new Label("Enter new account no");
         l3.setBounds(50,50,100,50);
         l4=new Label("Enter new PIN");
         l4.setBounds(50,120,100,50);
         t3=new TextField();
         t3.setBounds(170,50,150,50);
         t4=new TextField();
         t4.setBounds(170,120,150,50);
         b3=new Button("Create Account");
         b3.setBounds(100,200,100,50);
         b7.setBounds(450,450,30,30);
         f2.add(b7);
         f2.add(l3);
         f2.add(l4);
         f2.add(t3);
         f2.add(t4);
         f2.add(b3);
         //int s1=0,s2=0;
         
         b3.addActionListener(new ActionListener () {
         public void actionPerformed(ActionEvent e) {
            // try {
          p1=Integer.parseInt(t3.getText());
         p2=Integer.parseInt(t4.getText());
         //System.out.println(p1);
         //}
         //catch (Exception z) {}
         acc.add(p1);
         pinno.add(p2);
         bal.add(0.0d);
         l5=new Label("Your Account has been created");
         l5.setBounds(50,400,300,50);
         f2.add(l5);
        //}
         //System.out.println(acc.size());
         }
         });
         
         f2.setSize(500,500);
         f2.setLayout(null);
         f2.setVisible(true);
         }
          });
          b7.setBounds(750,750,30,30);
          f1.add(b7);

        f1.add(b1);
        f1.add(b2);
        f1.add(t1);
        f1.add(t2);
        f1.add(l1);
        f1.add(l2);
        f1.setSize(800,800);
        f1.setLayout(null);
        f1.setVisible(true);
       
    }
    public boolean check(int s1,int s2){
        for(int i=0;i<acc.size();i++){
           // System.out.println(acc.get(i));
                  if(s1==((Integer)acc.get(i))){
                     
                      if(s2==((Integer)pinno.get(i))){
                          k=i;
                          return true;
                        }
                       
                    }
                   
                }
        return false;
    }
   public boolean withdraw(int d){
        if(d<(Double)bal.get(k)){
            bal.set(k,((Double)bal.get(k)-d));
            return true;
        }
        else return false;
       
    }
         public static void main(String args[]){
             acc();
             A2 obj1=new A2();
             
            }
}