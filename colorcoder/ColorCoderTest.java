package colorcoder;

import static org.junit.Assert.assertEquals;

import java.util.logging.Logger;

import org.junit.Test;

public class ColorCoderTest {

	private static final Logger LOGGER = Logger.getLogger(ColorCoderTest.class.getName());
	
	static void testNumberToPair(int pairNumber, MajorColor expectedMajor, MinorColor expectedMinor) {
		ColorPair colorPair = Main.getColorFromPairNumber(pairNumber);
		LOGGER.info("Got pair " + colorPair.toStr());
		assert(colorPair.getMajor() == expectedMajor);
		assertEquals("", expectedMajor, colorPair.getMajor());
		assert (colorPair.getMinor() == expectedMinor);
		assertEquals("", expectedMinor, colorPair.getMinor());
	}

	
	static void testPairToNumber(MajorColor major, MinorColor minor, int expectedPairNumber) {
		int pairNumber = Main.getPairNumberFromColor(major, minor);
		LOGGER.info("Got pair number " + pairNumber);
		assert (pairNumber == expectedPairNumber);
		assertEquals("Pair Number ", expectedPairNumber, pairNumber);
	}
	
	@Test
	public void testColorCode() {
		testNumberToPair(4, MajorColor.WHITE, MinorColor.BROWN);
		testNumberToPair(5, MajorColor.WHITE, MinorColor.SLATE);

		testPairToNumber(MajorColor.BLACK, MinorColor.ORANGE, 12);
		testPairToNumber(MajorColor.VIOLET, MinorColor.SLATE, 25);
	}
}
