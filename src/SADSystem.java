

class Shape{
	Shape(int i) {
		System.out.println("Constructor Shape");
		
	}
	
	void dispose(){
		System.out.println("fynally Shape");
	}
}


class Circle extends Shape{
	Circle(int i) {
		super(i);
		System.out.println("Constructor Circle");
		
	}
	
	void dispose(){
		System.out.println("fynally Circle");
		super.dispose();
	}
}


class Triangle extends Shape{
	Triangle(int i) {
		super(i);
		System.out.println("Constructor Triangle");
		
	}
	
	void dispose(){
		System.out.println("fynally Triangle");
		super.dispose();
	}
}

