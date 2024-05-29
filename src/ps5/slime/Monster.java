package ps5.slime;

public abstract class Monster {

	protected String name;
	protected int hp = 80;

	public Monster() {
		super();
	}

	public abstract void attack(Human h);

}