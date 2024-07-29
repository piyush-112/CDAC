package com.developers.geometry;

	public class Point2D {
		private double x;
		private double y;
		
		public Point2D(double x,double y){        //opeartion 1 with parameterised const
			this.x=x;
			this.y=y;
		}

		public String show(){               // return point's x & y co-ords
			//System.out.println("The X-coordinate is:"+x);
			//System.out.println("The Y-coordinate is:"+y);
			return ("X:"+x +" " +"Y:"+y);
		}

		public boolean isEqual(Point2D that){    //return true if both points are same x,y co-ords or false otherwise
			return this.x==that.x && this.y==that.y;
		}

		public double calDist(Point2D that){  //to calc distance between 2 points
			double Dx=this.x - that.x;
			double Dy=this.y - that.y;
			return Math.sqrt(Dx*Dx + Dy*Dy);
		}
		public Double getterx() {
			return x;
		}

		
		public Double gettery() {
			return y;
		}
	}

