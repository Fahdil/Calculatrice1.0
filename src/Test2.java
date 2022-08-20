import java.util.*;
import java.math.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.lang.Thread;

import javax.management.JMException;
import javax.swing.*;
public class Test2 extends JFrame implements ActionListener{
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	   String [] tab = {"0","1","2","3","4","5","6","7","8","9","abs","sqrt",".","ln","exp","X²","X³","1/X","cos","sin","tan","cos(-1)","sin(-1)","tan(-1)","Log","*","-","+","/","Sup","Clear","=","+/-" };
	 Container  ContainerP ;	
	 JTextField click = new JTextField();
	// Font font1 = new Font("Arial",Font.BOLD, 30);
	  // click.setFont(new Font("Serif",Font.BOLD, 30));
	   //click.setHorizontalAlignment(JtextField.CENTER);
	 JTextField resultat = new JTextField(10);
	JPanel ContainerB = new JPanel();
	JPanel ContainerH= new JPanel();
	JPanel ContainerHh = new JPanel();
	JPanel ContainerHb= new JPanel();
	
	
	   JButton []B = new JButton[tab.length];
	   
			public Test2(String title, int width, int height) {
				this.setTitle(title);
				this.setSize(width,height);
				this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				this.setLocationRelativeTo(null);
				this.setVisible(true);
				ContainerP=this.getContentPane();
				ContainerP.setLayout(new GridLayout(2,1));
				ContainerP.add(ContainerH);
				ContainerP.add(ContainerB);
				ContainerH.setLayout(new GridLayout(2,1));
				ContainerHh.setLayout(new GridLayout(1,1));
				ContainerHb.setLayout(new GridLayout(1,1));
				ContainerB.setLayout(new GridLayout(3,3));
						for(int i=0; i<B.length; i++) {
							B[i]=new JButton();
							B[i].setText(tab[i]);
							ContainerB.add(B[i]);	
						} 
						 ContainerH.add( ContainerHh);
							ContainerH.add( ContainerHb);
							ContainerHb.add(click);
							ContainerHh.add(resultat);
    ArrayList<Double> maliste1 = new ArrayList<>();
    
    System.out.println(maliste1.size());	
   
	ArrayList<Double> maliste2 = new ArrayList<>();
	maliste2.add(0.0);maliste2.add(0.0);
	ArrayList<Double> maliste = new ArrayList<>();
	maliste.add(10.0);
	ArrayList<Double> maliste3 = new ArrayList<>();
	/*ArrayList<Double> maliste4 = new ArrayList<>();
	ArrayList<Double> maliste5 = new ArrayList<>();*/


	             for(int i=0; i<B.length;i++)             
	          {
	            		
							B[i].addActionListener(new ActionListener (){
								public void actionPerformed(ActionEvent e) {
									Double r=0.0;double b=0.0; 
									  int h=1;  
								
											for(int i=0; /*i<B.length*/i>=0; i++ ) 
													{ 
															 if( i<B.length-22 &&  e.getSource()==B[i] )
															 {
																					// maliste.add(Integer.parseInt(B[i].getText()));
																					 if(maliste1.size()>=1 && maliste1.get(0)>=0) {
																						            if(maliste3.contains(0.001)==true) {
																								            	do {
																								             r=(maliste1.get(maliste1.size()-1))+Double.valueOf(B[i].getText())/maliste.get(maliste.size()-1);
																										            click.setText(String.valueOf(r));
																										           maliste.add(maliste.get(maliste.size()-1)*10);
																										           maliste1.add(r);
																										           break;
																								            	}while( e.getSource()==B[0]||e.getSource()==B[1]||e.getSource()==B[2]||e.getSource()==B[3]||e.getSource()==B[4]||e.getSource()==B[5]||e.getSource()==B[6]||e.getSource()==B[7]||e.getSource()==B[8]||e.getSource()==B[9]||e.getSource()==B[10]);
																								            	
																							              break;
																						            }
																						            else {
																						            	 r=(maliste1.get(maliste1.size()-1)*10)+Double.valueOf(B[i].getText());
																							              click.setText(String.valueOf(r));
																							              maliste1.add(r);
																							              break;
																						            }
																						           
																					        }
																					 else if(maliste1.size()>=1 && maliste1.get(0)<=0){
																						
																			              if(maliste3.contains(0.001)==true) {
																							            	do {
																							             r=(maliste1.get(maliste1.size()-1))-Double.valueOf(B[i].getText())/maliste.get(maliste.size()-1);
																									            click.setText(String.valueOf(r));
																									           maliste.add(maliste.get(maliste.size()-1)*10);
																									           maliste1.add(r);
																									           break;
																							            	}while( e.getSource()==B[0]||e.getSource()==B[1]||e.getSource()==B[2]||e.getSource()==B[3]||e.getSource()==B[4]||e.getSource()==B[5]||e.getSource()==B[6]||e.getSource()==B[7]||e.getSource()==B[8]||e.getSource()==B[9]||e.getSource()==B[10]);
																							             	   break;
																		                                                   }
																					            else {
																								            	  r=(Double)(maliste1.get(maliste1.size()-1)*10)-Double.valueOf(B[i].getText());
																								            	  r=r*-1.0;
																									              click.setText(String.valueOf(r));
																									              maliste1.add(r);
																									              break;
																					                }   
																					 }
																			
																					 else if (maliste1.size()==0) {
																						 r=Double.valueOf(B[i].getText());
																			              click.setText(String.valueOf(r));
																			              maliste1.add(r);
																			              break;
																					 }
																					//  break;
                            																 
															 }
																
															 else if( e.getSource()==B[10]) {//Valeurs absolue											
																	 b=(Math.abs(maliste1.get(maliste1.size()-1)));
																	 resultat.setText(String.valueOf(b));
																	 maliste1.add(b);
																	 break;
																 }
															 
															 else if( e.getSource()==B[11]) {//Racine carrer
																
																	 b=Math.sqrt(maliste1.get(maliste1.size()-1));																	
																	 resultat.setText(String.valueOf(b));
																	 maliste1.add(b);
																	 break;
																 }
															 
															 else if( e.getSource()==B[12]) {//factorielle
																	  maliste3.add(0.001);
																	  break;
																 }
															 
															 else if( e.getSource()==B[13]) {//ln
																
																 b=(Math.log(maliste1.get(maliste1.size()-1)));
																 resultat.setText(String.valueOf(b));
																 maliste1.add(b);break;
															 }
															 
															 else if( e.getSource()==B[14]) {//exp
																	
																	 b=(Math.exp(maliste1.get(maliste1.size()-1)));
																	 resultat.setText(String.valueOf(b));
																	 maliste1.add(b);break;
																 }
															 
															 else if( e.getSource()==B[15]) {//x carre
																
																	 b=(maliste1.get(maliste1.size()-1)*maliste1.get(maliste1.size()-1));
																	 resultat.setText(String.valueOf(b));
																	 maliste1.add(b); break;
																 }
															 
															 else if( e.getSource()==B[16]) {//x au cubbe
																	
																	 b=(maliste1.get(maliste1.size()-1)*maliste1.get(maliste1.size()-1)*maliste1.get(maliste1.size()-1));
																	 resultat.setText(String.valueOf(b));
																	 maliste1.add(b);break;
																 }
															 
															 else if( e.getSource()==B[17]) {//1/x
																	
																	 b=(double)1/maliste1.get(maliste1.size()-1);
																	 resultat.setText(String.valueOf(b));
																	 maliste1.add(b);break;
																 }
															 
															 else if( e.getSource()==B[18]) {//cos
																
																	 b=Math.cos(maliste1.get(maliste1.size()-1));
																	 resultat.setText(String.valueOf(b)+"   RADIANT    " +String.valueOf(b*57.2958)+"   DEGRE   ");
																	 maliste1.add(b);break;
																 }
															 
															 else if( e.getSource()==B[19]) {//sin
																	
																	 b=Math.sin(maliste1.get(maliste1.size()-1));
																	 resultat.setText(String.valueOf(b)+"   RADIANT    " +String.valueOf(b*57.2958)+"   DEGRE   ");
																	 maliste1.add(b);break;
																 }
															 
															 else if( e.getSource()==B[20]) {//tan
																
																	 b=Math.tan(maliste1.get(maliste1.size()-1));
																	 resultat.setText(String.valueOf(b)+"   RADIANT    " +String.valueOf(b*57.2958)+"   DEGRE   ");
																	 maliste1.add(b);break;
																 }
															 
															 else if( e.getSource()==B[21]) {//acos
																	
																	 b=Math.acos(maliste1.get(maliste1.size()-1));
																	 resultat.setText(String.valueOf(b)+"   RADIANT    " +String.valueOf(b*57.2958)+"   DEGRE   ");
																	 maliste1.add(b);break;
																 }
															 else if( e.getSource()==B[22]) {//asin
																	
																	 b=Math.asin(maliste1.get(maliste1.size()-1));
																	 resultat.setText(String.valueOf(b)+"   RADIANT    " +String.valueOf(b*57.2958)+"   DEGRE   ");
																	 maliste1.add(b);break;
																 }
															 
															 else if( e.getSource()==B[23]) {//atan
																
																	 b=Math.atan(maliste1.get(maliste1.size()-1));
																	 resultat.setText(String.valueOf(b)+"   RADIANT    " +String.valueOf(b*57.2958)+"   DEGRE   ");
																	 maliste1.add(b);break;
																 }
															
															 else if( e.getSource()==B[24]) {//log
																	 b=(Math.log(maliste1.get(maliste1.size()-1))/Math.log(10));
																	 resultat.setText(String.valueOf(b));
																	 maliste1.add(b);break;
																 }
													
														    else if( e.getSource()==B[25]) {//multiplication
														    	         maliste2.add(20.0);
														    	         maliste2.add(maliste1.get(maliste1.size()-1));
														    	           // if(maliste1.size()!=0) {	
														    	         maliste3.clear(); maliste.clear(); 	maliste.add(10.0);maliste1.clear();
															    	        	  break;
														    	            //}
														    	          //  else break;	  
																    	       
											                           }
														    else if( e.getSource()==B[26]) {//soustraction
																	        maliste2.add(200.0);
														    	            maliste2.add(maliste1.get(maliste1.size()-1));
														    	            maliste3.clear();  maliste.clear(); 	maliste.add(10.0); maliste1.clear();
														    	              break;
										                   }
														   else if( e.getSource()==B[27]) {//addition
																		      maliste2.add(2000.0);
															    	            maliste2.add(maliste1.get(maliste1.size()-1));
															    	            maliste3.clear();  maliste.clear(); 	maliste.add(10.0); maliste1.clear();
															    	              break;
										                   }
														    else if( e.getSource()==B[28]) {//gestion de supprimer tous
																        maliste2.add(0,20000.0);
													    	            maliste2.add(maliste1.get(maliste1.size()-1));
													    	            maliste3.clear();  maliste.clear(); 	maliste.add(10.0); maliste1.clear();
													    	              break;
										                   }
															 
														    else if(e.getSource()==B[29]) {//supprimer
													              if(maliste1.size()-2<0)
                                                                     maliste1.clear();
													              else
													        	 b=(maliste1.get(maliste1.size()-2));
													              
																 click.setText(String.valueOf(b));
																 maliste1.remove(maliste1.size()-1);break;
												           }
															 
														    else if( e.getSource()==B[30]) {
															      resultat.setText("  ");
													              click.setText(String.valueOf(0.0));
													                maliste1.clear();maliste3.clear(); maliste.clear();maliste2.clear(); maliste3.add(0.0); maliste.add(10.0); break;      
												                   }
															 
														     else if( e.getSource()==B[31]) {//gestion de supprimer tous
											//les different cas de figure dans cetteparties sont pour gerer chacune des cas correspondant aux opépations de base
											    	 
																		 if(maliste2.contains(20.0)==true)//1-multiplication 	
																		 {
																			   resultat.setText(String.valueOf( maliste2.get(maliste2.size()-1)*maliste1.get(maliste1.size()-1)));//affiche le resultat
																			    maliste1.add(( maliste2.get(maliste2.size()-1)*maliste1.get(maliste1.size()-1)));
																			  maliste2.clear(); maliste.clear(); maliste3.clear(); break;
																		 }
																		 else if(maliste2.contains(200.0)==true)//1-soustraction 	
																		 {
																			   resultat.setText(String.valueOf( maliste2.get(maliste2.size()-1)-maliste1.get(maliste1.size()-1)));//affiche le resultat
																			    maliste1.add(( maliste2.get(maliste2.size()-1)-maliste1.get(maliste1.size()-1)));
																			    maliste2.clear(); maliste.clear(); maliste3.clear(); break;
																	     }
																		 else  if(maliste2.contains(2000.0)==true)//3-addition	
																			 {
																				   resultat.setText(String.valueOf( maliste2.get(maliste2.size()-1)+maliste1.get(maliste1.size()-1)));//affiche le resultat
																				    maliste1.add(( maliste2.get(maliste2.size()-1)+maliste1.get(maliste1.size()-1)));
																				    maliste2.clear(); maliste.clear(); maliste3.clear(); break;
																			 }
																		 else if(maliste2.contains(20000.0)==true)//division 	
																			 {
																				   resultat.setText(String.valueOf( maliste2.get(maliste2.size()-1)/maliste1.get(maliste1.size()-1)));//affiche le resultat
																				    maliste1.add(( maliste2.get(maliste2.size()-1)/maliste1.get(maliste1.size()-1)));
																				    maliste2.clear(); maliste.clear(); maliste3.clear(); break;
																			 }
														                break;
												                   }
															 else if( e.getSource()==B[32]) {//log
																 b=(maliste1.get(maliste1.size()-1))*(-1.0);
																 click.setText(String.valueOf(b));
																 maliste1.add(b);break;
															 }
						  
						}
								//les break permets de briser la boucle une fois l'action est exécuté	
										//dans les if de 0 à 9 on gere la recepion ou la sauvegarde des valeurs entrer a travers la liste1	          
										// dans les autres ifs on gere les operations mathématiques particuliers 	
								     }	
							});
			
			 }		
	 }
}
