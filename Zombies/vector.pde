public class Vector {

	public float x;
	public float y;

	public Vector (float x, float y) {
		this.x = x;
		this.y = y;	
	}

	Vector mult(float multiplier){
		return new Vector(x * multiplier, y * multiplier);

	}

	void add(Vector vectorToAdd){
		x += vectorToAdd.x;
		y += vectorToAdd.y;

	}
}