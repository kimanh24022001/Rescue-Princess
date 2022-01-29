import java.awt.event.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.awt.*;
import javax.swing.*;
import java.util.Random;
public class game implements  KeyListener{
	
	JFrame frame = new JFrame();
	JButton buttonOne = new JButton();
	JLabel lose = new JLabel();
	JLabel win = new JLabel();
	JLabel background = new JLabel();
	JLabel prince = new JLabel();
	JLabel heart = new JLabel();
	JLabel diamond = new JLabel();
	JLabel billgate = new JLabel();
	JLabel crow= new JLabel();
	JLabel coin_bar = new JLabel();
	JLabel live_bar = new JLabel();
	JLabel heart_icon = new JLabel();
	JLabel []cloud = new JLabel[7];
	JLabel []ground = new JLabel[4];
	JLabel coin_1=new JLabel();
	JLabel []coin_2=new JLabel[7];
	JLabel []coin_3=new JLabel[7];
	JLabel []coin_4=new JLabel[7];
	JLabel []coin_6=new JLabel[100];
	JLabel cloud_1 = new JLabel();
	JLabel cloud_2 = new JLabel();
	JLabel cloud_3 = new JLabel();
	JLabel cloud_4 = new JLabel();
	JLabel cloud_5 = new JLabel();
	JLabel cloud_6 = new JLabel();
	JLabel ground_1 = new JLabel();
	JLabel ground_2 = new JLabel();
	JLabel ground_3 = new JLabel();
	JTextField gameover = new JTextField();
	int seconds=3;
	int seconds_1=2;
	int seconds_2=100000000;
	int seconds_3=100000000;
	int seconds_4=3;
	int seconds_5=3;
	int step=20;
	int score=0;
	int live=3,die=0;
	int []flag_2=new int [100];
	int []flag_3=new int [100];
	int []flag_4=new int [100];
	int []flag_6=new int [100];
	int flag_heart=1;
	int flag_diamond=1;
	Random random = new Random();
	int x = random.nextInt(5)+1;
	Border thickBorder = new LineBorder(new Color(100,150,200), 5);
	ImageIcon game_1= new ImageIcon("C:\\Users\\DELL\\eclipse-workspace\\Rescue Princess\\src\\background.jpg");
	ImageIcon game_2= new ImageIcon("C:\\Users\\DELL\\eclipse-workspace\\Rescue Princess\\src\\prince_1.png");
	ImageIcon game_21= new ImageIcon("C:\\Users\\DELL\\eclipse-workspace\\Rescue Princess\\src\\prince_2.png");
	ImageIcon game_22= new ImageIcon("C:\\Users\\DELL\\eclipse-workspace\\Rescue Princess\\src\\prince_3.png");
	ImageIcon game_3= new ImageIcon("C:\\Users\\DELL\\eclipse-workspace\\Rescue Princess\\src\\heart_1.png");
	ImageIcon game_4= new ImageIcon("C:\\Users\\DELL\\eclipse-workspace\\Rescue Princess\\src\\zombie_1.png");
	ImageIcon game_41= new ImageIcon("C:\\Users\\DELL\\eclipse-workspace\\Rescue Princess\\src\\zombie_2.png");
	ImageIcon game_42= new ImageIcon("C:\\Users\\DELL\\eclipse-workspace\\Rescue Princess\\src\\zombie_3.png");
    ImageIcon game_43= new ImageIcon("C:\\Users\\DELL\\eclipse-workspace\\Rescue Princess\\src\\zombie_4.png");		
	ImageIcon game_7= new ImageIcon("C:\\Users\\DELL\\eclipse-workspace\\Rescue Princess\\src\\cloud_1.jpg.png");
	ImageIcon game_5= new ImageIcon("C:\\Users\\DELL\\eclipse-workspace\\Rescue Princess\\src\\crow_1.jpg.png");
	ImageIcon game_6= new ImageIcon("C:\\Users\\DELL\\eclipse-workspace\\Rescue Princess\\src\\crow_2.jpg.png");
	ImageIcon game_8= new ImageIcon("C:\\Users\\DELL\\eclipse-workspace\\Rescue Princess\\src\\cloud_2.jpg.png");
	ImageIcon game_9= new ImageIcon("C:\\Users\\DELL\\eclipse-workspace\\Rescue Princess\\src\\cloud_3.jpg.png");
	ImageIcon game_10= new ImageIcon("C:\\Users\\DELL\\eclipse-workspace\\Rescue Princess\\src\\cloud_4.jpg.png");
ImageIcon game_11= new ImageIcon("C:\\Users\\DELL\\eclipse-workspace\\Rescue Princess\\src\\cloud_5.jpg.png");
	ImageIcon game_12= new ImageIcon("C:\\Users\\DELL\\eclipse-workspace\\Rescue Princess\\src\\cloud_6.jpg.png");
	ImageIcon game_131= new ImageIcon("C:\\Users\\DELL\\eclipse-workspace\\Rescue Princess\\src\\ground_1.png");
	ImageIcon game_132= new ImageIcon("C:\\Users\\DELL\\eclipse-workspace\\Rescue Princess\\src\\ground_2.png");
	ImageIcon game_133= new ImageIcon("C:\\Users\\DELL\\eclipse-workspace\\Rescue Princess\\src\\ground_3.png");		
	ImageIcon game_14= new ImageIcon("C:\\Users\\DELL\\eclipse-workspace\\Rescue Princess\\src\\coin.png");
	ImageIcon game_15= new ImageIcon("C:\\Users\\DELL\\eclipse-workspace\\Rescue Princess\\src\\diamond.jpg.png");
	ImageIcon game_161= new ImageIcon("C:\\Users\\DELL\\eclipse-workspace\\Rescue Princess\\src\\prince_11.png");
	ImageIcon game_162= new ImageIcon("C:\\Users\\DELL\\eclipse-workspace\\Rescue Princess\\src\\prince_22.png");
	ImageIcon game_163= new ImageIcon("C:\\Users\\DELL\\eclipse-workspace\\Rescue Princess\\src\\prince_33.png");			
	ImageIcon game_171= new ImageIcon("C:\\Users\\DELL\\eclipse-workspace\\Rescue Princess\\src\\die_1.jpg.png");
	ImageIcon game_172= new ImageIcon("C:\\Users\\DELL\\eclipse-workspace\\Rescue Princess\\src\\die_2.jpg.png");
	ImageIcon game_173= new ImageIcon("C:\\Users\\DELL\\eclipse-workspace\\Rescue Princess\\src\\die_3.jpg.png");	
	public game() {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(750,1200);
		//frame.setIconImage(background.getImage());
		frame.getContentPane().setBackground(Color.black);
		frame.setLayout(null);
		frame.setResizable(true);
		
		coin_bar.setBounds(50,130,100,100);
		coin_bar.setText("0 ");
		coin_bar.setFont(new Font("Ink Free",Font.BOLD,20));
		coin_bar.setForeground(Color.white);
	//	coin_bar.setBackground(Color.gray);
		coin_1.setBounds(0,30,300,300);
		coin_1.setIcon(game_14);
		
		live_bar.setBounds(50,80,100,100);
		live_bar .setText("3");
		live_bar.setFont(new Font("Ink Free",Font.BOLD,20));
		live_bar.setForeground(Color.white);
		live_bar.setBackground(Color.black);
		
		heart_icon.setBounds(0,-10,300,300);
		heart_icon.setIcon(game_3);
		
		background.setBounds(10,0,1200,660);
		background.setIcon(game_1);
		
		prince.setBounds(200,230,300,300);
		prince.setIcon(game_2);
		
		heart.setBounds(-1900,230,300,300);
		heart.setIcon(game_3);
		
		diamond.setBounds(-290,230,300,300);
		diamond.setIcon(game_15);
		
		billgate.setBounds(1000,230,300,300);
		billgate.setIcon(game_4);
		
		crow.setBounds(-300,120,200,200);
		crow.setIcon(game_5);

		cloud_1.setBounds(20,100,100,100);
		cloud_1.setIcon(game_7);
		cloud_2.setBounds(500,150,100,100);
		cloud_2.setIcon(game_8);
		cloud_3.setBounds(200,100,100,100);
		cloud_3.setIcon(game_9);
		cloud_4.setBounds(80,150,100,100);
		cloud_4.setIcon(game_10);
		cloud_5.setBounds(400,100,100,100);
		cloud_5.setIcon(game_11);
		cloud_6.setBounds(600,170,100,100);
		cloud_6.setIcon(game_12);	
		cloud[1]=cloud_1;
		cloud[2]=cloud_2;
		cloud[3]=cloud_3;
		cloud[4]=cloud_4;
		cloud[5]=cloud_5;
		cloud[6]=cloud_6;
		
		ground_1.setBounds(-500,20,500,500);
		ground_1.setIcon(game_131);	
		ground_2.setBounds(-1500,10,500,500);
		ground_2.setIcon(game_132);	
		ground_3.setBounds(-2500,100,500,500);
		ground_3.setIcon(game_133);
		ground[1]=ground_1;
		ground[2]=ground_2;
		ground[3]=ground_3;
		
		for(int i=0;i<2;i++) {
	    	coin_2[i]=new JLabel();
	    	coin_2[i].setBounds(-400-30*i,30,300,300);
	    	coin_2[i].setIcon(game_14);
	    	flag_2[i]=1;
		}
		for(int i=0;i<3;i++) {
	    	coin_3[i]=new JLabel();
            coin_3[i].setBounds(-2300-i*30,160,300,300);
	    	coin_3[i].setIcon(game_14);
	    	flag_3[i]=1;
		}
		for(int i=0;i<4;i++) {
	    	coin_4[i]=new JLabel();
	    	coin_4[i].setBounds(-1270-i*30,80,300,300);
	    	coin_4[i].setIcon(game_14);
	    	flag_4[i]=1;
		}
		for(int i=0;i<100;i++) {
			coin_6[i]=new JLabel();
		}
		for(int i=0;i<x;i++) {
	   // 	coin_6[i]=new JLabel();
	    	coin_6[i].setBounds(600-i*30,200,300,300);
	    	coin_6[i].setIcon(game_14);
	    	flag_6[i]=1;
		}

//		timer.start();	
		timer_3.start();
		timer_4.start();

		frame.add(background);
		background.add(prince);
		background.add(heart);
		background.add(diamond);
		background.add(cloud_1);
		background.add(cloud_2);
		background.add(cloud_3);
		background.add(cloud_4);
		background.add(cloud_5);
		background.add(cloud_6);
		background.add(crow);
		background.add(billgate);
		background.add(ground[1]);
		background.add(ground[2]);
		background.add(ground[3]);
		background.add(coin_bar);
		background.add(coin_1);
		background.add(live_bar);
		background.add(heart_icon);
		check_collision();
		for (int i=0;i<x;i++) {
			background.add(coin_6[i]);
		}
		for(int i=0;i<2;i++) {
			background.add(coin_2[i]);
		}
		for(int i=0;i<3;i++) {
			background.add(coin_3[i]);
		}
		for(int i=0;i<4;i++) {
			background.add(coin_4[i]);
		}
		frame.setVisible(true);
		frame.addKeyListener(this);
	}
	void check_collision() {
		if ((prince.getX()==billgate.getX() && Math.abs( prince.getY()-billgate.getY())<=20) || (prince.getX()==(crow.getX()-10) && Math.abs(prince.getY()-crow.getY())<=50 )) {
			live--;
		}
		if (live<=0) {
			timer_6.start();
			GameOver();
		}
		if (Math.abs(prince.getX()-heart.getX())<=10 && Math.abs(prince.getY()-heart.getY())<=10 ) {
		    if (flag_heart==1) {
		     	live++;}
		    flag_heart=0;
		    background.remove(heart);
		}
		if (prince.getX()==(diamond.getX()-10) && Math.abs(prince.getY()-diamond.getY())<=10 ) {
			if (flag_diamond==1) {
				live=live+2;
			}
			flag_diamond=0;
		    background.remove(diamond);
		}
		for(int i=0;i<2;i++) {
			if ( Math.abs(prince.getX()-coin_2[i].getX())<=10 && Math.abs( prince.getY()-coin_2[i].getY())<=50) {
				if (flag_2[i]==1) {
				   score=1+score;}
				background.remove(coin_2[i]);
				flag_2[i]=0;
			}
		}
		for(int i=0;i<3;i++) {
			if ( Math.abs(prince.getX()-coin_3[i].getX())<=10 && Math.abs( prince.getY()-coin_3[i].getY())<=50) {
				if (flag_3[i]==1) {
					   score=1+score;}
				background.remove(coin_3[i]);
				flag_3[i]=0;
			}
		}
		for(int i=0;i<4;i++) {
			if ( Math.abs(prince.getX()-coin_4[i].getX())<=10 && Math.abs( prince.getY()-coin_4[i].getY())<=50) {
				if (flag_4[i]==1) {
					   score=1+score;}
				background.remove(coin_4[i]);
				flag_4[i]=0;
			}
		}
		for(int i=0;i<x;i++) {
			if ( Math.abs(prince.getX()-coin_6[i].getX())<=10 && Math.abs( prince.getY()-coin_6[i].getY())<=50) {
				if (flag_6[i]==1) {
					   score=1+score;}
				background.remove(coin_6[i]);
				flag_6[i]=0;
			}
		}
		coin_bar.setText(""+score);
		live_bar.setText(""+live);
		//Congratulations();
	}
	 public void Congratulations(){
			win.setBounds(250,200,150,100);
			win .setText("  You Won!");
			win.setFont(new Font("Ink Free",Font.BOLD,30));
			win.setForeground(Color.green);

			background.add(win);
	}
	public void GameOver(){
		lose.setBounds(250,200,150,100);
		lose.setText("  You Lose!");
		lose.setFont(new Font("Ink Free",Font.BOLD,30));
		lose.setForeground(Color.red);
		timer_3.stop();
		background.add(lose);
		}

	 Timer timer = new Timer(1000, new ActionListener() {
		 @Override
			public void actionPerformed(ActionEvent e) {}
	 });
	 Timer timer_1 = new Timer(70, new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (seconds==3) { prince.setIcon(game_2) ; }
				if (seconds==2) { prince.setIcon(game_21); }
				if (seconds==1) { prince.setIcon(game_22); }
				if (seconds==0) { prince.setIcon(game_21); }
				seconds--;
			//	prince.setBounds(100,400,300,300);
			//	step=step+20;
				if(seconds<=-1) {
					timer_1.stop();
					seconds=3;
				}
				check_collision();
			}
			});
	 Timer timer_2 = new Timer(100, new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (seconds_1==2) { billgate.setIcon(game_21); }
				if (seconds_1==1) { billgate.setIcon(game_22); }
				seconds_1--;
			//	prince.setBounds(100,400,300,300);
			//	step=step+20;
				if(seconds_1<=0) {
					timer_2.stop();
					seconds_1=3;
				}
			}

			});
Timer timer_3 = new Timer(140, new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				crow.setBounds(crow.getX()-step-10,120,200,200);
				if (seconds_2%2==0) { crow.setIcon(game_5); }
				else { crow.setIcon(game_6); }
				seconds_2--;
				if (crow.getX()<-1000) {
					crow.setBounds(600,120,200,200);
				}
				if(seconds_2<=0) {
					//timer_3.stop();
				//	seconds_2=3;
				}
				
			//	check_collision();
			}
	 });
	 Timer timer_4 = new Timer(200, new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				billgate.setBounds(billgate.getX()-step,billgate.getY(),300,300);
				if (seconds_3%4==0) { billgate.setIcon(game_4); }
				if (seconds_3%4==1) { billgate.setIcon(game_41); }
				if (seconds_3%4==2) { billgate.setIcon(game_42); }
				if (seconds_3%4==3) { billgate.setIcon(game_43); }
				seconds_3--;
				if (billgate.getX()<-1000) {
					billgate.setBounds(600,billgate.getY(),300,300);
				}
				if(seconds_3<=0) {
					timer_4.stop();
				//	seconds_2=3;
				}
				
			}
	 });
	 Timer timer_5 = new Timer(140, new ActionListener() {
			
		 @Override
			public void actionPerformed(ActionEvent e) {
				if (seconds_4==3) { prince.setIcon(game_161) ; }
				if (seconds_4==2) { prince.setIcon(game_162); }
				if (seconds_4==1) { prince.setIcon(game_163); }
				if (seconds_4==0) { prince.setIcon(game_161					
						); }
				seconds_4--;
			//	prince.setBounds(100,400,300,300);
			//	step=step+20;
				if(seconds_4<=-1) {
					timer_5.stop();
					seconds_4=3;
				}
				check_collision();
			}
	 });
	 Timer timer_6 = new Timer(140, new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (seconds_5==3) { prince.setIcon(game_171) ; }
				if (seconds_5==2) { prince.setIcon(game_172); }
				if (seconds_5==1) { prince.setIcon(game_173); }
				//if (seconds_5==0) { prince.setIcon(game_171); }
				seconds_5--;
			//	prince.setBounds(100,400,300,300);
			//	step=step+20;
				if(seconds_5<=0) {
					timer_6.stop();
					prince.setBounds(200,260,300,300);
					//seconds_5=3;
				}
				check_collision();
			}
	 });
	 Timer timer_7 = new Timer(600, new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				prince.setBounds(200,230,300,300);
				timer_7.stop();
			}
	 });
	 @Override
		public void keyTyped(KeyEvent e) {
			//keyTyped = Invoked when a key is typed. Uses KeyChar, char output
		 if(live>0) {
			switch(e.getKeyChar()) {
				case 'a':
					timer_5.start();
//					int a=cloud_1.getX();
				for (int i=1;i<=6;i++) {
					  cloud[i].setBounds(cloud[i].getX()+step,cloud[i].getY(),100,100);
					  if (cloud[i].getX()>700 ) {
						  cloud[i].setBounds(0,cloud[i].getY(),100,100);
					  }
				}
				ground_1.setBounds(ground_1.getX()+step,ground_1.getY(),500,500);
				if (ground_1.getX()>3600) {
						for(int i=0;i<2;i++) {
							background.add(coin_2[i]);
							flag_2[i]=1;
							coin_2[i].setBounds(30+30*i,50,300,300);
						}
					}
					for(int i=0;i<2;i++) {
						coin_2[i].setBounds(coin_2[i].getX()+step,coin_2[i].getY(),300,300);
					}
					if (ground_1.getX()>3600) {
						ground_1.setBounds(0,ground_1.getY(),500,500);
						}
					ground_2.setBounds(ground_2.getX()+step,ground_2.getY(),500,500);
					if (ground_2.getX()>3000) {
						for(int i=0;i<4;i++) {
							background.add(coin_4[i]);
							flag_4[i]=1;
							coin_4[i].setBounds(30+30*i,80,300,300);
						}
					}
					for(int i=0;i<4;i++) {
				 coin_4[i].setBounds(coin_4[i].getX()+step,coin_4[i].getY(),300,300);
					}
					if (ground_2.getX()>3000) {
						ground_2.setBounds(0,ground_2.getY(),500,500);
					}
					ground_3.setBounds(ground_3.getX()+step,ground_3.getY(),500,500);
					if (ground_3.getX()>3000) {
						for(int i=0;i<3;i++) {
							background.add(coin_3[i]);
							flag_3[i]=1;
							coin_3[i].setBounds(30+30*i,160,300,300);
						}
					}
					for(int i=0;i<3;i++) {
						coin_3[i].setBounds(coin_3[i].getX()+step,coin_3[i].getY(),300,300);
					}
					if (ground_3.getX()>3000) {
						ground_3.setBounds(0,ground_3.getY(),500,500);
					}
					
					heart.setBounds(heart.getX()+step,heart.getY(),300,300);
					if (heart.getX()>10000) {
				        background.add(heart);		
						heart.setBounds(0,heart.getY(),300,300);
						flag_heart=1;
					}
					diamond.setBounds(diamond.getX()+step,diamond.getY(),300,300);
					if (diamond.getX()>10000) {
						background.add(diamond);	
						diamond.setBounds(0,diamond.getY(),300,300);
						flag_diamond=1;
					}
					for(int i=0;i<x;i++) {
						coin_6[i].setBounds(coin_6[i].getX()+step,coin_6[i].getY(),300,300);
						if (coin_6[x-1].getX()>660) {
							int a=random.nextInt(5)+1;
							for (int k=0;k<x;k++) {
								background.remove(coin_6[i]);
							}
							for(int j=0;j<a;j++) {
							  coin_6[j].setBounds(30+30*j,300-a*20,300,300);
							  coin_6[j].setIcon(game_14);
							  background.add(coin_6[j]);
							  flag_6[j]=1;
							}
							x=a;
							break;
						}
					}
					check_collision() ;
									break;
						
				case 's': if (prince.getY()<=150) {   
					timer_1.start();
				for (int i=0;i<2;i++) {
					   prince.setBounds(prince.getX(),prince.getY()+2*step,300,300);
					}			
		        for (int i=1;i<=6;i++) {
				     cloud[i].setBounds(cloud[i].getX()-step,cloud[i].getY(),100,100);
					  if (cloud[i].getX()<-100 ) {
						 cloud[i].setBounds(600,cloud[i].getY(),100,100);
					  }
				}
		        ground_1.setBounds(ground_1.getX()-step,ground_1.getY(),500,500);
				if (ground_1.getX()<-3000) {
						for(int i=0;i<2;i++) {
							background.add(coin_2[i]);
							flag_2[i]=1;
							coin_2[i].setBounds(720-30*i,50,300,300);
						}
					}
					for(int i=0;i<2;i++) {
						coin_2[i].setBounds(coin_2[i].getX()-step,coin_2[i].getY(),300,300);
					}
					if (ground_1.getX()<-3000) {
						ground_1.setBounds(600,ground_1.getY(),500,500);
						}
					ground_2.setBounds(ground_2.getX()-step,ground_2.getY(),500,500);
					if (ground_2.getX()<-3000) {
						for(int i=0;i<4;i++) {
							background.add(coin_4[i]);
							flag_4[i]=1;
							coin_4[i].setBounds(830-30*i,80,300,300);
						}
					}
					for(int i=0;i<4;i++) {
				 coin_4[i].setBounds(coin_4[i].getX()-step,coin_4[i].getY(),300,300);
					}
					if (ground_2.getX()<-3000) {
						ground_2.setBounds(600,ground_2.getY(),500,500);
					}
					ground_3.setBounds(ground_3.getX()-step,ground_3.getY(),500,500);
					if (ground_3.getX()<-3000) {
						for(int i=0;i<3;i++) {
							background.add(coin_3[i]);
							flag_3[i]=1;
							coin_3[i].setBounds(850-30*i,160,300,300);
						}
					}
					for(int i=0;i<3;i++) {
						coin_3[i].setBounds(coin_3[i].getX()-step,coin_3[i].getY(),300,300);
					}
					if (ground_3.getX()<-3000) {
						ground_3.setBounds(600,ground_3.getY(),500,500);
					}
					
					heart.setBounds(heart.getX()-step,heart.getY(),300,300);
					if (heart.getX()<-10000) {
						
						heart.setBounds(600,heart.getY(),300,300);
						
					}
					diamond.setBounds(diamond.getX()-step,diamond.getY(),300,300);
					if (diamond.getX()<-10000) {
						
						diamond.setBounds(600,diamond.getY(),300,300);
						
					}
					for(int i=0;i<x;i++) {
						coin_6[i].setBounds(coin_6[i].getX()-step,coin_6[i].getY(),300,300);
						if (coin_6[0].getX()<-200) {
							int a=random.nextInt(5)+1;
							for (int k=0;k<x;k++) {
								background.remove(coin_6[i]);
							}
							for(int j=0;j<a;j++) {
							  coin_6[j].setBounds(600-30*j,300-a*20,300,300);
							  coin_6[j].setIcon(game_14);
							  background.add(coin_6[j]);
							  flag_6[j]=1;
							}
							x=a;
							break;
						}
					}
					check_collision() ;
					break;
				}
	
				case 'w': timer_1.start();
				//prince.setBounds(prince.getX(),prince.getY()-step,300,300);
				for (int i=0;i<2;i++) {
				   prince.setBounds(prince.getX(),prince.getY()-4*step,300,300);
				}			
				int check=0;
				for (int i=1;i<=3;i++) {
					if ( Math.abs(prince.getX()-ground[i].getX())<=100 ) { 
						prince.setBounds(prince.getX(),ground[i].getY()+35,300,300);
				         check=1;
					}
				}
			
				if (check==0) {
					timer_7.start();
				}
				//timer_7.start();
			//	prince.setBounds(prince.getX(),ground[1].getY()-50,500,500);
				ground_1.setBounds(ground_1.getX()-step,ground_1.getY(),500,500);
				if (ground_1.getX()<-3000) {
						for(int i=0;i<2;i++) {
							background.add(coin_2[i]);
							flag_2[i]=1;
							coin_2[i].setBounds(720-30*i,50,300,300);
						}
					}
					for(int i=0;i<2;i++) {
						coin_2[i].setBounds(coin_2[i].getX()-step,coin_2[i].getY(),300,300);
					}
					if (ground_1.getX()<-3000) {
						ground_1.setBounds(600,ground_1.getY(),500,500);
						}
					ground_2.setBounds(ground_2.getX()-step,ground_2.getY(),500,500);
					if (ground_2.getX()<-3000) {
						for(int i=0;i<4;i++) {
							background.add(coin_4[i]);
							flag_4[i]=1;
							coin_4[i].setBounds(830-30*i,80,300,300);
						}
					}
					for(int i=0;i<4;i++) {
				 coin_4[i].setBounds(coin_4[i].getX()-step,coin_4[i].getY(),300,300);
					}
					if (ground_2.getX()<-3000) {
						ground_2.setBounds(600,ground_2.getY(),500,500);
					}
					ground_3.setBounds(ground_3.getX()-step,ground_3.getY(),500,500);
					if (ground_3.getX()<-3000) {
						for(int i=0;i<3;i++) {
							background.add(coin_3[i]);
							flag_3[i]=1;
							coin_3[i].setBounds(850-30*i,160,300,300);
						}
					}
					for(int i=0;i<3;i++) {
						coin_3[i].setBounds(coin_3[i].getX()-step,coin_3[i].getY(),300,300);
					}
					if (ground_3.getX()<-3000) {
						ground_3.setBounds(600,ground_3.getY(),500,500);
					}
					
					heart.setBounds(heart.getX()-step,heart.getY(),300,300);
					if (heart.getX()<-10000) {
						
						heart.setBounds(600,heart.getY(),300,300);
						
					}
					diamond.setBounds(diamond.getX()-step,diamond.getY(),300,300);
					if (diamond.getX()<-10000) {
						
						diamond.setBounds(600,diamond.getY(),300,300);
						
					}
					for(int i=0;i<x;i++) {
						coin_6[i].setBounds(coin_6[i].getX()-step,coin_6[i].getY(),300,300);
						if (coin_6[0].getX()<-200) {
							int a=random.nextInt(5)+1;
							for (int k=0;k<x;k++) {
								background.remove(coin_6[i]);
							}
							for(int j=0;j<a;j++) {
							  coin_6[j].setBounds(600-30*j,300-a*20,300,300);
							  coin_6[j].setIcon(game_14);
							  background.add(coin_6[j]);
							  flag_6[j]=1;
							}
							x=a;
							break;
						}
					}
					check_collision() ;
					break;
case 'd':  timer_1.start();
//	int a=cloud_1.getX();
int check_1=0;
for (int i=2;i<=3;i++) {
	if ( Math.abs(prince.getX()-ground[i].getX())<=250 ) { 
		check_1=1;
	}
}
if ( Math.abs(prince.getX()-ground[1].getX())<=80 ) { 
	check_1=1;
}

if (check_1==0) {
	prince.setBounds(prince.getX(),230,300,300);
}
for (int i=1;i<=6;i++) {
	  cloud[i].setBounds(cloud[i].getX()-step,cloud[i].getY(),100,100);
	  if (cloud[i].getX()<-100 ) {
		  cloud[i].setBounds(600,cloud[i].getY(),100,100);
	  }
}
ground_1.setBounds(ground_1.getX()-step,ground_1.getY(),500,500);
if (ground_1.getX()<-3000) {
		for(int i=0;i<2;i++) {
			background.add(coin_2[i]);
			flag_2[i]=1;
			coin_2[i].setBounds(720-30*i,50,300,300);
		}
	}
	for(int i=0;i<2;i++) {
		coin_2[i].setBounds(coin_2[i].getX()-step,coin_2[i].getY(),300,300);
	}
	if (ground_1.getX()<-3000) {
		ground_1.setBounds(600,ground_1.getY(),500,500);
		}
	ground_2.setBounds(ground_2.getX()-step,ground_2.getY(),500,500);
	if (ground_2.getX()<-3000) {
		for(int i=0;i<4;i++) {
			background.add(coin_4[i]);
			flag_4[i]=1;
			coin_4[i].setBounds(830-30*i,80,300,300);
		}
	}
	for(int i=0;i<4;i++) {
 coin_4[i].setBounds(coin_4[i].getX()-step,coin_4[i].getY(),300,300);
	}
	if (ground_2.getX()<-3000) {
		ground_2.setBounds(600,ground_2.getY(),500,500);
	}
	ground_3.setBounds(ground_3.getX()-step,ground_3.getY(),500,500);
	if (ground_3.getX()<-3000) {
		for(int i=0;i<3;i++) {
			background.add(coin_3[i]);
			flag_3[i]=1;
			coin_3[i].setBounds(850-30*i,160,300,300);
		}
	}
	for(int i=0;i<3;i++) {
		coin_3[i].setBounds(coin_3[i].getX()-step,coin_3[i].getY(),300,300);
	}
	if (ground_3.getX()<-3000) {
		ground_3.setBounds(600,ground_3.getY(),500,500);
	}
	
	heart.setBounds(heart.getX()-step,heart.getY(),300,300);
	if (heart.getX()<-10000) {
        background.add(heart);		
		heart.setBounds(600,heart.getY(),300,300);
		flag_heart=1;
	}
	diamond.setBounds(diamond.getX()-step,diamond.getY(),300,300);
	if (diamond.getX()<-10000) {
		background.add(diamond);	
		diamond.setBounds(600,diamond.getY(),300,300);
		flag_diamond=1;
	}
	for(int i=0;i<x;i++) {
		coin_6[i].setBounds(coin_6[i].getX()-step,coin_6[i].getY(),300,300);
		if (coin_6[0].getX()<-200) {
			int a=random.nextInt(5)+1;
			for (int k=0;k<x;k++) {
				background.remove(coin_6[i]);
			}
			for(int j=0;j<a;j++) {
			  coin_6[j].setBounds(600-30*j,300-a*20,300,300);
			  coin_6[j].setIcon(game_14);
			  background.add(coin_6[j]);
			  flag_6[j]=1;
			}
			x=a;
			break;
		}
	}
	check_collision() ;
					break;
			}
		 }
		}

		@Override
		public void keyPressed(KeyEvent e) {
			//keyPressed = Invoked when a physical key is pressed down. Uses KeyCode, int output
		 if(live>0) {
			switch(e.getKeyCode()) {
			case 37:
				timer_5.start();
//				int a=cloud_1.getX();
			for (int i=1;i<=6;i++) {
				  cloud[i].setBounds(cloud[i].getX()+step,cloud[i].getY(),100,100);
				  if (cloud[i].getX()>700 ) {
					  cloud[i].setBounds(0,cloud[i].getY(),100,100);
				  }
			}
			ground_1.setBounds(ground_1.getX()+step,ground_1.getY(),500,500);
			if (ground_1.getX()>3600) {
					for(int i=0;i<2;i++) {
						background.add(coin_2[i]);
						flag_2[i]=1;
						coin_2[i].setBounds(30+30*i,50,300,300);
					}
				}
				for(int i=0;i<2;i++) {
					coin_2[i].setBounds(coin_2[i].getX()+step,coin_2[i].getY(),300,300);
				}
				if (ground_1.getX()>3600) {
					ground_1.setBounds(0,ground_1.getY(),500,500);
					}
				ground_2.setBounds(ground_2.getX()+step,ground_2.getY(),500,500);
				if (ground_2.getX()>3000) {
					for(int i=0;i<4;i++) {
						background.add(coin_4[i]);
						flag_4[i]=1;
						coin_4[i].setBounds(30+30*i,80,300,300);
					}
				}
				for(int i=0;i<4;i++) {
			 coin_4[i].setBounds(coin_4[i].getX()+step,coin_4[i].getY(),300,300);
				}
				if (ground_2.getX()>3000) {
					ground_2.setBounds(0,ground_2.getY(),500,500);
				}
				ground_3.setBounds(ground_3.getX()+step,ground_3.getY(),500,500);
				if (ground_3.getX()>3000) {
					for(int i=0;i<3;i++) {
						background.add(coin_3[i]);
						flag_3[i]=1;
						coin_3[i].setBounds(30+30*i,160,300,300);
					}
				}
				for(int i=0;i<3;i++) {
					coin_3[i].setBounds(coin_3[i].getX()+step,coin_3[i].getY(),300,300);
				}
				if (ground_3.getX()>3000) {
					ground_3.setBounds(0,ground_3.getY(),500,500);
				}
				
				heart.setBounds(heart.getX()+step,heart.getY(),300,300);
				if (heart.getX()>10000) {
			        background.add(heart);		
					heart.setBounds(0,heart.getY(),300,300);
					flag_heart=1;
				}
				diamond.setBounds(diamond.getX()+step,diamond.getY(),300,300);
				if (diamond.getX()>10000) {
					background.add(diamond);	
					diamond.setBounds(0,diamond.getY(),300,300);
					flag_diamond=1;
				}
				for(int i=0;i<x;i++) {
					coin_6[i].setBounds(coin_6[i].getX()+step,coin_6[i].getY(),300,300);
					if (coin_6[x-1].getX()>660) {
						int a=random.nextInt(5)+1;
						for (int k=0;k<x;k++) {
							background.remove(coin_6[i]);
						}
						for(int j=0;j<a;j++) {
						  coin_6[j].setBounds(30+30*j,300-a*20,300,300);
						  coin_6[j].setIcon(game_14);
						  background.add(coin_6[j]);
						  flag_6[j]=1;
						}
						x=a;
						break;
					}
				}
				check_collision() ;
				break;				
			case 40: if (prince.getY()<=150) {   
				timer_1.start();
			for (int i=0;i<2;i++) {
				   prince.setBounds(prince.getX(),prince.getY()+2*step,300,300);
				}			
	        for (int i=1;i<=6;i++) {
			     cloud[i].setBounds(cloud[i].getX()-step,cloud[i].getY(),100,100);
				  if (cloud[i].getX()<-100 ) {
					 cloud[i].setBounds(600,cloud[i].getY(),100,100);
				  }
			}
	        ground_1.setBounds(ground_1.getX()-step,ground_1.getY(),500,500);
			if (ground_1.getX()<-3000) {
					for(int i=0;i<2;i++) {
						background.add(coin_2[i]);
						flag_2[i]=1;
						coin_2[i].setBounds(720-30*i,50,300,300);
					}
				}
				for(int i=0;i<2;i++) {
					coin_2[i].setBounds(coin_2[i].getX()-step,coin_2[i].getY(),300,300);
				}
				if (ground_1.getX()<-3000) {
					ground_1.setBounds(600,ground_1.getY(),500,500);
					}
				ground_2.setBounds(ground_2.getX()-step,ground_2.getY(),500,500);
				if (ground_2.getX()<-3000) {
					for(int i=0;i<4;i++) {
						background.add(coin_4[i]);
						flag_4[i]=1;
						coin_4[i].setBounds(830-30*i,80,300,300);
					}
				}
				for(int i=0;i<4;i++) {
			 coin_4[i].setBounds(coin_4[i].getX()-step,coin_4[i].getY(),300,300);
				}
				if (ground_2.getX()<-3000) {
					ground_2.setBounds(600,ground_2.getY(),500,500);
				}
				ground_3.setBounds(ground_3.getX()-step,ground_3.getY(),500,500);
				if (ground_3.getX()<-3000) {
					for(int i=0;i<3;i++) {
						background.add(coin_3[i]);
						flag_3[i]=1;
						coin_3[i].setBounds(850-30*i,160,300,300);
					}
				}
				for(int i=0;i<3;i++) {
					coin_3[i].setBounds(coin_3[i].getX()-step,coin_3[i].getY(),300,300);
				}
				if (ground_3.getX()<-3000) {
					ground_3.setBounds(600,ground_3.getY(),500,500);
				}
				
				heart.setBounds(heart.getX()-step,heart.getY(),300,300);
				if (heart.getX()<-10000) {
					
					heart.setBounds(600,heart.getY(),300,300);
					
				}
				diamond.setBounds(diamond.getX()-step,diamond.getY(),300,300);
				if (diamond.getX()<-10000) {
					
					diamond.setBounds(600,diamond.getY(),300,300);
					
				}
				for(int i=0;i<x;i++) {
					coin_6[i].setBounds(coin_6[i].getX()-step,coin_6[i].getY(),300,300);
					if (coin_6[0].getX()<-200) {
						int a=random.nextInt(5)+1;
						for (int k=0;k<x;k++) {
							background.remove(coin_6[i]);
						}
						for(int j=0;j<a;j++) {
						  coin_6[j].setBounds(600-30*j,300-a*20,300,300);
						  coin_6[j].setIcon(game_14);
						  background.add(coin_6[j]);
						  flag_6[j]=1;
						}
						x=a;
						break;
					}
				}
				check_collision() ;
				break;
			}
			case 38: timer_1.start();
			//prince.setBounds(prince.getX(),prince.getY()-step,300,300);
			for (int i=0;i<2;i++) {
			   prince.setBounds(prince.getX(),prince.getY()-4*step,300,300);
			}			
			int check=0;
			for (int i=1;i<=3;i++) {
				if ( Math.abs(prince.getX()-ground[i].getX())<=100 ) { 
					prince.setBounds(prince.getX(),ground[i].getY()+35,300,300);
			         check=1;
				}
			}
		
			if (check==0) {
				timer_7.start();
			}
			//timer_7.start();
		//	prince.setBounds(prince.getX(),ground[1].getY()-50,500,500);
			ground_1.setBounds(ground_1.getX()-step,ground_1.getY(),500,500);
			if (ground_1.getX()<-3000) {
					for(int i=0;i<2;i++) {
						background.add(coin_2[i]);
						flag_2[i]=1;
						coin_2[i].setBounds(720-30*i,50,300,300);
					}
				}
				for(int i=0;i<2;i++) {
					coin_2[i].setBounds(coin_2[i].getX()-step,coin_2[i].getY(),300,300);
				}
				if (ground_1.getX()<-3000) {
					ground_1.setBounds(600,ground_1.getY(),500,500);
					}
				ground_2.setBounds(ground_2.getX()-step,ground_2.getY(),500,500);
				if (ground_2.getX()<-3000) {
					for(int i=0;i<4;i++) {
						background.add(coin_4[i]);
						flag_4[i]=1;
						coin_4[i].setBounds(830-30*i,80,300,300);
					}
				}
				for(int i=0;i<4;i++) {
			 coin_4[i].setBounds(coin_4[i].getX()-step,coin_4[i].getY(),300,300);
				}
				if (ground_2.getX()<-3000) {
					ground_2.setBounds(600,ground_2.getY(),500,500);
				}
				ground_3.setBounds(ground_3.getX()-step,ground_3.getY(),500,500);
				if (ground_3.getX()<-3000) {
					for(int i=0;i<3;i++) {
						background.add(coin_3[i]);
						flag_3[i]=1;
						coin_3[i].setBounds(850-30*i,160,300,300);
					}
				}
				for(int i=0;i<3;i++) {
					coin_3[i].setBounds(coin_3[i].getX()-step,coin_3[i].getY(),300,300);
				}
				if (ground_3.getX()<-3000) {
					ground_3.setBounds(600,ground_3.getY(),500,500);
				}
				
				heart.setBounds(heart.getX()-step,heart.getY(),300,300);
				if (heart.getX()<-10000) {
					
					heart.setBounds(600,heart.getY(),300,300);
					
				}
				diamond.setBounds(diamond.getX()-step,diamond.getY(),300,300);
				if (diamond.getX()<-10000) {
					
					diamond.setBounds(600,diamond.getY(),300,300);
					
				}
				for(int i=0;i<x;i++) {
					coin_6[i].setBounds(coin_6[i].getX()-step,coin_6[i].getY(),300,300);
					if (coin_6[0].getX()<-200) {
						int a=random.nextInt(5)+1;
						for (int k=0;k<x;k++) {
							background.remove(coin_6[i]);
						}
						for(int j=0;j<a;j++) {
						  coin_6[j].setBounds(600-30*j,300-a*20,300,300);
						  coin_6[j].setIcon(game_14);
						  background.add(coin_6[j]);
						  flag_6[j]=1;
						}
						x=a;
						break;
					}
				}
				check_collision() ;
				break;
case 39:  timer_1.start();
//int a=cloud_1.getX();
int check_1=0;
for (int i=2;i<=3;i++) {
   if ( Math.abs(prince.getX()-ground[i].getX())<=250 ) { 
	  check_1=1;
   }
}
if ( Math.abs(prince.getX()-ground[1].getX())<=80 ) { 
	check_1=1;
}
if (check_1==0) {
prince.setBounds(prince.getX(),230,300,300);
}
for (int i=1;i<=6;i++) {
  cloud[i].setBounds(cloud[i].getX()-step,cloud[i].getY(),100,100);
  if (cloud[i].getX()<-100 ) {
	  cloud[i].setBounds(600,cloud[i].getY(),100,100);
  }
}
ground_1.setBounds(ground_1.getX()-step,ground_1.getY(),500,500);
if (ground_1.getX()<-3000) {
	for(int i=0;i<2;i++) {
		background.add(coin_2[i]);
		flag_2[i]=1;
		coin_2[i].setBounds(720-30*i,50,300,300);
	}
}
for(int i=0;i<2;i++) {
	coin_2[i].setBounds(coin_2[i].getX()-step,coin_2[i].getY(),300,300);
}
if (ground_1.getX()<-3000) {
	ground_1.setBounds(600,ground_1.getY(),500,500);
	}
ground_2.setBounds(ground_2.getX()-step,ground_2.getY(),500,500);
if (ground_2.getX()<-3000) {
	for(int i=0;i<4;i++) {
		background.add(coin_4[i]);
		flag_4[i]=1;
		coin_4[i].setBounds(830-30*i,80,300,300);
	}
}
for(int i=0;i<4;i++) {
coin_4[i].setBounds(coin_4[i].getX()-step,coin_4[i].getY(),300,300);
}
if (ground_2.getX()<-3000) {
	ground_2.setBounds(600,ground_2.getY(),500,500);
}
ground_3.setBounds(ground_3.getX()-step,ground_3.getY(),500,500);
if (ground_3.getX()<-3000) {
	for(int i=0;i<3;i++) {
		background.add(coin_3[i]);
		flag_3[i]=1;
		coin_3[i].setBounds(850-30*i,160,300,300);
	}
}
for(int i=0;i<3;i++) {
	coin_3[i].setBounds(coin_3[i].getX()-step,coin_3[i].getY(),300,300);
}
if (ground_3.getX()<-3000) {
	ground_3.setBounds(600,ground_3.getY(),500,500);
}

heart.setBounds(heart.getX()-step,heart.getY(),300,300);
if (heart.getX()<-10000) {
    background.add(heart);		
	heart.setBounds(600,heart.getY(),300,300);
	flag_heart=1;
}
diamond.setBounds(diamond.getX()-step,diamond.getY(),300,300);
if (diamond.getX()<-10000) {
	background.add(diamond);	
	diamond.setBounds(600,diamond.getY(),300,300);
	flag_diamond=1;
}
for(int i=0;i<x;i++) {
	coin_6[i].setBounds(coin_6[i].getX()-step,coin_6[i].getY(),300,300);
	if (coin_6[0].getX()<-200) {
		int a=random.nextInt(5)+1;
		for (int k=0;k<x;k++) {
			background.remove(coin_6[i]);
		}
		for(int j=0;j<a;j++) {
		  coin_6[j].setBounds(600-30*j,300-a*20,300,300);
		  coin_6[j].setIcon(game_14);
		  background.add(coin_6[j]);
		  flag_6[j]=1;
		}
		x=a;
		break;
	}
}
check_collision() ;
				break;
		}
	}
	}

		@Override
		public void keyReleased(KeyEvent e) {
			//keyReleased = called whenever a button is released
			System.out.println("You released key char: " + e.getKeyChar());
			System.out.println("You released key code: " + e.getKeyCode());
		}

}
