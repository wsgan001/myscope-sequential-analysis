package postprocess;

import java.util.Comparator;

public class SortByUniqueCode implements Comparator<CodeSequence> {
	public int compare(CodeSequence s1, CodeSequence s2) {
		return s2.supCount - s1.supCount;
	}
}
