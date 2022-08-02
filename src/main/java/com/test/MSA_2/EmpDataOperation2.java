package com.test.MSA_2;


import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;



public class EmpDataOperation2 {
	public static void updateEmp(int empId5)throws Exception

	{
		Scanner sc=new Scanner(System.in);
		EmpDataService1 esr=new EmpDataService1();
		List<EmpDataSetUp1>check=EmpDataService1.getData().stream().filter(age->age.getEmpId()==empId5).collect(Collectors.toList());
		if(check.size()==0)
			throw new Exception("Sorry no such customer id");
		else
		{
			System.out.println("Enter the name to be updated");
			check.get(0).setEmpName(sc.nextLine());
			System.out.println("Enter the age to be updated");
			check.get(0).setEmpAge(sc.nextInt());
			System.out.println("Enter the Salary to be updated");
			check.get(0).setEmpSal(sc.nextInt());
		}
		System.out.println("Data Updated To");
		System.out.println(check.get(0).getEmpName()+" "+check.get(0).getEmpAge()+" "+check.get( 0).getEmpSal());
	}
	public static void descendingOrder(List<EmpDataSetUp1> empData)
	{
		
		List<EmpDataSetUp1> asd=empData.stream().sorted(Comparator.comparing(name->name.getEmpName())).collect(Collectors.toList());
		asd.stream().forEach(ans->System.out.println(ans.getEmpId()+" "+ans.getEmpName()+" "+ ans.getEmpAge()+" "+ans.getEmpSal()));
		
	}
	
	public static void display(List<EmpDataSetUp1> empData)
	{
		List<EmpDataSetUp1> asd=empData.stream().sorted(Comparator.comparing(name->name.getEmpName())).collect(Collectors.toList());
		asd.stream().forEach(ans->System.out.println(ans.getEmpId()+" "+ans.getEmpName()+" "+ ans.getEmpAge()+" "+ans.getEmpSal()));
	}
	

}

