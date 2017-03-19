
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class TaxWriteOff {
    public class WriteOff{
        private String itemName, datePurchased, purchaseType;
        private double itemCost,itemTotal;
        
        public WriteOff(String name, String date, double cost, String type)
        {
            this.itemName = name;
            this.datePurchased = date;
            this.purchaseType = type;
            this.itemCost = cost;
            this.itemTotal = cost + (cost * 0.10f);
        }
        public String getName()
        {
            return this.itemName;
        }
        public String getDate()
        {
            return this.datePurchased;
        }
        public String getType()
        {
            return this.purchaseType;
        }
        public double getCost()
        {
            return this.itemCost;
        }
        public double getTotal()
        {
            return this.itemTotal;
        }
        
    }
    public ArrayList<WriteOff> writeOffs;
    public void addWriteOff(String name, String date, double cost, String type)
    {
        writeOffs.add(0,new WriteOff(name,date,cost,type));
    }
    public ArrayList<WriteOff> getWriteOff(String type)
    {
        return this.writeOffs;
    }
    public TaxWriteOff()
    {
        writeOffs = new ArrayList<WriteOff>();
        WriteOff writeOff = null;
       
            writeOffs.add(new WriteOff("Laptop","3/3/2017",5,"School"));
            writeOffs.add(new WriteOff("TV","3/3/2017",10,"Work"));
            writeOffs.add(new WriteOff("Calculator","3/3/2017",15,"School"));
         
        
    }
    
    public void PrintReports()
    {
        for (int k=0;k<writeOffs.size();k++)
            System.out.printf("$%.2f\n",writeOffs.get(k).getTotal());
    }
    
}
