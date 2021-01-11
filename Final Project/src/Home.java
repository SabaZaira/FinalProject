
public class Home
{
	String point(String num)
	{
		if(num=="A")
			return ""+"4.0";
		else if(num=="B+")
			return "3.5";
		else if(num=="B")
			return "3.0";
		else if(num=="C+")
			return "2.5";
		else if(num=="C")
			return "2.0";
		else if(num=="D+")
			return "1.5";
		else if(num=="D")
			return "1.0";
		else if(num=="F")
			return "0";
		else
			return "";
	}
	String credit(String num,String p)
	{
		try
		{
			double i=Double.parseDouble(p),ab;
			if(num=="3")
			{
				ab=3*i;
				return Double.toString(ab);
			}
			else if(num=="4")
			{
				ab=4*i;
				return Double.toString(ab);
			}
			else
				return "";
		}
		catch(Exception e)
		{
				return " ";
		}
	}
	String csum(String cc1,String cc2,String cc3,String cc4,String cc5,String cc6,String gr1,String gw2,String ge3,String gt4,String gl5,String gn6)
	{
		try
		{
			int ab=0,i,o,k,l,t,r;
			if(cc1!="select"&&gr1!="select")
			{
				i=Integer.parseInt(cc1);
				ab=ab+i;
			}
			if(cc2!="select"&&gw2!="select")
			{
				o=Integer.parseInt(cc2);
				ab=ab+o;
			}
			if(cc3!="select"&&ge3!="select")
			{
				k=Integer.parseInt(cc3);
				ab=ab+k;
			}	
			if(cc4!="select"&&gt4!="select")
			{
				l=Integer.parseInt(cc4);
				ab=ab+l;
			}
			if(cc5!="select"&&gl5!="select")
			{
				t=Integer.parseInt(cc5);
				ab=ab+t;
			}	
			if(cc6!="select"&&gn6!="select")
			{
				r=Integer.parseInt(cc6);
				ab=ab+r;
			}	
			return Integer.toString(ab);
		}
		catch(Exception e) 
		{
			return "";
		}
	}
	String gpsum(String gs1,String gs2,String gs3,String gs4,String gs5,String gs6)
	{
		try 
		{
			double ab=0,i,o,k,l,t,r;	
			if(gs1!=""&&gs1.isEmpty()!=true)
			{
				i=Double.parseDouble(gs1);
				ab=ab+i;
			}
			if(gs2!=""&&gs2.isEmpty()!=true)
			{
				o=Double.parseDouble(gs2);
				ab=ab+o;
			}
			if(gs3!=""&&gs3.isEmpty()!=true)
			{
				k=Double.parseDouble(gs3);
				ab=ab+k;
			}
			if(gs4!=""&&gs4.isEmpty()!=true)
			{
				l=Double.parseDouble(gs4);
				ab=ab+l;
			}
			if(gs5!=""&&gs5.isEmpty()!=true)
			{
				t=Double.parseDouble(gs5);
				ab=ab+t;
			}
			if(gs6!=""&&gs6.isEmpty()!=true)
			{
				r=Double.parseDouble(gs6);
				ab=ab+r;
			}	
			return Double.toString(ab);
		}
		catch(Exception e) 
		{
		      return "";
		}
	}
	String agpa(String aa,String bb)
	{
		try {
		double k,p,div;
		k=Double.parseDouble(aa);
		p=Double.parseDouble(bb);
		div=p/k;
		return String.format("%.3f", div);}
	catch(Exception e) {
		      return "";}
	}
	String cgpa(String tw,String aw,String tfw,String cw,String bw)
	{
		try {
		double a,k,p,div,gc,oc,n,i;
		k=Double.parseDouble(aw);
		p=Double.parseDouble(bw);
		gc=Double.parseDouble(tfw);
		oc=Double.parseDouble(tw);
		i=Double.parseDouble(cw);
		if(tw.isEmpty()!=true&&tfw.isEmpty()!=true)
		{
			n=(gc*oc)+(k*i);
			a=oc+k;
			div=n/a;
		}
		else
			div=p/k;
		return String.format("%.3f", div);}catch(Exception e) {
		      return "";}
	}
	String convert(String text,String com1,String com2)
	{
		try 
		{
			double i,j;
			i=Double.parseDouble(text);
			switch (com1) 
			{	
			case "Pakistan Rupee                           -PKR":
				switch(com2)
				{
				case "Pakistan Rupee                           -PKR":
					j=i*1;
					return Double.toString(j);
				case "Euro                                                -EUR":
					j=i*0.0051;
					return Double.toString(j);
				case "US Dollar                                       -USD":
					j=i*0.0063;
					return Double.toString(j);
				case "Indian Rupee                                -INR":
					j=i*0.46;
					return Double.toString(j);
				case "UAE Dirham                                  -AED":
				case "Qatri Rial                                      -QAR":
					j=i*0.023;
					return Double.toString(j);
				case "Turkish Lira                                 -TRY":
					j=i*0.046;
					return Double.toString(j);
				case "Bruneian Dollar                          -BND":
				case "Singapore Dollar                        -SGD":
					j=i*0.008237;
					return Double.toString(j);
				case "Saudi Riyal                                  -SAR":
					j=i*0.023;
					return Double.toString(j);
				case "Chinese Yuan                             -CNY":
					j=i*0.040;
					return Double.toString(j);
				}
			case "Euro                                                -EUR":
				switch(com2)
				{
				case "Pakistan Rupee                           -PKR":
					j=i*195.96;
					return Double.toString(j);
				case "Euro                                                -EUR":
					j=i*1;
					return Double.toString(j);
				case "US Dollar                                       -USD":
					j=i*1.23;
					return Double.toString(j);
				case "Indian Rupee                                -INR":
					j=i*89.61;
					return Double.toString(j);
				case "UAE Dirham                                  -AED":
					j=i*4.50;
					return Double.toString(j);
				case "Qatri Rial                                      -QAR":
					j=i*4.46;
					return Double.toString(j);
				case "Turkish Lira                                  -TRY":
					j=i*9.08;
					return Double.toString(j);
				case "Bruneian Dollar                          -BND":
				case "Singapore Dollar                        -SGD":
					j=i*1.62;
					return Double.toString(j);
				case "Saudi Riyal                                  -SAR":
					j=i*4.60;
					return Double.toString(j);
				case "Chinese Yuan                             -CNY":
					j=i*7.93;
					return Double.toString(j);
				}
			case "US Dollar                                       -USD":
				switch(com2)
				{
				case "Pakistan Rupee                           -PKR":
					j=i*59.85;
					return Double.toString(j);
				case "Euro                                                -EUR":
					j=i*0.82;
					return Double.toString(j);
				case "US Dollar                                       -USD":
					j=i*1;
					return Double.toString(j);
				case "Indian Rupee                                -INR":
					j=i*73.12;
					return Double.toString(j);
				case "UAE Dirham                                  -AED":
					j=i*3.67;
					return Double.toString(j);
				case "Qatri Rial                                      -QAR":
					j=i*3.64;
					return Double.toString(j);
				case "Turkish Lira                                  -TRY":
					j=i*7.41;
					return Double.toString(j);
				case "Bruneian Dollar                          -BND":
				case "Singapore Dollar                        -SGD":
					j=i*1.32;
					return Double.toString(j);
				case "Saudi Riyal                                  -SAR":
					j=i*3.75;
					return Double.toString(j);
				case "Chinese Yuan                             -CNY":
					j=i*6.46;
					return Double.toString(j);
				}
			case "Indian Rupee                                -INR":
				switch(com2)
				{
				case "Pakistan Rupee                           -PKR":
					j=i*2.19;
					return Double.toString(j);
				case "Euro                                                -EUR":
					j=i*0.011;
					return Double.toString(j);
				case "US Dollar                                       -USD":
					j=i*0.014;
					return Double.toString(j);
				case "Indian Rupee                                -INR":
					j=i*1;
					return Double.toString(j);
				case "UAE Dirham                                  -AED":
				case "Qatri Rial                                      -QAR":	
					j=i*0.050;
					return Double.toString(j);
				case "Turkish Lira                                  -TRY":
					j=i*0.10;
					return Double.toString(j);
				case "Bruneian Dollar                          -BND":
				case "Singapore Dollar                        -SGD":
					j=i*0.018;
					return Double.toString(j);
				case "Saudi Riyal                                  -SAR":
					j=i*0.051;
					return Double.toString(j);
				case "Chinese Yuan                             -CNY":
					j=i*0.088;
					return Double.toString(j);
				}
			case "UAE Dirham                                  -AED":
				switch(com2)
				{
				case "Pakistan Rupee                           -PKR":
					j=i*43.78;
					return Double.toString(j);
				case "Euro                                                -EUR":
					j=i*0.22;
					return Double.toString(j);
				case "US Dollar                                       -USD":
					j=i*0.27;
					return Double.toString(j);
				case "Indian Rupee                                -INR":
					j=i*19.94;
					return Double.toString(j);
				case "UAE Dirham                                  -AED":
					j=i*1;
					return Double.toString(j);
				case "Qatri Rial                                      -QAR":	
					j=i*0.99;
					return Double.toString(j);
				case "Turkish Lira                                  -TRY":
					j=i*2.01;
					return Double.toString(j);
				case "Bruneian Dollar                          -BND":
				case "Singapore Dollar                        -SGD":
					j=i*0.36;
					return Double.toString(j);
				case "Saudi Riyal                                  -SAR":
					j=i*1.02;
					return Double.toString(j);
				case "Chinese Yuan                             -CNY":
					j=i*1.76;
					return Double.toString(j);
				}
			case "Turkish Lira                                 -TRY":
				switch(com2)
				{
				case "Pakistan Rupee                           -PKR":
					j=i*21.74;
					return Double.toString(j);
				case "Euro                                                -EUR":
					j=i*0.11;
					return Double.toString(j);
				case "US Dollar                                       -USD":
					j=i*0.14;
					return Double.toString(j);
				case "Indian Rupee                                -INR":
					j=i*9.90;
					return Double.toString(j);
				case "UAE Dirham                                  -AED":
					j=i*0.50;
					return Double.toString(j);
				case "Qatri Rial                                      -QAR":	
					j=i*0.49;
					return Double.toString(j);
				case "Turkish Lira                                 -TRY":
					j=i*1;
					return Double.toString(j);
				case "Bruneian Dollar                          -BND":
				case "Singapore Dollar                        -SGD":
					j=i*0.18;
					return Double.toString(j);
				case "Saudi Riyal                                  -SAR":
					j=i*0.51;
					return Double.toString(j);
				case "Chinese Yuan                             -CNY":
					j=i*0.87;
					return Double.toString(j);
				}
			case "Qatri Rial                                      -QAR":
				switch(com2)
				{
				case "Pakistan Rupee                           -PKR":
					j=i*44.16;
					return Double.toString(j);
				case "Euro                                                -EUR":
					j=i*0.22;
					return Double.toString(j);
				case "US Dollar                                       -USD":
					j=i*0.27;
					return Double.toString(j);
				case "Indian Rupee                                -INR":
					j=i*20.12;
					return Double.toString(j);
				case "UAE Dirham                                  -AED":
					j=i*1.01;
					return Double.toString(j);
				case "Qatri Rial                                      -QAR":	
					j=i*1;
					return Double.toString(j);
				case "Turkish Lira                                  -TRY":
					j=i*2.04;
					return Double.toString(j);
				case "Bruneian Dollar                          -BND":
				case "Singapore Dollar                        -SGD":
					j=i*0.36;
					return Double.toString(j);
				case "Saudi Riyal                                  -SAR":
					j=i*1.03;
					return Double.toString(j);
				case "Chinese Yuan                             -CNY":
					j=i*1.78;
					return Double.toString(j);
				}
			case "Bruneian Dollar                          -BND":
				switch(com2)
				{
				case "Pakistan Rupee                           -PKR":
					j=i*121.83;
					return Double.toString(j);
				case "Euro                                                -EUR":
					j=i*0.62;
					return Double.toString(j);
				case "US Dollar                                       -USD":
					j=i*0.76;
					return Double.toString(j);
				case "Indian Rupee                                -INR":
					j=i*55.49;
					return Double.toString(j);
				case "UAE Dirham                                  -AED":
					j=i*2.78;
					return Double.toString(j);
				case "Qatri Rial                                      -QAR":	
					j=i*2.76;
					return Double.toString(j);
				case "Turkish Lira                                  -TRY":
					j=i*5.61;
					return Double.toString(j);
				case "Bruneian Dollar                          -BND":
				case "Singapore Dollar                        -SGD":
					j=i*1;
					return Double.toString(j);
				case "Saudi Riyal                                  -SAR":
					j=i*2.84;
					return Double.toString(j);
				case "Chinese Yuan                             -CNY":
					j=i*4.90;
					return Double.toString(j);
				}
			case "Singapore Dollar                        -SGD":
				switch(com2)
				{
				case "Pakistan Rupee                           -PKR":
					j=i*121.86;
					return Double.toString(j);
				case "Euro                                                -EUR":
					j=i*0.62;
					return Double.toString(j);
				case "US Dollar                                       -USD":
					j=i*0.76;
					return Double.toString(j);
				case "Indian Rupee                                -INR":
					j=i*55.52;
					return Double.toString(j);
				case "UAE Dirham                                  -AED":
					j=i*2.78;
					return Double.toString(j);
				case "Qatri Rial                                      -QAR":	
					j=i*2.76;
					return Double.toString(j);
				case "Turkish Lira                                  -TRY":
					j=i*5.61;
					return Double.toString(j);
				case "Bruneian Dollar                          -BND":
				case "Singapore Dollar                        -SGD":
					j=i*1;
					return Double.toString(j);
				case "Saudi Riyal                                  -SAR":
					j=i*2.84;
					return Double.toString(j);
				case "Chinese Yuan                             -CNY":
					j=i*4.90;
					return Double.toString(j);
				}
			case "Saudi Riyal                                  -SAR":
				switch(com2)
				{
				case "Pakistan Rupee                           -PKR":
					j=i*42.86;
					return Double.toString(j);
				case "Euro                                                -EUR":
					j=i*0.22;
					return Double.toString(j);
				case "US Dollar                                       -USD":
					j=i*0.27;
					return Double.toString(j);
				case "Indian Rupee                                -INR":
					j=i*19.53;
					return Double.toString(j);
				case "UAE Dirham                                  -AED":
					j=i*0.98;
					return Double.toString(j);
				case "Qatri Rial                                      -QAR":	
					j=i*0.97;
					return Double.toString(j);
				case "Turkish Lira                                  -TRY":
					j=i*1.98;
					return Double.toString(j);
				case "Bruneian Dollar                          -BND":
				case "Singapore Dollar                        -SGD":
					j=i*0.35;
					return Double.toString(j);
				case "Saudi Riyal                                  -SAR":
					j=i*1;
					return Double.toString(j);
				case "Chinese Yuan                             -CNY":
					j=i*1.72;
					return Double.toString(j);
				}
			case "Chinese Yuan                             -CNY":
				switch(com2)
				{
				case "Pakistan Rupee                           -PKR":
					j=i*24.88;
					return Double.toString(j);
				case "Euro                                                -EUR":
					j=i*0.13;
					return Double.toString(j);
				case "US Dollar                                       -USD":
					j=i*0.15;
					return Double.toString(j);
				case "Indian Rupee                                -INR":
					j=i*11.33;
					return Double.toString(j);
				case "UAE Dirham                                  -AED":
					j=i*0.57;
					return Double.toString(j);
				case "Qatri Rial                                      -QAR":	
					j=i*0.56;
					return Double.toString(j);
				case "Turkish Lira                                 -TRY":
					j=i*1.15;
					return Double.toString(j);
				case "Bruneian Dollar                          -BND":
				case "Singapore Dollar                        -SGD":
					j=i*0.20;
					return Double.toString(j);
				case "Saudi Riyal                                  -SAR":
					j=i*0.58;
					return Double.toString(j);
				case "Chinese Yuan                             -CNY":
					j=i*1;
					return Double.toString(j);
				}
			}
			return "";
		}
		catch(NumberFormatException e)
		{
		      return "";
		}
	}
	      
}
	
