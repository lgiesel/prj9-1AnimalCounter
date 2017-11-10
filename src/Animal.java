
public class Animal implements Countable{

	private int count;
	
	@Override
	public void IncrementCount() {
		count++;		
	}

	@Override
	public void ResetCount() {
		count=0;
	}

	@Override
	public int GetCount() {
		return count;
	}

	@Override
	public String getCountString() {
		return getCount() + super.toString().getClass().getName(); //1 Animal
	}

	public Animal() {
		count = 0;
	}

	public Animal(int count) {
		super();
		this.count = count;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
}
