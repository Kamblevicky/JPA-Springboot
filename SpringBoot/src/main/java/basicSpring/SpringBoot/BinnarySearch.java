package basicSpring.SpringBoot;

public class BinnarySearch implements SortAlgorithm {
	
	private SortAlgorithm sortalgorithm;
	
	public BinnarySearch(SortAlgorithm sortalgorithm) {
		super();
		this.sortalgorithm=sortalgorithm;
	}

	public int binarySearch(int[] number, int numberToSearchFor) {
		// BubbleSort Algorithm
		int[] sortedNumber=sortalgorithm.sort(number);
		System.out.println(sortalgorithm);
		return 3;
	}

	@Override
	public int[] sort(int[] number) {
		// TODO Auto-generated method stub
		return null;
	}

}
