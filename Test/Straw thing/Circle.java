//a
public class Circle{

    private double x, y ,radius;

        public Circle(double x, double y, double radius){
            if (radius < 0 ) throw new IllegalArgumentException("Radius must be positive");

            
            this.x = x;
            this.y = y;
            this.radius = radius;
        }

        public Circle(){
            this(0, 0, 0);
        }

        

        ///GET

        public double getRadius(){
            return radius;
        }

        public double getX(){
            return x;
        }
        
        public double getY(){
            return y;
        }


        ///SET
        public void setRadius(double radius){
            if (radius < 0 ) throw new IllegalArgumentException("Radius must be positive");
            this.radius = radius;
        }

        public void setX(double x){
            //if (x < 0) throw new IllegalArgumentException("X must be positive");
            this.x = x;
        }

        public void setY(double y){
            //if (y < 0) throw new IllegalArgumentException("Y must be positive");
            this.y = y;
        }
        
        //FUNCTIONS        
        public double area(){
            return Math.PI * radius * radius;
        }

        public double perimeter(){
            return 2 * Math.PI * radius;
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
            return this.x + ";" + this.y + ";" + this.radius;
        }

        @Override
        public boolean equals(Object other){
            if (!(other instanceof Circle)) return false;
            Circle otherC = (Circle)other;

            return 
                this.x == otherC.x && 
                this.y == otherC.y && 
                this.radius == otherC.radius;


        }

}