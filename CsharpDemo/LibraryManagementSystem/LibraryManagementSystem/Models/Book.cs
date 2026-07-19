using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace LibraryManagementSystem.Models
{
    public class Book
    {
        public int BookId { get; set; }
        public string Title { get; set; }

        public string Author { get; set; }

        public bool IsAvailable { get; set; }

        public Book(int id, string title, string author)
        {
            BookId = id; Title = title; Author = author;
            IsAvailable = true;
        }

        public void Display()
        {
            Console.WriteLine($"{BookId} {Title} {Author} {IsAvailable}");
        }
    }
}
