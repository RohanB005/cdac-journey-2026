using System;
using System.Collections.Generic;

namespace StudentManagementSystem.Models;

public partial class Student
{
    public int StudentId { get; set; }

    public string FirstName { get; set; } = null!;

    public string LastName { get; set; } = null!;

    public DateTime Dob { get; set; }

    public string Email { get; set; } = null!;

    public string PhoneNumber { get; set; } = null!;
}
