package sudoku_game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SudokuDisplay extends JPanel {

	int cellSize = 50;
	int divider = 3;
	int x_offset = 100;
	int y_offset = 100;
	Font assignFont = new Font("Arial", 1, 40);
	
	SudokuGame game;
	
	public SudokuDisplay(SudokuGame game) {
		this.game = game;
		this.repaint();
		
		this.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
			}
		});
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		g.setFont(assignFont);
		
		int x;
		int y = y_offset;
		int gameNumber = game.getGameNumber();
		int num = (int)Math.sqrt(gameNumber);
		
		for(int row = 0; row < gameNumber; row++) {
			x = x_offset;
			
			for(int column = 0; column < gameNumber; column++) {
				
				g.drawRect(x, y, cellSize, cellSize);
				
				int value = game.getValue(row, column);
				
				if (value > 0) {
					g.setColor(Color.black);
					g.drawString("" + game.getValue(row, column), x + 10, y + 40);
				} else {
					g.setColor(Color.red);
					g.drawString("" + game.getConstrainedValue(row, column), x + 10, y + 40);
				}
				
				x += cellSize;
			}
			
			y += cellSize;
		}
		
		int length = cellSize * gameNumber;
		
		for(int div = 1; div < num; div++) {
			g.fillRect(x_offset, y_offset + div * num * cellSize, length, divider);
			g.fillRect(x_offset + div * num * cellSize, y_offset, divider, length);
		}
	}
}
