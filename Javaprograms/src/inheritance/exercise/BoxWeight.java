/* author :SAUMYA ACHANTANI 18CSU194
   version:1.0.0
   PURPOSE-2.Create a new class BoxWeight that extends Box to include weight as an instance variable.  */
   class BoxWeight extends Box
{
	float weight;
	BoxWeight()
	{
	super();
	this.weight=1;
	}
	BoxWeight(float w,float h,float d,float we)
	{
	super(w,h,d);
	this.weight=we;
	}
	BoxWeight(BoxWeight bw)
	{
	super(bw.height,bw.height,bw.depth);
	this.weight=bw.weight;
	}
	public float get_width()
	{
	return super.width;
	}
	public float get_height()
	{
	return super.height;
	}
	public float get_depth()
	{
	return super.depth;
	}
	public void set_weight(float we)
	{
	this.weight=we;
	}
	public float get_weight()
	{
	return weight;
	}
	public float get_vol()
    {
    return super.get_volume();
    }
}