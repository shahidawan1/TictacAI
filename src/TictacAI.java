
import java.net.*;
import java.util.Random;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
public class TictacAI {


	public static char[][] game = { { '1', '2', '3' }, { '4', '5', '6' },
		{ '7', '8', '9' } };
	private static JFrame mainFrame;
	private JLabel statusLabel;
	int count = 0;
	int wins = 100;

	int row = 100;
	int col = 100;
	
	Boolean Turn=false;

		TictacAI() {
		
		mainFrame = new JFrame("Tic Tac Toe");
		mainFrame.setSize(400, 400);
		mainFrame.setLayout(new GridLayout(3, 3));
		mainFrame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent windowEvent) {
				System.exit(0);
			}
		});
		mainFrame.setVisible(true);
	}

	JButton Button1 = new JButton("");
	JButton Button2 = new JButton("");
	JButton Button3 = new JButton("");
	JButton Button4 = new JButton("");
	JButton Button5 = new JButton("");
	JButton Button6 = new JButton("");
	JButton Button7 = new JButton("");
	JButton Button8 = new JButton("");
	JButton Button9 = new JButton("");

	public void showbutton() {

		mainFrame.add(Button1);
		mainFrame.add(Button2);
		mainFrame.add(Button3);
		mainFrame.add(Button4);
		mainFrame.add(Button5);
		mainFrame.add(Button6);
		mainFrame.add(Button7);
		mainFrame.add(Button8);
		mainFrame.add(Button9);
		mainFrame.setVisible(true);
		compTurn();
		
		Button1.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				wins = won();
				if(Turn==true)
				{	if (wins == 3 ) {
						if (game[0][0] == '1') {
							Button1.setText("0");
							game[0][0] = '0';
							row = 0;
							col = 0;
							Turn=false;
							count++;
							wins=won();
							if(wins==0)
							{JOptionPane.showMessageDialog(null,
									"Congrats you win ...... zeros '0' wins");}
							else if(wins==1)
							{
								JOptionPane.showMessageDialog(null,"Computer crosses 'x' wins");	
							}
							else if(count==9&&wins==3)
	
							{
								JOptionPane.showMessageDialog(null,"game is draw");	
							}
							compTurn();
						}
					}
				}
			}
		});

		Button2.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				wins = won();
				if(Turn==true)
				{
					if (wins == 3) {

						if (game[0][1] == '2') {

							Button2.setText("0");
							game[0][1] = '0';
							row = 0;
							col = 1;
							Turn=false;
							count++;
							wins=won();
							if(wins==0)
							{JOptionPane.showMessageDialog(null,
									"Congrats you win ...... zeros '0' wins");}
							else if(wins==1)
							{
								JOptionPane.showMessageDialog(null,"Computer crosses 'x' wins");	
							}
							else if(count==9&&wins==3)

							{
								JOptionPane.showMessageDialog(null,"game is draw");	
							}
							compTurn();
						}
					}
				}
			}
		});
		Button3.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				wins = won();
				if(Turn==true)
				{	
					if (wins == 3) {
						if (game[0][2] == '3') {
							Button3.setText("0");
							game[0][2] = '0';
							row = 0;
							col = 2;
							Turn=false;
							count++;
							wins=won();
							if(wins==0)
							{JOptionPane.showMessageDialog(null,
									"Congrats you win ...... zeros '0' wins");}
							else if(wins==1)
							{
								JOptionPane.showMessageDialog(null,"Computer crosses 'x' wins");	
							}
							else if(count==9&&wins==3)

							{
								JOptionPane.showMessageDialog(null,"game is draw");	
							}
							compTurn();
						}
					}
				}
			}
		});
		Button4.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				wins = won();
				if(Turn==true)
				{
					if (wins == 3 ) {
						if (game[1][0] == '4') {
							Button4.setText("0");
							game[1][0] = '0';
							row = 1;
							col = 0;
							Turn=false;
							count++;
							wins=won();
							if(wins==0)
							{JOptionPane.showMessageDialog(null,
									"Congrats you win ...... zeros '0' wins");}
							else if(wins==1)
							{
								JOptionPane.showMessageDialog(null,"Computer crosses 'x' wins");	
							}
							else if(count==9&&wins==3)

							{
								JOptionPane.showMessageDialog(null,"game is draw");	
							}
							compTurn();
						}
					}
				}
			}
		});
		Button5.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				wins = won();
				if(Turn==true)
				{
					if (wins == 3) {
						if (game[1][1] == '5') {
							Button5.setText("0");
							game[1][1] = '0';
							row = 1;
							col = 1;
							Turn=false;
							count++;
							wins=won();
							if(wins==0)
							{JOptionPane.showMessageDialog(null,
									"Congrats you win ...... zeros '0' wins");}
							else if(wins==1)
							{
								JOptionPane.showMessageDialog(null,"Computer crosses 'x' wins");	
							}
							else if(count==9&&wins==3)

							{
								JOptionPane.showMessageDialog(null,"game is draw");	
							}
							compTurn();
						}
					}
				}
			}
		});
		Button6.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				wins = won();
				if(Turn==true)
				{
					if (wins == 3) {
						if (game[1][2] == '6') {
							Button6.setText("0");
							game[1][2] = '0';
							row = 1;
							col = 2;
							Turn=false;
							count++;
							wins=won();
							if(wins==0)
							{JOptionPane.showMessageDialog(null,
									"Congrats you win ...... zeros '0' wins");}
							else if(wins==1)
							{
								JOptionPane.showMessageDialog(null,"Computer crosses 'x' wins");	
							}
							else if(count==9&&wins==3)

							{
								JOptionPane.showMessageDialog(null,"game is draw");	
							}
							compTurn();
						}
					}
				}
			}
		});
		Button7.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				wins = won();
				if(Turn==true)
				{
					if (wins == 3) {

						if (game[2][0] == '7') {
							Button7.setText("0");
							game[2][0] = '0';
							row = 2;
							col = 0;
							Turn=false;
							count++;
							wins=won();
							if(wins==0)
							{JOptionPane.showMessageDialog(null,
									"Congrats you win ...... zeros '0' wins");}
							else if(wins==1)
							{
								JOptionPane.showMessageDialog(null,"Computer crosses 'x' wins");	
							}
							else if(count==9&&wins==3)

							{
								JOptionPane.showMessageDialog(null,"game is draw");	
							}
							compTurn();
						}
					}
				}
			}
		});
		Button8.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				wins = won();
				if(Turn==true)
				{
					if (wins == 3) {

						if (game[2][1] == '8') {
							Button8.setText("0");
							game[2][1] = '0';
							row = 2;
							col = 1;
							Turn=false;
							count++;
							wins=won();
							if(wins==0)
							{JOptionPane.showMessageDialog(null,
									"Congrats you win ...... zeros '0' wins");}
							else if(wins==1)
							{
								JOptionPane.showMessageDialog(null,"Computer crosses 'x' wins");	
							}
							else if(count==9&&wins==3)

							{
								JOptionPane.showMessageDialog(null,"game is draw");	
							}
							compTurn();
						}
					}
				}
			}
		});
		Button9.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				wins = won();
				if(Turn==true)
				{
					if (wins == 3 ) {

						if (game[2][2] == '9') {
							Button9.setText("0");
							game[2][2] = '0';
							row = 2;
							col = 2;
							Turn=false;
							count++;
							wins=won();
							if(wins==0)
							{JOptionPane.showMessageDialog(null,
									"Congrats you win ...... zeros '0' wins");}
							else if(wins==1)
							{
								JOptionPane.showMessageDialog(null,"Computer crosses 'x' wins");	
							}
							else if(count==9&&wins==3)

							{
								JOptionPane.showMessageDialog(null,"game is draw");	
							}
							compTurn();
						}
					}
				}
			}
		});
		

	}

	public int won() {
		int winner = 3;
		if ((((game[0][0]) == 'x' && (game[0][1]) == 'x' && (game[0][2]) == 'x')
				|| ((game[1][0]) == 'x' && (game[1][1]) == 'x' && (game[1][2]) == 'x')
				|| ((game[2][0]) == 'x' && (game[2][1]) == 'x' && (game[2][2]) == 'x')
				||

				((game[0][0]) == 'x' && (game[1][0]) == 'x' && (game[2][0]) == 'x')
				|| ((game[0][1]) == 'x' && (game[1][1]) == 'x' && (game[2][1]) == 'x')
				|| ((game[0][2]) == 'x' && (game[1][2]) == 'x' && (game[2][2]) == 'x')
				||

				((game[0][0]) == 'x' && (game[1][1]) == 'x' && (game[2][2]) == 'x') || ((game[0][2]) == 'x'
				&& (game[1][1]) == 'x' && (game[2][0]) == 'x')

				)

				) {
			winner = 1;

			
		}
		if (

				(		(	(game[0][0]) == '0' && (game[0][1]) == '0' && (game[0][2]) == '0')
						|| ((game[1][0]) == '0' && (game[1][1]) == '0' && (game[1][2]) == '0')
						|| ((game[2][0]) == '0' && (game[2][1]) == '0' && (game[2][2]) == '0')
						||

						((game[0][0]) == '0' && (game[1][0]) == '0' && (game[2][0]) == '0')
						|| ((game[0][1]) == '0' && (game[1][1]) == '0' && (game[2][1]) == '0')
						|| ((game[0][2]) == '0' && (game[1][2]) == '0' && (game[2][2]) == '0')
						||

						((game[0][0]) == '0' && (game[1][1]) == '0' && (game[2][2]) == '0') || 
						((game[0][2]) == '0'&& (game[1][1]) == '0' && (game[2][0]) == '0')

				)

			) 
		{
			winner = 0;
			
		}
		if(count==9&&winner==3)
		{
			//JOptionPane.showMessageDialog(null,"Game is draw");
		}
		return winner;
	}
	public void compTurn()
	
	{		if(Turn==false)
			{		
					if(count==0)
					{
						int max=10;
						int min=1;
						Random random = new Random();
						int a=random.nextInt(max - min) + min;
						switch(a)
						{
							case 1:
								game[0][0]='x';
								Button1.setText("x");
								count++;
								Turn=true;
								break;
							case 2:
								game[0][1]='x';
								Button2.setText("x");
								count++;
								Turn=true;
								break;
							case 3:
								game[0][2]='x';
								Button3.setText("x");
								count++;
								Turn=true;
								break;
							case 4:
								game[1][0]='x';
								Button4.setText("x");
								count++;
								Turn=true;
								break;
							case 5:
								game[1][1]='x';
								Button5.setText("x");
								count++;
								Turn=true;
								break;
							case 6:
								game[1][2]='x';
								Button6.setText("x");
								count++;
								Turn=true;
								break;
							case 7:
								game[2][0]='x';
								Button7.setText("x");
								count++;
								Turn=true;
								break;
							case 8:
								game[2][1]='x';
								Button8.setText("x");
								count++;
								Turn=true;
								break;
							case 9:
								game[2][2]='x';
								Button9.setText("x");
								count++;
								Turn=true;
								break;
								
						}
					}
					
					else if((game[1][1])=='5')
					{
						game[1][1]='x';
						Button5.setText("x");
						count++;
						Turn=true;
					}
					
					else if(((game[0][0])=='x'&&(game[0][1])=='x')&&(game[0][2])=='3')
					{
						game[0][2]='x';
						Button3.setText("x");
						count++;
						Turn=true;
					}
					
					else if(((game[0][0])=='x'&&(game[1][0])=='x')&&(game[2][0])=='7')
					{
						game[2][0]='x';
						Button7.setText("x");
						count++;
						Turn=true;
					}
					
					else if(((game[0][0])=='x'&&(game[1][1])=='x')&&(game[2][2])=='9')
					{
						game[2][2]='x';
						Button9.setText("x");
						count++;
						Turn=true;
					}
					
					else if(((game[0][0])=='x'&&(game[2][0])=='x')&&(game[1][0])=='4')
					{
						game[1][0]='x';
						Button4.setText("x");
						count++;
						Turn=true;
					}
					
					else if(((game[0][0])=='x'&&(game[0][2])=='x')&&(game[0][1])=='2')
					{
						game[0][1]='x';
						Button2.setText("x");
						count++;
						Turn=true;
					}
					
					else if(((game[0][0])=='x'&&(game[2][2])=='x')&&(game[1][1])=='5')
					{
						game[1][1]='x';
						Button5.setText("x");
						count++;
						Turn=true;
					}
					
					else if(((game[0][1])=='0'&&(game[0][2])=='0')&&(game[0][0])=='1')
					{
						game[0][0]='x';
						Button1.setText("x");
						count++;
						Turn=true;
					}
					
					else if(((game[0][1])=='x'&&(game[1][1])=='x')&&(game[2][1])=='8')
					{
						game[2][1]='x';
						Button8.setText("x");
						count++;
						Turn=true;
					}
					
					else if(((game[0][1])=='x'&&(game[2][1])=='x')&&(game[1][1])=='5')
					{
						game[0][0]='x';
						Button5.setText("x");
						count++;
						Turn=true;
					}
					else if(((game[0][2])=='x'&&(game[1][1])=='x')&&(game[2][0])=='7')
					{
						game[2][0]='x';
						Button7.setText("x");
						count++;
						Turn=true;
					}
					else if(((game[0][2])=='x'&&(game[1][2])=='x')&&(game[2][2])=='9')
					{
						game[2][2]='x';
						Button9.setText("x");
						count++;
						Turn=true;
					}
					else if(((game[0][2])=='x'&&(game[2][0])=='x')&&(game[1][1])=='5')
					{
						game[1][1]='x';
						Button5.setText("x");
						count++;
						Turn=true;
					}
					else if(((game[0][2])=='x'&&(game[2][2])=='x')&&(game[1][2])=='6')
					{
						game[1][2]='x';
						Button6.setText("x");
						count++;
						Turn=true;
					}
					else if(((game[1][0])=='x'&&(game[2][0])=='x')&&(game[0][0])=='1')
					{
						game[0][0]='x';
						Button1.setText("x");
						count++;
						Turn=true;
					}
					else if(((game[1][0])=='x'&&(game[1][1])=='x')&&(game[1][2])=='6')
					{
						game[1][2]='x';
						Button6.setText("x");
						count++;
						Turn=true;
					}
					else if(((game[1][0])=='x'&&(game[1][2])=='x')&&(game[1][1])=='5')
					{
						game[1][1]='x';
						Button5.setText("x");
						count++;
						Turn=true;
					}
					else if(((game[1][1])=='x'&&(game[1][2])=='x')&&(game[1][0])=='4')
					{
						game[1][0]='x';
						Button4.setText("x");
						count++;
						Turn=true;
					}
					else if(((game[1][1])=='x'&&(game[2][0])=='x')&&(game[0][2])=='3')
					{
						game[0][2]='x';
						Button3.setText("x");
						count++;
						Turn=true;
					}
					else if(((game[1][1])=='x'&&(game[2][1])=='x')&&(game[0][1])=='2')
					{
						game[0][1]='x';
						Button2.setText("x");
						count++;
						Turn=true;
					}
					else if(((game[1][1])=='x'&&(game[2][2])=='x')&&(game[0][0])=='1')
					{
						game[0][0]='x';
						Button1.setText("x");
						count++;
						Turn=true;
					}
					else if(((game[1][2])=='x'&&(game[2][2])=='x')&&(game[0][2])=='3')
					{
						game[0][2]='x';
						Button3.setText("x");
						count++;
						Turn=true;
					}
					else if(((game[2][0])=='x'&&(game[2][1])=='x')&&(game[2][2])=='9')
					{
						game[2][2]='x';
						Button9.setText("x");
						count++;
						Turn=true;
					}
					else if(((game[2][0])=='x'&&(game[2][2])=='x')&&(game[2][1])=='8')
					{
						game[2][1]='x';
						Button8.setText("x");
						count++;
						Turn=true;
					}
					else if(((game[2][1])=='x'&&(game[2][2])=='x')&&(game[2][0])=='7')
					{
						game[2][0]='x';
						Button7.setText("x");
						count++;
						Turn=true;
					}
					
					//AI
					
					else if(((game[0][0])=='0'&&(game[0][1])=='0')&&(game[0][2])=='3')
					{
						game[0][2]='x';
						Button3.setText("x");
						count++;
						Turn=true;
					}
					
					else if(((game[0][0])=='0'&&(game[1][0])=='0')&&(game[2][0])=='7')
					{
						game[2][0]='x';
						Button7.setText("x");
						count++;
						Turn=true;
					}
					
					else if(((game[0][0])=='0'&&(game[1][1])=='0')&&(game[2][2])=='9')
					{
						game[2][2]='x';
						Button9.setText("x");
						count++;
						Turn=true;
					}
					
					else if(((game[0][0])=='0'&&(game[2][0])=='0')&&(game[1][0])=='4')
					{
						game[1][0]='x';
						Button4.setText("x");
						count++;
						Turn=true;
					}
					
					else if(((game[0][0])=='0'&&(game[0][2])=='0')&&(game[0][1])=='2')
					{
						game[0][1]='x';
						Button2.setText("x");
						count++;
						Turn=true;
					}
					
					else if(((game[0][0])=='0'&&(game[2][2])=='0')&&(game[1][1])=='5')
					{
						game[1][1]='x';
						Button5.setText("x");
						count++;
						Turn=true;
					}
					
					else if(((game[0][1])=='0'&&(game[1][1])=='0')&&(game[2][1])=='8')
					{
						game[2][1]='x';
						Button8.setText("x");
						count++;
						Turn=true;
					}
					
					else if(((game[0][1])=='0'&&(game[0][2])=='0')&&(game[0][0])=='1')
					{
						game[0][0]='x';
						Button1.setText("x");
						count++;
						Turn=true;
					}
					//mistake
					
					else if(((game[0][1])=='0'&&(game[2][1])=='0')&&(game[1][1])=='5')
					{
						game[0][0]='x';
						Button5.setText("x");
						count++;
						Turn=true;
					}
					else if(((game[0][2])=='0'&&(game[1][1])=='0')&&(game[2][0])=='7')
					{
						game[2][0]='x';
						Button7.setText("x");
						count++;
						Turn=true;
					}
					else if(((game[0][2])=='0'&&(game[1][2])=='0')&&(game[2][2])=='9')
					{
						game[2][2]='x';
						Button9.setText("x");
						count++;
						Turn=true;
					}
					else if(((game[0][2])=='0'&&(game[2][0])=='0')&&(game[1][1])=='5')
					{
						game[1][1]='x';
						Button5.setText("x");
						count++;
						Turn=true;
					}
					else if(((game[0][2])=='0'&&(game[2][2])=='0')&&(game[1][2])=='6')
					{
						game[1][2]='x';
						Button6.setText("x");
						count++;
						Turn=true;
					}
					else if(((game[1][0])=='0'&&(game[2][0])=='0')&&(game[0][0])=='1')
					{
						game[0][0]='x';
						Button1.setText("x");
						count++;
						Turn=true;
					}
					else if(((game[1][0])=='0'&&(game[1][1])=='0')&&(game[1][2])=='6')
					{
						game[1][2]='x';
						Button6.setText("x");
						count++;
						Turn=true;
					}
					else if(((game[1][0])=='0'&&(game[1][2])=='0')&&(game[1][1])=='5')
					{
						game[1][1]='x';
						Button5.setText("x");
						count++;
						Turn=true;
					}
					else if(((game[1][1])=='0'&&(game[1][2])=='0')&&(game[1][0])=='4')
					{
						game[1][0]='x';
						Button4.setText("x");
						count++;
						Turn=true;
					}
					else if(((game[1][1])=='0'&&(game[2][0])=='0')&&(game[0][2])=='3')
					{
						game[0][2]='x';
						Button3.setText("x");
						count++;
						Turn=true;
					}
					else if(((game[1][1])=='0'&&(game[2][1])=='0')&&(game[0][1])=='2')
					{
						game[0][1]='x';
						Button2.setText("x");
						count++;
						Turn=true;
					}
					else if(((game[1][1])=='0'&&(game[2][2])=='0')&&(game[0][0])=='1')
					{
						game[0][0]='x';
						Button1.setText("x");
						count++;
						Turn=true;
					}
					else if(((game[1][2])=='0'&&(game[2][2])=='0')&&(game[0][2])=='3')
					{
						game[0][2]='x';
						Button3.setText("x");
						count++;
						Turn=true;
					}
					else if(((game[2][0])=='0'&&(game[2][1])=='0')&&(game[2][2])=='9')
					{
						game[2][2]='x';
						Button9.setText("x");
						count++;
						Turn=true;
					}
					else if(((game[2][0])=='0'&&(game[2][2])=='0')&&(game[2][1])=='8')
					{
						game[2][1]='x';
						Button8.setText("x");
						count++;
						Turn=true;
					}
					else if(((game[2][1])=='0'&&(game[2][2])=='0')&&(game[2][0])=='7')
					{
						game[2][0]='x';
						Button7.setText("x");
						count++;
						Turn=true;
					}
					else if(((game[0][0])=='0'&&(game[2][1])=='0')&&(game[2][0])=='7')
					{
						game[2][0]='x';
						Button7.setText("x");
						count++;
						Turn=true;
					}
					
				//AI	
					
					
					
					
					else
					{	int counter=0;
						int x=0;
						int broke=0;
						
						for(int rownum=0;rownum<=2;rownum++)
						{	
							for(int colnum=0;colnum<=2;colnum++)
							{	x=0;
								counter++;
								x=(int)(game[rownum][colnum]-'0');
								if(x==counter)
								{
									setButtonText(rownum,colnum);
									Turn=true;
									count++;
									broke=1;
									break;
								}
								
							}
							if(broke==1)
							{
								break;
							}
						}
					}
					wins=won();
					if(wins==0)
					{JOptionPane.showMessageDialog(null,
							"Congrats you win ...... zeros '0' wins");}
					else if(wins==1)
					{
						JOptionPane.showMessageDialog(null,"Computer crosses 'x' wins");	
					}
					else if(count==9&&wins==3)
			
					{
						JOptionPane.showMessageDialog(null,"game is draw");	
					}
			
					
					
			}			
	}

		public static void main(String[] args) {
			TictacAI player=new TictacAI();
			player.play();
			
		
	}
public void setButtonText(int row, int col)
{
	wins = won();
	if(wins==3)
	{

		if(row==0&&col==0)
		{	
			Button1.setText("x");
			game[0][0]='x';
		}
		else
			if(row==0&&col==1)
			{
				Button2.setText("x");
				game[0][1]='x';
			}
			else
				if(row==0&&col==2)
				{
					Button3.setText("x");
					game[0][2]='x';
				}
				else
					if(row==1&&col==0)
					{
						Button4.setText("x");
						game[1][0]='x';
					}
					else
						if(row==1&&col==1)
						{
							Button5.setText("x");
							game[1][1]='x';
						}
						else
							if(row==1&&col==2)
							{
								Button6.setText("x");
								game[1][2]='x';
							}
							else
								if(row==2&&col==0)
								{
									Button7.setText("x");
									game[2][0]='x';
								}
								else
									if(row==2&&col==1)
									{
										Button8.setText("x");
										game[2][1]='x';
									}
									else
										if(row==2&&col==2)
										{
											Button9.setText("x");
											game[2][2]='x';
										}
	}
}
	
		public void play()
		
		{
			
			showbutton();
		}

}
