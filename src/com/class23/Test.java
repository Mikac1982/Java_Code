package com.class23;

public class Test {

	public static void main(String[] args) {
		System.out.println("---Creating Employee object---");
		Employee emp=new Employee();
		
		System.out.println(Employee.department); //STATIC variable(accessing through the CLASS(NAME) DIRECTLY!
		Employee.work();                         //static method
	//	emp.work();  NOT PREFERED WAY because it's static
		emp.salary=90000;      //INSTANCE variable/methods accessing through OBJECT
		emp.getPaid();
        
		
		System.out.println("---Creating SCRUMTEAM object---");
		ScrumTeam st=new ScrumTeam();
		ScrumTeam.work(); //static method
		st.salary=100000;
		st.getPaid();
		st.artifacts="Product Backlog,Sprint Backlog, BurnDown chart";
		st.ceremonies="Sprit grooming, Sprint Planning, Daily StandUp, Sprint Demo, Sprint Retro";
		st.attendScrumMeetings();
		st.workOnArtifacts();
		
		System.out.println("---Creating DEVELOPER object---");
		Developer dev =new Developer();
		Developer.work();  //static method
		dev.salary=120000;
		dev.getPaid();
		dev.artifacts="Sprit backlog";
		dev.ceremonies="Sprit grooming, Sprint Planning, Daily StandUp, Sprint Demo, Sprint Retro";
		dev.workOnArtifacts();
		dev.attendScrumMeetings();
		dev.code();
		
		System.out.println("---Creating TESTER object---");
		Tester qa =new Tester();     //QA-quality analist
		Tester.work();  //static method
		qa.salary=100000;
		qa.getPaid();
		qa.artifacts="Sprit backlog";
		qa.ceremonies="Sprit grooming, Sprint Planning, Daily StandUp, Sprint Demo, Sprint Retro";
		qa.workOnArtifacts();
		qa.attendScrumMeetings();
		qa.test();
	
		System.out.println("---Creating BUISSNESS ANALYST object---");
		BussinessAnalyst ba =new BussinessAnalyst();
		ba.salary=85000;
     	ba.getPaid();
		ba.artifacts="Sprit backlog, Product Backlog";
		ba.ceremonies="Sprit grooming, Sprint Planning, Daily StandUp, Sprint Demo, Sprint Retro";
		ba.workOnArtifacts();
		ba.attendScrumMeetings();
		ba.writeUserStories();
		
		System.out.println("---Creating SCRUM MASTER object---");
		ScrumMaster sm =new ScrumMaster();
		sm.salary=90000;
		sm.getPaid();
		sm.artifacts="Burn Down Chart";
		sm.ceremonies="Sprit grooming, Sprint Planning, Daily StandUp, Sprint Demo, Sprint Retro";
		sm.workOnArtifacts();
		sm.attendScrumMeetings();
		sm.driveScrumMeetings();
		
		System.out.println("---Creating PRODUCT OWNER object---");
		ProductOwner po =new ProductOwner();
		po.salary=150000;
		po.getPaid();
		po.artifacts="Sprit backlog, Product Backlog";
		po.ceremonies="Sprit grooming, Sprint Planning, Sprint Demo";
		po.workOnArtifacts();
		po.attendScrumMeetings();
		po.prioritizeBacklog();
		po.talkToTheClient();
			
		System.out.println("---Creating FRONT END Developer object---");
		FrontEnd fed =new FrontEnd();
		fed.salary=122000;
		fed.getPaid();
		fed.artifacts="Sprit backlog";
		fed.ceremonies="Sprit grooming, Sprint Planning, Daily StandUp, Sprint Demo, Sprint Retro";
		fed.workOnArtifacts();
		fed.attendScrumMeetings();
		fed.code();
		fed.doHtml();
		
		System.out.println("---Creating BACK END Developer object---");
		BackEnd bed =new BackEnd();
		bed.salary=121000;
		bed.getPaid();
		bed.artifacts="Sprit backlog";
		bed.ceremonies="Sprit grooming, Sprint Planning, Daily StandUp, Sprint Demo, Sprint Retro";
		bed.workOnArtifacts();
		bed.attendScrumMeetings();
		bed.code();
		bed.doSql();	
		
		System.out.println("---Creating MANUAL TESTER object---");
		ManualTester mqa =new ManualTester();
		mqa.salary=80000;
		mqa.getPaid();
		mqa.artifacts="Sprit backlog";
		mqa.ceremonies="Sprit grooming, Sprint Planning, Daily StandUp, Sprint Demo, Sprint Retro";
		mqa.workOnArtifacts();
		mqa.attendScrumMeetings();
		mqa.test();
		mqa.testManualy();
		
		System.out.println("---Creating AUTOMATION TESTER object---");
		AutomationTester aqa =new AutomationTester();
		aqa.salary=110000;
		aqa.getPaid();
		aqa.artifacts="Sprit backlog";
		aqa.ceremonies="Sprit grooming, Sprint Planning, Daily StandUp, Sprint Demo, Sprint Retro";
		aqa.workOnArtifacts();
		aqa.attendScrumMeetings();
		aqa.test();
		aqa.codeInJava();
		
	}

	
}
