package day1example;

public class LeapYear {

public boolean isLeapYear(int year){
				
				if(year%400==0)
					return true;
				else if((year%4==0)&&(year%100!=0))
					return true;
				else
					return false;
			}

		

		
		
		// TODO Auto-generated method stub

	}


