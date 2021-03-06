package net.atgame.lecture.board;

import java.io.IOException;

public class BoardExcuter {
	// 1. Board 생성
	final static int iContentLength = 20;
	static char[][] board = new char[10][iContentLength];
	static int iCurrentIndex = 0;
	static int iSearchIndex = -1;
	static char[] aryUserInput = new char[10];
	static char tempUserInput;
	static boolean isSame = true;
	static int iCount = 0;
	
	static void regist() throws IOException {
		System.out.println("등록");
		System.out.print("내용:");
		
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
		
		System.out.println("등록되었습니다.");
	}
	
	static void list() {
		System.out.println("목록");

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
			System.out.println();
		}
	}
	
	static void search() throws IOException {
		System.out.println("검색");
		System.out.print("찾을 내용:");
		
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
				System.out.println("결과:");
				for (int j = 0; j < iContentLength; j++)
				{
					if ( '\0' == board[i][j] )
					{
						break;
					}
					System.out.print(board[i][j]);
				}
				System.out.println();
			}
		}
		System.out.println("총" + iCount + "건");
	}
	
	static void edit() throws IOException {
		System.out.println("수정");
		System.out.print("내용:");
		
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
			System.out.println("존재하지 않습니다");
			return;
		}
		System.out.println("새 내용:");
		
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
		
		System.out.println("완료");
		
	}
	
	static void delete() throws IOException {
		System.out.println("삭제");
		System.out.print("내용:");
		
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
			System.out.println("존재하지 않습니다");
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
		
		System.out.println("완료");
			
	}

	public static void main(String[] args) throws IOException {
		// 2. 인사말 출력
		System.out.println("안녕하세요");
		
		while (true)
		{
			// 3. 메뉴 출력
			System.out.println("메뉴");
			System.out.println("R:등록");
			System.out.println("L:검색");
			System.out.println("E:수정");
			System.out.println("D:삭제");
			System.out.println("Q:종료");
			System.out.println("선택:");
			
			// 4. 사용자 선택
			char cUserInput = (char) System.in.read();
			System.in.read();
			System.in.read();
			
			// 5. 메뉴 분기
			switch (cUserInput)
			{
			case 'R' :
				regist();
				
				break;
			case 'L' :
				list();
				
				break;
			case 'S' :
				search();

				break;
			case 'E' :
				edit();
				
				break;
			case 'D' :
				delete();
				break;
				
			}
			
			if ( 'Q' == cUserInput )
			{
				break;
			}
		}
		
		// 6. 인사말 출력
		System.out.println("안녕히 가세요");
		
		// 7. 자원 해제
		board = null;
	}
}
