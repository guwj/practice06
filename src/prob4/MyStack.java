package prob4;

public class MyStack implements Stack {

	private int count;
	private String[] buffer;

	public MyStack(int arraylength) {
		buffer = new String[arraylength];
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String[] getBuffer() {
		return buffer;
	}

	public void setBuffer(String[] buffer) {
		this.buffer = buffer;
	}

	@Override
	public void push(String item) {
		if (count == buffer.length) {
			resize(buffer.length);
		}
		buffer[count] = item;
		count++;
	}

	@Override
	public String pop() throws MyStackException {
		--count;

		if (count < 0) {
			throw new MyStackException("비었다!");
		}
		return buffer[count];
	}

	public void resize(int length) {
		String[] newBuffer = new String[length * 2];
		for (int i = 0; i < buffer.length; i++) {
			newBuffer[i] = buffer[i];
		}
		buffer = newBuffer;
	}

	@Override
	public boolean isEmpty() {
		return count < 0;
	}

	@Override
	public int size() {
		return 0;
	}
}
