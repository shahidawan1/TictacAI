import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class TictacAI implements ActionListener{  

	public static char[][] gameBoard = { { '1', '2', '3' }, { '4', '5', '6' },
			{ '7', '8', '9' } };
	private static JFrame mainFrame;
	private int count = 0;
	private int wins = 100;
	private final String COMPUTER_WIN="YOU LOSE.....Computer crosses 'x' wins ";
	private final String PLAYER_WIN="Congrats YOU WIN ...... zeros '0' wins";
	private final String GAME_DRAW="Game DRAW";

	private boolean turn = true;
	


	private JButton topLeft = new JButton("");
	private JButton topCenter = new JButton("");
	private JButton topRight = new JButton("");
	private JButton middleLeft = new JButton("");
	private JButton middleCenter = new JButton("");
	private JButton middleRight = new JButton("");
	private JButton bottomLeft = new JButton("");
	private JButton bottomCenter = new JButton("");
	private JButton bottomRight = new JButton("");

	TictacAI() {

		topLeft.addActionListener(this);
		topCenter.addActionListener(this);
		topRight.addActionListener(this);
		middleLeft.addActionListener(this);
		middleCenter.addActionListener(this);
		middleRight.addActionListener(this);
		bottomLeft.addActionListener(this);
		bottomCenter.addActionListener(this);
		bottomRight.addActionListener(this);
		
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

	
	public void actionPerformed(ActionEvent e){	

		if(e.getSource()==topLeft){
			if((gameBoard[0][0])=='1')
				clickEvent(0,0);
		}
		else if(e.getSource()==topCenter){
			if((gameBoard[0][1])=='2')
				clickEvent(0,1);
		}
		else if(e.getSource()==topRight){ 
			if((gameBoard[0][2])=='3')	
				clickEvent(0,2);
		}
		else if(e.getSource()==middleLeft){ 
			if((gameBoard[1][0])=='4')	
				clickEvent(1,0);
		}
		else if(e.getSource()==middleCenter){ 
			if((gameBoard[1][1])=='5')
				clickEvent(1,1);
		}
		else if(e.getSource()==middleRight){ 
			if((gameBoard[1][2])=='6')	
				clickEvent(1,2);
		}
		else if(e.getSource()==bottomLeft){ 
			if((gameBoard[2][0])=='7')	
				clickEvent(2,0);
		}
		else if(e.getSource()==bottomCenter){ 
			if((gameBoard[2][1])=='8')
				clickEvent(2,1);
		}
		else if(e.getSource()==bottomRight){ 
			if((gameBoard[2][2])=='9')
				clickEvent(2,2);
		}

	}
	public void showbutton() {

		mainFrame.add(topLeft);
		mainFrame.add(topCenter);
		mainFrame.add(topRight);
		mainFrame.add(middleLeft);
		mainFrame.add(middleCenter);
		mainFrame.add(middleRight);
		mainFrame.add(bottomLeft);
		mainFrame.add(bottomCenter);
		mainFrame.add(bottomRight);
		mainFrame.setVisible(true);
		computerTurn();

	}

	public int hasWon() {
		int winner = 3;
		if ((((gameBoard[0][0]) == 'x' && (gameBoard[0][1]) == 'x' && (gameBoard[0][2]) == 'x')
				|| ((gameBoard[1][0]) == 'x' && (gameBoard[1][1]) == 'x' && (gameBoard[1][2]) == 'x')
				|| ((gameBoard[2][0]) == 'x' && (gameBoard[2][1]) == 'x' && (gameBoard[2][2]) == 'x')
				||

				((gameBoard[0][0]) == 'x' && (gameBoard[1][0]) == 'x' && (gameBoard[2][0]) == 'x')
				|| ((gameBoard[0][1]) == 'x' && (gameBoard[1][1]) == 'x' && (gameBoard[2][1]) == 'x')
				|| ((gameBoard[0][2]) == 'x' && (gameBoard[1][2]) == 'x' && (gameBoard[2][2]) == 'x')
				||

				((gameBoard[0][0]) == 'x' && (gameBoard[1][1]) == 'x' && (gameBoard[2][2]) == 'x') || ((gameBoard[0][2]) == 'x'
				&& (gameBoard[1][1]) == 'x' && (gameBoard[2][0]) == 'x')

		)

		) {
			JOptionPane.showMessageDialog(null,COMPUTER_WIN);
			winner = 1;

		}
		else if ((((gameBoard[0][0]) == '0' && (gameBoard[0][1]) == '0' && (gameBoard[0][2]) == '0')
				|| ((gameBoard[1][0]) == '0' && (gameBoard[1][1]) == '0' && (gameBoard[1][2]) == '0')
				|| ((gameBoard[2][0]) == '0' && (gameBoard[2][1]) == '0' && (gameBoard[2][2]) == '0')
				||

				((gameBoard[0][0]) == '0' && (gameBoard[1][0]) == '0' && (gameBoard[2][0]) == '0')
				|| ((gameBoard[0][1]) == '0' && (gameBoard[1][1]) == '0' && (gameBoard[2][1]) == '0')
				|| ((gameBoard[0][2]) == '0' && (gameBoard[1][2]) == '0' && (gameBoard[2][2]) == '0')
				||

				((gameBoard[0][0]) == '0' && (gameBoard[1][1]) == '0' && (gameBoard[2][2]) == '0') || ((gameBoard[0][2]) == '0'
				&& (gameBoard[1][1]) == '0' && (gameBoard[2][0]) == '0')

		)

		) {
			winner = 0;
			JOptionPane.showMessageDialog(null,PLAYER_WIN);
		}
		if (count == 9 && winner == 3) {
			 JOptionPane.showMessageDialog(null,GAME_DRAW);
		}
		return winner;
	}

	public void computerTurn()

	{
		if (turn == false) {
			if (count == 0) {
				int max = 10;
				int min = 1;
				Random random = new Random();
				int a = random.nextInt(max - min) + min;
				switch (a) {
				case 1:
					gameBoard[0][0] = 'x';
					topLeft.setText("x");
					count++;
					turn = true;
					break;
				case 2:
					gameBoard[0][1] = 'x';
					topCenter.setText("x");
					count++;
					turn = true;
					break;
				case 3:
					gameBoard[0][2] = 'x';
					topRight.setText("x");
					count++;
					turn = true;
					break;
				case 4:
					gameBoard[1][0] = 'x';
					middleLeft.setText("x");
					count++;
					turn = true;
					break;
				case 5:
					gameBoard[1][1] = 'x';
					middleCenter.setText("x");
					count++;
					turn = true;
					break;
				case 6:
					gameBoard[1][2] = 'x';
					middleRight.setText("x");
					count++;
					turn = true;
					break;
				case 7:
					gameBoard[2][0] = 'x';
					bottomLeft.setText("x");
					count++;
					turn = true;
					break;
				case 8:
					gameBoard[2][1] = 'x';
					bottomCenter.setText("x");
					count++;
					turn = true;
					break;
				case 9:
					gameBoard[2][2] = 'x';
					bottomRight.setText("x");
					count++;
					turn = true;
					break;

				}
			}

			else if ((gameBoard[1][1]) == '5') {
				gameBoard[1][1] = 'x';
				middleCenter.setText("x");
				count++;
				turn = true;
			}

			else if (((gameBoard[0][0]) == 'x' && (gameBoard[0][1]) == 'x')
					&& (gameBoard[0][2]) == '3') {
				gameBoard[0][2] = 'x';
				topRight.setText("x");
				count++;
				turn = true;
			}

			else if (((gameBoard[0][0]) == 'x' && (gameBoard[1][0]) == 'x')
					&& (gameBoard[2][0]) == '7') {
				gameBoard[2][0] = 'x';
				bottomLeft.setText("x");
				count++;
				turn = true;
			}

			else if (((gameBoard[0][0]) == 'x' && (gameBoard[1][1]) == 'x')
					&& (gameBoard[2][2]) == '9') {
				gameBoard[2][2] = 'x';
				bottomRight.setText("x");
				count++;
				turn = true;
			}

			else if (((gameBoard[0][0]) == 'x' && (gameBoard[2][0]) == 'x')
					&& (gameBoard[1][0]) == '4') {
				gameBoard[1][0] = 'x';
				middleLeft.setText("x");
				count++;
				turn = true;
			}

			else if (((gameBoard[0][0]) == 'x' && (gameBoard[0][2]) == 'x')
					&& (gameBoard[0][1]) == '2') {
				gameBoard[0][1] = 'x';
				topCenter.setText("x");
				count++;
				turn = true;
			}

			else if (((gameBoard[0][0]) == 'x' && (gameBoard[2][2]) == 'x')
					&& (gameBoard[1][1]) == '5') {
				gameBoard[1][1] = 'x';
				middleCenter.setText("x");
				count++;
				turn = true;
			}

			else if (((gameBoard[0][1]) == '0' && (gameBoard[0][2]) == '0')
					&& (gameBoard[0][0]) == '1') {
				gameBoard[0][0] = 'x';
				topLeft.setText("x");
				count++;
				turn = true;
			}

			else if (((gameBoard[0][1]) == 'x' && (gameBoard[1][1]) == 'x')
					&& (gameBoard[2][1]) == '8') {
				gameBoard[2][1] = 'x';
				bottomCenter.setText("x");
				count++;
				turn = true;
			}

			else if (((gameBoard[0][1]) == 'x' && (gameBoard[2][1]) == 'x')
					&& (gameBoard[1][1]) == '5') {
				gameBoard[0][0] = 'x';
				middleCenter.setText("x");
				count++;
				turn = true;
			} else if (((gameBoard[0][2]) == 'x' && (gameBoard[1][1]) == 'x')
					&& (gameBoard[2][0]) == '7') {
				gameBoard[2][0] = 'x';
				bottomLeft.setText("x");
				count++;
				turn = true;
			} else if (((gameBoard[0][2]) == 'x' && (gameBoard[1][2]) == 'x')
					&& (gameBoard[2][2]) == '9') {
				gameBoard[2][2] = 'x';
				bottomRight.setText("x");
				count++;
				turn = true;
			} else if (((gameBoard[0][2]) == 'x' && (gameBoard[2][0]) == 'x')
					&& (gameBoard[1][1]) == '5') {
				gameBoard[1][1] = 'x';
				middleCenter.setText("x");
				count++;
				turn = true;
			} else if (((gameBoard[0][2]) == 'x' && (gameBoard[2][2]) == 'x')
					&& (gameBoard[1][2]) == '6') {
				gameBoard[1][2] = 'x';
				middleRight.setText("x");
				count++;
				turn = true;
			} else if (((gameBoard[1][0]) == 'x' && (gameBoard[2][0]) == 'x')
					&& (gameBoard[0][0]) == '1') {
				gameBoard[0][0] = 'x';
				topLeft.setText("x");
				count++;
				turn = true;
			} else if (((gameBoard[1][0]) == 'x' && (gameBoard[1][1]) == 'x')
					&& (gameBoard[1][2]) == '6') {
				gameBoard[1][2] = 'x';
				middleRight.setText("x");
				count++;
				turn = true;
			} else if (((gameBoard[1][0]) == 'x' && (gameBoard[1][2]) == 'x')
					&& (gameBoard[1][1]) == '5') {
				gameBoard[1][1] = 'x';
				middleCenter.setText("x");
				count++;
				turn = true;
			} else if (((gameBoard[1][1]) == 'x' && (gameBoard[1][2]) == 'x')
					&& (gameBoard[1][0]) == '4') {
				gameBoard[1][0] = 'x';
				middleLeft.setText("x");
				count++;
				turn = true;
			} else if (((gameBoard[1][1]) == 'x' && (gameBoard[2][0]) == 'x')
					&& (gameBoard[0][2]) == '3') {
				gameBoard[0][2] = 'x';
				topRight.setText("x");
				count++;
				turn = true;
			} else if (((gameBoard[1][1]) == 'x' && (gameBoard[2][1]) == 'x')
					&& (gameBoard[0][1]) == '2') {
				gameBoard[0][1] = 'x';
				topCenter.setText("x");
				count++;
				turn = true;
			} else if (((gameBoard[1][1]) == 'x' && (gameBoard[2][2]) == 'x')
					&& (gameBoard[0][0]) == '1') {
				gameBoard[0][0] = 'x';
				topLeft.setText("x");
				count++;
				turn = true;
			} else if (((gameBoard[1][2]) == 'x' && (gameBoard[2][2]) == 'x')
					&& (gameBoard[0][2]) == '3') {
				gameBoard[0][2] = 'x';
				topRight.setText("x");
				count++;
				turn = true;
			} else if (((gameBoard[2][0]) == 'x' && (gameBoard[2][1]) == 'x')
					&& (gameBoard[2][2]) == '9') {
				gameBoard[2][2] = 'x';
				bottomRight.setText("x");
				count++;
				turn = true;
			} else if (((gameBoard[2][0]) == 'x' && (gameBoard[2][2]) == 'x')
					&& (gameBoard[2][1]) == '8') {
				gameBoard[2][1] = 'x';
				bottomCenter.setText("x");
				count++;
				turn = true;
			} else if (((gameBoard[2][1]) == 'x' && (gameBoard[2][2]) == 'x')
					&& (gameBoard[2][0]) == '7') {
				gameBoard[2][0] = 'x';
				bottomLeft.setText("x");
				count++;
				turn = true;
			}

			// AI
			else if (((gameBoard[0][2]) == '0' && (gameBoard[2][2]) == '0'&&(gameBoard[1][0]) == '0' && (gameBoard[2][0]) == '0')
					&& (gameBoard[2][1]) == '8') {
				gameBoard[2][1] = 'x';
				bottomCenter.setText("x");
				count++;
				turn = true;
			}
			
			else if (((gameBoard[0][2]) == '0' && (gameBoard[2][0]) == '0')
					&& (gameBoard[0][1]) == '2') {
				gameBoard[0][1] = 'x';
				topCenter.setText("x");
				count++;
				turn = true;
			}
			else if (((gameBoard[0][0]) == '0' && (gameBoard[0][1]) == '0')
					&& (gameBoard[0][2]) == '3') {
				gameBoard[0][2] = 'x';
				topRight.setText("x");
				count++;
				turn = true;
			}

			else if (((gameBoard[0][0]) == '0' && (gameBoard[1][0]) == '0')
					&& (gameBoard[2][0]) == '7') {
				gameBoard[2][0] = 'x';
				bottomLeft.setText("x");
				count++;
				turn = true;
			}

			else if (((gameBoard[0][0]) == '0' && (gameBoard[1][1]) == '0')
					&& (gameBoard[2][2]) == '9') {
				gameBoard[2][2] = 'x';
				bottomRight.setText("x");
				count++;
				turn = true;
			}

			else if (((gameBoard[0][0]) == '0' && (gameBoard[2][0]) == '0')
					&& (gameBoard[1][0]) == '4') {
				gameBoard[1][0] = 'x';
				middleLeft.setText("x");
				count++;
				turn = true;
			}

			else if (((gameBoard[0][0]) == '0' && (gameBoard[0][2]) == '0')
					&& (gameBoard[0][1]) == '2') {
				gameBoard[0][1] = 'x';
				topCenter.setText("x");
				count++;
				turn = true;
			}

			else if (((gameBoard[0][0]) == '0' && (gameBoard[2][2]) == '0')
					&& (gameBoard[1][1]) == '5') {
				gameBoard[1][1] = 'x';
				middleCenter.setText("x");
				count++;
				turn = true;
			}

			else if (((gameBoard[0][1]) == '0' && (gameBoard[1][1]) == '0')
					&& (gameBoard[2][1]) == '8') {
				gameBoard[2][1] = 'x';
				bottomCenter.setText("x");
				count++;
				turn = true;
			}

			else if (((gameBoard[0][1]) == '0' && (gameBoard[0][2]) == '0')
					&& (gameBoard[0][0]) == '1') {
				gameBoard[0][0] = 'x';
				topLeft.setText("x");
				count++;
				turn = true;
			}

			else if (((gameBoard[0][1]) == '0' && (gameBoard[2][1]) == '0')
					&& (gameBoard[1][1]) == '5') {
				gameBoard[0][0] = 'x';
				middleCenter.setText("x");
				count++;
				turn = true;
			} else if (((gameBoard[0][2]) == '0' && (gameBoard[1][1]) == '0')
					&& (gameBoard[2][0]) == '7') {
				gameBoard[2][0] = 'x';
				bottomLeft.setText("x");
				count++;
				turn = true;
			} else if (((gameBoard[0][2]) == '0' && (gameBoard[1][2]) == '0')
					&& (gameBoard[2][2]) == '9') {
				gameBoard[2][2] = 'x';
				bottomRight.setText("x");
				count++;
				turn = true;
			} else if (((gameBoard[0][2]) == '0' && (gameBoard[2][0]) == '0')
					&& (gameBoard[1][1]) == '5') {
				gameBoard[1][1] = 'x';
				middleCenter.setText("x");
				count++;
				turn = true;
			} else if (((gameBoard[0][2]) == '0' && (gameBoard[2][2]) == '0')
					&& (gameBoard[1][2]) == '6') {
				gameBoard[1][2] = 'x';
				middleRight.setText("x");
				count++;
				turn = true;
			} else if (((gameBoard[1][0]) == '0' && (gameBoard[2][0]) == '0')
					&& (gameBoard[0][0]) == '1') {
				gameBoard[0][0] = 'x';
				topLeft.setText("x");
				count++;
				turn = true;
			} else if (((gameBoard[1][0]) == '0' && (gameBoard[1][1]) == '0')
					&& (gameBoard[1][2]) == '6') {
				gameBoard[1][2] = 'x';
				middleRight.setText("x");
				count++;
				turn = true;
			} else if (((gameBoard[1][0]) == '0' && (gameBoard[1][2]) == '0')
					&& (gameBoard[1][1]) == '5') {
				gameBoard[1][1] = 'x';
				middleCenter.setText("x");
				count++;
				turn = true;
			} else if (((gameBoard[1][1]) == '0' && (gameBoard[1][2]) == '0')
					&& (gameBoard[1][0]) == '4') {
				gameBoard[1][0] = 'x';
				middleLeft.setText("x");
				count++;
				turn = true;
			} else if (((gameBoard[1][1]) == '0' && (gameBoard[2][0]) == '0')
					&& (gameBoard[0][2]) == '3') {
				gameBoard[0][2] = 'x';
				topRight.setText("x");
				count++;
				turn = true;
			} else if (((gameBoard[1][1]) == '0' && (gameBoard[2][1]) == '0')
					&& (gameBoard[0][1]) == '2') {
				gameBoard[0][1] = 'x';
				topCenter.setText("x");
				count++;
				turn = true;
			} else if (((gameBoard[1][1]) == '0' && (gameBoard[2][2]) == '0')
					&& (gameBoard[0][0]) == '1') {
				gameBoard[0][0] = 'x';
				topLeft.setText("x");
				count++;
				turn = true;
			} else if (((gameBoard[1][2]) == '0' && (gameBoard[2][2]) == '0')
					&& (gameBoard[0][2]) == '3') {
				gameBoard[0][2] = 'x';
				topRight.setText("x");
				count++;
				turn = true;
			} else if (((gameBoard[2][0]) == '0' && (gameBoard[2][1]) == '0')
					&& (gameBoard[2][2]) == '9') {
				gameBoard[2][2] = 'x';
				bottomRight.setText("x");
				count++;
				turn = true;
			} else if (((gameBoard[2][0]) == '0' && (gameBoard[2][2]) == '0')
					&& (gameBoard[2][1]) == '8') {
				gameBoard[2][1] = 'x';
				bottomCenter.setText("x");
				count++;
				turn = true;
			} else if (((gameBoard[2][1]) == '0' && (gameBoard[2][2]) == '0')
					&& (gameBoard[2][0]) == '7') {
				gameBoard[2][0] = 'x';
				bottomLeft.setText("x");
				count++;
				turn = true;
			} else if (((gameBoard[0][0]) == '0' && (gameBoard[2][1]) == '0')
					&& (gameBoard[2][0]) == '7') {
				gameBoard[2][0] = 'x';
				bottomLeft.setText("x");
				count++;
				turn = true;
			}

			// AI

			else {
				int counter = 0;
				int x = 0;
				int broke = 0;

				for (int rownum = 0; rownum <= 2; rownum++) {
					for (int colnum = 0; colnum <= 2; colnum++) {
						x = 0;
						counter++;
						x = (int) (gameBoard[rownum][colnum] - '0');
						if (x == counter) {
							setButtonText(rownum, colnum);
							turn = true;
							count++;
							broke = 1;
							break;
						}

					}
					if (broke == 1) {
						break;
					}
				}
			}
			wins = hasWon();

		}
	}

	public static void main(String[] args) {
		TictacAI player = new TictacAI();
		player.play();

	}
	public void clickEvent(int row, int col){
		
		wins = hasWon();
			if (turn == true && wins == 3) {
				
				if (row == 0 && col == 0) {
					if (gameBoard[0][0] == '1') {
							topLeft.setText("0");
							gameBoard[0][0] = '0';
							
					}
				} 
				
				else if (row == 0 && col == 1) {
					if (gameBoard[0][1] == '2') {
							topCenter.setText("0");
							gameBoard[0][1] = '0';
							
					}
				} 
				
				else if (row == 0 && col == 2) {
					if (gameBoard[0][2] == '3') {
							topRight.setText("0");
							gameBoard[0][2] = '0';
							
					}
				} 
				
				else if (row == 1 && col == 0) {
					if (gameBoard[1][0] == '4') {
							middleLeft.setText("0");
							gameBoard[1][0] = '0';
							
					}
				} 
				
				else if (row == 1 && col == 1) {
					if (gameBoard[1][1] == '5') {
							middleCenter.setText("0");
							gameBoard[1][1] = '0';					
												}
				} 
				
				else if (row == 1 && col == 2) {
					if (gameBoard[1][2] == '6') {
							middleRight.setText("0");
							gameBoard[1][2] = '0';
							
					}
				} 
				
				else if (row == 2 && col == 0) {
					if (gameBoard[2][0] == '7') {
							bottomLeft.setText("0");
							gameBoard[2][0] = '0';
							
					}
				}
				
				else if (row == 2 && col == 1) {
					if (gameBoard[2][1] == '8') {
							bottomCenter.setText("0");
							gameBoard[2][1] = '0';					
							
					}
				} 
				else if (row == 2 && col == 2) {
					if (gameBoard[2][2] == '9') {
							bottomRight.setText("0");
							gameBoard[2][2] = '0';
							
					}
				}
			}
			count++;
			turn = false;
			wins = hasWon();
			computerTurn();
			
	}

	public void setButtonText(int row, int col) {
		wins = hasWon();
		if (wins == 3) {

			if (row == 0 && col == 0) {
				topLeft.setText("x");
				gameBoard[0][0] = 'x';
			} else if (row == 0 && col == 1) {
				topCenter.setText("x");
				gameBoard[0][1] = 'x';
			} else if (row == 0 && col == 2) {
				topRight.setText("x");
				gameBoard[0][2] = 'x';
			} else if (row == 1 && col == 0) {
				middleLeft.setText("x");
				gameBoard[1][0] = 'x';
			} else if (row == 1 && col == 1) {
				middleCenter.setText("x");
				gameBoard[1][1] = 'x';
			} else if (row == 1 && col == 2) {
				middleRight.setText("x");
				gameBoard[1][2] = 'x';
			} else if (row == 2 && col == 0) {
				bottomLeft.setText("x");
				gameBoard[2][0] = 'x';
			} else if (row == 2 && col == 1) {
				bottomCenter.setText("x");
				gameBoard[2][1] = 'x';
			} else if (row == 2 && col == 2) {
				bottomRight.setText("x");
				gameBoard[2][2] = 'x';
			}
		}
	}

	public void play()

	{

		showbutton();
	}



}
