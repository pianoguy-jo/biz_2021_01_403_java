package com.com.service.impl;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


import com.com.iolist.Loo9VO;
import com.com.iolist.values.Values;
import com.com.service.Loo9Service;

public class Loo9ServiceImplV1 implements Loo9Service {

	private static List<Loo9VO> loo9List;
	static String productList;
	private static FileReader fileReader = null;
	private static BufferedReader buffer = null;

	public Loo9ServiceImplV1() {

		productList = "src/com/com/iolist/매입매출데이터.txt";
		loo9List = new ArrayList<Loo9VO>();

	}

	public void loadScoreFromFile() {

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

	public void sumPrice() {

		for (Loo9VO lVO : loo9List) {

			int sumIPrice = lVO.getiPrice() * lVO.getQty();
			sumIPrice += lVO.getiPrice() * lVO.getQty();
			
			int sumUPrice = lVO.getuPrice() * lVO.getQty();
			sumUPrice += lVO.getuPrice();
			
			lVO.setTotalIPrice(sumIPrice);
			lVO.setTotalUPrice(sumUPrice);
			
			loo9List.add(lVO);
		}
		
				
		

	}

	public void print() {
		
		System.out.println(Values.dLine);
		System.out.println("거래일자\t거래처\t상품이름\t매입금액\t판매금액");
		
		for(Loo9VO lVO : loo9List) {
			
			System.out.printf("%s%s%s%s%d%d%d",
					lVO.getDate(),
					lVO.getCorrName(),
					lVO.getiPrice(),
					lVO.getTotalUPrice());
			
		}
		

	}

}
