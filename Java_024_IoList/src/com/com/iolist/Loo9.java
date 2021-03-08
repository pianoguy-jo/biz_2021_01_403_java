package com.com.iolist;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Loo9 {
	private static List<Loo9VO> loo9List;
	static String productList;
	private static FileReader fileReader = null;
	private static BufferedReader buffer = null;

	public Loo9() {

		productList = "src/com/com/iolist/매입매출데이터.txt";
		loo9List = new ArrayList<Loo9VO>();

	}

	public static void main(String args[]) throws FileNotFoundException {

		try {

			fileReader = new FileReader(productList);
			buffer = new BufferedReader(fileReader);
			String reader = buffer.readLine();

			if (reader == null) {
				return;
				// break;
			}

			String list[] = reader.split(",");

			Loo9VO lVO = new Loo9VO(list[0],
					(list[4]),
					(list[5]),
					(list[6]),
					Integer.valueOf(list[7]),
					Integer.valueOf(list[8]),
					Integer.valueOf(list[9]),
					Integer.valueOf(list[10]));

			loo9List.add(lVO);
		}

		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
