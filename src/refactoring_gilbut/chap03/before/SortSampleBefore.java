package refactoring_gilbut.chap03.before;

import java.util.Arrays;

public class SortSampleBefore {
	private final int[] data;

	public SortSampleBefore(int[] data) {
		this.data = new int[data.length];
		System.arraycopy(data, 0, this.data, 0, data.length);
	}
	
	//���� ����
	public void sort() {
		for(int x = 0 ; x < data.length - 1 ; x++) {
			int m = x;
									//data.length - 1�ϸ� AssertionError �߻���, data.length�� �ؾ� Error �߻�X
			for(int y = x + 1 ; y < data.length - 1 ; y++) {
				if( data[m] > data[y] ) {
					m = y;
				}
			}
			assert isMin(m, x, data.length - 1): this + ", x = " + x;
			
			int v = data[m];	//data[m]�� data[x] ~ data[data.length]�� �ּҰ�
			data[m] = data[x];
			data[x] = v;
			// ���⼭ data[0] ~ data[x + 1]�� �̹� ���ĵǾ� �־�� �Ѵ�.
			
			assert isSorted(0, x + 1): this + ", x = " + x;
 		}
	}

	private boolean isSorted(int start, int end) {
		// TODO Auto-generated method stub
		for(int i = start ; i < end ; i++) {
			if(data[i] > data[i + 1]) {
				return false;
			}
		}
		return true;
	}

	private boolean isMin(int pos, int start, int end) {
		// TODO Auto-generated method stub
		for(int i = start ; i < end + 1 ; i++) {
			if(data[pos] > data[i]) {
				return false;
			}
		}
		return true;
	}

	@Override
	public String toString() {
		return String.format("%s", Arrays.toString(data));
	}
	
	
}
