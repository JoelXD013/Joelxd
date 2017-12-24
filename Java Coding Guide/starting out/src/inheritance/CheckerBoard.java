package inheritance;

public class CheckerBoard {
	CheckerPieces [][] checkerboard;
	
	int size;
	boolean player1;
	boolean player2;
	
	public CheckerBoard() {
		checkerboard = new CheckerPieces [8][8];
		size = 8;
		
		checkerboard[0][0] = new Empty();
		checkerboard[0][1] = new Black();
		checkerboard[0][2] = new Empty();
		checkerboard[0][3] = new Black();
		checkerboard[0][4] = new Empty();
		checkerboard[0][5] = new Black();
		checkerboard[0][6] = new Empty();
		checkerboard[0][7] = new Black();
		
		checkerboard[1][0] = new Black();
		checkerboard[1][1] = new Empty();
		checkerboard[1][2] = new Black();
		checkerboard[1][3] = new Empty();
		checkerboard[1][4] = new Black();
		checkerboard[1][5] = new Empty();
		checkerboard[1][6] = new Black();
		checkerboard[1][7] = new Empty();
		
		checkerboard[2][0] = new Empty();
		checkerboard[2][1] = new Black();
		checkerboard[2][2] = new Empty();
		checkerboard[2][3] = new Black();
		checkerboard[2][4] = new Empty();
		checkerboard[2][5] = new Black();
		checkerboard[2][6] = new Empty();
		checkerboard[2][7] = new Black();
		
		checkerboard[3][0] = new Empty();
		checkerboard[3][1] = new Empty();
		checkerboard[3][2] = new Empty();
		checkerboard[3][3] = new Empty();
		checkerboard[3][4] = new Empty();
		checkerboard[3][5] = new Empty();
		checkerboard[3][6] = new Empty();
		checkerboard[3][7] = new Empty();
		
		checkerboard[4][0] = new Empty();
		checkerboard[4][1] = new Empty();
		checkerboard[4][2] = new Empty();
		checkerboard[4][3] = new Empty();
		checkerboard[4][4] = new Empty();
		checkerboard[4][5] = new Empty();
		checkerboard[4][6] = new Empty();
		checkerboard[4][7] = new Empty();
		
		checkerboard[5][0] = new Red();
		checkerboard[5][1] = new Empty();
		checkerboard[5][2] = new Red();
		checkerboard[5][3] = new Empty();
		checkerboard[5][4] = new Red();
		checkerboard[5][5] = new Empty();
		checkerboard[5][6] = new Red();
		checkerboard[5][7] = new Empty();
		
		checkerboard[6][0] = new Empty();
		checkerboard[6][1] = new Red();
		checkerboard[6][2] = new Empty();
		checkerboard[6][3] = new Red();
		checkerboard[6][4] = new Empty();
		checkerboard[6][5] = new Red();
		checkerboard[6][6] = new Empty();
		checkerboard[6][7] = new Red();
		
		checkerboard[7][0] = new Red();
		checkerboard[7][1] = new Empty();
		checkerboard[7][2] = new Red();
		checkerboard[7][3] = new Empty();
		checkerboard[7][4] = new Red();
		checkerboard[7][5] = new Empty();
		checkerboard[7][6] = new Red();
		checkerboard[7][7] = new Empty();
	}
	
	public void print() {
		for(int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++)
				System.out.print(checkerboard[i][j].getSym());
			System.out.println();
		}
		
	}
	
	public static void main(String[] args) {
		
		CheckerBoard b = new CheckerBoard();
		b.print();
		
		System.out.println();
		b.checkerboard[7][7].setSym('T');
		
		b.print();
		
	}
}
