// Slime.java

package ps5.slime;

import javax.swing.JOptionPane;

class Orc extends Monster {

	// 생성자
	public Orc(String n) {
		super();
		name = n;

	}

	// 공격
	public void attack(Human h) {

		if (hp > 0) {
			System.out.println(name + "는 " + h.name + "를 공격했다");
			h.hp = h.hp - 10;

			if (h.hp < 1) {
				JOptionPane.showMessageDialog(null, "Game Over");
				System.exit(0);
			}

			System.out.println("현재 " + h.name + "의 체력은 " + h.hp + "이다\n");
		}

	}

}