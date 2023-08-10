package org.tnsif.checkedexception;

import java.io.FileInputStream;

public class CheckedExcetptionDemo {

	public static void main(String[] args) {
		try{
		FileInputStream f = new FileInputStream("E:\\2022 BKP\\Desktop\\Programming world\\TNS Training\\Technical\\daily challenge.txt");
		System.out.println("File is exists!!");
		}
		catch(Exception e)
		{
			System.out.println("Exception Handled"+e);
		}

	}

}
