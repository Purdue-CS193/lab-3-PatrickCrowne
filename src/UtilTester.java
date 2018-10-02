// NOTE: If this import is giving you issues, make sure you
// hover over it and either click the red lightbulb, or press
// ALT + ENTER to "Add Junit4 to Classpath". This will allow
// you to run the test cases!

import org.junit.*;
import static org.junit.Assert.assertEquals;

public class UtilTester {
    public static final double delta = 0.000001;

    @Test
    public void testSimpleDivision() {
        assertEquals(7, MathUtils.divideNumbers(21, 3), delta);
        assertEquals(20032006, MathUtils.divideNumbers(80128024,4), delta);
        assertEquals(13, MathUtils.divideNumbers(169, 13), delta);
    }

    @Test
    public void testComplexDivision() {
        assertEquals(0.142857, MathUtils.divideNumbers(3, 21),  delta);
        assertEquals(6163694.153846, MathUtils.divideNumbers(80128024, 13), delta);
        assertEquals(0.384615, MathUtils.divideNumbers(5, 13), delta);
    }

    @Test
    public void testBasicPositivePower() {
        assertEquals(2, MathUtils.raiseToPower(2, 1), delta);
        assertEquals(25, MathUtils.raiseToPower(5, 2), delta);
        assertEquals(65536, MathUtils.raiseToPower(2, 16), delta);
    }

    @Test
    public void testComplexPositivePower() {
        assertEquals(14348907, MathUtils.raiseToPower(3, 15), delta);
        assertEquals(1419857, MathUtils.raiseToPower(17, 5), delta);
        assertEquals(62748517, MathUtils.raiseToPower(13, 7), delta);
    }

    @Test
    public void testBasicNegativePower() {
        assertEquals(0.5, MathUtils.raiseToPower(2, -1), delta);
        assertEquals(0.04, MathUtils.raiseToPower(5, -2), delta);
        assertEquals(0.00001525879, MathUtils.raiseToPower(2, -16), delta);
    }

    @Test
    public void testComplexNegativePower() {
        assertEquals(1.0/14348907, MathUtils.raiseToPower(3, -15), delta);
        assertEquals(1.0/1419857, MathUtils.raiseToPower(17, -5), delta);
        assertEquals(1.0/62748517, MathUtils.raiseToPower(13, -7), delta);
    }

    @Test
    public void testShortUsername() {
        assertEquals("bxiu", StringUtils.makePurdueUsername("bo", "xiu"));
    }

    @Test
    public void testLongUsername() {
        assertEquals("mdecimus", StringUtils.makePurdueUsername("maximus", "decimus-meridius"));
    }

    @Test
    public void testUsernameCase() {
        assertEquals("mashbeck", StringUtils.makePurdueUsername("MaTtHeW", "AsHbEcK"));
    }
//
    public static final String simpleTextMessage = "User jhanky, you have been entered to win one year's free " +
            "tuition at Purdue! Reply from your email (jhanky@purdue.edu), please!";
    public static final String simpleTextExpunged = "User [DATA EXPUNGED], you have been entered to win one year's free " +
            "tuition at Purdue! Reply from your email ([DATA EXPUNGED]@purdue.edu), please!";

    public static final String complexTextMessage = "SCP-173 approached D-class member bchunky at approximately 04:07 " +
            "into the testing procedure. bchunky exhibited nervous behavior at first, knowing that it would not be" +
            " simple to maintain containment. In spite of being the sole D-class to survive the latest Keter-level " +
            "event throughout the facility, bchunky was able to survive until 07:45 by alternating blinking between " +
            "eyes. bchunky ultimately had their neck snapped at 07:48 after Dr. Robertson played a loud air horn " +
            "over the intercom. Dr. Robertson claims this was not at all related to the fact that his wife was " +
            "having an affair with D-Class member bchunky, and explained that it was part of a \"QA procedure " +
            "passed down from higher-ups.\"";

    public static final String complexTextExpunged = "SCP-173 approached D-class member [DATA EXPUNGED] at approximately 04:07 " +
            "into the testing procedure. [DATA EXPUNGED] exhibited nervous behavior at first, knowing that it would not be" +
            " simple to maintain containment. In spite of being the sole D-class to survive the latest Keter-level " +
            "event throughout the facility, [DATA EXPUNGED] was able to survive until 07:45 by alternating blinking between " +
            "eyes. [DATA EXPUNGED] ultimately had their neck snapped at 07:48 after Dr. Robertson played a loud air horn " +
            "over the intercom. Dr. Robertson claims this was not at all related to the fact that his wife was " +
            "having an affair with D-Class member [DATA EXPUNGED], and explained that it was part of a \"QA procedure " +
            "passed down from higher-ups.\"";

    @Test
    public void testBasicReplacement() {
        assertEquals(simpleTextExpunged, StringUtils.replaceStudentUsername(simpleTextMessage, "jhanky"));
    }

    @Test
    public void testComplexReplacement() {
        assertEquals(complexTextExpunged, StringUtils.replaceStudentUsername(complexTextMessage, "bchunky"));
    }
}
