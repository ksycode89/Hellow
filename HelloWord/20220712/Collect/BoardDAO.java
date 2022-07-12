package Collect;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BoardDAO  {
	private static BoardDAO instance = new BoardDAO();
	List<Board> list;

	private BoardDAO() {
		list = new ArrayList<>();
	}

	public static BoardDAO getInstance() {
		return instance;
	}
	
	
	
	// 목록
	public List<Board> boardList() {
		return list;
	}

	// 등록
	public void add(Board board) {
		list.add(board);
	}

	// 조회
	public List<Board> search(String writer) {
		List<Board> list = new ArrayList<>();

		for (Board board : this.list) {
			if (board.getWriter().equals(writer)) {
				list.add(board);
			}
		}
		return list;
	}

	// 삭제
	public void remove(String title) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getTitle().equals(title)) {
				list.remove(i);
				break;

			}

		}
	}

	
}
