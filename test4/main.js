window.onload = function() {
	var canvas = document.getElementById("canvas"),
		context = canvas.getContext("2d"),
		width = canvas.width = window.innerWidth,
		height = canvas.height = window.innerHeight;

	for (var angle = 0; angle < Math.PI * 2; angle += .01) {
		console.log(Math.sin(angle));
	}
};