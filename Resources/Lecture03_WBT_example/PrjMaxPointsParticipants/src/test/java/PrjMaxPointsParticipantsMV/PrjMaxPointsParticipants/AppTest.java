package CatalogApp..PrjMaxPointsParticipants;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import PrjMaxPointsParticipantsMV.PrjMaxPointsParticipants.*;
import static org.junit.Assert.*;
import model.Participant;

import org.junit.Ignore;
import org.junit.Test;

import controller.ParticipantController;
import repository.Repository;
import junit.framework.TestCase;
import junit.framework.TestSuite;


public class AppTest
{

	private Repository rep;
	private ParticipantController ctrl;
	
	@Test
	public void tc_4_AllParticipantsMax() {
				
		rep = new Repository("FileParticipantsMaxAll.txt");		
		
		ctrl=new ParticipantController(rep);
		int noParticipantsMax= ctrl.getNumberOfParticipantWithMaxPointsReceived();
		
		assertEquals(4, noParticipantsMax);	
		System.out.println();
	}
	@Test
	public void tc_3_AllParticipantsOnlyOne() {
		rep = new Repository("FileParticipantsMaxOne.txt");	
			
		ctrl=new ParticipantController(rep);
		int noParticipantsMax= ctrl.getNumberOfParticipantWithMaxPointsReceived();
		
		assertEquals(1, noParticipantsMax);	
	}
	
	@Test
	public void tc_20_ParticipantsWith99Points() {
		rep = new Repository("FileParticipants99Points.txt");	
			
		ctrl=new ParticipantController(rep);
		int noParticipantsMax= ctrl.getNumberOfParticipantWithMaxPointsReceived();
		
		assertEquals(3, noParticipantsMax);	
	}
	
 }
