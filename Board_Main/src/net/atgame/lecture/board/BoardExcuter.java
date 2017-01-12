package net.atgame.lecture.board;

import java.io.IOException;

public class BoardExcuter {

	public static void main(String[] args) throws IOException {
		// 1. Board 생성
		final int iContentLength = 20;
		char[][] board = new char[10][iContentLength];
		int iCurrentIndex = 0;
		int iSearchIndex = -1;
		char[] aryUserInput = new char[10];
		char tempUserInput;
		boolean isSame = true;
		int iCount = 0;
		
		// 2. 인사말 출력
		System.out.print('안');
		System.out.print('녕');
		System.out.print('하');
		System.out.print('세');
		System.out.print('요');
		System.out.print('\r');
		System.out.print('\n');
		
		while (true)
		{
			// 3. 메뉴 출력
			System.out.print('메');
			System.out.print('뉴');
			System.out.print('\r');
			System.out.print('\n');
			System.out.print('R');
			System.out.print(':');
			System.out.print('등');
			System.out.print('록');
			System.out.print('\r');
			System.out.print('\n');
			System.out.print('L');
			System.out.print(':');
			System.out.print('검');
			System.out.print('색');
			System.out.print('\r');
			System.out.print('\n');
			System.out.print('E');
			System.out.print(':');
			System.out.print('수');
			System.out.print('정');
			System.out.print('\r');
			System.out.print('\n');
			System.out.print('D');
			System.out.print(':');
			System.out.print('삭');
			System.out.print('제');
			System.out.print('\r');
			System.out.print('\n');
			System.out.print('Q');
			System.out.print(':');
			System.out.print('종');
			System.out.print('료');
			System.out.print('\r');
			System.out.print('\n');
			System.out.print('선');
			System.out.print('택');
			System.out.print(':');
			
			// 4. 사용자 선택
			char cUserInput = (char) System.in.read();
			System.in.read();
			System.in.read();
			
			// 5. 메뉴 분기
			switch (cUserInput)
			{
			case 'R' :
				System.out.print('등');
				System.out.print('록');
				System.out.print('\r');
				System.out.print('\n');
				System.out.print('내');
				System.out.print('용');
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
				
				System.out.print('등');
				System.out.print('록');
				System.out.print('되');
				System.out.print('었');
				System.out.print('습');
				System.out.print('니');
				System.out.print('다');
				System.out.print('.');
				System.out.print('\r');
				System.out.print('\n');
				
				break;
			case 'L' :
				System.out.print('목');
				System.out.print('록');
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
				System.out.print('검');
				System.out.print('색');
				System.out.print('\r');
				System.out.print('\n');
				System.out.print('찾');
				System.out.print('을');
				System.out.print('내');
				System.out.print('용');
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
						System.out.print('결');
						System.out.print('과');
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
				System.out.print('총');
				System.out.print(iCount);
				System.out.print('건');
				System.out.print('\r');
				System.out.print('\n');

				break;
			case 'E' :
				System.out.print('수');
				System.out.print('정');
				System.out.print('\r');
				System.out.print('\n');
				System.out.print('내');
				System.out.print('용');
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
					System.out.print('존');
					System.out.print('재');
					System.out.print('하');
					System.out.print('지');
					System.out.print(' ');
					System.out.print('않');
					System.out.print('습');
					System.out.print('니');
					System.out.print('다');
					System.out.print('\r');
					System.out.print('\n');
					break;
				}
				System.out.print('새');
				System.out.print(' ');
				System.out.print('내');
				System.out.print('용');
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
				
				System.out.print('완');
				System.out.print('료');
				System.out.print('\r');
				System.out.print('\n');
				
				break;
			case 'D' :
				System.out.print('삭');
				System.out.print('제');
				System.out.print('\r');
				System.out.print('\n');
				System.out.print('내');
				System.out.print('용');
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
					System.out.print('존');
					System.out.print('재');
					System.out.print('하');
					System.out.print('지');
					System.out.print(' ');
					System.out.print('않');
					System.out.print('습');
					System.out.print('니');
					System.out.print('다');
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
				
				System.out.print('완');
				System.out.print('료');
				System.out.print('\r');
				System.out.print('\n');
				
				break;
			}
			
			if ( 'Q' == cUserInput )
			{
				break;
			}
		}
		
		// 6. 인사말 출력
		System.out.print('안');
		System.out.print('녕');
		System.out.print('히');
		System.out.print(' ');
		System.out.print('가');
		System.out.print('세');
		System.out.print('요');
		System.out.print('\r');
		System.out.print('\n');
		
		// 7. 자원 해제
		board = null;
	}
}
