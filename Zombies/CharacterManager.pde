public class CharacterManager {
	
Human[] characters;

public CharacterManager (int numberofCharacter) {
	characters = new Human[numberofCharacter];

	for (int i = 0; i < numberofCharacter; ++i) {
		Vector position = new Vector(random(width), random(height));
		characters[i] = new Human(12, position, 0.5);
		
	}
}
public void update() {
	for (Human character : characters) {
		character.walk();
		character.draw();
	}

}

}