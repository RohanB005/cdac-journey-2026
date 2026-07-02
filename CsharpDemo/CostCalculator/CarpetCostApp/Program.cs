namespace CarpetCostApp
{
    class Program
    {
        static void Main()
        {
            const double PRICE_PER_SQFT = 50.0;

            double length, width;

            Console.WriteLine("Enter length of the room (in feet): ");
            if(!double.TryParse(Console.ReadLine(), out length))
            {
                Console.WriteLine("Invalid length input!");
                return;
            }

            Console.WriteLine("Enter width of the room (in feet): ");
            if(!double.TryParse((string)Console.ReadLine(), out width))
            {
                Console.WriteLine("Invalid width request");
                return;
            }

            double area = length * width;

            double cost = area * PRICE_PER_SQFT;

            Console.WriteLine("\n--- Carpet Cost Calculator ---");
            Console.WriteLine("Area of room = " + area + " sq ft");
            Console.WriteLine("Price per sq ft = " + PRICE_PER_SQFT);
            Console.WriteLine("Total carpet cost = " + cost);
        }
    }
}
