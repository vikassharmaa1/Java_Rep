package constructor;

//Usage 1 super keyword where we want to access private data members of superclass using super calling super class constructor
class BoxSuper {
	private double width;
	private double height;
	private double depth;

	BoxSuper(BoxSuper ob) {
		width = ob.width;
		height = ob.height;
		depth = ob.depth;

	}

	BoxSuper(double w, double h, double d) {
		width = w;
		height = h;
		depth = d;

	}

	public class BoxweightSuper extends BoxSuper {
		double weight;

		BoxweightSuper(BoxweightSuper ob) {
			super(ob);
			weight = ob.weight;
		}

		BoxweightSuper(double w, double h, double d, double m) {
			super(w, h, d);
			weight = m;
		}

	}
}

// Usage 2 super keyword where there is superclass variable name hiding

class Box1Super {
	int i;
}

class Box1weightSuper extends Box1Super {
	int i;

	Box1weightSuper(int a, int b) {
		super.i = a;
		i = b;
	}

	void show() {

		System.out.println(super.i);
		System.out.println(i);
	}
}
