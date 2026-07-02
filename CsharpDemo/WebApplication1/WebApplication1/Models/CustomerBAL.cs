namespace WebApplication1.Models
{
    public class CustomerBAL
    {
        public Customer GetCustomer()
        {
            Customer c = new Customer();
            c.CustomerName = "Some Customer";
            c.Address = "Some Address";
            c.Age = 50;
            return c;

        }
    }
}
