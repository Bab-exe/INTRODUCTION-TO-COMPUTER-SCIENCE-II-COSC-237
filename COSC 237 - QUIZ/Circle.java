//formuluas gotten from google
public class Circle{

    //perimeter is circumference 

    private double x, y;
    private double radius;

        public Circle(double x, double y, double radius){

            this.radius = (radius < 0 ) ? 1 : radius;
            
            this.x = x;
            this.y = y;
            
        }

        public Circle(){
            this(0, 0, 1);
        }


        ///GET

        public double getRadius(){
            return this.radius;
        }

        public double getX(){
            return this.x;
        }
        
        public double getY(){
            return this.y;
        }


        ///SET
        public void setRadius(double radius){
            
            this.radius = (radius < 0 ) ? 1 : radius;
        }

        public void setX(double x){
            //if (x < 0) throw new IllegalArgumentException("X must be positive");
            this.x = x;
        }

        public void setY(double y){
            //if (y < 0) throw new IllegalArgumentException("Y must be positive");
            this.y = y;
        }

        public void set(double x, double y, double radius){
            this.x = x;
            this.y = y;

            this.setRadius(radius);
        }
        
       
        //FUNCTIONS      
        
        /** Circle Area = πr^2 */
        public double area(){
            return Math.PI * (radius * radius);
        }

        /** Circle Perimeter = 2πr */
        public double perimeter(){
            return 2 * Math.PI * this.radius;
        }

        
        public void copy(Circle other){
            this.x = other.x;
            this.y = other.y;
            this.radius = other.radius;
        }

        public Circle getCopy(){
            return new Circle(this.x, this.y, this.radius);
        }


        ///OVERRIDES
        @Override
        public String toString(){
            return this.x + "; " + this.y + "; " + this.radius;
        }

        @Override
        public boolean equals(Object other){
            if (!(other instanceof Circle)) return false;
            
            Circle otherC = (Circle)other;

            return (
                this.x == otherC.x && 
                this.y == otherC.y && 
                this.radius == otherC.radius
            );
        }

}