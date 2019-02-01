import java.util.*;
class Point2D
{
	private float x;
	private float y;
	Point2D()
	{
	    this.x=x;
        this.y=y;
	}
	Point2D(float x,float y)
	{
	    this.x=x;
	    this.y=y;
	}
	public float get_x()
	{
	    return x;
	}
	public float get_y()
	{
		return y;
	}
	public void set_x()
	{
		this.x=x;
	}
	public void set_y()
	{
		this.y=y;
	}
    //public double[] set_xy()
	//{
	//	float[] arr = new float[2];
	//	arr[0]=get_x();
	//	arr[1]=get_y();
	//}
	public float[] get_xy()
	{
		float[] arr = new float[2];
		arr[0]=get_x();
		arr[1]=get_y();
		return arr;
	}
	public String toString()
	{
        return Arrays.toString(get_xy());
	}
}