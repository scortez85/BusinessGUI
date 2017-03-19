
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
    
    private Map<String,WriteOff> writeOffs;
    
    public TaxWriteOff()
    {
        writeOffs = new HashMap<String,WriteOff>();
        WriteOff writeOff = null;
       
            for (int k=0;k<10;k++)
            {
                writeOffs.put(String.valueOf(k), new WriteOff("k","k",4.4,"School"));
            }
        
    }
    
    public void PrintReports()
    {
        //System.out.println(writeOffs.size());
        for (String item : writeOffs.keySet())
        {
            System.out.println(writeOffs.get(item).getType());
        }
    }
    
}
