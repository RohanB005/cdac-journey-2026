using Microsoft.AspNetCore.Mvc;
using WebApplication1.Models;

namespace WebApplication1.Controllers
{
    //Handle user interaction logic

    public class TestController : Controller
    {
        //action method 
        public string MyFirstMethod()
        {
            return "Welcome to my application";
        }
        public IActionResult Index()
        {
            return View();
        }

        public ActionResult MyFirstViewMethod()
        {
            CustomerBAL b = new CustomerBAL();
            Customer c = b.GetCustomer();

            ViewBag.Customer = c;
            return View("MyFirstView");
        }
    }
}
