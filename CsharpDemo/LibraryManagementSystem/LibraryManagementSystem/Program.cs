using LibraryManagementSystem.Models;

namespace LibraryManagementSystem
{
    public class Program
    {
        static void Main(string[] args)
        {
            Student student = new Student(1, "Rohan", "PGCP-AC");

            List<Book> books = new List<Book>()
            {
                new Book(101, "C# Programming", "Andrew"),
                new Book(102, "ASP.NET Core", "Microsoft"),
                new Book(103, "SQL", "Rockoff"),
                new Book(104, "React", "Jordan")
            };
            Console.WriteLine("=====Student Details======");
            student.Display();

            Console.WriteLine("\n-------Book List------");
            foreach (Book b in books)
            {
                b.Display();
            }
            Console.WriteLine("\n=====LINQ Example======");
            var result = books.Where(b => b.IsAvailable);
            foreach(Book b in books)
            {
                b.Display();
            }

            Console.WriteLine("\n=======Issue Book ======");
            try
            {
                IssueBook(books, 101);
                IssueBook(books, 101);
            }
            catch(BookNotAvailableException ex)
            {
                Console.WriteLine(ex.Message);
            }
            Console.WriteLine("\n=====Available Books ======");

            foreach(Book b in books)
            {
                b.Display();
            }
        }
        static void IssueBook(List<Book> books, int id)
        {
            Book book = books.FirstOrDefault(b => b.BookId == id);
            if(book == null)
            {
                Console.WriteLine("Book not found");
                return;
            }
            if(!book.IsAvailable)
            {
                throw new BookNotAvailableException("Book is already issued");
            }
            book.IsAvailable = false;
            Console.WriteLine($"{book.Title} Issued Successfully");
        }
    }
}
