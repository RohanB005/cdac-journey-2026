using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.ComponentModel.DataAnnotations;
using Microsoft.EntityFrameworkCore;

namespace LoginApp
{
    public class User
    {
        [Key]
        public int Id { get; set; }

        public required string Username { get; set; }

        public required string Password { get; set; }    
    }
}
