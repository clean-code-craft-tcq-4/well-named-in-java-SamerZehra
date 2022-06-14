package colorcoder;

import java.util.logging.Logger;


public class Main {
		
	private static final Logger LOGGER = Logger.getLogger(Main.class.getName());
		
	static ColorPair getColorFromPairNumber(int pairNumber) {
		int zeroBasedPairNumber = pairNumber - 1;
		MajorColor majorColor = MajorColor.fromIndex(zeroBasedPairNumber / ColorPair.nMajorColors);
		MinorColor minorColor = MinorColor.fromIndex(zeroBasedPairNumber % ColorPair.nMinorColors);
		return new ColorPair(majorColor, minorColor);
	}

	static int getPairNumberFromColor(MajorColor major, MinorColor minor) {
		return major.getIndex() * ColorPair.nMinorColors + minor.getIndex() + 1;
	}

	

	static void printManual() {
		LOGGER.info(" Color Code Manual ");
		int count = 1;
		for(int i = 0 ; i< ColorPair.nMajorColors ; i++) {
			for(int j = 0; j< ColorPair.nMinorColors ; j++) {
				LOGGER.info(count + " | " + ColorPair.MajorColorNames[i] + " | " + ColorPair.MinorColorNames[j]);
				count++;
			}
		}
	}
	
	public static void main(String[] args) {
		printManual();
		
	}
}
