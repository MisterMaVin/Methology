package net.atgame.lecture.board;

import java.io.IOException;

public class BoardExcuter {

	public static void main(String[] args) throws IOException {
		// 1. Board ����
		final int iContentLength = 20;
		char[][] board = new char[10][iContentLength];
		int iCurrentIndex = 0;
		int iSearchIndex = -1;
		char[] aryUserInput = new char[10];
		char tempUserInput;
		boolean isSame = true;
		int iCount = 0;
		
		// 2. �λ縻 ���
		System.out.print('��');
		System.out.print('��');
		System.out.print('��');
		System.out.print('��');
		System.out.print('��');
		System.out.print('\r');
		System.out.print('\n');
		
		while (true)
		{
			// 3. �޴� ���
			System.out.print('��');
			System.out.print('��');
			System.out.print('\r');
			System.out.print('\n');
			System.out.print('R');
			System.out.print(':');
			System.out.print('��');
			System.out.print('��');
			System.out.print('\r');
			System.out.print('\n');
			System.out.print('L');
			System.out.print(':');
			System.out.print('��');
			System.out.print('��');
			System.out.print('\r');
			System.out.print('\n');
			System.out.print('E');
			System.out.print(':');
			System.out.print('��');
			System.out.print('��');
			System.out.print('\r');
			System.out.print('\n');
			System.out.print('D');
			System.out.print(':');
			System.out.print('��');
			System.out.print('��');
			System.out.print('\r');
			System.out.print('\n');
			System.out.print('Q');
			System.out.print(':');
			System.out.print('��');
			System.out.print('��');
			System.out.print('\r');
			System.out.print('\n');
			System.out.print('��');
			System.out.print('��');
			System.out.print(':');
			
			// 4. ����� ����
			char cUserInput = (char) System.in.read();
			System.in.read();
			System.in.read();
			
			// 5. �޴� �б�
			switch (cUserInput)
			{
			case 'R' :
				System.out.print('��');
				System.out.print('��');
				System.out.print('\r');
				System.out.print('\n');
				System.out.print('��');
				System.out.print('��');
				System.out.print(':');
				
				for (int i = 0; i < iContentLength; i++)
				{
					tempUserInput = (char) System.in.read();
					if ( '\r' == tempUserInput )
					{
						System.in.read();
						board[iCurrentIndex][i] = '\0';
						break;
					}
					board[iCurrentIndex][i] = tempUserInput;
				}
				
				iCurrentIndex++;
				
				System.out.print('��');
				System.out.print('��');
				System.out.print('��');
				System.out.print('��');
				System.out.print('��');
				System.out.print('��');
				System.out.print('��');
				System.out.print('.');
				System.out.print('\r');
				System.out.print('\n');
				
				break;
			case 'L' :
				System.out.print('��');
				System.out.print('��');
				System.out.print('\r');
				System.out.print('\n');

				for (int i = 0; i < iCurrentIndex; i++)
				{
					isSame = true;
					for (int j = 0; j < iContentLength; j++)
					{
						if ( '\0' == board[i][j] )
						{
							break;
						}
						System.out.print(board[i][j]);
					}
					System.out.print('\r');
					System.out.print('\n');
				}
				
				break;
			case 'S' :
				System.out.print('��');
				System.out.print('��');
				System.out.print('\r');
				System.out.print('\n');
				System.out.print('ã');
				System.out.print('��');
				System.out.print('��');
				System.out.print('��');
				System.out.print(':');
				
				for (int i = 0; i < iContentLength; i++)
				{
					tempUserInput = (char) System.in.read();
					if ( '\r' == tempUserInput )
					{
						System.in.read();
						aryUserInput[i] = '\0';
						break;
					}
					aryUserInput[i] = tempUserInput;
				}
				iCount = 0;
				for (int i = 0; i < iCurrentIndex; i++)
				{
					isSame = true;
					for (int j = 0; j < iContentLength; j++)
					{
						if ( '\0' == board[i][j] && '\0' == aryUserInput[j] )
						{
							break;
						}
						if ( board[i][j] != aryUserInput[j] )
						{
							isSame = false;
							break;
						}
					}
					
					if ( isSame )
					{
						++iCount;
						System.out.print('��');
						System.out.print('��');
						System.out.print(':');
						for (int j = 0; j < iContentLength; j++)
						{
							if ( '\0' == board[i][j] )
							{
								break;
							}
							System.out.print(board[i][j]);
						}
						System.out.print('\r');
						System.out.print('\n');
					}
				}
				System.out.print('��');
				System.out.print(iCount);
				System.out.print('��');
				System.out.print('\r');
				System.out.print('\n');

				break;
			case 'E' :
				System.out.print('��');
				System.out.print('��');
				System.out.print('\r');
				System.out.print('\n');
				System.out.print('��');
				System.out.print('��');
				System.out.print(':');
				
				for (int i = 0; i < iContentLength; i++)
				{
					tempUserInput = (char) System.in.read();
					if ( '\r' == tempUserInput )
					{
						System.in.read();
						aryUserInput[i] = '\0';
						break;
					}
					aryUserInput[i] = tempUserInput;
				}
				iSearchIndex = -1;
				iCount = 0;
				for (int i = 0; i < iCurrentIndex; i++)
				{
					isSame = true;
					for (int j = 0; j < iContentLength; j++)
					{
						if ( '\0' == board[i][j] && '\0' == aryUserInput[j] )
						{
							break;
						}
						if ( board[i][j] != aryUserInput[j] )
						{
							isSame = false;
							break;
						}
					}
					
					if ( isSame )
					{
						iSearchIndex = i;
					}
				}
				
				if ( -1 == iSearchIndex )
				{
					System.out.print('��');
					System.out.print('��');
					System.out.print('��');
					System.out.print('��');
					System.out.print(' ');
					System.out.print('��');
					System.out.print('��');
					System.out.print('��');
					System.out.print('��');
					System.out.print('\r');
					System.out.print('\n');
					break;
				}
				System.out.print('��');
				System.out.print(' ');
				System.out.print('��');
				System.out.print('��');
				System.out.print(':');
				
				for (int i = 0; i < iContentLength; i++)
				{
					tempUserInput = (char) System.in.read();
					if ( '\r' == tempUserInput )
					{
						System.in.read();
						board[iSearchIndex][i] = '\0';
						break;
					}
					board[iSearchIndex][i] = tempUserInput;
				}
				
				System.out.print('��');
				System.out.print('��');
				System.out.print('\r');
				System.out.print('\n');
				
				break;
			case 'D' :
				System.out.print('��');
				System.out.print('��');
				System.out.print('\r');
				System.out.print('\n');
				System.out.print('��');
				System.out.print('��');
				System.out.print(':');
				
				for (int i = 0; i < iContentLength; i++)
				{
					tempUserInput = (char) System.in.read();
					if ( '\r' == tempUserInput )
					{
						System.in.read();
						aryUserInput[i] = '\0';
						break;
					}
					aryUserInput[i] = tempUserInput;
				}
				iSearchIndex = -1;
				iCount = 0;
				for (int i = 0; i < iCurrentIndex; i++)
				{
					isSame = true;
					for (int j = 0; j < iContentLength; j++)
					{
						if ( '\0' == board[i][j] && '\0' == aryUserInput[j] )
						{
							break;
						}
						if ( board[i][j] != aryUserInput[j] )
						{
							isSame = false;
							break;
						}
						
						if ( isSame )
						{
							iSearchIndex = i;
						}
					}
				}
				
				if ( -1 == iSearchIndex )
				{
					System.out.print('��');
					System.out.print('��');
					System.out.print('��');
					System.out.print('��');
					System.out.print(' ');
					System.out.print('��');
					System.out.print('��');
					System.out.print('��');
					System.out.print('��');
					System.out.print('\r');
					System.out.print('\n');
					break;
				}
				
				if ( iSearchIndex < (iCurrentIndex - 1) )
				{ 
					for (int i = iSearchIndex; i < iCurrentIndex; i++)
					{
						for (int j = 0; j < iContentLength; j++)
						{
							if ( '\0' == board[i+1][j] )
							{
								board[i][j] = '\0';
								break;
							}
							board[i][j] = board[i+1][j];
						}
					}
				}
				
				iCurrentIndex--;
				
				System.out.print('��');
				System.out.print('��');
				System.out.print('\r');
				System.out.print('\n');
				
				break;
			}
			
			if ( 'Q' == cUserInput )
			{
				break;
			}
		}
		
		// 6. �λ縻 ���
		System.out.print('��');
		System.out.print('��');
		System.out.print('��');
		System.out.print(' ');
		System.out.print('��');
		System.out.print('��');
		System.out.print('��');
		System.out.print('\r');
		System.out.print('\n');
		
		// 7. �ڿ� ����
		board = null;
	}
}
