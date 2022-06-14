package colorcoder;

class ColorPair {
	static final  String MajorColorNames[] = { "White", "Red", "Black", "Yellow", "Violet" };
	static final  int nMajorColors = MajorColorNames.length;

	static final  String MinorColorNames[] = { "Blue", "Orange", "Green", "Brown", "Slate" };
	static final  int nMinorColors = MinorColorNames.length;
	
    private MajorColor majorColor;
    private MinorColor minorColor;
    
    public ColorPair(MajorColor major, MinorColor minor)
    {
        majorColor = major;
        minorColor = minor;
    }
    public MajorColor getMajor() {
        return majorColor;
    }
    public MinorColor getMinor() {
        return minorColor;
    }
    String toStr() {
        String colorPairStr = MajorColorNames[majorColor.getIndex()];
        colorPairStr += " ";
        colorPairStr += MinorColorNames[minorColor.getIndex()];
        return colorPairStr;
    }
}
