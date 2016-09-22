package prob4;

public class MyStack implements Stack {
	private int capacity;
	private int top;
	private String[] buffer;
	
	public MyStack( int capacity ) {
		resizeBuffer( capacity );
	}
	
	private void resizeBuffer( int capacity ) {
		String[] tempBuffer = new String[ capacity ];
		for( int i = 0; i < top; i++ ) {
			tempBuffer[ i ] = buffer[ i ];
		}
		
		buffer = tempBuffer;
		this.capacity = capacity;
	}
	
	@Override
	public void push(String item) {
		if( top == capacity ){
			resizeBuffer( capacity*2 );
		}
		
		buffer[ top++ ] = item;
	}

	@Override
	public String pop() throws MyStackException {
		if( top == 0 ) {
			throw new MyStackException( "stack is empty" );
		}
		
		return buffer[--top];
	}

	@Override
	public boolean isEmpty() {
		return top == 0;
	}

	@Override
	public int size() {
		return top;
	}
}
