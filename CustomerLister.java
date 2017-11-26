import java.util.ArrayList;
public class CustomerLister{
	public static void main(String[] args) {
		int index=0;
	ArrayList<String>customerName=new ArrayList<String>();
	ArrayList<Double>customerBalance=new ArrayList<Double>();
	customerName.add("Cathy");
	customerName.add("Ben");
	customerName.add("Jorge");
	customerName.add("Wanda");
	customerName.add("Freddie");
	
	customerBalance.add(12.23);
	customerBalance.add(12.50);
	customerBalance.add(100.50);
	customerBalance.add(120.80);
	customerBalance.add(200.80);
	
	
	while (index < customerName.size())
    {
       System.out.println(customerName.get(index)  +  customerBalance.get(index));
       
       
       index++; 

    }
	
	
	}
}