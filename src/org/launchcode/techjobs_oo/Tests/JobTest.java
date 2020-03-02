package org.launchcode.techjobs_oo.Tests;

import org.junit.*;
import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;



public class JobTest {

    private Job jobOne;
    private Job jobTwo;
    private Object Job;
    private Object Employer;
    private Object Location;
    private Object CoreCompetency;
    private Object PostionType;

    @Before
    public void buildJobs() {
        jobOne = new Job();
        jobTwo = new Job();
    }

    @Test
    public void testSettingJobId() {
        assertEquals(jobOne.getId(), jobTwo.getId() - 1);
    }



    @Test
    public void testJobConstructorSetsAllFields() {
        Job testingJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals("Product tester", testingJob.getName());

        assertTrue( testingJob.getEmployer() instanceof  Employer);
        assertTrue( testingJob.getLocation() instanceof Location);
        assertTrue( testingJob.getPositionType() instanceof PositionType);
        assertTrue( testingJob.getCoreCompetency() instanceof CoreCompetency);

//        assertEquals("Quality Control", testingJob.getName());
//        assertEquals("Persistence", testingJob.getName());

    }

    @Test
    public void testJobsForEquality(){
        Job testingJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job testingJob2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertFalse(testingJob.equals(testingJob2));
    }

    @Test
    public void toStringTest() {

        Job testingJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality Control"), new CoreCompetency("Persistence"));
        String expected = "ID: " + testingJob.getId() + "\n" +
                "Name: Product tester\n" +
                "Employer: ACME\n" +
                "Location: Desert\n" +
                "Position Type: Quality Control\n" +
                "Core Competency: Persistence";
        Assert.assertEquals(expected, testingJob.toString());
    }

    @Test
    public void toStringDataNotAvaliable() {
        Job testingJob = new Job("", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));
        String expected = "ID: " + testingJob.getId() + "\n" +
                "Name: Data not available\n" +
                "Employer: Data not available\n" +
                "Location: Data not available\n" +
                "Position Type: Data not available\n" +
                "Core Competency: Data not available";
        Assert.assertEquals(expected, testingJob.toString());
    }
    }


//    @Test
//    public String toString() {
//
//        //return name + " (Credits: " + numberOfCredits + ", GPA: " + gpa + ")";
//    }

//    @Test
//    public String toString() {
//        Job testingJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
//        Job testingJob2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
//        testingJob.toString();
//    }

