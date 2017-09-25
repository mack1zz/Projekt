public class Human {

    String name = "Kalle"; 
    int age = 12;
    int size = 5;
    float movementSpeed = 4;
    Vector position;
    Vector direction;

	public Human (String name, int age, int size, Vector position, float speed) {
		this.name = name;
		this.age = age;
		this.size = size;
		movementSpeed = speed;
		this.position = position;

		direction = new Vector(random(-1, 1), random(-1, 1));
	}

    public void talk() {
    	if (age > 2) {
    		println(name + ": hello!");
    	}
    }
    
    public void walk() {
    	position.add(direction.mult(movementSpeed));
    }

    public void draw() {
        ellipse(position.x, position.y, size, size);

    }
}
