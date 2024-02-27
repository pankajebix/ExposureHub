package ehub.com.pages;

import java.io.IOException;

public class AAA {
	
	public static void main(String[] args) throws IOException {
//		System.out.println("dd");
//		
////		Excelutility	excUtil=new Excelutility(System.getProperty("user.dir")+AppConstants.pathofExcelDataAsPerEnv);
////		System.out.println(excUtil.getCellData("policyNumber", "Value", 4));
////		System.out.println(excUtil.getCellData("policyNumber", "Value", 5));
////		
////		excUtil.setCellData("Classes", "Class", 2, "Pankaj");
////		excUtil.setCellData("Classes", "Class", 3, "Neeraj");
//		
//		Boolean a=false;
//		
//		Assert.assertTrue(a);
		
		String s="daataa%";
		if(s.equalsIgnoreCase("Daataa"+"%")) {
			System.out.println("pass");
		}else {
			System.out.println("fail");
		}
		
	}	
}
