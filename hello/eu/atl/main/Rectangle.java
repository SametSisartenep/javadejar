package eu.atl.main;

public class Rectangle implements Scale {
	Point min, max;

	public
	Rectangle(Point min, Point max)
	{
		this.min = min;
		this.max = max;
	}

	public
	Rectangle(int minx, int miny, int maxx, int maxy)
	{
		this.min = new Point(minx, miny);
		this.max = new Point(maxx, maxy);
	}

	public int
	Dx()
	{
		return this.max.x - this.min.x;
	}

	public int
	Dy()
	{
		return this.max.y - this.min.y;
	}

	public int
	area()
	{
		return this.Dx()*this.Dy();
	}

	public int
	cmp(Scale s)
	{
		Rectangle r;
		int a;

		r = (Rectangle)s;
		a = this.area() - r.area();
		return a == 0 ? 0 : a/Math.abs(a);
	}
}
