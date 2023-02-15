package conditions;

public class CheckAge {
	public static void main(String []args) {
		Sample s = (x)->{if(x>=18) {return "Eligible";
		}else{
			return "not eligible";
			}
		}
		;
		System.out.println(s.findVoltage(28));
	}
	

}
