//Cody, Tony, Themba, Carmen

public class GroupProj {
	public static void main (String [] args){
		
	} // end of main

	public class Box{
		private double length, width;
    
		Box(){
			length = 1;
			width = 1;
		}
    
		Box(double inpLength, double inpWidth){
			length = inpLength;
			width = inpWidth;
		}
    
		public void setLength(double newLength){
			length = newLength;
		}
    
		public void setWidth (double newWidth){
			width = newWidth;
		}
    
		public double getLength() {
			return length;
		}
    
		public double getWidth(){
			return width;
		}
   
		public double getArea(){
			return length*width;
		}
    
		public double getPerimeter(){
			return 2*length+2*width;
		}  
    
		
  }//end of Box

}// end
