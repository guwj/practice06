package prob5;

public class Money {
	private int amount;

	public Money(int amount) {
		this.amount = amount;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public Money add(Money money) {
		Money result = null;
		if( money != null ) {
			result = new Money( amount + money.amount );
		}
		return result;
	}

	public Money minus(Money money) {
		Money result = null;
		if( money != null ) {
			result = new Money( amount - money.amount );
		}
		return result;
	}

	public Money multiply(Money money) {
		Money result = null;
		if( money != null ) {
			result = new Money( amount * money.amount );
		}
		return result;
	}

	public Money devide(Money money) {
		Money result = null;
		if( money != null && money.amount != 0 ) {
			result = new Money( amount / money.amount );
		}
		return result;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + amount;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Money other = (Money) obj;
		if (amount != other.amount)
			return false;
		return true;
	}
}
