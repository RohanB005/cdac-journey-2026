using System;
using System.Collections.Generic;

namespace StudentManagementSystem.Models;

public partial class Student
{
    public int StudentId { get; set; }

    public string? StudentName { get; set; }

    public string? Course { get; set; }

    public int? Age { get; set; }

    public string? City { get; set; }
}
