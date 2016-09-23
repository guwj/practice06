package prob6;

public class MyStack<T> implements Stack<T> {

	private int count;
	private T[] buffer;

	public MyStack(int arraylength) {
		buffer = (T[])new Object[arraylength];
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public T[] getBuffer() {
		return buffer;
	}

	public void setBuffer(T[] buffer) {
		this.buffer = buffer;
	}

	@Override
	public void push(T item) {
		if (count == buffer.length) {
			resize(buffer.length);
		}
		buffer[count] = item;
		count++;
	}

	@Override
	public T pop() throws MyStackException {
		--count;

		if (count < 0) {
			throw new MyStackException("비었다!");
		}
		return buffer[count];
	}

	public void resize(int length) {
//		T[] newBuffer = new T[length * 2];
		T[] newBuffer = (T[])new Object[length * 2];
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
