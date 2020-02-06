package org.launchcode.techjobs_oo.Tests;


import org.junit.BeforeClass;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;

public class JobTest {

    static Job idTest1;
    static Job idTest2;
    static Job testJob;
    static Job testJob2;

    @BeforeClass
    public static void createJobs() {
        idTest1 = new Job();
        idTest2 = new Job();
        testJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));;
        testJob2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));;
    }

    @Test
    public void testSettingJobId() {
        assertFalse(idTest1.getId() == idTest2.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        assertTrue(testJob.getName() instanceof String);
        assertTrue(testJob.getEmployer() instanceof Employer);
        assertTrue(testJob.getLocation() instanceof Location);
        assertTrue(testJob.getPositionType() instanceof PositionType);
        assertTrue(testJob.getCoreCompetency() instanceof CoreCompetency);
    }

    @Test
    public void testJobsForEquality() {
        assertFalse(testJob.equals(testJob2));
    }

    @Test
    public void testToString() {
        assertEquals("\nID: 3\nName: Product tester\nEmployer: ACME\nLocation: Desert\nPosition Type: Quality control\nCore Competency: Persistence\n",testJob.toString());
    }

}
