package codes.Assignments;

import java.util.*;

class Ordersinfo
{
     int orderId;
     ArrayList<String> items = new ArrayList<>();
     boolean paymentstatus;

     Ordersinfo(ArrayList<String> itm,boolean pyt,int orderId)
     {
         this.orderId = orderId;
         this.items = itm;
         this.paymentstatus = pyt;
     }

     public void getdata()
     {
         System.out.println("Order Id : "+this.orderId);
         System.out.println("Items List "+this.items);
         System.out.println("Payment Method : "+this.paymentstatus);
     }


}

class Order
{
    int orderId=100;
    ArrayList<String> itms = new ArrayList<>();

    HashMap<Integer,Ordersinfo> orders = new HashMap<>();

    public void CreateOrder(ArrayList<String> itm,boolean pytsta)
    {
        Ordersinfo neworder = new Ordersinfo(itm,pytsta,this.orderId);
        for(String i: itm)
        {
            itms.add(i);
        }
        orders.put(this.orderId,neworder);
        System.out.println("order Created your OrderId "+this.orderId);
        this.orderId++;
    }


    public void getorder(int orderId)
    {
        orders.get(orderId).getdata();
    }

    public void getitems()
    {
        System.out.println(this.itms);
    }





}

public class ECommerce {
    public static void main(String[] args) {
        ArrayList<String> itms = new ArrayList<>();
        Scanner sc= new Scanner(System.in);
        Order o1 = new Order();

        boolean loop = true;
        while(loop)
        {
            System.out.println("Choose the Option : ");
            System.out.println("1) Create Order 2) Get OrderInfo 3) GetItemsList 4) Exit");
            int cho = sc.nextInt();
            switch (cho)
            {
                case 1:
                    System.out.println("Enter how many items you wants to add ");
                    int size = sc.nextInt();
                    itms = new ArrayList<>();
                    for(int i=0;i<size;i++)
                    {
                        String itm = sc.next();
                        itms.add(itm);
                    }
                    System.out.println("Choose payment method : ");
                    System.out.println("1) Cash on Delivery 2) Other");
                    int choi = sc.nextInt();
                    if(choi ==1)
                    {
                        o1.CreateOrder(itms,true);
                    }
                    else
                    {
                        o1.CreateOrder(itms,false);
                    }

                    break;
                case 2:
                    System.out.println("Please Enter your orderId : ");
                    int orderid = sc.nextInt();
                    o1.getorder(orderid);
                    break;
                case 3:
                    System.out.println("You ordered Items : ");
                    o1.getitems();
                    break;
                case 4:
                    System.out.println("Thank you visit again!😀😀😃");
                    loop=false;
                    break;
                default:
                    System.out.println("Invalide input! Try Again!");
            }

        }


    }
}
