using System;
using System.Collections.Generic;

namespace MyApplication.Models;

public partial class Employee
{
    public int EmployeeId { get; set; }

    public string? Ename { get; set; }

    public string? Email { get; set; }

    public decimal? Salary { get; set; }
}
