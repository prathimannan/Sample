package conditions;

public class UseCondiationsCar {
      public static void main(String[]args) {
    	  ConditionsCAR car1 = new ConditionsCAR();
    	  car1.brand = "bmw";
    	  car1.model = "z100";
    	  car1.price = 1000000;
    	  car1.colour = "yellow";
    	  
    	  ConditionsCAR car2 = new ConditionsCAR();
    	  car2.brand = "benz";
    	  car2.model = "z23e";
    	  car2.price = 4000000;
    	  car2.colour = "black";
    	  
    	  ConditionsCAR car3 = new ConditionsCAR();
    	  car3.brand = "audi";
    	  car3.model = "xuv";
    	  car3.price = 3000000;
    	  car3.colour = "red";
    	  
    	  if(car1.price<car2.price && car1.price<car3.price) {
    		  System.out.println(car1.brand +" cheap");
    	  
    	  } else if (car2.price<car1.price && car2.price<car3.price) {
    		  System.out.println(car2.brand + " cheap");
    		  
    	  } else if (car3.price<car1.price && car3.price<car2.price) {
    		  System.out.println( car3.brand +" cheap");
    		  
    	  }
    	  
      }
}
    		  
    		  
    	 
    	  
    	  
      

