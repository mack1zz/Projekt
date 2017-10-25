using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.UI;

public class PlayerController : MonoBehaviour 
{
	public float speed;
	public Text countText;
	public Text winText;
	public enum State {Playing, Pause};
	public State state;

	private Rigidbody rb;
	private int count;

	void freeze ()
	{
		GetComponent<Rigidbody> ().isKinematic = true;
	}

	void Start () 
	{
		rb = GetComponent<Rigidbody>();
		count = 0;
		SetCountText ();
		winText.text = "";
		state = State.Playing;
	}

	void FixedUpdate () 
	{
		if (state == State.Pause)
			freeze();
		if (state == State.Playing)
			movement ();
	}

	void movement()
	{
		float moveHorizontal = Input.GetAxis ("Horizontal");
		float moveVertical = Input.GetAxis ("Vertical");
		GetComponent<Rigidbody> ().isKinematic = false;
		Vector3 movement = new Vector3 (moveHorizontal, 0.0f, moveVertical);

		rb.AddForce (movement * speed);
	}

	void OnTriggerEnter(Collider other) 
	{
		if (other.gameObject.CompareTag ("Pick Up")) 
		{
			other.gameObject.SetActive (false);
			count += 1;
			SetCountText ();
		}
	}

	void SetCountText ()
	{
		countText.text = "Count: " + count.ToString ();
		if (count >= 13) 
		{
			winText.text = "You Win!";
		}
	}
}