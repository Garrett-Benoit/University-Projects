/*		Programmer:		Garrett Benoit
 * 		Project:		Lab 2
 * 		Due Date:		11/20/2015
 * 		Instructor:		Kaye Kussmann
 * 		Description:	Read_Write_Frame.java creates a frame, panel, and gridbag layout creating a GUI for Read.java
 * 						Displays an input dialog to read from a text file
 * 						Reads the text file line by line, word by word
 * 						Counts words, spaces, and individual alphabet characters
 */

package Read_Write_Package;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JCheckBox;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JLabel;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.NoSuchElementException;

public class Read_Write_Frame extends JFrame {
	
	// JLabels
	static JLabel lblWOSpace;
	static JLabel lblWSpace;
	static JLabel lblA;
	static JLabel lblB;
	static JLabel lblC;
	static JLabel lblD;
	static JLabel lblE;
	static JLabel lblF;
	static JLabel lblG;
	static JLabel lblH;
	static JLabel lblI;
	static JLabel lblJ;
	static JLabel lblK;
	static JLabel lblL;
	static JLabel lblM;
	static JLabel lblN;
	static JLabel lblO;
	static JLabel lblP;
	static JLabel lblQ;
	static JLabel lblR;
	static JLabel lblS;
	static JLabel lblT;
	static JLabel lblU;
	static JLabel lblV;
	static JLabel lblW;
	static JLabel lblX;
	static JLabel lblY;
	static JLabel lblZ;
	
	// Check Boxes
	JCheckBox chckbxA;
	JCheckBox chckbxB;
	JCheckBox chckbxC;
	JCheckBox chckbxD;
	JCheckBox chckbxE;
	JCheckBox chckbxF;
	JCheckBox chckbxG;
	JCheckBox chckbxH;
	JCheckBox chckbxI;
	JCheckBox chckbxJ;
	JCheckBox chckbxK;
	JCheckBox chckbxL;
	JCheckBox chckbxM;
	JCheckBox chckbxN;
	JCheckBox chckbxO;
	JCheckBox chckbxP;
	JCheckBox chckbxQ;
	JCheckBox chckbxR;
	JCheckBox chckbxS;
	JCheckBox chckbxT;
	JCheckBox chckbxU;
	JCheckBox chckbxV;
	JCheckBox chckbxW;
	JCheckBox chckbxX;
	JCheckBox chckbxY;
	JCheckBox chckbxZ;
	
	// Local variables
	private JPanel contentPane;
	private static BufferedReader buffer = null;
	private static int wordCount = 0;
	private static int spaceCount = 0;
	private static int alphabetACount = 0;
	private static int alphabetBCount = 0;
	private static int alphabetCCount = 0;
	private static int alphabetDCount = 0;
	private static int alphabetECount = 0;
	private static int alphabetFCount = 0;
	private static int alphabetGCount = 0;
	private static int alphabetHCount = 0;
	private static int alphabetICount = 0;
	private static int alphabetJCount = 0;
	private static int alphabetKCount = 0;
	private static int alphabetLCount = 0;
	private static int alphabetMCount = 0;
	private static int alphabetNCount = 0;
	private static int alphabetOCount = 0;
	private static int alphabetPCount = 0;
	private static int alphabetQCount = 0;
	private static int alphabetRCount = 0;
	private static int alphabetSCount = 0;
	private static int alphabetTCount = 0;
	private static int alphabetUCount = 0;
	private static int alphabetVCount = 0;
	private static int alphabetWCount = 0;
	private static int alphabetXCount = 0;
	private static int alphabetYCount = 0;
	private static int alphabetZCount = 0;
	private static String sentence;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args)
	{		
		EventQueue.invokeLater(new Runnable()
		{
			
			public void run()
			{
				try
				{
					Read_Write_Frame frame = new Read_Write_Frame();
					frame.setVisible(true);
				} catch (Exception e)
				{
					e.printStackTrace();
				}
				
				// Read r = new Read();
				
				try
				{
						// Store a file name input by the user into fileInput
						String fileInput = JOptionPane.showInputDialog("Please enter the file name: ");
						
						// Create buffer and store file name input
						buffer = new BufferedReader(new FileReader(fileInput));
						
						// Check if Ok or Cancel is selected
						if(fileInput != null)
						{
							// Try word and alphabet count, handle error catching
							try
							{
								// Read individual lines and ignore white space
								while ((sentence = buffer.readLine()) != null)
								{
									// Split each sentence by white space and store each word into book variable
									String [] book = sentence.replaceAll("\\s", " ").split(" ");									
									
									// Loop through sentences searching for specific character
									for(int i = 0; i < sentence.length(); i++)
									{
										if (sentence.charAt(i) == 'A' || sentence.charAt(i) == 'a')
										{
											alphabetACount++;
										}
										if (sentence.charAt(i) == 'B' || sentence.charAt(i) == 'b')
										{
											alphabetBCount++;
										}
										if (sentence.charAt(i) == 'C' || sentence.charAt(i) == 'c')
										{
											alphabetCCount++;
										}
										if (sentence.charAt(i) == 'D' || sentence.charAt(i) == 'd')
										{
											alphabetDCount++;
										}
										if (sentence.charAt(i) == 'E' || sentence.charAt(i) == 'e')
										{
											alphabetECount++;
										}
										if (sentence.charAt(i) == 'F' || sentence.charAt(i) == 'f')
										{
											alphabetFCount++;
										}
										if (sentence.charAt(i) == 'G' || sentence.charAt(i) == 'g')
										{
											alphabetGCount++;
										}
										if (sentence.charAt(i) == 'H' || sentence.charAt(i) == 'h')
										{
											alphabetHCount++;
										}
										if (sentence.charAt(i) == 'I' || sentence.charAt(i) == 'i')
										{
											alphabetICount++;
										}
										if (sentence.charAt(i) == 'J' || sentence.charAt(i) == 'j')
										{
											alphabetJCount++;
										}
										if (sentence.charAt(i) == 'K' || sentence.charAt(i) == 'k')
										{
											alphabetKCount++;
										}
										if (sentence.charAt(i) == 'L' || sentence.charAt(i) == 'l')
										{
											alphabetLCount++;
										}
										if (sentence.charAt(i) == 'M' || sentence.charAt(i) == 'm')
										{
											alphabetMCount++;
										}
										if (sentence.charAt(i) == 'N' || sentence.charAt(i) == 'n')
										{
											alphabetNCount++;
										}
										if (sentence.charAt(i) == 'O' || sentence.charAt(i) == 'o')
										{
											alphabetOCount++;
										}
										if (sentence.charAt(i) == 'P' || sentence.charAt(i) == 'p')
										{
											alphabetPCount++;
										}
										if (sentence.charAt(i) == 'Q' || sentence.charAt(i) == 'q')
										{
											alphabetQCount++;
										}
										if (sentence.charAt(i) == 'R' || sentence.charAt(i) == 'r')
										{
											alphabetRCount++;
										}
										if (sentence.charAt(i) == 'S' || sentence.charAt(i) == 's')
										{
											alphabetSCount++;
										}
										if (sentence.charAt(i) == 'T' || sentence.charAt(i) == 't')
										{
											alphabetTCount++;
										}
										if (sentence.charAt(i) == 'U' || sentence.charAt(i) == 'u')
										{
											alphabetUCount++;
										}
										if (sentence.charAt(i) == 'V' || sentence.charAt(i) == 'v')
										{
											alphabetVCount++;
										}
										if (sentence.charAt(i) == 'W' || sentence.charAt(i) == 'w')
										{
											alphabetWCount++;
										}
										if (sentence.charAt(i) == 'X' || sentence.charAt(i) == 'x')
										{
											alphabetXCount++;
										}
										if (sentence.charAt(i) == 'Y' || sentence.charAt(i) == 'y')
										{
											alphabetYCount++;
										}
										if (sentence.charAt(i) == 'Z' || sentence.charAt(i) == 'z')
										{
											alphabetZCount++;
										}
									}
										
									wordCount += book.length;
									
									// Counts number of spaces
									spaceCount = sentence.length() - sentence.replaceAll(" ", "").length();
									
									// Adds space count and word count together
									spaceCount += wordCount;
								}
								
								// Set total wordCount to label
								lblWOSpace.setText(String.valueOf(wordCount));
								
								// Set total spaceCount to label
								lblWSpace.setText(String.valueOf(spaceCount));
								
							}
							catch (NoSuchElementException e)
							{
								System.err.println("File improperly formed: Terminating");
							}
						}
						else
						{
							// If Cancel is selected exit program
							System.out.println("File input cancelled.  Program exiting.");
							System.exit(1);
						}
					
				} catch (IOException ioE)
				{
					System.err.println("Read error: Terminating");
					System.exit(1);
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Read_Write_Frame()
	{
		
		// Set EXIT ON CLOSE operation
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Set bounds of frame
		setBounds(100, 100, 350, 550);
		
		// Create JPanel on frame
		contentPane = new JPanel();
		
		// Set border of JPanel
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		// Create GridBag layout
		GridBagLayout gbl_contentPane = new GridBagLayout();
		
		// Set size for GridBag
		gbl_contentPane.columnWidths = new int[]{25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		
		// Set GridBag as layout for JPanel
		contentPane.setLayout(gbl_contentPane);
		
		// OK button
		Button button = new Button("Ok");
		button.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				Read r = new Read(alphabetACount, alphabetBCount, alphabetCCount, alphabetDCount, alphabetECount, alphabetFCount, alphabetGCount, alphabetHCount, alphabetICount, alphabetJCount, alphabetKCount, alphabetLCount, alphabetMCount, alphabetNCount, alphabetOCount, alphabetPCount, alphabetQCount, alphabetRCount, alphabetSCount, alphabetTCount, alphabetUCount, alphabetVCount, alphabetWCount, alphabetXCount, alphabetYCount, alphabetZCount);
					
				if (chckbxA.isSelected() == true)
				{
					r.setLblA(String.valueOf(alphabetACount));
				}
				else
				{
					lblA.setText(" ");
				}
				
				if (chckbxB.isSelected() == true)
				{
					r.setLblB(String.valueOf(alphabetBCount));
				}
				else
				{
					lblB.setText(" ");
				}
				
				if (chckbxC.isSelected() == true)
				{
					r.setLblC(String.valueOf(alphabetCCount));
				}
				else
				{
					lblC.setText(" ");
				}
						
				if (chckbxD.isSelected() == true)
				{
					r.setLblD(String.valueOf(alphabetDCount));
				}
				else
				{
					lblD.setText(" ");
				}
					
				if (chckbxE.isSelected() == true)
				{
					r.setLblE(String.valueOf(alphabetECount));
				}
				else
				{
					lblE.setText(" ");
				}
				
				if (chckbxF.isSelected() == true)
				{
					r.setLblF(String.valueOf(alphabetFCount));
				}
				else
				{
					lblF.setText(" ");
				}
				
				if (chckbxG.isSelected() == true)
				{
					r.setLblG(String.valueOf(alphabetGCount));
				}
				else
				{
					lblG.setText(" ");
				}
						
				if (chckbxH.isSelected() == true)
				{
					r.setLblH(String.valueOf(alphabetHCount));
				}
				else
				{
					lblH.setText(" ");
				}
					
				if (chckbxI.isSelected() == true)
				{
					r.setLblI(String.valueOf(alphabetICount));
				}
				else
				{
					lblI.setText(" ");
				}
				
				if (chckbxJ.isSelected() == true)
				{
					r.setLblJ(String.valueOf(alphabetJCount));
				}
				else
				{
					lblJ.setText(" ");
				}
				
				if (chckbxK.isSelected() == true)
				{
					r.setLblK(String.valueOf(alphabetKCount));
				}
				else
				{
					lblK.setText(" ");
				}
						
				if (chckbxL.isSelected() == true)
				{
					r.setLblL(String.valueOf(alphabetLCount));
				}
				else
				{
					lblL.setText(" ");
				}
					
				if (chckbxM.isSelected() == true)
				{
					r.setLblM(String.valueOf(alphabetMCount));
				}
				else
				{
					lblM.setText(" ");
				}
				
				if (chckbxN.isSelected() == true)
				{
					r.setLblN(String.valueOf(alphabetNCount));
				}
				else
				{
					lblN.setText(" ");
				}
				
				if (chckbxO.isSelected() == true)
				{
					r.setLblO(String.valueOf(alphabetOCount));
				}
				else
				{
					lblO.setText(" ");
				}
				
				if (chckbxP.isSelected() == true)
				{
					r.setLblP(String.valueOf(alphabetPCount));
				}
				else
				{
					lblP.setText(" ");
				}
						
				if (chckbxQ.isSelected() == true)
				{
					r.setLblQ(String.valueOf(alphabetQCount));
				}
				else
				{
					lblQ.setText(" ");
				}
					
				if (chckbxR.isSelected() == true)
				{
					r.setLblR(String.valueOf(alphabetRCount));
				}
				else
				{
					lblR.setText(" ");
				}
				
				if (chckbxS.isSelected() == true)
				{
					r.setLblS(String.valueOf(alphabetSCount));
				}
				else
				{
					lblS.setText(" ");
				}
				
				if (chckbxT.isSelected() == true)
				{
					r.setLblT(String.valueOf(alphabetTCount));
				}
				else
				{
					lblT.setText(" ");
				}
						
				if (chckbxU.isSelected() == true)
				{
					r.setLblU(String.valueOf(alphabetUCount));
				}
				else
				{
					lblU.setText(" ");
				}
					
				if (chckbxV.isSelected() == true)
				{
					r.setLblV(String.valueOf(alphabetVCount));
				}
				else
				{
					lblV.setText(" ");
				}
				
				if (chckbxW.isSelected() == true)
				{
					r.setLblW(String.valueOf(alphabetWCount));
				}
				else
				{
					lblW.setText(" ");
				}
				
				if (chckbxX.isSelected() == true)
				{
					r.setLblX(String.valueOf(alphabetXCount));
				}
				else
				{
					lblX.setText(" ");
				}
						
				if (chckbxY.isSelected() == true)
				{
					r.setLblY(String.valueOf(alphabetYCount));
				}
				else
				{
					lblY.setText(" ");
				}
					
				if (chckbxZ.isSelected() == true)
				{
					r.setLblZ(String.valueOf(alphabetZCount));
				}
				else
				{
					lblZ.setText(" ");
				}
			}
		});
		
		// Clear button
		Button button_2 = new Button("Clear");
		button_2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				chckbxA.setSelected(false);
				lblA.setText(" ");
				chckbxB.setSelected(false);
				lblB.setText(" ");
				chckbxC.setSelected(false);
				lblC.setText(" ");
				chckbxD.setSelected(false);
				lblD.setText(" ");
				chckbxE.setSelected(false);
				lblE.setText(" ");
				chckbxF.setSelected(false);
				lblF.setText(" ");
				chckbxG.setSelected(false);
				lblG.setText(" ");
				chckbxH.setSelected(false);
				lblH.setText(" ");
				chckbxI.setSelected(false);
				lblI.setText(" ");
				chckbxJ.setSelected(false);
				lblJ.setText(" ");
				chckbxK.setSelected(false);
				lblK.setText(" ");
				chckbxL.setSelected(false);
				lblL.setText(" ");
				chckbxM.setSelected(false);
				lblM.setText(" ");
				chckbxN.setSelected(false);
				lblN.setText(" ");
				chckbxO.setSelected(false);
				lblO.setText(" ");
				chckbxP.setSelected(false);
				lblP.setText(" ");
				chckbxQ.setSelected(false);
				lblQ.setText(" ");
				chckbxR.setSelected(false);
				lblR.setText(" ");
				chckbxS.setSelected(false);
				lblS.setText(" ");
				chckbxT.setSelected(false);
				lblT.setText(" ");
				chckbxU.setSelected(false);
				lblU.setText(" ");
				chckbxV.setSelected(false);
				lblV.setText(" ");
				chckbxW.setSelected(false);
				lblW.setText(" ");
				chckbxX.setSelected(false);
				lblX.setText(" ");
				chckbxY.setSelected(false);
				lblY.setText(" ");
				chckbxZ.setSelected(false);
				lblZ.setText(" ");
			}
		});
			
		GridBagConstraints gbc_button_2 = new GridBagConstraints();
		gbc_button_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_button_2.gridwidth = 4;
		gbc_button_2.insets = new Insets(0, 0, 5, 5);
		gbc_button_2.gridx = 6;
		gbc_button_2.gridy = 11;
		contentPane.add(button_2, gbc_button_2);
				
		GridBagConstraints gbc_button = new GridBagConstraints();
		gbc_button.fill = GridBagConstraints.HORIZONTAL;
		gbc_button.gridwidth = 4;
		gbc_button.insets = new Insets(0, 0, 5, 5);
		gbc_button.gridx = 6;
		gbc_button.gridy = 9;
		contentPane.add(button, gbc_button);
				
		// JLabel: Word count without spaces
		JLabel lblWordCountWithout = new JLabel("Word count without spaces: ");
		GridBagConstraints gbc_lblWordCountWithout = new GridBagConstraints();
		gbc_lblWordCountWithout.anchor = GridBagConstraints.EAST;
		gbc_lblWordCountWithout.gridwidth = 4;
		gbc_lblWordCountWithout.insets = new Insets(0, 0, 5, 5);
		gbc_lblWordCountWithout.gridx = 2;
		gbc_lblWordCountWithout.gridy = 1;
		contentPane.add(lblWordCountWithout, gbc_lblWordCountWithout);
		
		// lblWOSpace
		lblWOSpace = new JLabel(" ");
		GridBagConstraints gbc_lblWOSpace = new GridBagConstraints();
		gbc_lblWOSpace.anchor = GridBagConstraints.WEST;
		gbc_lblWOSpace.gridwidth = 3;
		gbc_lblWOSpace.insets = new Insets(0, 0, 5, 5);
		gbc_lblWOSpace.gridx = 6;
		gbc_lblWOSpace.gridy = 1;
		contentPane.add(lblWOSpace, gbc_lblWOSpace);
		
		// JLabel: Word count with spaces
		JLabel lblWordCountWith = new JLabel("Word count with spaces: ");
		GridBagConstraints gbc_lblWordCountWith = new GridBagConstraints();
		gbc_lblWordCountWith.anchor = GridBagConstraints.EAST;
		gbc_lblWordCountWith.gridwidth = 4;
		gbc_lblWordCountWith.insets = new Insets(0, 0, 5, 5);
		gbc_lblWordCountWith.gridx = 2;
		gbc_lblWordCountWith.gridy = 3;
		contentPane.add(lblWordCountWith, gbc_lblWordCountWith);
		
		// lblWSpace
		lblWSpace = new JLabel(" ");
		GridBagConstraints gbc_lblWSpace = new GridBagConstraints();
		gbc_lblWSpace.anchor = GridBagConstraints.WEST;
		gbc_lblWSpace.gridwidth = 3;
		gbc_lblWSpace.insets = new Insets(0, 0, 5, 5);
		gbc_lblWSpace.gridx = 6;
		gbc_lblWSpace.gridy = 3;
		contentPane.add(lblWSpace, gbc_lblWSpace);
		
		// ChxBx A
		chckbxA = new JCheckBox("A");
		GridBagConstraints gbc_chckbxA = new GridBagConstraints();
		gbc_chckbxA.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxA.gridx = 1;
		gbc_chckbxA.gridy = 5;
		contentPane.add(chckbxA, gbc_chckbxA);
		
		// lblA
		lblA = new JLabel(" ");
		GridBagConstraints gbc_lblA = new GridBagConstraints();
		gbc_lblA.insets = new Insets(0, 0, 5, 5);
		gbc_lblA.gridx = 2;
		gbc_lblA.gridy = 5;
		contentPane.add(lblA, gbc_lblA);
		
		// ChxBx N
		chckbxN = new JCheckBox("N");
		GridBagConstraints gbc_chckbxN = new GridBagConstraints();
		gbc_chckbxN.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxN.gridx = 4;
		gbc_chckbxN.gridy = 5;
		contentPane.add(chckbxN, gbc_chckbxN);
		
		// lblN
		lblN = new JLabel(" ");
		GridBagConstraints gbc_lblN = new GridBagConstraints();
		gbc_lblN.insets = new Insets(0, 0, 5, 5);
		gbc_lblN.gridx = 5;
		gbc_lblN.gridy = 5;
		contentPane.add(lblN, gbc_lblN);
		
		// ChxBx B
		chckbxB = new JCheckBox("B");
		GridBagConstraints gbc_chckbxB = new GridBagConstraints();
		gbc_chckbxB.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxB.gridx = 1;
		gbc_chckbxB.gridy = 6;
		contentPane.add(chckbxB, gbc_chckbxB);
		
		// lblB
		lblB = new JLabel(" ");
		GridBagConstraints gbc_lblB = new GridBagConstraints();
		gbc_lblB.insets = new Insets(0, 0, 5, 5);
		gbc_lblB.gridx = 2;
		gbc_lblB.gridy = 6;
		contentPane.add(lblB, gbc_lblB);
		
		// ChxBx O
		chckbxO = new JCheckBox("O");
		GridBagConstraints gbc_chckbxO = new GridBagConstraints();
		gbc_chckbxO.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxO.gridx = 4;
		gbc_chckbxO.gridy = 6;
		contentPane.add(chckbxO, gbc_chckbxO);
		
		// lblO
		lblO = new JLabel(" ");
		GridBagConstraints gbc_lblO = new GridBagConstraints();
		gbc_lblO.insets = new Insets(0, 0, 5, 5);
		gbc_lblO.gridx = 5;
		gbc_lblO.gridy = 6;
		contentPane.add(lblO, gbc_lblO);
		
		// ChxBx C
		chckbxC = new JCheckBox("C");
		GridBagConstraints gbc_chckbxC = new GridBagConstraints();
		gbc_chckbxC.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxC.gridx = 1;
		gbc_chckbxC.gridy = 7;
		contentPane.add(chckbxC, gbc_chckbxC);
		
		// lblC
		lblC = new JLabel(" ");
		GridBagConstraints gbc_lblC = new GridBagConstraints();
		gbc_lblC.insets = new Insets(0, 0, 5, 5);
		gbc_lblC.gridx = 2;
		gbc_lblC.gridy = 7;
		contentPane.add(lblC, gbc_lblC);
		
		// ChxBx P
		chckbxP = new JCheckBox("P");
		GridBagConstraints gbc_chckbxP = new GridBagConstraints();
		gbc_chckbxP.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxP.gridx = 4;
		gbc_chckbxP.gridy = 7;
		contentPane.add(chckbxP, gbc_chckbxP);
		
		// lblP
		lblP = new JLabel(" ");
		GridBagConstraints gbc_lblP = new GridBagConstraints();
		gbc_lblP.insets = new Insets(0, 0, 5, 5);
		gbc_lblP.gridx = 5;
		gbc_lblP.gridy = 7;
		contentPane.add(lblP, gbc_lblP);
		
		// ChxBx D
		chckbxD = new JCheckBox("D");
		GridBagConstraints gbc_chckbxD = new GridBagConstraints();
		gbc_chckbxD.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxD.gridx = 1;
		gbc_chckbxD.gridy = 8;
		contentPane.add(chckbxD, gbc_chckbxD);
		
		// lblD
		lblD = new JLabel(" ");
		GridBagConstraints gbc_lblD = new GridBagConstraints();
		gbc_lblD.insets = new Insets(0, 0, 5, 5);
		gbc_lblD.gridx = 2;
		gbc_lblD.gridy = 8;
		contentPane.add(lblD, gbc_lblD);
		
		// ChxBx Q
		chckbxQ = new JCheckBox("Q");
		GridBagConstraints gbc_chckbxQ = new GridBagConstraints();
		gbc_chckbxQ.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxQ.gridx = 4;
		gbc_chckbxQ.gridy = 8;
		contentPane.add(chckbxQ, gbc_chckbxQ);
		
		// lblQ
		lblQ = new JLabel(" ");
		GridBagConstraints gbc_lblQ = new GridBagConstraints();
		gbc_lblQ.insets = new Insets(0, 0, 5, 5);
		gbc_lblQ.gridx = 5;
		gbc_lblQ.gridy = 8;
		contentPane.add(lblQ, gbc_lblQ);
		
		
		// ChxBx E
		chckbxE = new JCheckBox("E");
		GridBagConstraints gbc_chckbxE = new GridBagConstraints();
		gbc_chckbxE.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxE.gridx = 1;
		gbc_chckbxE.gridy = 9;
		contentPane.add(chckbxE, gbc_chckbxE);
		
		// lblE
		lblE = new JLabel(" ");
		GridBagConstraints gbc_lblE = new GridBagConstraints();
		gbc_lblE.insets = new Insets(0, 0, 5, 5);
		gbc_lblE.gridx = 2;
		gbc_lblE.gridy = 9;
		contentPane.add(lblE, gbc_lblE);
		
		// ChxBx R
		chckbxR = new JCheckBox("R");
		GridBagConstraints gbc_chckbxR = new GridBagConstraints();
		gbc_chckbxR.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxR.gridx = 4;
		gbc_chckbxR.gridy = 9;
		contentPane.add(chckbxR, gbc_chckbxR);
		
		// lblR
		lblR = new JLabel(" ");
		GridBagConstraints gbc_lblR = new GridBagConstraints();
		gbc_lblR.insets = new Insets(0, 0, 5, 5);
		gbc_lblR.gridx = 5;
		gbc_lblR.gridy = 9;
		contentPane.add(lblR, gbc_lblR);
		
		// ChxBx F
		chckbxF = new JCheckBox("F");
		GridBagConstraints gbc_chckbxF = new GridBagConstraints();
		gbc_chckbxF.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxF.gridx = 1;
		gbc_chckbxF.gridy = 10;
		contentPane.add(chckbxF, gbc_chckbxF);
		
		// lblF
		lblF = new JLabel(" ");
		GridBagConstraints gbc_lblF = new GridBagConstraints();
		gbc_lblF.insets = new Insets(0, 0, 5, 5);
		gbc_lblF.gridx = 2;
		gbc_lblF.gridy = 10;
		contentPane.add(lblF, gbc_lblF);
		
		// ChxBx S
		chckbxS = new JCheckBox("S");
		GridBagConstraints gbc_chckbxS = new GridBagConstraints();
		gbc_chckbxS.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxS.gridx = 4;
		gbc_chckbxS.gridy = 10;
		contentPane.add(chckbxS, gbc_chckbxS);
		
		// lblS
		lblS = new JLabel(" ");
		GridBagConstraints gbc_lblS = new GridBagConstraints();
		gbc_lblS.insets = new Insets(0, 0, 5, 5);
		gbc_lblS.gridx = 5;
		gbc_lblS.gridy = 10;
		contentPane.add(lblS, gbc_lblS);
		
		// ChxBx G
		chckbxG = new JCheckBox("G");
		GridBagConstraints gbc_chckbxG = new GridBagConstraints();
		gbc_chckbxG.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxG.gridx = 1;
		gbc_chckbxG.gridy = 11;
		contentPane.add(chckbxG, gbc_chckbxG);
		
		// lblG
		lblG = new JLabel(" ");
		GridBagConstraints gbc_lblG = new GridBagConstraints();
		gbc_lblG.insets = new Insets(0, 0, 5, 5);
		gbc_lblG.gridx = 2;
		gbc_lblG.gridy = 11;
		contentPane.add(lblG, gbc_lblG);
		
		// ChxBx T
		chckbxT = new JCheckBox("T");
		GridBagConstraints gbc_chckbxT = new GridBagConstraints();
		gbc_chckbxT.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxT.gridx = 4;
		gbc_chckbxT.gridy = 11;
		contentPane.add(chckbxT, gbc_chckbxT);
		
		// lblT
		lblT = new JLabel(" ");
		GridBagConstraints gbc_lblT = new GridBagConstraints();
		gbc_lblT.insets = new Insets(0, 0, 5, 5);
		gbc_lblT.gridx = 5;
		gbc_lblT.gridy = 11;
		contentPane.add(lblT, gbc_lblT);
		
		// ChxBx H
		chckbxH = new JCheckBox("H");
		GridBagConstraints gbc_chckbxH = new GridBagConstraints();
		gbc_chckbxH.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxH.gridx = 1;
		gbc_chckbxH.gridy = 12;
		contentPane.add(chckbxH, gbc_chckbxH);
		
		// lblH
		lblH = new JLabel(" ");
		GridBagConstraints gbc_lblH = new GridBagConstraints();
		gbc_lblH.insets = new Insets(0, 0, 5, 5);
		gbc_lblH.gridx = 2;
		gbc_lblH.gridy = 12;
		contentPane.add(lblH, gbc_lblH);
		
		// ChxBx U
		chckbxU = new JCheckBox("U");
		GridBagConstraints gbc_chckbxU = new GridBagConstraints();
		gbc_chckbxU.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxU.gridx = 4;
		gbc_chckbxU.gridy = 12;
		contentPane.add(chckbxU, gbc_chckbxU);
		
		// lblU
		lblU = new JLabel(" ");
		GridBagConstraints gbc_lblU = new GridBagConstraints();
		gbc_lblU.insets = new Insets(0, 0, 5, 5);
		gbc_lblU.gridx = 5;
		gbc_lblU.gridy = 12;
		contentPane.add(lblU, gbc_lblU);
		
		// ChxBx I
		chckbxI = new JCheckBox("I");
		GridBagConstraints gbc_chckbxI = new GridBagConstraints();
		gbc_chckbxI.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxI.gridx = 1;
		gbc_chckbxI.gridy = 13;
		contentPane.add(chckbxI, gbc_chckbxI);
		
		// lblI
		lblI = new JLabel(" ");
		GridBagConstraints gbc_lblI = new GridBagConstraints();
		gbc_lblI.insets = new Insets(0, 0, 5, 5);
		gbc_lblI.gridx = 2;
		gbc_lblI.gridy = 13;
		contentPane.add(lblI, gbc_lblI);
		
		// ChxBx V
		chckbxV = new JCheckBox("V");
		GridBagConstraints gbc_chckbxV = new GridBagConstraints();
		gbc_chckbxV.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxV.gridx = 4;
		gbc_chckbxV.gridy = 13;
		contentPane.add(chckbxV, gbc_chckbxV);
		
		// lblV
		lblV = new JLabel(" ");
		GridBagConstraints gbc_lblV = new GridBagConstraints();
		gbc_lblV.insets = new Insets(0, 0, 5, 5);
		gbc_lblV.gridx = 5;
		gbc_lblV.gridy = 13;
		contentPane.add(lblV, gbc_lblV);
		
		// Close button
		Button button_1 = new Button("Close");
		button_1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				// Exit program
				System.exit(0);
			}
		});
		
		GridBagConstraints gbc_button_1 = new GridBagConstraints();
		gbc_button_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_button_1.gridwidth = 4;
		gbc_button_1.insets = new Insets(0, 0, 5, 5);
		gbc_button_1.gridx = 6;
		gbc_button_1.gridy = 13;
		contentPane.add(button_1, gbc_button_1);
		
		// ChxBx J
		chckbxJ = new JCheckBox("J");
		GridBagConstraints gbc_chckbxJ = new GridBagConstraints();
		gbc_chckbxJ.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxJ.gridx = 1;
		gbc_chckbxJ.gridy = 14;
		contentPane.add(chckbxJ, gbc_chckbxJ);
		
		// lblJ
		lblJ = new JLabel(" ");
		GridBagConstraints gbc_lblJ = new GridBagConstraints();
		gbc_lblJ.insets = new Insets(0, 0, 5, 5);
		gbc_lblJ.gridx = 2;
		gbc_lblJ.gridy = 14;
		contentPane.add(lblJ, gbc_lblJ);
		
		// ChxBx W
		chckbxW = new JCheckBox("W");
		GridBagConstraints gbc_chckbxW = new GridBagConstraints();
		gbc_chckbxW.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxW.gridx = 4;
		gbc_chckbxW.gridy = 14;
		contentPane.add(chckbxW, gbc_chckbxW);
		
		// lblW
		lblW = new JLabel(" ");
		GridBagConstraints gbc_lblW = new GridBagConstraints();
		gbc_lblW.insets = new Insets(0, 0, 5, 5);
		gbc_lblW.gridx = 5;
		gbc_lblW.gridy = 14;
		contentPane.add(lblW, gbc_lblW);
		
		// ChxBx K
		chckbxK = new JCheckBox("K");
		GridBagConstraints gbc_chckbxK = new GridBagConstraints();
		gbc_chckbxK.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxK.gridx = 1;
		gbc_chckbxK.gridy = 15;
		contentPane.add(chckbxK, gbc_chckbxK);
		
		// lblK
		lblK = new JLabel(" ");
		GridBagConstraints gbc_lblK = new GridBagConstraints();
		gbc_lblK.insets = new Insets(0, 0, 5, 5);
		gbc_lblK.gridx = 2;
		gbc_lblK.gridy = 15;
		contentPane.add(lblK, gbc_lblK);
		
		// ChxBx X
		chckbxX = new JCheckBox("X");
		GridBagConstraints gbc_chckbxX = new GridBagConstraints();
		gbc_chckbxX.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxX.gridx = 4;
		gbc_chckbxX.gridy = 15;
		contentPane.add(chckbxX, gbc_chckbxX);
		
		// lblX
		lblX = new JLabel(" ");
		GridBagConstraints gbc_lblX = new GridBagConstraints();
		gbc_lblX.insets = new Insets(0, 0, 5, 5);
		gbc_lblX.gridx = 5;
		gbc_lblX.gridy = 15;
		contentPane.add(lblX, gbc_lblX);
		
		// ChxBx L
		chckbxL = new JCheckBox("L");
		GridBagConstraints gbc_chckbxL = new GridBagConstraints();
		gbc_chckbxL.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxL.gridx = 1;
		gbc_chckbxL.gridy = 16;
		contentPane.add(chckbxL, gbc_chckbxL);
		
		// lblL
		lblL = new JLabel(" ");
		GridBagConstraints gbc_lblL = new GridBagConstraints();
		gbc_lblL.insets = new Insets(0, 0, 5, 5);
		gbc_lblL.gridx = 2;
		gbc_lblL.gridy = 16;
		contentPane.add(lblL, gbc_lblL);
		
		// ChxBx Y
		chckbxY = new JCheckBox("Y");
		GridBagConstraints gbc_chckbxY = new GridBagConstraints();
		gbc_chckbxY.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxY.gridx = 4;
		gbc_chckbxY.gridy = 16;
		contentPane.add(chckbxY, gbc_chckbxY);
		
		// lblY
		lblY = new JLabel(" ");
		GridBagConstraints gbc_lblY = new GridBagConstraints();
		gbc_lblY.insets = new Insets(0, 0, 5, 5);
		gbc_lblY.gridx = 5;
		gbc_lblY.gridy = 16;
		contentPane.add(lblY, gbc_lblY);
		
		// ChxBx M
		chckbxM = new JCheckBox("M");
		GridBagConstraints gbc_chckbxM = new GridBagConstraints();
		gbc_chckbxM.insets = new Insets(0, 0, 0, 5);
		gbc_chckbxM.gridx = 1;
		gbc_chckbxM.gridy = 17;
		contentPane.add(chckbxM, gbc_chckbxM);
		
		// lblM
		lblM = new JLabel(" ");
		GridBagConstraints gbc_lblM = new GridBagConstraints();
		gbc_lblM.insets = new Insets(0, 0, 0, 5);
		gbc_lblM.gridx = 2;
		gbc_lblM.gridy = 17;
		contentPane.add(lblM, gbc_lblM);
		
		// ChxBx Z
		chckbxZ = new JCheckBox("Z");
		GridBagConstraints gbc_chckbxZ = new GridBagConstraints();
		gbc_chckbxZ.insets = new Insets(0, 0, 0, 5);
		gbc_chckbxZ.gridx = 4;
		gbc_chckbxZ.gridy = 17;
		contentPane.add(chckbxZ, gbc_chckbxZ);
		
		// lblZ
		lblZ = new JLabel(" ");
		GridBagConstraints gbc_lblZ = new GridBagConstraints();
		gbc_lblZ.insets = new Insets(0, 0, 0, 5);
		gbc_lblZ.gridx = 5;
		gbc_lblZ.gridy = 17;
		contentPane.add(lblZ, gbc_lblZ);
	}
	
}
