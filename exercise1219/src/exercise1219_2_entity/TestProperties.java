package exercise1219_2_entity;

import java.util.*;

import exercise1219_2.Employee;

import java.io.*;

public class TestProperties {

	public static void main(String[] args) {
		TestProperties t = new TestProperties();
		Properties p = new Properties();
		
		Employee []er = t.readFile(p);
		
		t.printConsole(p);
		t.addEmpData(p);
		t.printConsole(p);
		t.saceEmpXML(er);
		
	}
	
	public void addEmpData(Properties p) {
		p.setProperty("21300442", "Cavin,개발부,32000000,0.25");
		p.setProperty("70431100", "Anna,총무부,41000000,0.2");
	}
	
	public Employee[] readFile(Properties p) {
		
		try {
			p.load(new FileReader("empDate.txt"));
		} catch(Exception e1) {
			e1.printStackTrace();
		}
		
		Set<String> ks = p.stringPropertyNames();
		Employee []e = new Employee[ks.size()];
		Iterator<String> iT = ks.iterator();
		
		int x = 0;
		while(iT.hasNext()) {
			String key = iT.next();
			String value = p.getProperty(key);
			
			String []v = value.split(",");
			
			int eId = Integer.parseInt(key);
			String eName = v[0];
			String dept = v[1];
			int salary = Integer.parseInt(v[2]);
			double bP = Double.parseDouble(v[3]);
			
			e[x] = new Employee(eId, eName, dept, salary, bP);
			
			x ++;
		}
		
		return e;
	}
	
	public void printConsole(Properties p) {
		p.list(System.out);
	}
	
	public void saceEmpXML(Employee []er) {
		Properties pR = new Properties();
		
		int x = 0;
		while(x < er.length) {
			int s = (int)(er[x].getSalary() + (er[x].getSalary()*er[x].getbPoint()));	
			pR.setProperty(String.valueOf(er[x].geteId()), er[x].toString()+", "+s);
			
			x ++;
		}
		
		try {
			pR.storeToXML(new FileOutputStream("empResult.xml"), "보너스포인트적용연봉", "UTF-8");
			
		} catch(IOException e) {
			e.printStackTrace();
		}
	}

}
