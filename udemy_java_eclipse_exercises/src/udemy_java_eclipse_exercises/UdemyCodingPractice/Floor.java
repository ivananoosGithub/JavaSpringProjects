package udemy_java_eclipse_exercises.UdemyCodingPractice;

public class Floor {
    // write your code here
    private double width;
    private double length;
    
    public Floor (double Width, double Length){
        
        if( Width < 0 ){
            this.width = 0;
            this.length = Length;
        }
        
        if(Length < 0){
                this.width = Width;
                this.length = 0;
        }
        
        if(Width != 0 && Length != 0){
            this.width = Width;
            this.length = Length;
        }
    }
    
    public double getArea(){
        return this.width * this.length;
    }
    
    public class Carpet {
    	
        private double cost;
        
        public Carpet(double Cost){
            
            if(Cost < 0) {
                this.cost = 0;
            }
            
            else {
                this.cost = Cost;
            }
        }
        
        public double getCost(){
            return cost;
        }
    }

    public class Calculator {
        private Floor floor;
        private Carpet carpet;
        
        public Calculator (Floor floor, Carpet carpet){
            
            this.floor = floor;
            this.carpet = carpet;
            
        }
        
        public double getTotalCost (){
            return this.floor.getArea() * this.carpet.getCost();
        }
    }
}












