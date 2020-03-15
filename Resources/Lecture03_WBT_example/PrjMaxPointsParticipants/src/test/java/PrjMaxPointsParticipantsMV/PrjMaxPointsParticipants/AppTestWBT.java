package PrjMaxPointsParticipantsMV.PrjMaxPointsParticipants;

import static org.junit.Assert.*;

import org.junit.Test;

import repository.Repository;
import controller.ParticipantController;

public class AppTestWBT {
	private Repository rep;
	private ParticipantController ctrl;
	
	@Test
	public void tc_1_AllStatements() {
						
		rep = new Repository("FileParticipantsMaxStatements.txt");		
		
		ctrl=new ParticipantController(rep);
		int noParticipantsMax= ctrl.getNumberOfParticipantWithMaxPointsReceived();
		
		assertEquals(2, noParticipantsMax);	
		System.out.println();
	}
	@Test
	public void tc_2_S3_True() {
				
		
		rep = new Repository("FileParticipantsMaxConditionsS3.txt");		
		
		ctrl=new ParticipantController(rep);
		int noParticipantsMax= ctrl.getNumberOfParticipantWithMaxPointsReceived();
		
		assertEquals(1, noParticipantsMax);	
		System.out.println();
	}
	@Test
	public void tc_3_Path1() {
				
		rep = new Repository("FileParticipantsMaxPath1.txt");		
		
		ctrl=new ParticipantController(rep);
		int noParticipantsMax= ctrl.getNumberOfParticipantWithMaxPointsReceived();
		
		assertEquals(0, noParticipantsMax);	
		System.out.println();
	}
	@Test
	public void tc_4_Loop_1() {
						
		rep = new Repository("FileParticipantsMaxLoop1.txt");		
		
		ctrl=new ParticipantController(rep);
		int noParticipantsMax= ctrl.getNumberOfParticipantWithMaxPointsReceived();
		
		assertEquals(1, noParticipantsMax);	
		System.out.println();
	}
	@Test
	public void tc_5_Loop_2() {
						
		rep = new Repository("FileParticipantsMaxLoop2.txt");		
		
		ctrl=new ParticipantController(rep);
		int noParticipantsMax= ctrl.getNumberOfParticipantWithMaxPointsReceived();
		
		assertEquals(1, noParticipantsMax);	
		System.out.println();
	}
}
