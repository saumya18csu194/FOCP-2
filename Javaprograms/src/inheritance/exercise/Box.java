/* author :SAUMYA ACHANTANI 18CSU194
   version:1.0.0
   PURPOSE-1.Define a class Box with the following instance variables: width, height and depth, all of type float. */
  class Box
{
	float width,height,depth;
	Box()
	{
	width=1;
	height=1;
	depth=1;
	}
	Box(float w,float h,float d)
	{
	this.width=w;
	this.height=h;
	this.depth=d;
	}
	Box(Box b)
	{
	this.width=width;
	this.height=height;
	this.depth=depth;
	}
	public void set_width(float w)
	{
	this.width=w;
	}
	public float get_width()
	{
	return width;
	}
	public void set_height(float h)
	{
	this.height=h;
	}
	public float get_height()
	{
	return height;
	}
	public void set_depth(float d)
	{
	this.depth=d;
	}
	public float get_depth()
	{
	return depth;
	}
	public float get_volume()
	{
	return width*height*depth;
	}
}