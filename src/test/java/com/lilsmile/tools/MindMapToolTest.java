package com.lilsmile.tools;


import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class MindMapToolTest extends TestCase {

    public MindMapToolTest(String testName) {
        super(testName);
    }

    public static Test suite()
    {
        return new TestSuite( MindMapToolTest.class );
    }

    public void testTool()
    {
        assertTrue( true );
    }
}
