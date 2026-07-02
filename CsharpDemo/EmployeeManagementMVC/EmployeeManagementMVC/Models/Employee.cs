using System;
using System.Collections.Generic;

namespace EmployeeManagementMVC.Models;

public partial class Employee
{
    public int EmpId { get; set; }

    public string Name { get; set; } = null!;

    public string Department { get; set; } = null!;

    public decimal Salary { get; set; }

    public string City { get; set; } = null!;
}
