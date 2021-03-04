package ru.frozenpriest;

import ru.frozenpriest.client.gwtProjectTest;
import com.google.gwt.junit.tools.GWTTestSuite;
import junit.framework.Test;
import junit.framework.TestSuite;

public class gwtProjectSuite extends GWTTestSuite {
  public static Test suite() {
    TestSuite suite = new TestSuite("Tests for gwtproject");
    suite.addTestSuite(gwtProjectTest.class);
    return suite;
  }
}
