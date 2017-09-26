package edu.luc.cs.cs271.lab2;

import edu.luc.cs.cs271.lab2.Team;
import org.junit.Test;

import static org.junit.Assert.*;

public class TeamTest {
    Team makeTeamFixture(final String name, final String headcoach, final int funding) {
        return new Team(name, headcoach, funding);
    }
    @Test
    public void testConstructorValidName() {
        try {
            new Team(null, "Klinsmann", 500);
            fail("should have thrown IllegalArgumentException");
        } catch (final Throwable ex) {
            //System.out.println("we landed here, we're good");
            // if we landed here, we're good!
        }
    }
    // TODO testConstructorValidHeadcoach
    @Test
    public void testConstructorValidHeadcoach() {
        try {
            new Team("USA", "Klinsmann", 500);
            fail("should have thrown IllegalArgumentException");
        } catch (final Throwable ex) {
           // System.out.println("we landed here, we're good");
            // if we landed here, we're good!
        }
    }
    // TODO testConstructorValidFunding
    @Test
    public void testConstructorValidFunding() {
        try {
            new Team("USA", "Klinsmann", 500);
            fail("should have thrown IllegalArgumentException");
        } catch (final Throwable ex) {
           // System.out.println("we landed here, we're good");
            // if we landed here, we're good!
        }
    }

    @Test
    public void testGetName() {
        final String name = "USA";
        final Team t = makeTeamFixture("USA", "Klinsmann", 500);
        assertEquals(name, t.getName());
        //System.out.println("we landed here, we're good");
    }

    // TODO testGetHeadcoach

    @Test
    public void getHeadcoach() throws Exception {
        final String headcoach = "Klinsmann";
        final Team t = makeTeamFixture("USA","Klinsmann", 500);
        assertEquals(headcoach, t.getHeadcoach());
        //System.out.println("we landed here, we're good");
    }
    // TODO testGetFunding
    @Test
    public void getFunding() throws Exception {
        final int funding = 500;
        final Team t = makeTeamFixture("USA", "Klinsmann", 500);
        assertEquals(funding, t.getFunding());
        //System.out.println("we landed here, we're good");
    }

}