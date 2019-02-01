import java.util.*;
class Point3D extends Point2D
{
	private float z;
	Point3D()
	{
	super();
    this.z=1;
	}
	Point3D(float x,float y,float z)
	{
	super(x,y);
	this.z=z;
	}
	public void set_z()
	{
	this.z=z;
	}
	public float get_z()
	{
	return z;
	}
    public float[] get_xyz()
	{
		float[] arr = new float[3];
		arr[0]=get_x();
		arr[1]=get_y();
		arr[2]=get_z();
		return arr;
	}
    public String to_String()
	{
        return Arrays.toString(get_xyz());
	}
}