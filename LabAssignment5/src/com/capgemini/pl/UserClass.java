package com.capgemini.pl;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

import com.capgemini.bean.Employee;
import com.capgemini.exception.EmployeeException;;
	public class UserClass {
		
		public static void main(String args[])
		{
			Scanner sc=new Scanner(System.in);
		HashMap<Integer,Employee> directory=new HashMap<Integer,Employee>();
			System.out.println("Enter multiple employees");
			int n=sc.nextInt();
			for(int i=0;i<n;i++)
			   {
			Employee ee=new Employee();
			
		System.out.println("Enter employee id");
		ee.id=sc.nextInt();	
		System.out.println("Enter employee name");
		ee.name=sc.next();	
		System.out.println("Enter employee salary");
		ee.sal=sc.nextFloat();	
		if(ee.sal<3000)
			try {
				throw new EmployeeException ();
			} catch (EmployeeException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		System.out.println("Enter employee Designation");
		ee.desig=sc.next();
		
		System.out.println("**********Employee accepted**********");
		System.out.println("**********Insurance Scheme**********");
		if(ee.desig .equals("System Associate")&&(ee.sal>5000 && ee.sal<20000))
			ee.ins="C";
		else if(ee.desig .equals("Programmer")&&(ee.sal>20000 && ee.sal<40000))
			ee.ins="B";
		else if(ee.desig .equals("Manager")&&(ee.sal>40000))
	        ee.ins="A";		
		else if(ee.desig .equals("Clerk")&&(ee.sal<5000))
			ee.ins="N";
		System.out.println("**********Employee ins Scheme**********");
		
		System.out.println("Employee insurance scheme"+ee.ins);
		
		directory.put(ee.id,ee);
			   }
		
			System.out.println("********Hash map contents********");
			Collection<Employee> vSet=directory.values();
			Iterator<Employee> itv=vSet.iterator();
			      while(itv.hasNext())
			{
				
			System.out.println("Values  "+itv.next());
			}
			
			      
		System.out.println("Enter insurance scheme");
		String i=sc.next();
		
		Set<Entry<Integer, Employee>> mapSet=directory.entrySet();
		Iterator<Entry<Integer, Employee>> it=mapSet.iterator();
		while(it.hasNext())
			
		{Map.Entry<Integer,Employee> entry =it.next();
		if(entry.getValue().equals(i))
		System.out.println( it.next());
		}
			
		}
	}


